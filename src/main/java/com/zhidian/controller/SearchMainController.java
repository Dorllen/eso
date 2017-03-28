/**
 * @Title: MainSearchController.java
 * @Package com.zhidian.interceptors
 * @Description: TODO(用一句话描述该文件做什么)
 * @author dongneng
 * @date 2017-3-19 下午8:15:39
 * @version V1.0
 */
package com.zhidian.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhidian.bases.worm.WormsService;
import com.zhidian.service.ArticleService;
import com.zhidian.util.ObjectConvert;
import com.zhidian.views.ResultPageDTO;
import com.zhidian.views.ResultPageView;

/**
 * @ClassName: MainSearchController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dongneng
 * @date 2017-3-19 下午8:15:39
 * 
 */
@Controller
@RequestMapping("/search")
public class SearchMainController {

	@Autowired
	WormsService wormsService;

	@Autowired
	ArticleService articleService;

	// 搜索服务,这是直接访问链接，不是json数据接口！
	@GetMapping(value = { "", "/" }) // q代表查询内容，t代表筛选雷荣，f代表查询筛选网站
	public String index(@RequestParam(value = "q", required = false) String key,
			@RequestParam(value = "t", required = false) String origin,
			@RequestParam(value = "f", required = false) String from, Model model) {
		if (!StringUtils.isEmpty(key)) {
			List<ResultPageDTO> lists = null;
			if ("Origin".equals(origin)) {
				// 如果从来源，就直接在线获取数据，处理之后返回
				// from 格式: segmentfault|cnblog|ibmdeveloper
				// 如果用户筛选了条件，即定义了搜索的来源。
				lists = wormsService.getResultsByOnlineSearch(key, from);
				// 查询网站热度，排序数据
				// 没有定义筛选条件，就调用拼接器，处理数据
				lists = articleService.getHandlerResults(lists, from);
				// 分析list，分析与以前页面差别
				articleService.analyseSearchResultDiff(lists, from);
			} else {
				// 关键词分词
				List<String> keyLists = articleService.analyseKeyWord(key);
				// 获取数据：从索引或数据库
				lists = articleService.getResultsByIndexCache(keyLists, key, from);
				if (lists == null || lists.size() == 0) {
					// 当索引服务中为空，就去数据库查找
					lists = articleService.getResultsByDBWays(keyLists, key, from);
					if (lists == null || lists.size() == 0) {
						// DB也没有数据。联网查找.
						lists = wormsService.getResultsByOnlineSearch(key, from);
						lists = articleService.getHandlerResults(lists, from);
						// 查询网站热度，排序数据
						lists = articleService.getHandlerResults(lists, from);
						// 分析results,快照当前搜索，联网查找之后记录关键词，分析关键词，同级关键词
						articleService.searchResultsHandler(lists);
					}
				}
			}
			// ResultPageDTO => ResultPageVO . 同时要连通数据库，找出当前用户的信息，如：收藏，访问量
			List<ResultPageView> results = ObjectConvert.convertPageResultVTO2ViewList(lists);
			// 制作模板，放入数据
			model.addAttribute("Message", results);
		} else {
			// 提示 请输入关键词...
			model.addAttribute("Data", "请输入搜索内容!");
		}
		return "search/index";
	}

	// 显示搜索页结果
	@GetMapping("/json")
	@ResponseBody
	public Object json(@RequestParam(value = "f", required = false, defaultValue = "segmentfault") String from,
			@RequestParam("q") String query) {
		// 直接开始爬取
		return wormsService.pullOnlineData(from, query);
	}

	// 多线程爬虫显示搜索页结果
	@GetMapping("/json2")
	@ResponseBody
	public Object json2(@RequestParam(value = "f", required = false, defaultValue = "segmentfault") String from,
			@RequestParam("q") String query) {
		// 直接开始爬取
		return wormsService.pullOnlineDataWithThreading(from, query);
	}
}

/**
 * @Title: MainSearchController.java
 * @Package com.zhidian.interceptors
 * @Description: TODO(用一句话描述该文件做什么)
 * @author dongneng
 * @date 2017-3-19 下午8:15:39
 * @version V1.0
 */
package com.zhidian.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhidian.bases.worms.WormsService;

/**
 * @ClassName: MainSearchController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dongneng
 * @date 2017-3-19 下午8:15:39
 * 
 */
@Controller
@RequestMapping("/search")
public class MainSearchController {
	
	@Autowired
	WormsService wormsService;

	// 搜索服务
	@GetMapping(value = { "", "/" })
	public String index(
			@RequestParam(value = "q", required = false) String key, Model model) {

		// 从索引

		// 从数据库

		//

		return "search/index";
	}

	
	// 显示搜索页结果
	@GetMapping("/json")
	@ResponseBody
	public Object json(
			@RequestParam(value = "f", required = false, defaultValue = "segmentfault") String from,
			@RequestParam("q") String query) {
		// 直接开始爬取
		return wormsService.onlinePullData(from, query);
	}
	
	// 多线程爬虫显示搜索页结果
	@GetMapping("/json2")
	@ResponseBody
	public Object json2(
			@RequestParam(value = "f", required = false, defaultValue = "segmentfault") String from,
			@RequestParam("q") String query) {
		// 直接开始爬取
		return wormsService.onlinePullDataThreading(from, query);
	}
}

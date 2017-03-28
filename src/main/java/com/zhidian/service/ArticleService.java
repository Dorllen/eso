package com.zhidian.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zhidian.views.ResultPageDTO;

@Service
public class ArticleService {

	public List<String> analyseKeyWord(String key) {
		// 分词器

		// 从数据库对比分词获取

		return null;
	}

	public void collectKeyWord() {
		// 收集用户点击后的文章，记录其关键词
	}

	public List<ResultPageDTO> getResultsByIndexCache(List<String> keyLists, String key, String from) {

		return null;
	}

	public List<ResultPageDTO> getResultsByDBWays(List<String> keyLists, String key, String from) {
		// TODO Auto-generated method stub
		return null;
	}

	public void searchResultsHandler(List<ResultPageDTO> results) {
		// 分析搜索结果，快照当前搜索结果

	}

	public void analyseSearchResultDiff(List<ResultPageDTO> list, String from) {
		// 分析搜索结果，记录与以前差别(如果from有，需要另再设计，因为是来自筛选网站的)
		// 与上一个分析结果不同，在于这个是要进入页面分析文章指数，如有必要更新当前文章数据（相同数据可能更新），并且是后台加入运行队列

	}

	public List<ResultPageDTO> getHandlerResults(List<ResultPageDTO> list, String from) {
		// 当爬虫之后，调用该处理器，处理排序问题。
		// 查询网站热度，排序数据
		// 没有定义筛选条件，就调用拼接器，处理数据
		
		return null;
	}

}


/**
* @Title: MainSearchController.java
* @Package com.zhidian.interceptors
* @Description: TODO(用一句话描述该文件做什么)
* @author dongneng
* @date 2017-3-19 下午8:15:39
* @version V1.0
*/
package com.zhidian.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping
	public String index(){
		return "search/index";
	}
	
	@RequestMapping("/")
	@ResponseBody
	public Object indexJson(){
		
		return "暂为null!";
	}
}


/**
* @Title: Article.java
* @Package com.zhidian.controllers
* @Description: TODO(用一句话描述该文件做什么)
* @author dongneng
* @date 2017-3-21 上午5:01:08
* @version V1.0
*/
package com.zhidian.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: Article
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dongneng
 * @date 2017-3-21 上午5:01:08
 *
 */
@Controller
@RequestMapping("/a")
public class MainArticleController {
	
	@GetMapping(value={"","/"})
	public String index(){
		// 内容显示，直接从数据看。
		
		
		return "a/index";
	}
	
	
	
}

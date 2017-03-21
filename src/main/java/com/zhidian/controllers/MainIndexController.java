
/**
* @Title: MainIndexController.java
* @Package com.zhidian.controllers
* @Description: TODO(用一句话描述该文件做什么)
* @author dongneng
* @date 2017-3-20 下午11:20:23
* @version V1.0
*/
package com.zhidian.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: MainIndexController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dongneng
 * @date 2017-3-20 下午11:20:23
 *
 */
@Controller
public class MainIndexController {
	
	@GetMapping(value={"","/"})
	public String index(){
		// 首页准备
		
		return "index";
	}
}

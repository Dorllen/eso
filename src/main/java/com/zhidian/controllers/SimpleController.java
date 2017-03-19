
/**
* @Title: SimpleController.java
* @Package com.zhidian.controllers
* @Description: TODO(用一句话描述该文件做什么)
* @author dongneng
* @date 2017-3-18 下午9:58:21
* @version V1.0
*/
package com.zhidian.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.zhidian.entities.User;
import com.zhidian.services.SimpleService;

/**
 * @ClassName: SimpleController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dongneng
 * @date 2017-3-18 下午9:58:21
 *
 */
@Controller
public class SimpleController {
	private Logger log = LoggerFactory.getLogger(getClass());
	
	
	@Autowired
	SimpleService simpleService;
	
	@RequestMapping("/demo")
	@ModelAttribute
	public String demo(Model model){
		model.addAttribute("name", "dongneng");
		return "demo";
	}
	
	@RequestMapping("/demo2")
	public String demo2(){
		return "demo2";
	}
	
	@GetMapping("/tt/")
	public String t(){
		System.out.println("T1");
		return null;
	}
	
	@PostMapping("/tt/")
	public String t2(){
		System.out.println("T2");
		return null;
	}
	
	@RequestMapping("/demo3")
	public String demo3(){
		return "jDemo";
	}
	
	@ResponseBody
	@RequestMapping("/user")
	public List<User> allUser(){
		log.info("info: select all user..");
		log.debug("debug: select all user..");
		log.error("error: select all user..");
		List<User> list = simpleService.getAllUser();
		return list;
	}
	
	@RequestMapping("/error2")
	@ResponseStatus(code=HttpStatus.CONFLICT,reason="not not not")
	@ExceptionHandler(Exception.class)
	public void error(){
		System.out.println("in error2...");
		int i = 1/0;
		System.out.println(i);
//		return "error";
	}
	
	@RequestMapping("/t")
	public ModelAndView modelView(ModelAndView model){
		model.addObject(1);
		model.setViewName("demo");
		return model;
	}
	
	@RequestMapping("/u/{id}")
	public String Id(@PathVariable int id){
		System.out.println(id);
		return "id:"+id;
	}
	
	@RequestMapping("/uname/{name:[a-zA-Z]+}")
	public String Name(@PathVariable String name){
		System.out.println(name);
		return "name:"+name;
	}
	
	@RequestMapping("/r1")
	public String re1(){
		System.out.println("r1");
		return "redirect:/demo";
	}
	@RequestMapping("/r2")
	public String re2(){
		System.out.println("r2");
		return "redirect:demo";
	}
	
	@RequestMapping("/f1")
	public String fo1(){
		System.out.println("fo1");
		return "forward:/demo";
	}
	@RequestMapping("/f2")
	public String fo2(){
		System.out.println("fo2");
		return "forward:demo";
	}
	@RequestMapping("/f/f1")
	public String f11(){
		System.out.println("f11");
		return "forward:/demo";
	}
	@RequestMapping("/f/f2")
	public String f12(){
		System.out.println("f12");
		return "forward:demo";
	}
	@RequestMapping("/f/demo")
	@ResponseBody
	public String fdemo(){
		System.out.println("fdemo");
		return "f/demo";
	}
}

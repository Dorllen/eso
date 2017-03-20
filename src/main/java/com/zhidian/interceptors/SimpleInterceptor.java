
/**
* @Title: SimpleInterceptor.java
* @Package com.zhidian.interceptors
* @Description: TODO(用一句话描述该文件做什么)
* @author dongneng
* @date 2017-3-18 下午11:15:29
* @version V1.0
*/
package com.zhidian.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: SimpleInterceptor
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dongneng
 * @date 2017-3-18 下午11:15:29
 *
 */
public class SimpleInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		System.out.println("simpleIterceptor prehandler");
		System.out.println(System.nanoTime());
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("simpleIterceptor postHandle");
		System.out.println(System.nanoTime());
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("simpleIterceptor afterCompletion");
		System.out.println(System.nanoTime());
	}


}

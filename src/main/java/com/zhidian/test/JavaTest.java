
/**
* @Title: JavaTest.java
* @Package com.zhidian.test
* @Description: TODO(用一句话描述该文件做什么)
* @author dongneng
* @date 2017-3-21 上午1:37:55
* @version V1.0
*/
package com.zhidian.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName: JavaTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dongneng
 * @date 2017-3-21 上午1:37:55
 *
 */
public class JavaTest {
	public static void main(String[] args) {
		String url = "http://demo.com/js/ss/ee.css?ddd=123";
		Pattern pattern = Pattern.compile("^.*\\.css.*$");
		Matcher matcher = pattern.matcher(url);
		System.out.println(matcher.matches());
	}
}

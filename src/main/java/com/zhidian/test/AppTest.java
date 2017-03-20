
/**
* @Title: AppTest.java
* @Package com.zhidian.test
* @Description: TODO(用一句话描述该文件做什么)
* @author dongneng
* @date 2017-3-19 上午1:51:13
* @version V1.0
*/
package com.zhidian.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhidian.WebApplication;
import com.zhidian.mappers.UserMapper;

/**
 * @ClassName: AppTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dongneng
 * @date 2017-3-19 上午1:51:13
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = WebApplication.class)
public class AppTest {
	
	
	@Autowired
	UserMapper userMapper;
	
	@Test
	@Rollback
	public void Insert() throws Exception {
		
	}
	
	@Test
	public void test() throws Exception {
		
	}
	
}

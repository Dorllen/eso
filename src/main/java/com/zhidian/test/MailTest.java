/**
 * @Title: MailTest.java
 * @Package com.zhidian.test
 * @Description: TODO(用一句话描述该文件做什么)
 * @author dongneng
 * @date 2017-3-19 下午7:34:08
 * @version V1.0
 */
package com.zhidian.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

import com.zhidian.WebApplication;

/**
 * @ClassName: MailTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dongneng
 * @date 2017-3-19 下午7:34:08
 * 
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebApplication.class)
public class MailTest {
	@Autowired
	private JavaMailSender javaMailSender;

	@Value("${spring.mail.username}")
	private String username;

	@Test
	public void testSendSimple() {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(username);
		message.setTo("393156105@qq.com");
		message.setSubject("标题：测试标题");
		message.setText("测试内容部份");
		javaMailSender.send(message);
	}
}

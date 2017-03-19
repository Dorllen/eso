
/**
* @Title: SimpleService.java
* @Package com.zhidian.services
* @Description: TODO(用一句话描述该文件做什么)
* @author dongneng
* @date 2017-3-18 下午11:48:52
* @version V1.0
*/
package com.zhidian.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhidian.entities.User;
import com.zhidian.mappers.UserMapper;

/**
 * @ClassName: SimpleService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dongneng
 * @date 2017-3-18 下午11:48:52
 *
 */
@Service
public class SimpleService {
	@Autowired
	UserMapper userMapper;
	
	public List<User> getAllUser(){
		return userMapper.getAllUser();
	}
	
}


/**
* @Title: UserMapper.java
* @Package com.zhidian.mapper
* @Description: TODO(用一句话描述该文件做什么)
* @author dongneng
* @date 2017-3-18 下午11:41:29
* @version V1.0
*/
package com.zhidian.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zhidian.model.User;

/**
 * @ClassName: UserMapper
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dongneng
 * @date 2017-3-18 下午11:41:29
 *
 */
@Mapper
public interface UserMapper {
	List<User> getAllUser();
}

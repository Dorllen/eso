/**
 * @Title: NotFoundException.java
 * @Package com.zhidian.exceptions
 * @Description: TODO(用一句话描述该文件做什么)
 * @author dongneng
 * @date 2017-3-20 下午4:28:31
 * @version V1.0
 */
package com.zhidian.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @ClassName: NotFoundException
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dongneng
 * @date 2017-3-20 下午4:28:31
 * 
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "not found")
public class NotFoundException extends RuntimeException {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 1L;

}

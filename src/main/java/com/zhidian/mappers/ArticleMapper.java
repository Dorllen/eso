
/**
* @Title: ArticleMapper.java
* @Package com.zhidian.mappers
* @Description: TODO(用一句话描述该文件做什么)
* @author dongneng
* @date 2017-3-20 下午10:40:43
* @version V1.0
*/
package com.zhidian.mappers;

import org.apache.ibatis.annotations.Mapper;

import com.zhidian.entities.Article;

/**
 * @ClassName: ArticleMapper
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dongneng
 * @date 2017-3-20 下午10:40:43
 *
 */
@Mapper
public interface ArticleMapper {
	// 增
	
	void addArticle(Article article);
	
	
	// 删
	
	
	// 改
	
	
}

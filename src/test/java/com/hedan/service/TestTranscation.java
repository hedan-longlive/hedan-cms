package com.hedan.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hedan.entity.Article;



/**
 * 测试事务
 * @author Administrator
 *
 */
public class TestTranscation extends BaseTest {
	
	@Autowired
	ArticleService articleService;

	/**
	 * 
	 */
	@Test
	public void testAddArticle() {
		Article article = new Article();
		article.setContent("测试内容22");
		article.setTags(" zhSANG1222,LISI22");
		articleService.add(article);
		
		
	}
}

package com.hedan.service;

import java.util.List;

import com.hedan.entity.Article4Vote;
import com.hedan.entity.VoteStatic;


/**
 * 
 * @author Administrator
 *
 */
public interface Article4VoteService {
	
	int publish(Article4Vote av);
	
	List<Article4Vote>  list();
	
	Article4Vote  findById(Integer id);
	
	int vote(Integer articleId,Character option);
	//int vote(Integer userId, Integer articleId,Character option);
	
	List<VoteStatic> getVoteStatics(Integer articleId);
	
	
	

}

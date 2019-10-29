package com.hedan.service;

import java.util.List;

import com.hedan.entity.Channel;



/**
 * 
 * @author Administrator
 *
 */
public interface ChannelService {

	/**
	 *  获取所有的频道（栏目）
	 * @return
	 */
	List<Channel> getAllChnls();

}

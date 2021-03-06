package com.hedan.dao;


import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hedan.entity.Channel;


/**
 * 
 * @author Administrator
 *
 */
public interface ChannelMapper {

	/**
	 * 获取所有的频道
	 * @return
	 */
	@Select("SELECT * FROM cms_channel ORDER BY id")
	List<Channel> listAll();
	
	/**
	 *  根据id获取对应的频道
	 * @param id
	 * @return
	 */
	/*@Select("SELECT * FROM cms_channel WHERE id = #{value} limit 1")*/
	Channel findById(Integer id);
	
	

}

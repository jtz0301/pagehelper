package com.jz.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jz.entity.User;

public interface UserDao {
	
	public List<User> queryAll();
	
	
	int deleteByList(@Param("ids")List<Integer> ids);
	
	int deleteByArray(@Param("ids")Integer[] ids);

}

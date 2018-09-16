package com.jz.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.jz.entity.User;
import com.jz.util.PagedResult;
import com.jz.util.ResultUtil;

public interface UserService {
	
	public PagedResult<User> queryAll();
	
	public ResultUtil deleteByList();
	
	public ResultUtil deleteByArray();
	

}

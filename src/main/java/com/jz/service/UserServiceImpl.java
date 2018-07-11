package com.jz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jz.dao.UserDao;
import com.jz.entity.User;
import com.jz.util.BeanUtil;
import com.jz.util.PagedResult;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	@Override
	public PagedResult<User> queryAll() {
		
		
		PageHelper.startPage(1,4);
		
		
		List<User> queryAll = userDao.queryAll();
		
		PageInfo<User> page=new PageInfo<User>();
		
		
		return BeanUtil.toPagedResult(queryAll);
	}

}

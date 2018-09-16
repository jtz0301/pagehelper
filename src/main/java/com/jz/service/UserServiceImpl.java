package com.jz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jz.dao.UserDao;
import com.jz.entity.User;
import com.jz.util.BeanUtil;
import com.jz.util.PagedResult;
import com.jz.util.ResultUtil;

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
	@Override
	public ResultUtil deleteByList() {
		ResultUtil resultUtil=new ResultUtil();
		List<Integer> ids=new ArrayList<Integer>();
		ids.add(177);
		ids.add(178);
		//ids.add(3);
		
		int id = userDao.deleteByList(ids);
		if(id>0) {
			return resultUtil.set(1, "批量list删除成功");
		}else {
			return resultUtil.set(2, "批量list删除失败");

		}
	}
	@Override
	public ResultUtil deleteByArray() {
		ResultUtil resultUtil=new ResultUtil();
		Integer[] ids= {190,195};
		
		int id = userDao.deleteByArray(ids);
		if(id>0) {
			return resultUtil.set(1, "批量list删除成功");
		}else {
			return resultUtil.set(2, "批量list删除失败");

		}
	}

}

package com.jz.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jz.entity.User;
import com.jz.service.UserService;
import com.jz.util.PagedResult;
import com.jz.util.ResultUtil;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@ApiOperation(value = "添加部门", notes = "添加部门", response = ResultUtil.class, httpMethod = "POST")
    @RequestMapping("/queryAll")
	public PagedResult<User> queryAll(){
		PagedResult<User> queryAll = userService.queryAll();
		System.out.println("queryAll======"+queryAll);
		return queryAll;
	}
	
	
	
	@ApiOperation(value = "List几个批量删除", notes = "List几个批量删除", response = ResultUtil.class, httpMethod = "POST")
    @RequestMapping("/deleteByList")
	public ResultUtil deleteByList(){
		ResultUtil deleteByList = userService.deleteByList();
		return deleteByList;
	}
	
	
	
	@ApiOperation(value = "数组几个批量删除", notes = "数组几个批量删除", response = ResultUtil.class, httpMethod = "POST")
    @RequestMapping("/deleteByArray")
	public ResultUtil deleteByArray(){
		ResultUtil deleteByList = userService.deleteByArray();
		return deleteByList;
	}
	
	

}

package com.jz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.jz.entity.User;
import com.jz.service.UserService;
import com.jz.util.PagedResult;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@ResponseBody
	@RequestMapping("queryAll")
	public PagedResult<User> queryAll(){
		PagedResult<User> queryAll = userService.queryAll();
		System.out.println("queryAll======"+queryAll);
		return queryAll;
	}
	
	

}

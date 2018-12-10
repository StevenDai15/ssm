package com.luckydb.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.luckydb.model.User;
import com.luckydb.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;

    /**
     * 
     * @param request
     * @param response
     * @param model
     * @return
     */
	@RequestMapping(value = "/saveUser")
	public String saveUser(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		List<User> userList = userService.readAllUser();
		for (User user : userList) {
			System.out.println(JSONObject.toJSONString(user));
		}
		
		return "userList";
		
	}

}

package com.yq.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yq.pojo.Users;

@Controller
public class UserController {

	
	@RequestMapping("/queryUsers")
	public ModelAndView queryUsers() {
		List<Users> list = new ArrayList<>();
		for (int i = 1; i < 11; i++) {
			Users user = new Users(i, "Jack"+i, 20);
			list.add(user);
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("userList", list);
		mv.setViewName("list");
		return mv;
		
	}
}

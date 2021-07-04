package com.myshop.demo.controller;

import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myshop.demo.entity.Users;
import com.myshop.demo.service.UsersService;

@RestController
@RequestMapping(value = "/userController")
public class UserController { 
	
	@Autowired
	UsersService uSer;
	
	@PostMapping(value = "/saveUsers")
	public HashMap<String, Object> saveUsers(@RequestBody Users u) {
		u.setCreatedAt(new Date());
		HashMap<String, Object> map = new HashMap<>();
		Users data = uSer.saveUsers(u);
		if (data!=null) {
			map.put("code", "200");
			map.put("content", data);
		} else {
			map.put("code", "201");
			map.put("content", "201");
			
		}
		return map;
		
	}
	@GetMapping(value = "/getUserById")
	public HashMap<String, Object> getUserById(Long id) {
		Users data = uSer.findById(id);
		HashMap<String, Object> map = new HashMap<>();
		if (data!=null) {
			map.put("code", "200");
			map.put("content", data);
		} else {
			map.put("code", "201");
			map.put("content", "201");
			
		}
		return map;
		
	}

	// i am testing git here
}

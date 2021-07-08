package com.myshop.demo.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

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
		
		HashMap<String, Object> map = new HashMap<>();
		Users phonePresent = uSer.findByPhone(u.getPhone());
		  Users userPresent = uSer.findUsersByUserName(u.getUserName());
		  if (phonePresent!=null&& userPresent!=null) {
			map.put("code", "250");
			map.put("content", "phone or userName already exist");
		} else {
			Users data = uSer.saveUsers(u);
			if (data!=null) {
				map.put("code", "200");
				map.put("content", data);
			} else {
				map.put("code", "201");
				map.put("content", "no data");
				
			}
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


	@GetMapping(value = "/getUserByPhoneNo")
	public HashMap<String, Object> getUserByPhoneNo(String phone) {
		Users data = uSer.findByPhone(phone);
		HashMap<String, Object> map = new HashMap<>();
		if (data!=null) {
			map.put("code", "200");
			map.put("content", data);
		} else {
			map.put("code", "201");
			map.put("content", "no data");
			
			
		}
		return map;
		
	}
	@GetMapping(value = "/getUserByUserName/{name}")
	public HashMap<String, Object> getUserByUserName(@PathVariable ("name") String userName) {
		 Users data = uSer.findUsersByUserName(userName);
		 HashMap<String, Object> map = new HashMap<>();
			if (data!=null) {
				map.put("code", "200");
				map.put("content", data);
			} else {
				map.put("code", "201");
				map.put("content", "no data");
				
				
			}
			return map;
		
	}
	@PostMapping(value = "/getUserByPhoneNoAndPassword")
	public HashMap<String, Object> getUserByPhoneNoAndPassword(String phone, String password) {
		Users data = uSer.getUserByPhoneNoAndPassword(phone,password);
		HashMap<String, Object> map = new HashMap<>();
		if (data!=null) {
			map.put("code", "200");
			map.put("content", data);
		} else {
			map.put("code", "201");
			map.put("content", "no data");
			
			
		}
		return map;
	}
	
	@PostMapping(value = "/getUserByUserNameAndPassword")
	public HashMap<String, Object> getUserByUserNameAndPassword(String userName, String password) {
		Users data = uSer.getUserByUserNameAndPassword(userName,password);
		HashMap<String, Object> map = new HashMap<>();
		if (data!=null) {
			map.put("code", "200");
			map.put("content", data);
		} else {
			map.put("code", "201");
			map.put("content", "no data");
			
			
		}
		return map;
	}
	@GetMapping(value= "/getAllUsers")
    public HashMap<String, Object> getAllUsers(){
	List<Users>userdata=uSer.findAll();
	HashMap<String,Object>map=new HashMap<>();
	if (userdata!=null) {
		map.put("code", "200");
		map.put("content", userdata);
	} else {
		map.put("code", "201");
		map.put("content", "nodata");
	}
	
      return map;

	}
}

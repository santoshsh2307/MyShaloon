package com.myshop.demo.service;

import java.util.List;

import com.myshop.demo.entity.Users;

public interface UsersService {
	 
	public Users saveUsers(Users u);

	public List<Users> findAll();

}

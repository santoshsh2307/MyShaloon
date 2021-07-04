package com.myshop.demo.serviceImpl;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.demo.entity.Users;
import com.myshop.demo.repository.UsersRepository;
import com.myshop.demo.service.UsersService;

@Service
public class UserServiceImpl implements UsersService {
	
	@Autowired
	UsersRepository uRepo;

	@Transactional
	public Users saveUsers(Users u) {
		// TODO Auto-generated method stub 
		u.setCreatedAt(new Date());
		u.setStatus(true);
		Users data = uRepo.save(u);
		
		return data;
	}

}

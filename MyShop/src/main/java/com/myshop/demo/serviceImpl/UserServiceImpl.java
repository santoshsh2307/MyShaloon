package com.myshop.demo.serviceImpl;

import java.util.Date;
import java.util.Optional;
import java.util.List;

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

	@Transactional
	public Users findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Users> data = uRepo.findById(id);
		return data.get();
	}

	@Transactional
	public Users findByPhone(String phone) {
		Users data = uRepo.findByPhone(phone);
		// TODO Auto-generated method stub
		return data;
	}

	@Transactional
	public Users findUsersByUserName(String userName) {
		// TODO Auto-generated method stub
		Users data = uRepo.findByUserName(userName);
		return data;
	}

	@Transactional
	public Users getUserByPhoneNoAndPassword(String phone, String password) {
		// TODO Auto-generated method stub
		Users data = uRepo.findByPhoneAndPassword(phone,password);
		return data;
	}

	@Transactional
	public Users getUserByUserNameAndPassword(String userName, String password) {
		// TODO Auto-generated method stub
		Users data = uRepo.findByUserNameAndPassword(userName,password);
		return data;
	}
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return uRepo.findAll();
	}

}

package com.myshop.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myshop.demo.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{

	Users findByPhone(String phone);

	Users findByUserName(String userName);

	Users findByPhoneAndPassword(String phone, String password);

	Users findByUserNameAndPassword(String userName, String password);

}

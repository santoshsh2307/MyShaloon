package com.myshop.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myshop.demo.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{

}

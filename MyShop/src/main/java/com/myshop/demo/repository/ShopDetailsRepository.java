package com.myshop.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myshop.demo.entity.ShopDetails;

@Repository
public interface ShopDetailsRepository extends JpaRepository<ShopDetails, Long>{

}

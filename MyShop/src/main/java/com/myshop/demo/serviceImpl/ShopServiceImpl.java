package com.myshop.demo.serviceImpl;

import java.util.Date;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.demo.entity.ShopDetails;
import com.myshop.demo.repository.ShopAvailablityRepository;
import com.myshop.demo.repository.ShopDetailsRepository;
import com.myshop.demo.service.ShopService;

@Service
public class ShopServiceImpl implements ShopService{
	
	@Autowired
	ShopDetailsRepository sRepo;

	@Transactional
	public ShopDetails saveShop(ShopDetails s) {
		s.setCreatedAt(new Date());
		s.setStatus(true);
		// TODO Auto-generated method stub
		ShopDetails data = sRepo.save(s);
		return data;
	}

	@Transactional
	public ShopDetails findShopById(Long id) {
		// TODO Auto-generated method stub
		Optional<ShopDetails> data = sRepo.findById(id);
		return data.get();
	}

}

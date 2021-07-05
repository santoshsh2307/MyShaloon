package com.myshop.demo.service;

import java.util.List;

import com.myshop.demo.entity.ShopDetails;

public interface ShopService  {


	ShopDetails saveShop(ShopDetails s);

	ShopDetails findShopById(Long id);
	List<ShopDetails> findAll();

}

package com.myshop.demo.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myshop.demo.entity.ShopDetails;
import com.myshop.demo.service.ShopService;

@RestController
@RequestMapping(value = "/shopController")
public class ShopController {

	@Autowired
	ShopService sSer; 
	
	@PostMapping(value = "/createShop")
	public HashMap<String, Object> createShop(@RequestBody ShopDetails s) {
		ShopDetails data = sSer.saveShop(s);
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
	@GetMapping(value ="/getAllShopDetails")
	public List<ShopDetails>getAllShopDetails(){
	List<ShopDetails>shopdata=sSer.findAll();
	if(shopdata!=null && shopdata.isEmpty());
	return shopdata;
	}
}

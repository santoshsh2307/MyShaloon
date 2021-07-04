package com.myshop.demo.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myshop.demo.entity.ShopAvailablity;
import com.myshop.demo.service.ShopAvailabilityService;

@RestController
@RequestMapping(value = "/shopAvailablityController")
public class ShopAvailablityController {
	
	@Autowired
	ShopAvailabilityService saSer;
	
	@PostMapping(value = "/saveShopAvailability")
	public HashMap<String, Object> saveShopAvailability(ShopAvailablity sa) {
		ShopAvailablity data = saSer.saveShopAvailability(sa);
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
	@GetMapping(value= "/getAllShopAvailablity")
	public List<ShopAvailablity>getAllShopAvailablity(){
		List<ShopAvailablity>shopdata=saSer.findAll();
		if(shopdata!=null && shopdata.isEmpty());
		return shopdata;
	}

	
}

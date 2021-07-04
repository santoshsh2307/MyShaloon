package com.myshop.demo.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myshop.demo.entity.EmployeeShopOwnerRelation;
import com.myshop.demo.service.ESORService;

@RestController
@RequestMapping(value = "/eSORController")
public class ESORController {
	
	@Autowired
	ESORService esorSer;
	
	@PostMapping(value = "/saveESOR")
	public HashMap<String, Object> saveESOR(@RequestBody EmployeeShopOwnerRelation esor ) {
		EmployeeShopOwnerRelation data = esorSer.saveESOR(esor);
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

}

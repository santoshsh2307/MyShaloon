package com.myshop.demo.service;

import java.util.List;

import com.myshop.demo.entity.EmployeeShopOwnerRelation;

public interface ESORService {

	EmployeeShopOwnerRelation saveESOR(EmployeeShopOwnerRelation esor);

	List<EmployeeShopOwnerRelation> findAll();

}

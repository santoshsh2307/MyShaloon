package com.myshop.demo.service;

import java.util.Optional;

import com.myshop.demo.entity.EmployeeShopOwnerRelation;

public interface ESORService {

	EmployeeShopOwnerRelation saveESOR(EmployeeShopOwnerRelation esor);

	Optional<EmployeeShopOwnerRelation> findESORById(Long id);

}

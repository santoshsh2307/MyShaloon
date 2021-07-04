package com.myshop.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myshop.demo.entity.EmployeeShopOwnerRelation;

@Repository
public interface EmployeeShopOwnerRelationRepository extends JpaRepository<EmployeeShopOwnerRelation, Long>{

}

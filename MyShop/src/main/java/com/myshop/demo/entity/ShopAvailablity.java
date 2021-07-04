package com.myshop.demo.entity;

import java.util.Date;
import java.util.TimeZone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "shop_availabity")
public class ShopAvailablity {

	private Long id;
	private Long shopId;
	private TimeZone loginTime;
	private TimeZone logoutTime;
	private Date createdDate;
	private Boolean status;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "shop_id")
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	
	@Column(name = "login_time")
	public TimeZone getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(TimeZone loginTime) {
		this.loginTime = loginTime;
	}
	
	@Column(name = "logout_time")
	public TimeZone getLogoutTime() {
		return logoutTime;
	}
	public void setLogoutTime(TimeZone logoutTime) {
		this.logoutTime = logoutTime;
	}
	
	@Column(name = "created_date")
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	@Column(name = "status")
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	
	
	
}

package com.bank.Entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer customerId;
	@Column(name = "customername")
	private String customerName;
	
	

	@Column(name = "created")
	private LocalDateTime createDateon;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public LocalDateTime getCreateDateon() {
		return createDateon;
	}

	public void setCreateDateon(LocalDateTime createDateon) {
		this.createDateon = createDateon;
	}
	
	

	
	
	
	
	
	
	
	
	
	
}

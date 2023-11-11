package com.customer.test;

import com.bank.DAO.CustomerDAO;
import com.bank.DAO.CustomerDAOImpl;
import com.bank.Entities.Customer;

public class CustomerTest {

	public static void main(String[] args) {

		Customer c=new Customer();
		c.setCustomerName("veky");
		c.setCustomerId(425);
		CustomerDAO d=new CustomerDAOImpl();
		d.save(c);
		
	}

}

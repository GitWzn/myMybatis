package com.wzn.dao;

import java.util.List;

import com.wzn.Bean.Customer;

public interface ICustomerDao {
	public List<Customer> findAllCustomer();
}

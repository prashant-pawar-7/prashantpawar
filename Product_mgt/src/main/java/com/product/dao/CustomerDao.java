package com.product.dao;

import java.util.List;

import com.product.entities.Customer;


public interface CustomerDao {
	public int insertCustomer(Customer cst);

	public int updateCustomer(int id,String cname);

	public int deleteCustomer(Customer cst);

	public Customer getCustomer(int id);

	public List<Customer> getAllCustomers();
}

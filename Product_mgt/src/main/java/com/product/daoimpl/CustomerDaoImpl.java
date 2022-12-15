package com.product.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.product.dao.CustomerDao;
import com.product.entities.Customer;

public class CustomerDaoImpl implements CustomerDao{
	
     private HibernateTemplate ht;
	@Transactional
	//to insert customer
	public int insertCustomer(Customer cst) {
		int i=(Integer) ht.save(cst);
		return i;
	}
  @Transactional
  //to update customer name
	public int updateCustomer(int id, String cname) {
		Customer c=ht.get(Customer.class, id);
		c.setCname(cname);
		 ht.update(c);
	return 1;
	}
  @Transactional
  // to delete customer
	public int deleteCustomer(Customer cst) {
	  ht.delete(cst);
	
	  return 1;
	}
// to view customer details
	public Customer getCustomer(int id) {
		
		return ht.get(Customer.class, id);
	}
     // to view all customers
	public List<Customer> getAllCustomers() {
		List<Customer> clist=ht.loadAll(Customer.class);
		return clist;
	}
	// getter for hibernate template bean
	public HibernateTemplate getHt() {
		return ht;
	}
//setter for hibernate template bean
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

}

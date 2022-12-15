package com.product.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.product.dao.ProductDao;
import com.product.entities.Product;

public class ProductDaoImpl implements ProductDao{
private HibernateTemplate ht;

@Transactional
//to insert product
	public int insertProduct(Product p) {
		ht.save(p);
		return 1;
	}
@Transactional
// update product name
	public int updateProduct(int id, String pname) {
		Product product=ht.get(Product.class, id);
	ht.update(product);
	return 1;
	}
@Transactional
// to delete product
	public int deleteProduct(Product p) {
		ht.delete(p);
	return 1;
	}
// to view product details
	public Product getProduct(int id) {
		
		return ht.get(Product.class, id);
	}
// to view all products
	public List<Product> getAllProducts() {
		List<Product> pList=ht.loadAll(Product.class);
		return pList;
	}
	//getter for hibernate template bean
	public HibernateTemplate getHt() {
		return ht;
	}
	//setter for hibernate template bean
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
}

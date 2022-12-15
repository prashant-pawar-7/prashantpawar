package com.product.dao;

import java.util.List;

import com.product.entities.Product;

public interface ProductDao {
	public int insertProduct(Product p);

	public int updateProduct(int id,String pname);

	public int deleteProduct(Product p);

	public Product getProduct(int id);

	public List<Product> getAllProducts();
}

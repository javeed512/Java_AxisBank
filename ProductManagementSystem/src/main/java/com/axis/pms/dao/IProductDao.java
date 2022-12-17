package com.axis.pms.dao;

import java.util.List;

import com.axis.pms.beans.Product;

public interface IProductDao {
	
	
	public int addProduct(Product product);
	public int updateProduct(Product product);
	
	public  int  deleteProductById(long productId);
	
	public  Product selectProductById(long productId);

	public     List<Product>      selectAllProducts();
	
	
	
	

}

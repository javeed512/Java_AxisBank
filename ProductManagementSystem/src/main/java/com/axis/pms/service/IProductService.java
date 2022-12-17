package com.axis.pms.service;

import java.util.List;

import com.axis.pms.beans.Product;

public interface IProductService {
	
		
		public int addProduct(Product product);
		public int updateProduct(Product product);
		
		public  int  deleteProductById(long productId);
		
		public  Product selectProductById(long productId);
	
		public     List<Product>      selectAllProducts();
		

}

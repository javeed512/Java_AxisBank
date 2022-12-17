package com.axis.pms.service;

import java.util.List;

import com.axis.pms.beans.Product;
import com.axis.pms.dao.IProductDao;
import com.axis.pms.dao.ProductDaoImp;

public class ProductServiceImp implements IProductService {

	private IProductDao dao;

	public ProductServiceImp() {

		this.dao = new ProductDaoImp();

	}

	@Override
	public int addProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.addProduct(product);
	}

	@Override
	public int updateProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.updateProduct(product);
	}

	@Override
	public int deleteProductById(long productId) {
		// TODO Auto-generated method stub
		return dao.deleteProductById(productId);
	}

	@Override
	public Product selectProductById(long productId) {
		// TODO Auto-generated method stub
		return dao.selectProductById(productId);
	}

	@Override
	public List<Product> selectAllProducts() {
		// TODO Auto-generated method stub
		return dao.selectAllProducts();
	}

}

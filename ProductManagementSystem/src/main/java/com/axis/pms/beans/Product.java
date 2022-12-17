package com.axis.pms.beans;

import java.sql.Date;


public class Product {
	
	
	private long productId;
	private String productName;
	private double price;
	private Date dop;
	
	public Product() {
		
		
	}

	public Product(long productId, String productName, double price, Date dop) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.dop = dop;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDop() {
		return dop;
	}

	public void setDop(Date dop) {
		this.dop = dop;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", dop=" + dop
				+ "]";
	}
	
	
	
	
	
	
	
	

}

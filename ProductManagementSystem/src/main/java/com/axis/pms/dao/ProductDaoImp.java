package com.axis.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.axis.pms.beans.Product;

//DATABASE CONNECTION LOGICS
public class ProductDaoImp implements IProductDao {

	Connection conn;

	public ProductDaoImp() {

		conn = DBUtil.getDBConncetion();

	}

	@Override
	public int addProduct(Product product) {

		int count = 0;

		String insertQuery = "insert into products(pid,pname,price,dop) values(?,?,?,current_date)";

		try {
			PreparedStatement pstmt = conn.prepareStatement(insertQuery);

			pstmt.setLong(1, product.getProductId());
			pstmt.setString(2, product.getProductName());
			pstmt.setDouble(3, product.getPrice());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public int updateProduct(Product product) {
		int count = 0;

		String updateQuery = "update products set  pname =? , price = ? , dop = current_date+1 where pid = ?";

		try {
			PreparedStatement pstmt = conn.prepareStatement(updateQuery);

			pstmt.setString(1, product.getProductName());
			pstmt.setDouble(2, product.getPrice());
			pstmt.setLong(3, product.getProductId());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public int deleteProductById(long productId) {
		int count = 0;

		String deleteQuery = "delete from products where pid =?";

		try {
			PreparedStatement pstmt = conn.prepareStatement(deleteQuery);

			pstmt.setLong(1, productId);

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

	@Override
	public Product selectProductById(long productId) {

		String selectOne = "select pid,pname,price,dop from products where pid = ?";

		Product product = null; // to store product record coming from data base

		try {
			PreparedStatement pstmt = conn.prepareStatement(selectOne);

			pstmt.setLong(1, productId);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				product = new Product();

				product.setProductId(rs.getLong("pid"));
				product.setProductName(rs.getString("pname"));
				product.setPrice(rs.getDouble("price"));
				product.setDop(rs.getDate("dop"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return product;
	}

	@Override
	public List<Product> selectAllProducts() {

		String selectAll = "select pid,pname,price,dop from products ";

		List<Product> list = new ArrayList<Product>();

		try {
			PreparedStatement pstmt = conn.prepareStatement(selectAll);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				Product product = new Product();

				product.setProductId(rs.getLong("pid"));
				product.setProductName(rs.getString("pname"));
				product.setPrice(rs.getDouble("price"));
				product.setDop(rs.getDate("dop"));

				
						list.add(product);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return list;
		
	}

}

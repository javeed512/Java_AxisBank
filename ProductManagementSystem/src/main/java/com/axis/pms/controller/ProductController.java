package com.axis.pms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.axis.pms.beans.Product;
import com.axis.pms.dao.DBUtil;
import com.axis.pms.service.IProductService;
import com.axis.pms.service.ProductServiceImp;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	private IProductService service;
	
	
	public ProductController() {
		
		this.service = new ProductServiceImp();
		
	}
	
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		
		
		PrintWriter out = response.getWriter();

		out.print(DBUtil.getDBConncetion());

		String action = request.getParameter("action");

		switch (action) {
		case "add":

				out.print("Add done");
				
				Product product = new Product();
				
				product.setProductId(Long.parseLong(request.getParameter("pid")));
				
				product.setProductName(request.getParameter("pname"));
				
				product.setPrice(Double.parseDouble(request.getParameter("price")));
				
				
				
			int count =	service.addProduct(product);
				
				if(count > 0) {
			out.print("<h1> Product Added Successfully </h1>");
			
				}
				else {
					
					out.print("<h2>Add Failed...</h2>");
					
				}
				
			break;
		case "update":

			break;
		case "selectAll":

			break;

		default:
			break;
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

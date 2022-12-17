package com.axis.pms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

		HttpSession session = request.getSession();

		RequestDispatcher reqDispatcher = request.getRequestDispatcher("/views/dashboard.jsp");

		out.print(DBUtil.getDBConncetion());

		String action = request.getParameter("action");

		switch (action) {
		case "add":

			Product product = new Product();

			product.setProductId(Long.parseLong(request.getParameter("pid")));

			product.setProductName(request.getParameter("pname"));

			product.setPrice(Double.parseDouble(request.getParameter("price")));

			int count = service.addProduct(product);

			reqDispatcher.include(request, response); // dispatch to dashboard

			if (count > 0) {
				out.print("<h1 style='color:green'> Product Added Successfully </h1>");

			} else {

				out.print("<h2 style='color:red'>Add Operation Failed...</h2>");

			}

			break;
		case "update":

			Product product1 = new Product();

			product1.setProductId(Long.parseLong(request.getParameter("pid")));

			product1.setProductName(request.getParameter("pname"));

			product1.setPrice(Double.parseDouble(request.getParameter("price")));

			int count1 = service.updateProduct(product1);

			reqDispatcher.include(request, response);

			if (count1 > 0) {
				out.print("<h1 style='color:green'> Product Updated Successfully </h1>");

			} else {

				out.print("<h2 style='color:red'>Update Operation Failed...</h2>");

			}

			break;
		case "displayAll":

			List<Product> productList = service.selectAllProducts();

			session.setAttribute("productList", productList);

			RequestDispatcher rd = request.getRequestDispatcher("/views/displayAll.jsp");

			rd.include(request, response);

			break;

		case "delete":

			long deleteId = Long.parseLong(request.getParameter("pid"));

			int count2 = service.deleteProductById(deleteId);

			reqDispatcher.include(request, response);

			if (count2 > 0) {
				out.print("<h1 style='color:green'> Product Deleted Successfully </h1>");

			} else {

				out.print("<h2 style='color:red'>Delete Operation Failed...</h2>");

			}

			break;

		case "searchById":

			long searchId = Long.parseLong(request.getParameter("pid"));

			Product searchedProduct = service.selectProductById(searchId);

			session.setAttribute("product", searchedProduct);

			reqDispatcher.include(request, response);

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

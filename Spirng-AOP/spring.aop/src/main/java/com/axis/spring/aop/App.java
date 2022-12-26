package com.axis.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.axis.spring.aop.service.ShoppingCart;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Welcome to E-Store");

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ShoppingCart cart = context.getBean(ShoppingCart.class);

		// cart.login();

		cart.checkout("pending");

		cart.addProduct();

		cart.removeProduct();
		try {

			int n = cart.quantity(0);

			System.out.println(n);

		} catch (Exception e) {

			System.err.println("Invalid Quantity Exp");
		}

	}
}

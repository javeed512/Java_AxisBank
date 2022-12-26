package com.axis.spring.aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	
	@Before("execution(* com.axis.spring.aop.service.ShoppingCart.checkout(..))")
	public void beforeLogger() {
		
		
		System.out.println("shopping cart before logging..");
		
	}

	
	@After("execution(*  *.*.addProduct())")
	public void afterLogger() {
		
		
		System.out.println("logger after  addProduct() service ");
		
		
	}
	
	
	@Pointcut("execution(* com.axis.spring.aop.service.ShoppingCart.quantity(..))")
	public void  afterReturningPointCut() {
		
		
	}
	
	
	@AfterReturning(pointcut ="afterReturningPointCut()" , returning = "qty"  )
	
	public void afterReturningQuantity(int qty) {
		
		
		System.out.println("logger after  returing quantity only "+qty);
		
		
	}
	
	
	
	
	@AfterThrowing(pointcut = "afterReturningPointCut()" , throwing = "e")
	public void afterThrowingExp(Exception e) {
		
		
		
		System.out.println("logger after throwing exp " + e);
		
		
		
	}
	
	
	
}

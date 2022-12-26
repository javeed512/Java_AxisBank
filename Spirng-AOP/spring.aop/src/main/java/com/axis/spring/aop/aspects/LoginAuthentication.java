package com.axis.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAuthentication {
	
	@Pointcut("execution(* com.axis.spring.aop.service.ShoppingCart.login())")
	public void authenticationPointCut() {  // point cut exp
		
		
		
	}
	
	
	@Pointcut("execution(* com.axis.spring.aop.service.ShoppingCart.checkout(..))")
	public void authorizationPointCut() { // point cut exp
		
		
		
	}
	
	
	//@Before("execution(* com.axis.spring.aop.service.ShoppingCart.login())")
	
	
	@Before("authenticationPointCut() || authorizationPointCut() ")
	public void  loginAuthenticationAndAuthorization() { // cross cutting concern
		
		
			System.out.println("Authenticating User Login Request");
		
	}

}

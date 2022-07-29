package com.shoppingcart;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	 @Before("execution(* com.shoppingcart.ShoppingCart.checkout(..))")
	 public void logger() {
			
			System.out.println(" Before Loggers");
		}
@After	("execution(* *.*.*.checkout(..))")	
public void afterLogger() {
	System.out.println(" After Loggers");

}
}

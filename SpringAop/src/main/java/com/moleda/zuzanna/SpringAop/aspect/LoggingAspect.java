package com.moleda.zuzanna.SpringAop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allGetters()")
	public void LoggingAdvice(){
		System.out.println("Logging advice. Run advice.");
	}
	
	@Before("allGetters()")
	public void secondAdvice(){
		System.out.println("Second advice run.");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
}

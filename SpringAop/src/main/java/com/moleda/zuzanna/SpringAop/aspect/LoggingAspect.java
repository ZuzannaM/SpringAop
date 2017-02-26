package com.moleda.zuzanna.SpringAop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class LoggingAspect {

//	@Before("allGetters() && allCircleMethods()")
//	public void LoggingAdvice(){
//		System.out.println("Logging advice. Run advice.");
//	}
	
//	@Before("allGetters()")
//	public void secondAdvice(){
//		System.out.println("Second advice run.");
//	}
	
	@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void stringMethod(String name, Exception ex){
		System.out.println("Method with a String arguments has been called. String value id: " + name + " Exception: " + ex);
	}
	
	@AfterReturning(pointcut="args(name)", returning="ret")
	public void okMethod(String name, String ret){
		System.out.println("PPPPPPPPPPPP name: " + name + " returning value: " + ret);
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	@Pointcut("within(com.moleda.zuzanna.SpringAop.model.Circle)")
	public void allCircleMethods() {}
}

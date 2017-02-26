package com.moleda.zuzanna.SpringAop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
	
	
//	@AfterReturning("args(name)")
//	public void okMethod(String name){
//		System.out.println("PPPPPPPPPPPP name: " + name);
//	}
	
	@Around("allGetters()")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		
		Object returnValue = null;
		
		try {
			System.out.println("Before advice.");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("After Returning advice.");
		} catch (Throwable e) {
			System.out.println("After throwing advice.");
		}
		System.out.println("After finally advice.");
		return returnValue;
		
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	@Pointcut("within(com.moleda.zuzanna.SpringAop.model.Circle)")
	public void allCircleMethods() {}
}

package com.moleda.zuzanna.SpringAop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;



public class LoggingAspect {

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
	
	
	public void allGetters() {}
	
	public void getLoggingAdvice(){
		System.out.println("Logging advice");
	}
	
}

package com.moleda.zuzanna.SpringAop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moleda.zuzanna.SpringAop.service.ShapeService;

public class App {
	
	public static void main(String[] args) {
	
		AbstractApplicationContext cxt = new ClassPathXmlApplicationContext("spring.xml");
		cxt.registerShutdownHook();
		ShapeService shapeService = cxt.getBean("shapeService", ShapeService.class);
		
		shapeService.getCircle();
//		System.out.println(shapeService.getCircle().getName());
		
	}
}

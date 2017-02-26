package com.moleda.zuzanna.SpringAop.service;

import com.moleda.zuzanna.SpringAop.model.Circle;
import com.moleda.zuzanna.SpringAop.model.Triangle;

public class FactoryBeanService {

	public Object getBean(String beanName) {
		if (beanName.equals("shapeService"))
			return new ShapeServiceProxy();
		if (beanName.equals("circle"))
			return new Circle();
		if (beanName.equals("triangle"))
			return new Triangle();
		return null;
	}
}

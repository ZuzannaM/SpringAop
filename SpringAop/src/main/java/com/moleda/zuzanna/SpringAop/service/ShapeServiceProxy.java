package com.moleda.zuzanna.SpringAop.service;

import com.moleda.zuzanna.SpringAop.aspect.LoggingAspect;
import com.moleda.zuzanna.SpringAop.model.Circle;

public class ShapeServiceProxy extends ShapeService {

	public Circle getCircle() {
		new LoggingAspect().getLoggingAdvice();
		return super.getCircle();
	}
}

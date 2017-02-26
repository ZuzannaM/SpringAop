package com.moleda.zuzanna.SpringAop.service;


import com.moleda.zuzanna.SpringAop.aspect.Loggable;
import com.moleda.zuzanna.SpringAop.model.Circle;
import com.moleda.zuzanna.SpringAop.model.Triangle;

public class ShapeService {
	
	private Circle circle;
	private Triangle triangle;
	
	@Loggable
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
}

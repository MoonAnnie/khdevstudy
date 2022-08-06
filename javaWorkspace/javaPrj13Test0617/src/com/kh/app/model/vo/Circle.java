package com.kh.app.model.vo;

public class Circle {

	public final double PI = 3.14;
	private double radius;
	
	public Circle(double radius) {
		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getPI() {
		return PI;
	}// 상수(final) 필드니까 setter 이 안나옴
	// 상수는 재할당이 불가하므로 setter 가 없음



}

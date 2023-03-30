package com.demo.core.lab3;

public class Triangle extends Shape{
	 private int height;
     private int base;
     
     
	public Triangle(String color,int height, int base) {
		super(color);
		this.height = height;
		this.base = base;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getBase() {
		return base;
	}


	public void setBase(int base) {
		this.base = base;
	}
	
	 @Override
	    public double getArea() {
	        return 0.5 * base * height;
	    }
     
}

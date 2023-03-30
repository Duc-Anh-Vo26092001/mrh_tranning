package com.demo.core.lab3;

public abstract class Shape {
      protected String color;

      public Shape(String color) {
		super();
		this.color = color;
	  }

     public abstract double getArea();
}
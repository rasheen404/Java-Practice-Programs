package com.learn.ShapesApp;

public class Circle extends Shapes{

	double radius = 3.5;
	
	@Override
	double findArea()
	{
		double area = Math.PI*radius*radius;
		System.out.print("Area of Circle : ");
		return area;
	}
	
	double findCircleArea()
	{
		double perimeter = 2*Math.PI*radius;
		System.out.print("Perimeter of Circle : ");
		return perimeter;
	}



}

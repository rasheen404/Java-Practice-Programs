package com.learn.ShapesApp;

public class Rectangle extends Shapes{

	double length = 7.5,breadth = 5.5;
	
	@Override
	double findArea()
	{
		double area = length*breadth;
		System.out.print("Area of Rectangle : ");
		return area;
	}
	
	double findRectangleArea()
	{
		double perimeter = 2*(length+breadth);
		System.out.print("Perimeter of Rectangle : ");
		return perimeter;
	}



}

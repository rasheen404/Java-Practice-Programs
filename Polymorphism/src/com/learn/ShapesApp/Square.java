package com.learn.ShapesApp;

public class Square extends Shapes{
	double side = 5.5;
	
	@Override
	double findArea()
	{
		double area = side*side;
		System.out.print("Area of Square : ");
		return area;
	}
	
	double findSquareArea()
	{
		double perimeter = 4*side;
		System.out.print("Perimeter of Square : ");
		return perimeter;
	}

}

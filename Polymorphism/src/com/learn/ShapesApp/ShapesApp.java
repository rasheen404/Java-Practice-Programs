package com.learn.ShapesApp;

public class ShapesApp {
	
	public static void doActivity(Shapes sh)
	{
		sh.draw();
		System.out.println(sh.findArea());
		
		if(sh instanceof Square)
		{
			System.out.println(((Square)(sh)).findSquareArea());
		}
		else if(sh instanceof Circle)
		{
			System.out.println(((Circle)(sh)).findCircleArea());
		}
		else {
			System.out.println(((Rectangle)(sh)).findRectangleArea());
		}
		
	}
	
	public static void main(String[] args) {
		Square square = new Square();
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		
		doActivity(square);
		System.out.println("-----------------------------------------------------");
		doActivity(circle);
		System.out.println("-----------------------------------------------------");
		doActivity(rectangle);
	}

}

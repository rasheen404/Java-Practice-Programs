package com.learn.Shapes;

public class ShapeApp {
	public static void main(String[] args) {
		Square square = new Square();
		Rectangle rectangle = new Rectangle();
		Circle circle = new Circle();
		Geomatry geomatry = new Geomatry();
		
		geomatry.Activity(square);
		geomatry.Activity(rectangle);
		geomatry.Activity(circle);
		
	}

}

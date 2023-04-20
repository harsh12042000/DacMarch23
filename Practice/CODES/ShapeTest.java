package org.example.main;

import java.util.Scanner;
class Shape{
	protected float area;
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	public void calculateArea( ) {
		//TODO
	}
	public float getArea() {
		return this.area;
	}
}
class Rectangle extends Shape{
	private float length;
	private float breadth;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public void setLength(float length) {
		this.length = length;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	@Override
	public void calculateArea() {
		this.area = this.length * this.breadth;
	}
}
class Circle extends Shape{
	private float radius;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	@Override
	public void calculateArea() {
		this.area = (float) (Math.PI * Math.pow(this.radius, 2));
	}
}
enum ShapeType{
	EXIT, RECTANGLE, CIRCLE
}
class ShapeFactory{
	private ShapeFactory() {
		// TODO Auto-generated constructor stub
	}
	public static Shape getReference( ShapeType choice ) {
		Shape shape = null;
		switch( choice ) {
		case RECTANGLE:
			shape = new Rectangle();
			break;
		case CIRCLE:
			shape = new Circle();
			break;
		}
		return shape;
	}
}
class ShapeTest{
	private static Scanner sc = new Scanner(System.in);
	
	private Shape shape;	//null
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	public void acceptRecord( ) {
		if( this.shape != null ) {
			if( this.shape instanceof  Rectangle ) {
				Rectangle rect =  (Rectangle) this.shape;	//Downcasting
				System.out.print("Length	:	");
				rect.setLength( sc.nextFloat());
				System.out.print("Breadth	:	");
				rect.setBreadth(sc.nextFloat());
				//this.shape.calculateArea();
			}else {
				Circle circle = (Circle) this.shape;	//Downcasting
				System.out.print("Radius	:	");
				circle.setRadius( sc.nextFloat());
				//this.shape.calculateArea();
			}
			this.shape.calculateArea();
		}
	}
	public void printRecord( ) {
		if( this.shape != null )
			System.out.println("Area	:	"+this.shape.getArea());
	}
	public static ShapeType menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.print("Enter choice	:	");
		return ShapeType.values()[ sc.nextInt()]; 
	}
}
public class Program { 
	public static void main(String[] args) {
		ShapeType choice;
		ShapeTest test = new ShapeTest();
		while( ( choice = ShapeTest.menuList( ) ) !=  ShapeType.EXIT ) {
			Shape shape = ShapeFactory.getReference(choice);
			test.setShape(shape);
			test.acceptRecord();
			test.printRecord();
		}
	}
}

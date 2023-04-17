package main.cdac;

import java.util.Scanner;
class Shape {
     protected float area;
     
     public Shape() {
    	 
     }
     public float getArea() {
    	 return this.area;
     }
}
class Rectangle extends Shape{
	private float length;
	private float breadth;
	
	public Rectangle() {
		
	}
	public void setLength(float length) {
		this.length = length;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	public void calculateArea() {
		this.area = this.length * this.breadth;
	}
}
class Circle extends Shape{
	private float radius;
	
	public Circle() {
		
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public void calculateArea() {
	    this.area = (float)(Math.PI * Math.pow(radius,2));
	}
}
class RectangleTest{
	 Rectangle r = new Rectangle();
	
	 private static Scanner sc = new Scanner(System.in);
	public void acceptRecord() {
		System.out.println("Length  :");
		this.r.setLength(sc.nextFloat());
		System.out.println("Breadth  :");
		this.r.setBreadth(sc.nextFloat());
		
		this.r.calculateArea();
	}
	public void printRecord() {
		System.out.println("Area  :"+this.r.getArea());
}
class CircleTest{
	Circle c = new Circle();
	
	 private static Scanner sc = new Scanner(System.in);
	public  void acceptRecord() {
		System.out.println("Radius  :");
		this.c.setRadius(sc.nextFloat());
		
		this.c.calculateArea();
	}
	public void printRecord() {
		System.out.println("Area   :"+this.c.getArea());
	}
}

public class Test{
	public static void main(String[] args) {
		CircleTest circleTest = new CircleTest();
		circleTest.acceptRecord();
		circleTest.printRecord();
    }   
}


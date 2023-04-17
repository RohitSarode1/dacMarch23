package org.ex.main;

class Shape {
     float area;
     
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
public class Test{
	public static void main1(String[] args) {
		Rectangle r = new Rectangle();
		r.setLength(10.22f);
		r.setBreadth(10.25f);
		r.calculateArea();
		System.out.println("Area   :"+r.getArea());
	}
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(12.55f);
		c.calculateArea();
		System.out.println("Area    :"+c.getArea());
	}
}

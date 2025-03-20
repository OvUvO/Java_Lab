package com.lab7.haha;

interface GeometricObject{
	
	public double getPerimeter();
	public double getArea();
	
}

interface Resizable{
	
	public boolean resize(int percent);
	
}

class Circle implements GeometricObject{
	
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getPerimeter() {
		return (2*3.14*radius);
	}
	
	@Override
	public double getArea() {
		return (3.14*radius*radius);
	}
	
	@Override
	public String toString() {
		return String.format("Perimeter: %2f, Area: %2f",getPerimeter(),getArea());
	}
	
}

class ResizableCircle implements Resizable{
	int percent = 1;
	
	public ResizableCircle(double radius) {

	}
	
	@Override
	public boolean resize(int percent) {
		return true;
	}
}
public class Lab7_Q2 {

	public static void main(String[] args) {
		Circle obj = new Circle(3);
		System.out.println(obj);
	}

}
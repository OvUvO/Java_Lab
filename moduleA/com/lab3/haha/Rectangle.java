package com.lab3.haha;

public class Rectangle {
	private double width;
	private double height;
	private String color;
	
	public Rectangle() {
		this.width = 5.0;
        this.height = 1.5;
        this.color = "Blue";
		
	}
	
	public Rectangle(double width, double height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        return width * height;
    }

    public double findPerimeter() {
        return 2 * (width + height);
    }
    
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        System.out.println("Original Rectangle:");
        System.out.println("Color: " + obj1.getColor());
        System.out.println("Width： " + obj1.getWidth());
        System.out.println("Height： " + obj1.getHeight());
        System.out.println("Area： " + obj1.findArea());
        System.out.println("Perimeter： " + obj1.findPerimeter());

        System.out.println("\n");

        Rectangle obj2 = new Rectangle(5.0, 10.0, "Blue");
        System.out.println("Customize Rectangle：");
        System.out.println("Color： " + obj2.getColor());
        System.out.println("Width： " + obj2.getWidth());
        System.out.println("Height： " + obj2.getHeight());
        System.out.println("Area： " + obj2.findArea());
        System.out.println("Perimeter： " + obj2.findPerimeter());
    }
}

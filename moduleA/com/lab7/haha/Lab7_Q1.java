package com.lab7.haha;

interface Movable{
	
	void moveUp();
	void moveDown();
	void moveLeft();
	void moveRight();

}

class MovablePoint implements Movable{
	int x,y;
	int xSpeed, ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed,int ySpeed ){
		
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	
	}
	
	@Override
	public void moveUp() {
		
		y += ySpeed;
		
	}
	
	@Override
	public void moveDown() {
		
		y -= ySpeed;
		
	}
	
	@Override
	public void moveLeft() {
		
		x -= xSpeed;
		
	}
	
	@Override
	public void moveRight() {
		
		x += xSpeed;
		
	}
	
	@Override
	public String toString() {
		
		return String.format("MovablePoint(x=%d,y=%d,xSpeed=%d,ySpeed=%d)",x,y,xSpeed,ySpeed);
		
	}
}
class MovableCircle implements Movable{
	
	private int radius;
	private MovablePoint center; 

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle(radius=" + radius + ", center=" + center + ")";
    }
	
}
public class Lab7_Q1 {

	public static void main(String[] args) {
		
		MovablePoint point = new MovablePoint(1, 2, 3, 4);
        System.out.println(point);
        point.moveRight();
        point.moveUp();
        System.out.println(point);

        MovableCircle circle = new MovableCircle(5, 5, 2, 3, 10);
        System.out.println(circle); 
        circle.moveLeft();
        circle.moveDown();
        System.out.println(circle);
        
	}

}

package com.lab3.haha;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = SLOW;
        this.on = false;   
        this.radius = 5.0; 
        this.color = "blue"; 
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        if (speed >= SLOW && speed <= FAST) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed. Use 1 (SLOW), 2 (MEDIUM), or 3 (FAST).");
        }
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on) {
            return "Fan speed: " + speed + ", Color: " + color + ", Radius: " + radius;
        } else {
            return "Fan is off. Color: " + color + ", Radius: " + radius;
        }
     }
    
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(7.0);
        fan1.setColor("red");
        fan1.setOn(true);
        System.out.println(fan1);

        Fan fan2 = new Fan();
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(6.5);
        fan2.setColor("green");
        fan2.setOn(false);
        System.out.println(fan2);
    }
}

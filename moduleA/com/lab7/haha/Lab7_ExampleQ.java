package com.lab7.haha;

abstract class GeometricObject implements Comparable<GeometricObject> {
	
	public abstract double getArea();
    
    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(this.getArea(), o.getArea());
    }
    
    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        if (o1.compareTo(o2) >= 0) {
          return o1;
        } else {
          return o2;
        }
    }
}


public class Lab7_ExampleQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

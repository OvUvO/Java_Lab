package com.lab3.haha;

public class Timelol {
	
	public static void main(String[] args) {
        Time currentTime = new Time();
        
        System.out.println("Current Time (GMT): " + currentTime.getHour() + ":" +
                currentTime.getMinute() + ":" + currentTime.getSecond());
    }
	
}

class Time {
	private int hour;
    private int minute;
    private int second;

    public Time() {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        this.second = (int) (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        this.minute = (int) (totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        this.hour = (int) (totalHours % 24);
    }
    
    public Time(int hour, int minute, int second) {
    	this.hour = hour;
    	this.minute = minute;
    	this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    
}
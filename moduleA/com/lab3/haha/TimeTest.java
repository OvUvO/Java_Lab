package com.lab3.haha;

public class TimeTest {
	public static void main(String[] args) {
        Time1[] timeArray = new Time1[10];
        
        int hour = 1, minute = 30, second = 30;
        
        for (int i = 0; i < timeArray.length; i++) {
            timeArray[i] = new Time1(hour, minute, second);
            second += 5;
            
            if (second >= 60) {
                second -= 60;
                minute++;
            }
            if (minute >= 60) {
                minute -= 60;
                hour++;
            }
        }
        
        for (Time1 t : timeArray) {
            System.out.println(t);
        }
    }
}

class Time1 {
	private int hour;
    private int minute;
    private int second;

    public Time1() {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        this.second = (int) (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        this.minute = (int) (totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        this.hour = (int) (totalHours % 24);
    }
    
    public Time1(int hour, int minute, int second) {
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
    
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
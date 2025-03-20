package com.lab3.haha;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Date {

	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1; //its start from 0 so need to +1
        int day = calendar.get(Calendar.DATE);

        System.out.println("Current Date: " + year + "-" + month + "-" + day);

	}

}

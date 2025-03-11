package com.la6.haha;

import java.time.LocalDate;


public class Person {
	private String name;
	private String address;
	private String phoneNum;
	private String emailAdrs;

	public static void main(String[] args) {
		

	}

}

//A person has a name, address, phone number, and email address.
//A student has a status (freshman, sophomore, junior, or senior). 

//Student--
class Student extends Person {
	String[] status = {"freshman", "sophomore", "junior", "senior"};
	
	
}


// Employee--
class Employee extends Person {
	
}

class Faculty extends Employee {
	
}

class Staff extends Employee {
	
}


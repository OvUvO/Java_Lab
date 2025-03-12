package com.la6.haha;

import java.time.LocalDate;

// Enum for Student Status
enum StudentStatus {
    FRESHMAN, SOPHOMORE, JUNIOR, SENIOR;
}

// Person Class
class Person {
    protected String name, address, phone, email;

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + name;
    }
}

// Student Class
class Student extends Person {
    private StudentStatus status;

    public Student(String name, String address, String phone, String email, StudentStatus status) {
        super(name, address, phone, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + ", Status: " + status;
    }
}

// Employee Class
class Employee extends Person {
    protected String office;
    protected double salary;
    protected LocalDate dateHired;

    public Employee(String name, String address, String phone, String email, String office, double salary, LocalDate dateHired) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return super.toString() + ", Office: " + office + ", Salary: $" + salary + ", Hired: " + dateHired;
    }
}

// Faculty Class
class Faculty extends Employee {
    private String officeHours, rank;

    public Faculty(String name, String address, String phone, String email, String office, double salary, LocalDate dateHired, String officeHours, String rank) {
        super(name, address, phone, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() + ", Office Hours: " + officeHours + ", Rank: " + rank;
    }
}

// Staff Class
class Staff extends Employee {
    protected String title;

    public Staff(String name, String address, String phone, String email, String office, double salary, LocalDate dateHired, String title) {
        super(name, address, phone, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + ", Title: " + title;
    }
}

// FullTime Staff Class
class FullTime extends Staff {
    public FullTime(String name, String address, String phone, String email, String office, double salary, LocalDate dateHired, String title) {
        super(name, address, phone, email, office, salary, dateHired, title);
    }

    public double getEarnings() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Earnings: $" + getEarnings();
    }
}

// PartTime Staff Class
class PartTime extends Staff {
    private double hourlyRate;
    private int hoursWorked;

    public PartTime(String name, String address, String phone, String email, String office, double hourlyRate, int hoursWorked, LocalDate dateHired, String title) {
        super(name, address, phone, email, office, 0, dateHired, title);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getEarnings() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() + ", Hourly Rate: $" + hourlyRate + ", Hours Worked: " + hoursWorked + ", Earnings: $" + getEarnings();
    }
}

// Testing
public class PersonH {
    public static void main(String[] args) {
        LocalDate dateHired = LocalDate.of(2020, 6, 15);
        Student student = new Student("Alice", "123 Street", "1234567890", "alice@example.com", StudentStatus.FRESHMAN);
        Faculty faculty = new Faculty("Dr. Bob", "456 Ave", "9876543210", "bob@example.com", "Room 101", 80000, dateHired, "9AM-5PM", "Professor");
        FullTime fullTimeStaff = new FullTime("Charlie", "789 Blvd", "1122334455", "charlie@example.com", "Room 102", 50000, dateHired, "Manager");
        PartTime partTimeStaff = new PartTime("Dave", "101 Rd", "6677889900", "dave@example.com", "Room 103", 50, 20, dateHired, "Assistant");

        System.out.println(student);
        System.out.println(faculty);
        System.out.println(fullTimeStaff);
        System.out.println(partTimeStaff);
    }
}

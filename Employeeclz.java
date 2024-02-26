package com.example.hr;

public class Employeeclz {
	
	    private String name;
	    private int id;
	    private double salary;

	    public void printName() {
	        System.out.println("Employee Name: " + name);
	    }

	    public void printSalary() {
	        System.out.println("Employee Salary: " + salary);
	    }

	    // Getters and setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
	}




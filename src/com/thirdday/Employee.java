package com.thirdday;

public class Employee {

	
	private static String companyName;
	public static int employeeCount;
	public String name;
	private int id;
	
	double salary;
	
	public void printEmployeeDetails() {
		 String localDepartment= "QA automation";
		 int localTaxRate = 10;
		
		 name = " Lamyea";
		 id = 23456;
		 salary= 77000;
		 System.out.println(localDepartment);
		 System.out.println(localTaxRate+ "%");
		 System.out.println("Employee name: "+ name);
		 System.out.println("Employee ID: "+id);
		 System.out.println("Employee salary: "+salary);
		 
	}
	
	

	public static void main(String[] args) {
		
		
		System.out.println("Default Company name: "  +Employee.companyName);
		
		System.out.println("Default Employee count: " +Employee.employeeCount);
		
		System.out.println();
		Employee.companyName = "Google";
		Employee.employeeCount = 10000;
		
		
		
		System.out.println("Company name: " +Employee.companyName);
		System.out.println("Employee count: " +Employee.employeeCount);
		
		
		Employee instance = new Employee();
		
		instance.printEmployeeDetails();
		
	}
	
	
	}
	
	


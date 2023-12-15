package com.thirdday;

public class StaticVariableDemo {
	
	
	  private static String collegeName;
	  public static int collegeId;
	  protected static int totalEmployee;
	  static double salary;
	  
	  
	  public static void showDefaultValue() {
		  System.out.println("College Name : " +collegeName);
			System.out.println("College ID : " +collegeId);
			
			System.out.println("Number of Employee : " +totalEmployee);
			System.out.println("Average Salary : " +salary);
	  }
	  
	  
	  
	  public static void main(String[] args) {
		  
		  System.out.println("Default Value:" + StaticVariableDemo.collegeName);
		  
		  StaticVariableDemo.collegeName = "ABS international colege";
		  
		  System.out.println("Modified Value:" +StaticVariableDemo.collegeName);
		  StaticVariableDemo.showDefaultValue();

	  
	  
	  
	  
	  
	  }
	  
  
	
	
}

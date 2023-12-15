package com.seconday;

public class IntanceVariableDemo {

	public String lastname;
	private int age;
	protected String firstname;
	double salary;
	
	
	//access modifires
	
	public void showDefaultValue() {
	System.out.println("LastName Value: " +lastname);
	System.out.println("First name Value: " + firstname);
	System.out.println("Age: "+age);
	System.out.println("Salary : " +salary);
	
	}
	
	public void changeDefaultValues() {
		lastname= "Sultan";
		age = 20;
		firstname = "Ram";
		salary = 4565.65;
		
				
	}
	
	
	
	
	public static void main(String[] args) {
		//instance or object
		
		 IntanceVariableDemo instancedemo = new  IntanceVariableDemo();
		 
		 instancedemo.showDefaultValue();
		 instancedemo.changeDefaultValues();
		 instancedemo.showDefaultValue();
		 
		
	}
	
	
}

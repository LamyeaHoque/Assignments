package Assignment7;


import java.util.Scanner;

public class checkRectangle {
	public static void main(String args[])
		{

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the length: ");

		double len =input.nextDouble();

		System.out.println("Enter the breadth: ");

		double bre=input.nextDouble();

		if(len==bre)

		System.out.println("Square");

		else

		System.out.println("Not a Square");

		}



		
		
		
		
	}



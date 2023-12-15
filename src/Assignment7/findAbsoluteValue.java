package Assignment7;

import java.util.Scanner; 

public class findAbsoluteValue {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");

		int n =input.nextInt();
		if (n<0) {
			
			n = (-1) * n;
		}
		
		System.out.println("The absolute valou of the number you enterd is: "+n);


	}

}

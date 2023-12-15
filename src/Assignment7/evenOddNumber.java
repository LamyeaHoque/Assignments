package Assignment7;
import java.util.Scanner;
public class evenOddNumber {

	public static void main(String[] args) {
		
	        Scanner user = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = user.nextInt();

	        if(num % 2 == 0)
	            System.out.println(num + " is even");
	        else
	            System.out.println(num + " is odd");

	}

}

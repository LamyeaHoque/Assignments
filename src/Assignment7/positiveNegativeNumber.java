package Assignment7;
import java.util.Scanner;

public class positiveNegativeNumber {

	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input =user.nextInt();
		
		
		if(input > 0) {
		System.out.println("The number is positive");
		}
		else if(input < 0) {
			System.out.println("The number is negative");
			}
		else {
			System.out.println("The number is zero");
			}

	}

}

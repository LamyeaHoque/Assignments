package Assignment9;

public class factorial {

	public static void main(String[] args) {
		//6*5*4*3*2*1
		
		int num =6;
		int factorial=1;
		for ( int i= 1; i<=num; i ++) {
			factorial= factorial *i;
		}
		System.out.println("Factorial of 6 is : "+ factorial);
	}

}

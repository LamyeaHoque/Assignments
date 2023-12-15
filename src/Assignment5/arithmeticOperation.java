package Assignment5;

public class arithmeticOperation {
	public static void main(String[] args) {
		
	
    int numb1 = 10, numb2 = 20, sum = 0;

   
    System.out.println("num1 = " + numb1);
    System.out.println("num2 = " + numb2);

   
    sum = numb1 + numb2;
    System.out.println("The sum = " + sum);
 
    
    //substracting 
   int  sub = numb1 - numb2;
    System.out.println("Subtraction = " + sub);
    int mult = numb1 * numb2;
    System.out.println("Multiplication = " + mult); 
    
    // Dividing num1 and num2
     int  div = numb1 / numb2;
    System.out.println("Division = " + div);
 
    
    
    //Mod
    int mod = numb1 % numb2;
    System.out.println("Remainder = " + mod);
    
    
    //+= operator
    numb1+=numb2;
    
    System.out.println("Number1 += : "+numb1);
  //-= operator
    numb2-=numb1;
    
    System.out.println("Number2 -= : "+numb2);
    
  //*= oprator
    numb1*=numb2;
    
    System.out.println("Number3 with *= :  "+numb1);
    
    
  //*= oprator
    numb1/=numb2;
    
    System.out.println("Number4 with /= :  "+numb1);
    
    
    
  //%= oprator
    numb1%=numb2;
    
    System.out.println("Number5 with %= :  "+numb1);
    
	}
	
	
	
}

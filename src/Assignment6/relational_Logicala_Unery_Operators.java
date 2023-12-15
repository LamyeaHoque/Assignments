package Assignment6;

public class relational_Logicala_Unery_Operators {

	public static void main(String[] args) {
		int num1 =11;
	    int num2 = 21;
	     
	     
	    System.out.println("num1 > num2 is " + (num1 > num2));
	    System.out.println("num1 < num2 is " + (num1 < num2));
	    System.out.println("num1 >= num2 is " + (num1 >= num2));
	    System.out.println("num1 <= num2 is " + (num1 <= num2));
	    System.out.println("num1 == num2 is " + (num1 == num2));
	    System.out.println("num1 != num2 is " + (num1 != num2));
	    
	    
	    int result;
	    result = ++num1;
        System.out.println(
            "The value of result after preincrement is: "   + result);
 
        result = num1++;
        System.out.println(
            "The value of result after postincrement is: "   + result);
 
        result = --num2;
        System.out.println(
            "The value of result after predecrement is: "    + result);
 
        result = num2--;
        System.out.println(
            "The value of result after postdecrement is: "    + result);

        //&&
        boolean resAnd= (num1<num2) &&(num2>num1);
        System.out.println("The value of result using &&: "+resAnd);
        
        // 0r ||
        boolean resAnd2= (num1<=num2) || (100>num1);
        System.out.println("The value of result using ||: "+resAnd2);
        boolean resAnd3= (num2<=num1) ||(num2!=55);
        System.out.println("The value of result using ||: "+resAnd);
        
        
        
        
	}

}

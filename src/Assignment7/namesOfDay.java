package Assignment7;

public class namesOfDay {

	public static void main(String[] args) {
		 int weekday = 5;
        String day;
 
        // Switch statement with int data type
        switch (weekday) {
 
        // Case
        case 1:
            day = "Monday";
            break;
 
        // Case
        case 2:
            day = "Tuesday";
            break;
 
            // Case
        case 3:
            day = "Wednesday";
            break;
 
            // Case
        case 4:
            day = "Thursday";
            break;
 
        // Case
        case 5:
            day= "Friday";
            break;
 
            // Case
        case 6:
            day = "Saturday";
            break;
 
            // Case
        case 7:
            day= "Sunday";
            break;
 
        // Default case
        default:
            day = "Invalid day";
        }
        System.out.println(day);
		
		
		
		
		
		

	}

}

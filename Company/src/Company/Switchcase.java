package Company;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //System.out.println("enter a number");
		
		int day = 0;
       
       switch(day)
       {
    	   case 0: System.out.println("Sunday");
    	            break;
    	   case 1: System.out.println("Monday");
    	            break;
    	   case 2: System.out.println("Tuesday");
                    break;
    	   case 3: System.out.println("Wednesday");
                    break;
    	   case 4: System.out.println("Thrusday");
                     break;
    	   case 5: System.out.println("Friday");
                    break;
    	   case 6: System.out.println("Saturday");
                     break;
           default: System.out.println("Invalid ........please enter between 0 to 6");
                     break;
       }
       
       
       
	}

}

package Company;
import java.util.Scanner;
public class Positivenegetive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       int number = sc.nextInt();
       if(number > 0) {
    	   System.out.println("number is positive");
       }else if(number < 0) {
    	   System.out.println("number is negetive");
       }
	}

}

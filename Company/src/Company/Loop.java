package Company;
import java.util.Scanner;
public class Loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a = sc.nextInt();
		// TODO Auto-generated method stub
       for(int i = 2;i<=a;i+=2) 
       {
    	 System.out.println(i);  
       }
 }
 
}

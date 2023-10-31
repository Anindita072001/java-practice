package Company;
import java.util.Scanner;
public class Array_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int a[]=new int[5];
      System.out.println("enter your five sub marks");
      for(int i=0; i<=4; i++)
      {
    	  a[i]= sc.nextInt();
      }
      System.out.println("your five marks are");
      for (int i = 0; i<=4;i++) {
    	                          System.out.println("Subject " + (i + 1) + ": " + a[i]);
                               }
	}

}

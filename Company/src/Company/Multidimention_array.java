package Company;

import java.util.Scanner;

public class Multidimention_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          int[][] a =new int [3][3];
          System.out.println("enter the value");
          for(int i=0;i<=2;i++)
          {
        	  for(int j=0;j<2;j++)
        	  {
        		  a[i][j]=sc.nextInt();
        	  }
          }
          System.out.println("your value are");
          for(int i=0;i<=2;i++)
          {
        	  for(int j=0;j<=2;j++)
        	  {
        		  System.out.println(a[i][j] +" ");
        	  }
        	  System.out.println();
          }
	}

}

package Company;
import java.util.*;
import java.util.ArrayList;

public class Xyz {
	public static void main(String[] args) {
        ArrayList<Integer> L1 = new ArrayList<Integer>();
        L1.add(90);
        L1.add(80);
        L1.add(70);
        L1.add(60);
        L1.add(50);
        System.out.println("numbers are - L1" );
        for(Integer s : L1)
        {
        	System.out.println(s);
        }
        
        ArrayList<Integer> L2 = new ArrayList<Integer>();
        L2.add(900);
        L2.add(800);
        L2.add(700);
        L2.add(600);
        L2.add(500);
        System.out.println("numbers are L2 - " +L2);
        
        ArrayList<Integer> L3 = new ArrayList<Integer>();
        L3.add(9000);
        L3.add(8000);
        L3.add(7000);
        L3.add(6000);
        L3.add(5000);
        System.out.println("numbers are L3 - " +L3);
        
        ArrayList<Integer> L4 = new ArrayList<Integer>(); 
        L4.addAll(L1);
        System.out.println("numbers are L4 - " +L4);
        
        
        int n = L2.size()/2;
        System.out.println("size of half list - " +n);
        int count = n;
        System.out.println("using for loop");
        for(int i=n;i<L2.size();i++)
        {
        	System.out.println(L2.get(i)+ "");
        }
        System.out.println("using while loop");
        while(count<L2.size())
        {
        	System.out.println(L2.get(count)+ "");
        	count++;
        }
        
        
        //reverce
        System.out.println("reverse of L3");
        for(int i=L3.size()-1;i>=0;i--)
        {
        	System.out.print(L3.get(i)+" ");
        }
        
        
  
	}
}

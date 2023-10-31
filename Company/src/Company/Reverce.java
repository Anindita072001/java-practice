package Company;
import java.util.*;
public class Reverce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> L1 = new ArrayList<Integer>();
	        L1.add(90);
	        L1.add(80);
	        L1.add(70);
	        L1.add(60);
	        L1.add(50);
	        System.out.println("numbers are - L1 - " +L1);
//	        for(Integer s : L1)
//	        {
//	        	System.out.println(s);
//	        }
	        
	        //reverce
	        ArrayList<Integer> reversedList = new ArrayList<Integer>();
	        //System.out.print("reverse of L1 ");
	        for(int i=L1.size()-1;i>=0;i--)
	        {
	        	reversedList.add(L1.get(i));
	        
	        }
	        System.out.print("reverse of L1 " +reversedList);
//	        Collections.reverse(L1);
//	       System.out.println(L1);
	}
}

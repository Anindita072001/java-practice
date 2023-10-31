package Company;
import java.util.*;
import java.util.ArrayList;

public class Searching {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> L1 = new ArrayList<Integer>();
	        L1.add(90);
	        L1.add(80);
	        L1.add(70);
	        L1.add(60);
	        L1.add(80);
	        
	        int index = L1.indexOf(80);
	        System.out.println("1st position of 80 " +index);
	        
	        int lastindex = L1.lastIndexOf(80);
	        System.out.println("last position of 80 - " +lastindex);
	}
}

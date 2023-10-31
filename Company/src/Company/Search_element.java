package Company;
import java.util.*;
import java.util.ArrayList;

public class Search_element {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> L1 = new ArrayList<String>();
	        L1.add("flower");
	        L1.add("animal");
	        L1.add("bird");
	        L1.add("insect");
	        L1.add("fish");
	        
	        String element = "insec";
	        
	        boolean p = L1.contains(element);
	        if(p)
	        {
	        	System.out.println(" present in list :-" +element);
	        }
	        else
	        {
	        	System.out.println(" not present in list :-" +element);
	        }
	        //System.out.println("is insect in the list ?         " +p);
	        
	        int index = L1.indexOf(element);
	        if(index!=-1)
	        {
	        	  System.out.println(element + " is found at index " + index + " in the list.");
              } 
	        else {
             System.out.println(element + " is not found in the list.");
	        //System.out.println(" position of insect " +index);
	        }
	}
}

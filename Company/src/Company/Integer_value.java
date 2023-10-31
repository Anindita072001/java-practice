package Company;

import java.util.*;

public class Integer_value {
	public static void main(String[] args) {
        ArrayList<Integer> Clist = new ArrayList<Integer>();
        Clist.add(90);
        Clist.add(80);
        Clist.add(70);
        Clist.add(60);
        Clist.add(50);
        
       
        
        System.out.println("numbers are - ");
        for(Integer clist : Clist) {
        	System.out.println(clist);
        }
        System.out.println("value in 2nd index : " +Clist.get(1));
        Clist.set(1, 100);
        System.out.println("number after updating : ");
        
        for(Integer a : Clist)
        {
        	System.out.println(a);
        }
        Clist.remove(0);
        System.out.println("after removing" +Clist);
        Clist.removeAll(Clist);
        System.out.println("after removing" +Clist);
	}
}

package Company;
import java.util.*;
public class Fruit {
	public static void main(String[] args) {
        ArrayList<String> Clist = new ArrayList<String>();
        Clist.add("RED");
        Clist.add("black");
        Clist.add("orange");
        Clist.add("pink");
        Clist.add("white");
        
        Clist.set(4, "blue");
        System.out.println("the list is " +Clist);
        
        
        //System.out.println("colours are - ");
        for(String clist : Clist) {
        	//System.out.println(clist);
        }
        String a = Clist.get(4);
        System.out.println(a);
        
	}
}

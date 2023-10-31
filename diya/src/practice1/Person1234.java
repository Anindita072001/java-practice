package practice1;
import java.util.*;
class Person{
	
}
public class Person1234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Object> p = new ArrayList<>();
    for(int i=1;i<=10;i++)
    {
    	p.add(new Person());
    }
    for(Object q :p ) {
    	System.out.println(q);
    }
	}

}

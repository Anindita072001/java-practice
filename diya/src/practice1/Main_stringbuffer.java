package practice1;

public class Main_stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("This is StringBuffer");
	  sb.append(". This is a sample program");
	  System.out.println(sb);
	  
	  sb.insert(21, " Object");
	  System.out.println(sb);
	  
	  sb.replace(14,20,"Builder" );
	  System.out.println(sb);
	  
	  sb.reverse();
	  System.out.println(sb);
	  
	  
	}

}

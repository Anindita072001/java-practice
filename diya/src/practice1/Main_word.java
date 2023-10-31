package practice1;

public class Main_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str1 = "Welcome to Java World" ;
     char c = str1.charAt(5);
     System.out.println("5th position charecter is - "+c);
     
     String str2 = "Welcome";
     String str1Lower = str1.toLowerCase();
     String str2Lower = str2.toLowerCase();
     
     int result1 = str1Lower.compareTo(str2Lower);
     System.out.println("after comparing -  "+result1);
     
     String str3 = "Let us learn";
     String result2 = str1+str3;
     
     System.out.println("after concatenates -  "+result2);
  
	int p = str1.indexOf("a");
	 
	System.out.println("position of a in first line -  "+p);
	String str4 = str1.replaceAll("a","e");
	System.out.println("after replace a to e -  "+str4);
	
	String str5 = str1.substring(4,10);
	System.out.println("4th to 10th position display -  "+str5);
	
	
	System.out.println("final result -  "+str1Lower);
	}

}

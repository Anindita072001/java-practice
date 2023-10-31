package Company;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a= 6 ;
      int b= 11 ;
      int c = 3 ;
      int d = 9;
      if(a>b) {
    	        if(a>c) {
    	        	      if(a>d) {
    	        	    	        System.out.println("a is max ="+a);
    	        	              }
    	        	      else {
    	        	    	     System.out.println("d is max ="+d);
    	        	           }
    	                }
    	        else {
    	        	   if(c>d) {
    	        		          System.out.println("c is max ="+c);
    	        	           }
    	        	   else {
    	        		       System.out.println("d is max="+d);
    	        	        }
    	        	 }
    	             
    	       
              }
      else {
    	     if(b>c) {
    	    	        if(b>d) {
    	    	        	       System.out.println("b is max ="+b);
    	    	                }
    	    	        else {
    	    	        	    System.out.println("d is max ="+d);
    	    	             }
    	             }
    	     else {
    	    	 if(c>d) {
   		          System.out.println("c is max ="+c);
   	              }
			   	  else {
			   		       System.out.println("d is max="+d);
			   	        }
    	          }
           }
      }
	}
	
    	 
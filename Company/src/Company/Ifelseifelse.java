package Company;

public class Ifelseifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sub1 = 45;
        int sub2 = 40;
        int sub3 = 15;
        int total = sub1 + sub2 + sub3;
        double percentage = total / 3 * 2;
        System.out.println("percentage is = " +percentage );
        if(percentage >= 90)
        {
        	System.out.println("A+ grade");
        }else if(percentage>= 80) {
        	System.out.println(" A grade");
        }else if(percentage >=70) {
        		System.out.println("B+ grade");
        }else if(percentage >=60) {
    		System.out.println("B grade");
    	
        }else {
        	System.out.println("sorry you are fail");
        }
	}

}

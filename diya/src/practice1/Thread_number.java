package practice1;

class Abcd{
	public void average() {
    	int sum = 0;
    	 for(int i=1;i<=10;i++)
    	 {
    		 sum=sum+i;
    		 
    	 }
    	 System.out.println("Average - " +sum/10);
    		 }
     public void square(int arr[]) {
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 System.out.println("Square is  - " +arr[i]*arr[i]);
    	 }
     }
}
public class Thread_number {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[] = {1,20,50,15,30} ;
     Thread t1 = new Thread(new Abcd()::average);
	t1.start();
	Thread t2 = new Thread(() -> new Abcd().square(arr));
	t2.start();
	
	}

}

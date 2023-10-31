package practice1;
class No{
	public void odd() {
		for(int i=1;i<=100;i++) {
			if(i%2!=0)
			{
				System.out.println("Odd numbers are - "+i);
			}
			
		}
	}
		public void even() {
			for(int i=1;i<=100;i++) {
				if(i%2==0)
				{
					System.out.println("even numbers are - "+i);
				}
				
			}
		
		}
}
	
public class Odd_even_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new No()::odd);
		t1.start();
		try {
	           
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		Thread t2 = new Thread(new No()::even);
		t2.start();
		try {
			t2.join();
		} catch(Exception e){
	    	 System.out.println(e); 
	      }
           
	}

}

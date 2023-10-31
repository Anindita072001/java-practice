package Company;
class Abc123{
	public static void add() {
		int a =45,b= 56,c;
		c=a+b;
		System.out.println("addition"+c);
	}
	public void sub() {
		int a =45,b= 56,c;
		c=a-b;
		System.out.println("substraction"+c);
	}
}
public class Threading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Thread t1 = new Thread(Abc123 :: add);
    t1.start();
    
    Thread t2 = new Thread(new Abc123()::sub);
    t2.start();
	}

}

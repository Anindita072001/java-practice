package practice1;
interface BankAccount1{
	public void deposit();
	public void withdraw ();
}
class CheckingAccount1 implements BankAccount1{
	public void deposit() {
		System.out.println("Rs. 1000 deposit");
	}
	public void withdraw () {
		System.out.println("Rs. 500 withdraw");
	}
}
public class Main_interface_bankaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount1 c = new CheckingAccount1();
		c.deposit();
		c.withdraw();
	}

}

package abstract_method;

abstract

public class Xyz {
	Xyz()
	{
		System.out.println("welcome");
	}

}
class Pqr extends Xyz
{
	Pqr()
	{
		System.out.println("heeeee");
	}
	void disp()
	{
		System.out.println("hiiiiiii");
	}
}
public class Xyz
{
	public static void main(String[] args)
	{
		Xyz a1= new Pqr();
		a1.disp();
		a1.disp();
	}
}

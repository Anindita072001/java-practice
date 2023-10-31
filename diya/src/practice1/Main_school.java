package practice1;
interface Person1{
	public void speak();
}

class Student1 implements Person1234{
	public void speak() {
		System.out.println("sumi is a student");
	}
}

class Teacher1 implements Person1234{
	public void speak() {
		System.out.println("sumita is a teacher");
	}
}



public class Main_school {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student1 s = new Student1();
      s.speak();
      
      Teacher1 t = new Teacher1();
      t.speak();
	}

}

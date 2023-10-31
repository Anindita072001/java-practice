package practice1;
class Person{
	String name = "Anindita";
	int age = 23;
	public void speak() {
		System.out.println(name +" "+age);
	}
}
class Student extends Person{
	String grade = "A";
	public void study() {
		System.out.println(grade);
	}
}
public class Main_person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student s = new Student();
    s.speak();
    s.study();
	}

}

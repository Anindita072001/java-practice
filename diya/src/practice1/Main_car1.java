package practice1;
class Vehicle{
	String brand = "BMW";
	String model = "f5";
	int year = 2023;
	public void drive() {
		System.out.println(brand +" "+model +" "+year);
	}
		

}
class Car extends Vehicle{
	String color = "red";
	public void honk() {
		System.out.println(color);
}
}
	public class Main_car1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Car c = new Car();
     c.drive();
     c.honk();
	}

}

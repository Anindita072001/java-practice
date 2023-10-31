package practice1;
abstract class Shape{
	abstract void calculateArea();
}

class Circle extends Shape{
	void calculateArea(){
		System.out.println("Area of a circle");
	}
}
class Rectangle extends Shape{
	void calculateArea(){
		System.out.println("Area of a rectangle");
	}
}
public class Main_calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Circle c = new Circle();
    c.calculateArea();
    
    Rectangle r = new Rectangle();
    r.calculateArea();
	}

}

package javapolymorphism;

class Vechicle{
	void display() {
		System.out.println("Vechicle is running !!!");
	}
}
class Bike extends Vechicle{
	void display() {
		System.out.println("Bike is running !!!");
	}
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike obj = new Bike();
		obj.display();
	}

}

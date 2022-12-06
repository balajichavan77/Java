package javainheritance;

class Vechicle{
	int speed;
	
	Vechicle(){
		System.out.println("Vechicle Default constructor invoked");
	}
	Vechicle(int speed){
		this.speed = speed;
	}
	void getVechicleDetails() {
		System.out.println("Vechicle running at speed:"+this.speed+" "+"km/hr");
	}
}
class Bike extends Vechicle{
	int bike_speed;
	
	Bike(){
		System.out.println("Default Bike constructor invoked");
	}
	Bike(int bike_speed){
		super(bike_speed);
		this.bike_speed = bike_speed;
	}
	void getBikeDetails() {
		super.getVechicleDetails();
		System.out.println("Bike is running at speed:"+this.bike_speed+" "+"km/hr");
	}
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Bike();
		Bike obj = new Bike(100);
		obj.getBikeDetails();
	}

}

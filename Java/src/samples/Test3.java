package samples;

//method overloading
class A{
	int x,y;
	void display() {
		System.out.println("Overloded Function");
	}
	void display(int x) {
		System.out.println("Square:"+(x*x));
	}
	void display(int x,int y) {
		System.out.println("Addition:"+(x+y));
	}
	void display(String s) {
		System.out.println("Length:"+s.length());
	}
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj = new A();
		obj.display();
		obj.display(10);
		obj.display(5,10);
		obj.display("Mahesh");
	}
}

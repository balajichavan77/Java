package javaabstraction;

interface I1{
	abstract void show();
	         void display();
}
public class Test3 implements I1 {

	@Override
	public void show() {
		// TODO Auto-generated method stub
	System.out.println("msg from show");	
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("msg from display");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 obj = new Test3();
		obj.display();
		obj.show();
	}
}

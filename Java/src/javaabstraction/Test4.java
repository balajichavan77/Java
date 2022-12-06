package javaabstraction;

public class Test4 implements Task1,Task2 {

	@Override
	public void printing() {
		// TODO Auto-generated method stub
		System.out.println("printing........");
	}

	@Override
	public void scanning() {
		// TODO Auto-generated method stub
		System.out.println("Scanning........");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 obj = new Test4();
		obj.printing();
		obj.scanning();
	}
}

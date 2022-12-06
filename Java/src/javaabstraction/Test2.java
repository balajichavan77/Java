package javaabstraction;

abstract class RBI{
	void transaction_limit() {
		System.out.println("Allowed 50000 Only");
	}
	abstract void roi();
}
class SBI extends RBI{

	@Override
	void roi() {
		// TODO Auto-generated method stub
		System.out.println("Rate of Instrest in SBI is: 7%");
	}
}
class ICICI extends RBI{

	@Override
	void roi() {
		// TODO Auto-generated method stub
		System.out.println("Rate of Instrest in ICICI is: 9%");
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBI obj = new SBI();
		obj.roi();
		obj.transaction_limit();
	}
}

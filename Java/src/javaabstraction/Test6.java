package javaabstraction;

interface Billing{
	abstract void invoice_amount();
		
	}

public class Test6 implements Billing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test6 obj = new Test6();
		obj.invoice_amount();
	}

	@Override
	public void invoice_amount() {
		// TODO Auto-generated method stub
		System.out.println("Total Invoice Amount is : 40000");
	}

}

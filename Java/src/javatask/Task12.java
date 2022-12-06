package javatask;

//method Overriding
class Vendor{
	void Calculate(int order_amount, int discount_amt) {
		int total_amount;
		total_amount = order_amount - discount_amt;
		System.out.println(total_amount);
	}
}
class Flipkart extends Vendor{
	void calculate(int order_amount, int discount_amt) {
		int total_amount;
		int tax_amount = 8000;
		total_amount = order_amount - discount_amt + tax_amount;
		System.out.println(total_amount);
	}
}
public class Task12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flipkart obj = new Flipkart();
		obj.calculate(10000, 8000);
	}
}

package javaexceptions;


public class Test9 {

	static boolean ValidateNumber(int number) {
		if (number == 0) {
		  throw new ArithmeticException("Divisor is 0");
		}
		else {
			return true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 20;
		int num2 = 20;
		System.out.println("start");
		try {
			if(ValidateNumber(num2)) {
				System.out.println(num1/num2);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("done");
	}

}

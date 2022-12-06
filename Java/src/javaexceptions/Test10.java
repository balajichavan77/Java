package javaexceptions;

public class Test10 {

	static void ValidateAge(int age){
		if (age < 18) {
			throw new ArithmeticException("User Not Eligible to Voot !!!");
		}
		else {
			System.out.println("User is Eligible to Voot !!!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("start");
		ValidateAge(17);
		System.out.println("done");
	}

}

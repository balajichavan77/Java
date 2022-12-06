package javaexceptions;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Mahesh";
		try {
			System.out.println(name.length());
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println(3);
		}
	}
}

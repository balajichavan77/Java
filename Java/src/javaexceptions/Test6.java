package javaexceptions;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Mahesh";
		try {
			System.out.println(name.charAt(1));
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println(3);
		}
	}
}

package javaexceptions;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {10,20,30,40,50};
		try {
			System.out.println(array[5]);
		}catch(Exception ex) {
			System.out.println(3);
		}
	}
}

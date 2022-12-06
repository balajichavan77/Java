package samples;
//multilevel inheritance

import java.util.Scanner;

class M{
	int n;
	void getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		n = sc.nextInt();
	}
}
class N extends M{
	void  display() {
		getInput();
		System.out.println("Square:"+(n*n));
	}
}
class L extends N{
	void display() {
		getInput();
		System.out.println("Cube:"+(n*n*n));
	}
}
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		N obj1 = new N();
		obj1.display();
		L obj2 = new L();
		obj2.display();
		}
	}

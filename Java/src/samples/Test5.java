package samples;

//single inheritance
import java.util.Scanner;

class C{
	int n;
	void getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		n = sc.nextInt();
	}
}
class D extends C{
	void display() {
		getInput();
		System.out.println("Square Root:"+Math.sqrt(n));
	}
}
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	D obj = new D();
	obj.display();
	}
}

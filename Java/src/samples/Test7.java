package samples;

//Hierarchical Inheritance
import java.util.Scanner;

class W {
	int n;

	void getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		n = sc.nextInt();
	}
}

class X extends W {
	void display() {
		getInput();
		System.out.println("Square:" + (n * n));
	}
}

class Y extends W {
	void display() {
		getInput();
		System.out.println("Cube:" + (n * n * n));
	}
}

class Z extends W {
	void display() {
		getInput();
		System.out.println("Square Root:" + Math.sqrt(n));
	}
}

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		X obj1 = new X();
		obj1.display();
		Y obj2 = new Y();
		obj2.display();
		Z obj3 = new Z();
		obj3.display();
	}

}

package javacondition;
import java.util.Scanner;
public class Test2 {
	public static void main(String[] args) {
		System.out.println("Enter Age:");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age >= 18) {
			System.out.println("Eligible to Vote !!!");
		}
		else {
			System.out.println("Not Eligible to Vote !!!");
		}
	}
}

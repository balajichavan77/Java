package javatask;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 System.out.print("Enter a number: ");
		 Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();

	        if(num % 2 == 0) {
	            System.out.println(num + " is even number");
	        }
	        else {
	            System.out.println(num + " is odd number");
	        }
	}

}

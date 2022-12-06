package samples;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter a Number: ");  
		number = sc.nextInt();
		
		int[]numberArray = new int[10];
		System.out.println("Enter the Elements of the Array:");
		
		for(int i = 0; i < number; i++) {
			numberArray[i] = sc.nextInt();
		}
		System.out.println("Array Elements are:");
		
		for(int i=0; i < number; i++) {
			System.out.println(numberArray[i]);
		}
	}
}

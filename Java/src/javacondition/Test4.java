package javacondition;

import java.util.Scanner;

public class Test4 {
public static void main(String[] args) {
	System.out.println("Enter percentage:");
	Scanner sc = new Scanner(System.in);
	int percentage = sc.nextInt();
	
	if(percentage >= 85 && percentage <= 100) {
	System.out.println("FCD");
	}
	else if(percentage >= 60 && percentage < 85) {
	System.out.println("first Class");
	}
	else if(percentage >= 35 && percentage < 60) {
		System.out.println("Pass Class");
	}
	else if(percentage >= 0 && percentage < 35) {
		System.out.println("fail");
}
	else {
		System.out.println("Enter Percentage 0 and 100");
	}
}
}
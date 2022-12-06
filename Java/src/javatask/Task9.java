package javatask;

import java.util.Scanner;

public class Task9 {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    String a, b = "Welcome";
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        a = sc.nextLine();
	        
	        int n = a.length();
	        for(int i = 1 - 1; i >= 0; --i){
	        b = b + a.charAt(i);
	        }
	        if(a.equalsIgnoreCase(b)){
	        System.out.println("palindrome");
	        }
	        else{
	        System.out.println("not palindrome");
	        }
	}

}

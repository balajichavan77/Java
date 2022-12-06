package javatask;

public class Task5 {

	// To Reverse all elements of an array
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    int [] array = new int [] {10, 20, 30, 40, 50};  
	        System.out.println("Original array:");  
	        for (int i = 0; i < array.length; i++) {	
	            
	        System.out.println(array[i] + " ");  
	        }
	        
	        System.out.println();  
	        System.out.println("Array in reverse order:");  
	        
	        for (int i = array.length-1; i >= 0; i--) {  
	        System.out.println(array[i] + " ");  
	    }  
	}
}

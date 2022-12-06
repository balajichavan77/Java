package javacollections;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Alex");
		a1.add("Alen");
		a1.add("Bob");
		a1.add("Clement");
		a1.add("Jhon");
		
		Iterator <String> it = a1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}	
		//System.out.println(a1);
	}
}

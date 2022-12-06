package oops;

//static program
public class Test5 {
	static int count=0;
	Test5(){
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test5 obj1 = new Test5();
		Test5 obj2 = new Test5();
		Test5 obj3 = new Test5();
		Test5 obj4 = new Test5();
		Test5 obj5 = new Test5();
	}
}

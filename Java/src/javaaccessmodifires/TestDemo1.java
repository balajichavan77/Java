package javaaccessmodifires;

public class TestDemo1 {

	private int number = 200;
	public String name = "Mahesh";
	int age = 21;
	protected String email ="mahesh@gmail.com";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TestDemo1 obj = new TestDemo1();
       System.out.println(obj.number);
       System.out.println(obj.name);
       System.out.println(obj.age);
       System.out.println(obj.email);
	}
}

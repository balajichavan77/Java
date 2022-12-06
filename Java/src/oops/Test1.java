package oops;

class Person{
	int id = 101;
	String name = "Mahesh";
	int age = 22;
	void getPerson(){
		System.out.println(id+ " "+ name+ " "+ age);
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person();
		p.getPerson();
		p.getPerson();
	}
}

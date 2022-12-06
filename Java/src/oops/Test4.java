package oops;

// default constructor
class Student{
	int roll_no;
	String student_name;
	int age;
	
	public Student() {
		System.out.println("Deafult constructor exicuted");
	}
	
	// Parameterized constructor
	Student(int roll_no, String student_name,int age){
		this.roll_no = roll_no;
		this.student_name = student_name;
		this.age = age; 
	}
	void getStudentDetails() {
		System.out.println(this.roll_no+" "+this.student_name+" "+this.age);
	}
}
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(101,"Mahesh",21);
		s1.getStudentDetails();
		Student s2 = new Student(102,"Sunil",22);
		s2.getStudentDetails();
	}
}

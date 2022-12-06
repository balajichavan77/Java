package oops;

import java.time.LocalDate;
import java.time.Period;

class Employee{
	int emp_id = 101;
	String emp_name = "Mahesh Patil";
	String emp_email = "mahesh@gmail.com";
	String emp_dob = "2001-12-23";
	
	void getEmployeedetails() {
		System.out.println(emp_id + " " +emp_name + " " + emp_email + " " + emp_dob);
		System.out.println();
	}
	void calculateAge() {
		LocalDate dob = LocalDate.parse(emp_dob);
		LocalDate curDate = LocalDate.now();
		System.out.println(emp_name + " " + "is" + " " + Period.between(dob, curDate).getYears() + " " + "Years Old");
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee el = new Employee();
		el.getEmployeedetails();
		el.calculateAge();
	}

}

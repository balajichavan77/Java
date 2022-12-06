package javaabstraction;

abstract class Employee{
	void empDetails() {
		System.out.println("Employee Details are: Mahesh From INDIA");
		}
	abstract void salary();
	}

class HRDepartment extends Employee{
	void salary() {
		System.out.println("Salary Details: Rs 56000");
	}
}
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HRDepartment obj = new HRDepartment();
		obj.empDetails();
		obj.salary();
	}
}

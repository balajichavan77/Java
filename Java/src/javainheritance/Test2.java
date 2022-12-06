package javainheritance;

class Project{
	int project_id;
	String project_name;
	String status;
	
	Project(){
		System.out.println("Default project constructor invoked");
		this.project_id = 101;
		this.project_name = "Online Shopping Cart";
		this.status = "In Prograss";
	}
	void getProjectDetails() {
		System.out.println(this.project_id+" "+this.project_name+" "+this.status);
	}
}
class Task extends Project{
	int task_id;
	String task_name;
	String task_status;
	
	Task(int task_id,String task_name,String task_status){
		super(); // super() Invokes 
		this.task_id = task_id;
		this.task_name = task_name;
		this.task_status = task_status;
	}
	void getDetails() {
		System.out.println(super.project_name);
		super.getProjectDetails();
		System.out.println(this.task_id+" "+this.task_name+" "+this.task_status);
	}
}
public class Test2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Task obj = new Task(01,"Implement Payment Getway","Assigned");
		obj.getDetails();
	}
}

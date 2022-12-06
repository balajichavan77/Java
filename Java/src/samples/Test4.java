package samples;

class B{
	int n;

  B(){
	n=100;
	System.out.println("Constructor Initialized");
   }	
  void display() {
	  System.out.println("Square:"+(n*n));
  }
}
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj = new B();
		obj.display();
	}

}

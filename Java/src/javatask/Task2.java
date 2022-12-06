package javatask;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t1=0;
		 int t2=1;
		 int t3;
		 int i;
		 int count=20;  
		 
		 System.out.print(t1+" "+t2);
		 for(i=2;i<count;++i){  
		  t3=t1+t2;  
		  
		  System.out.print(" "+t3);  
		  t1=t2;  
		  t2=t3;  
		 }  
	}
}

package oops;

class Product{
	int product_id;
	String product_name;
	int product_qty;
	
	//Constructor
	Product(){
		System.out.println("Default constructor gets exicuted");
		product_id = 111;
		product_name = "Laptop";
		product_qty = 10;
	}
	
	void getProductDetails() {
		System.out.println(product_id+ " "+product_name+ " "+product_qty);
	}
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1 = new Product();
		p1.getProductDetails();
	}
}
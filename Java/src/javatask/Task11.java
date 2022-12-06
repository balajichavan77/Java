package javatask;

//default constructor
		class Passenger{
			int p_id;
			String p_name;
			int p_age;
			String p_email;
			String p_phone;
			String p_gender;
			
			public Passenger() {
				System.out.println("Deafult constructor exicuted");
			}
				// Parameterized constructor
				Passenger(int p_id, String p_name,int p_age,String p_email,String p_phone,String p_gender){
					this.p_id = p_id;
					this.p_name = p_name;
					this.p_age = p_age; 
					this.p_email = p_email;
					this.p_phone = p_phone;
					this.p_gender = p_gender;
				}
			void getPassengerDetails() {
			System.out.println(this.p_id+" "+this.p_name+" "+this.p_age+" "+this.p_email+" "+this.p_phone+" "+this.p_gender);
		}
	}
public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Passenger s1 = new Passenger(101,"Mahesh",21,"mahesh@gmail.com","7775919225","male");
		s1.getPassengerDetails();
		Passenger s2 = new Passenger(102,"Sunil",22,"sunil@gmail.com","9875999025","male");
		s2.getPassengerDetails();
		Passenger s3 = new Passenger(103,"Somesh",26,"somesh@gmail.com","9846245647","male");
		s3.getPassengerDetails();
		Passenger s4 = new Passenger(104,"Suman",21,"suman@gmail.com","9875646225","female");
		s4.getPassengerDetails();
		Passenger s5 = new Passenger(105,"Rani",22,"rani@gmail.com","9875999025","female");
		s5.getPassengerDetails();
		Passenger s6 = new Passenger(106,"Soniya",21,"soniya@gmail.com","9846245647","female");
		s6.getPassengerDetails();
	}
}

package javaencapsulation;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user1 = new User();
		user1.setUserName("Mahesh");
		user1.setPassword("1234");
		
		System.out.println(user1.getUserName() +" "+user1.getPassword());
		

		User user2 = new User();
		user2.setUserName("Soniya");
		user2.setPassword("123");
		
		System.out.println(user2.getUserName()+" "+user2.getPassword());
	}
}

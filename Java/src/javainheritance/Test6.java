package javainheritance;

class Sports{
	String sport_name;
	public Sports(String sport_name) {
		super();
		this.sport_name = sport_name;
		System.out.println("Sports Constructor !!!");
	}
	void getSportsDetails() {
		System.out.println(this.sport_name);
	}
}
class BasketBall extends Sports{

	public BasketBall(String sport_name) {
		super(sport_name);
		System.out.println("BasketBall Constructor !!!");
		// TODO Auto-generated constructor stub
	}
}
class BaseBall extends Sports{

	public BaseBall(String sport_name) {
		super(sport_name);
		System.out.println("BaseBall Constructor !!!");
		// TODO Auto-generated constructor stub
	}	
}
class Cricket extends BasketBall{

	public Cricket(String sport_name) {
		super(sport_name);
		System.out.println("Cricket Constructor !!!");
		// TODO Auto-generated constructor stub
	}
}
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseBall baseball = new BaseBall("BaseBall");
		baseball.getSportsDetails();
	}
}

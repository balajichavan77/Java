package javacondition;

public class Test5 {
public static void main(String[] args) {
	int weekday = 7;
	switch(weekday) {
	case 1:
		System.out.println("Monday");
		break;
		
	case 2:
		System.out.println("Tuesday");
		break;
		
	case 3:
		System.out.println("Wednesday");
		break;
		
	case 4:
		System.out.println("Thurusday");
		break;
		
	case 5:
		System.out.println("Friday");
		break;
		
	case 6:
		System.out.println("Staurday");
		break;
		
	case 7:
		System.out.println("Sunday");
		break;
		
		default:
			System.out.println("Enter Weekday between 1 to 7");
		}
	}
}

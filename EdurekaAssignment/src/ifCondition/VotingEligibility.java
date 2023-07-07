package ifCondition;
import java.util.Scanner;

public class VotingEligibility {
	static int age;
	public static void main(String[] args) {
		ageEligibilty();	
	}
	public static void ageEligibilty() {
		System.out.println("Enter your age ");
		Scanner input = new Scanner(System.in);
		age=input.nextInt();
		
		if (age>=18)
			System.out.println("eligible for voting");
		else
			System.out.println("Not eligible for voting");
	}
}

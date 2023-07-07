package ifCondition;
import java.util.Scanner;

public class NumberPostvorNegtvorZero {
	 static int num;	 	
	public static void main(String[] args) {
		PositiveorNegative();
	}
	public static void PositiveorNegative() {
		System.out.println("Enter your number");
		Scanner input = new Scanner(System.in);
		num=input.nextInt();
		if(num>0)
			System.out.println("Number you entered is positive :"+num);
		else if(num==0)
			System.out.println("Number you entered is Zero :"+num);
		else
			System.out.println("Number you entered is negative :"+num);
	}
}

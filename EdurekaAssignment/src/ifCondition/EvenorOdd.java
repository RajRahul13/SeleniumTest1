package ifCondition;
import java.util.Scanner;

public class EvenorOdd {
		static int num;
	
	public static void main(String[] args) {
		System.out.println("Enter your number");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		Numevenorodd();
	}
	public static void Numevenorodd() {
		
		if(num%2==0)
			System.out.println("Number entered is even "+num);
		else
			System.out.println("Number entered is odd "+num);
	}

}

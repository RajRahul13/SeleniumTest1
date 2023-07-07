package ifCondition;
import java.util.Scanner;

public class Largestoftwo {
	static int num1;
	static int num2;
	public static void main(String[] args) {
		LargestNum();
	}
	public static void LargestNum() {
		Scanner input=new Scanner(System.in);
		System.out.println("enter your first number");
		num1=input.nextInt();
		System.out.println("enter your second number");
		num2=input.nextInt();
		
		if(num1>num2)
			System.out.println("largest of num1 and num2 is:"+num1);
		else if(num1==num2)
			System.out.println("num1 is equal to num2 :"+num1+" and "+num2);
		else
			System.out.println("smallest of num1 and num2 is:"+num1);
	}

}

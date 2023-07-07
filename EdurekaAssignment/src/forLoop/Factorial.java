package forLoop;
import java.util.Scanner;

public class Factorial {
		static int i,n;
		static int j=1;
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=input.nextInt();
		if(num>0) {
			n=num;
			FactorialofNum();
		}
		else if(num==0)
			System.out.println("Factorial of your number is 1");
		else
			System.out.println("factorial of your number is not defined;");
	}
	
	public static void FactorialofNum() {
		     for(i=1;i<=n;i++) {
		    	 j= j*i;
		     }
		     	System.out.println("factorial of your number :"+ j);
	}

}

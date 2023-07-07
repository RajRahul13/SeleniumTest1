package whileLoop;
import java.util.Scanner;

public class Factorial {
		static int i=1,n;
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
		     while(i<=n) {
		    	 j= j*i;
		    	 i++;
		     }
		     	System.out.println("factorial of your number :"+ j);
	}

}

package dowhileLoop;
import java.util.Scanner;

public class ReverseDigit {
	static int rev=0;
	static int temp;
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any number");
		temp=input.nextInt();
		ReverseDigitOfNum();
	}
	public static void ReverseDigitOfNum() {
		do {
			rev=rev*10+temp%10;
			temp=temp/10;
		}while(temp!=0);
		System.out.println("Reverse of your given number :"+ rev);
	}
}

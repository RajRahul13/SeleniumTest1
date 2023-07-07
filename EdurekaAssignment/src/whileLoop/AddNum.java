package whileLoop;
import java.util.Scanner;

public class AddNum {
	static int n;
	static int sum=0;
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any number");
		n=input.nextInt();
		AddDigitOfNum();
	}
	public static void AddDigitOfNum() {
		while(n!=0) {
			sum=sum+n%10;
			n=n/10;
		}
		System.out.println("sum of digit of your number :" + sum);
	}
}

package forLoop;
import java.util.Scanner;

public class AddNum {
	static int n;
	static int sum;
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any number");
		n=input.nextInt();
		AddDigitOfNum();
	}
	public static void AddDigitOfNum() {
		for(sum=0;n!=0;n=n/10) {
			sum=sum+n%10;
		}
		System.out.println("sum of digit of your number :" + sum);
	}
}

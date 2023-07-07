package forLoop;

public class FibonacciSeries {
	static int num1=0,num2=1,num3=0;
	public static void main(String[] args) {
		FirstTenFibonacci();
	}
	public static void FirstTenFibonacci() {
		System.out.print(num1 +" "+ num2);
		for(int i=2;i<10;i++) {
			num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
		}
	}
}

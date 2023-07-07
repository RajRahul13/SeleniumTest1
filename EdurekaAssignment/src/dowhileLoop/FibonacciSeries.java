package dowhileLoop;

public class FibonacciSeries {
	static int num1=0,num2=1,num3=0,i=2;
	public static void main(String[] args) {
		FirstTenFibonacci();
	}
	public static void FirstTenFibonacci() {
		System.out.print(num1 +" "+ num2);
		do {
			num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
			i++;
		}while(i<10);
	}
}

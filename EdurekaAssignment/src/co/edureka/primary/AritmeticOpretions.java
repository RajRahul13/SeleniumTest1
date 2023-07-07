package co.edureka.primary;

public class AritmeticOpretions{
	public int substract(int a,int b) {
		return b-a;
	}
	public int multiply(int a,int b) {
		return a*b;
	}
	public int divide(int a,int b) {
		return b/a;
	}
	public int factorial(int a) {
		int fact = 1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public int reverse(int num) {
		int temp=num;
		int rev=0;
		while(temp!=0) {
			rev=rev*10 + temp%10;
			temp=temp/10;			
		}
		return rev;
	}
}


package test;

public class SwapNumbers {
	static int a=10;
	static int b=20;
	static int temp=0;
	
	public static void main(String [] args)
	{
		//SwapMethod1();
		//SwapMethod2();
		SwapMethod3();
	}
	
	public static void SwapMethod1() {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("swapped value of a & b are "+ a +" "+ b );
		
	}
	public static void SwapMethod2() {
		temp=a;
		a=b;
		b=temp;
		System.out.println("swapped value of a & b are "+ a +" "+ b );
		
	}
	public static void SwapMethod3() {
		a=a^b; //bitwise XOR
		b=a^b;
		a=a^b;
		System.out.println("swapped value of a & b are "+ a +" "+ b );
		
	}
}

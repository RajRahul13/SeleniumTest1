package DataTypesandOperations;

public class AirtmeticOprns {
	
	static int num1=5;
	static int num2=10;
	static int result;
	public static void main(String[] args) {
		addition();
		substraction();
		multiplication();
		division();
		increment();
		decrement();
	}

	public static void addition() {
		result=num1+num2;
		System.out.println("Adding num1 and num2 :" +result);
	}
	public static void substraction() {
		result=num2-num1;
		System.out.println("Substarcting num1 from num2 :" +result);
	}
	public static void multiplication() {
		result=num2*num1;
		System.out.println("Multiplicating num1 and num2 :" +result);
	}
	public static void division() {
		result=num2/num1;
		System.out.println("Diving num1 from num2 :" +result);
	}
	public static void increment() {
		num1++;
		System.out.println("After incrementing num1 :" +num1);
	}
	public static void decrement() {
		num1--;
		System.out.println("After decrementing num1 :" +num1);
	}
}

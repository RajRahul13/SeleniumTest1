package co.edureka.secondary;
import co.edureka.primary.*;

public class ImportMethod {

	public static void main(String[] args) {
		AritmeticOpretions op = new AritmeticOpretions();
		System.out.println("value after substracting 4 from 5:"+ op.substract(4, 5));
		System.out.println("value after multiplying 3 and 2 :"+ op.multiply(3, 2));
		System.out.println("value after diving 3 from 6 :"+ op.divide(3, 6));
		System.out.println("value of factorial 5 :"+ op.factorial(5));
		System.out.println("value of 4353 after reversing :"+ op.reverse(4353));

	}

}

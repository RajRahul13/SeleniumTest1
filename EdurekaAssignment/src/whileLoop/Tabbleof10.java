package whileLoop;
import java.util.Scanner;

public class Tabbleof10 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=input.nextInt();
		System.out.println("Table of :"+ n);
		
		int i=1;
			while(i<=10) {
				System.out.println(n*i);
					i++;
			}
	}
	
	

}

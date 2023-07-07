package forLoop;
import java.util.Scanner;

public class Tabbleof10 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=input.nextInt();
		System.out.println("Table of :"+ n);
			for(int i=1;i<=10;i++)
				System.out.println(n*i);
	}
	
	

}

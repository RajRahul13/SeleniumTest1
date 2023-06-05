package test;

import java.util.Scanner;

public class lowerCasetoUppercase {

	
	static String str="";
	static String UpperCase="";
	static String StrRemain="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(str.toUpperCase());
		getUserInput();
		FirstTwoUppercase();	
	}
	public static void getUserInput() {
		System.out.println("Enter your desired string");
		Scanner ip= new Scanner(System.in);
		str= ip.next();
	}
	public static void FirstTwoUppercase() {
		for(int i=0;i<2;i++) {
			UpperCase=UpperCase+str.charAt(i);
		}
		for(int i=2;i<str.length();i++) {
			StrRemain=StrRemain+str.charAt(i);
		}
		System.out.println(UpperCase.toUpperCase()+StrRemain);
	}
}

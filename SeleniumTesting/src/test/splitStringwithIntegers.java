package test;

import java.util.Scanner;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class splitStringwithIntegers {
	static String str="";
	static String finalexpression="";
	public static void main(String[] args) {
		getUserInput();
		splitStringwithInteger();
		RmvSpaces("rahul rai");
	}
	public static void getUserInput() {
		System.out.println("Enter your desired string");
		Scanner ip= new Scanner(System.in);
		str= ip.next();
	}
	public static void splitStringwithInteger() {
		//System.out.println(str.concat("rauhul"));
		finalexpression=str.replaceAll("[^0-9]","");
		System.out.println(finalexpression);
	}
	
	//passing string as arguement to the funcion
	public static void RmvSpaces (String str1)  {
		str1=str1.replaceAll(" ","");
		System.out.println(str1);
	}
}

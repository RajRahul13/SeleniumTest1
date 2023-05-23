package test;

import java.util.Scanner;
	
public class Palindrome {
		public static void main (String args[]) {	
			
			//String Palindrome
		//StringPalindromeMethod1();
		//StringPalindromeMethod2();
		//StringPalindromeMethod3();
			//Number Palindrome
		//NumberPalindromeMethod1();	
		//NumberPalindromeMethod2();
		NumberPalindromeMethod3();
		
		System.out.println("Do you wish to continue");
		System.out.println("Type Yes or No");
		Scanner Userip = new Scanner(System.in);
		String Useripchoice = Userip.next();
		if(Useripchoice.equals("Yes")) {
		}
		
	}
	public static void StringPalindromeMethod1() {
		System.out.println("Enter your String:");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		String revStr="";
		int strLen = str.length();
		
		for(int i=strLen-1;i>=0;i--)
		{
			revStr=revStr + str.charAt(i);
		}
		//System.out.println(revStr);
		if(str.equals(revStr)){
			System.out.println(str +" is palindrome string");
		}
		else {
			System.out.println(str +" is not palindrome string");
		}
			
		
	}
	public static void StringPalindromeMethod2() {
		System.out.println("Enter your String:");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		char a[]=str.toCharArray();
		
		String revStr="";
		int strLen = str.length();
		
		for(int i=strLen-1;i>=0;i--)
		{
			revStr=revStr + a[i];
		}
		//System.out.println(revStr);
		if(str.equals(revStr)){
			System.out.println(str +" is palindrome string");
		}
		else {
			System.out.println(str +" is not palindrome string");
		}
			
		
	}
	
	public static void StringPalindromeMethod3() {
		System.out.println("Enter your String:");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		StringBuffer sb= new StringBuffer(str);		//modify this method
		
		if(str.equals(sb.reverse())){
			System.out.println(str +" is palindrome string");
		}
		else {
			System.out.println(str +" is not palindrome string");
		}
			
		
	}
	
	public static void NumberPalindromeMethod1() {
		System.out.println("Enter your Number:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int temp=num;
		
		int rev=0;
		
		while(temp!=0) {
			rev=rev*10 + temp%10;
			temp=temp/10;			
		}
		
		if(num==rev){
			System.out.println(num +" is palindrome number");
		}
		else {
			System.out.println(num +" is not palindrome number");
		}
			
		
	}
	
	public static void NumberPalindromeMethod2() {
		System.out.println("Enter your Number:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();       
		System.out.println("reverese number is "+ rev);
	}
	
	public static void NumberPalindromeMethod3() {
		System.out.println("Enter your Number:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		StringBuilder sb = new StringBuilder(num);
		sb.append(num);
		StringBuilder rev = sb.reverse();
		System.out.println("reverese number is "+ rev );
	}

}

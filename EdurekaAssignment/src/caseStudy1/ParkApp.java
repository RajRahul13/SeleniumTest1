package caseStudy1;

import java.util.Scanner;

public class ParkApp {
	static double ticketprice=400;
	static int NoOfTicket;
 	public static void main(String[] args) {
 		System.out.println("How many tickets do you want");
		Scanner ip=new Scanner(System.in);
		NoOfTicket=ip.nextInt();
		if(NoOfTicket>0)
			Ticket();
		else
			System.out.println("Please enter a valid number");
	}
	
	public static void Ticket() {
		ticketprice=(ticketprice*NoOfTicket);
		if(NoOfTicket>=10) {
			ticketprice=ticketprice-(ticketprice*0.1);
			System.out.println("As you have booked 10 or more tickets here is your discounted price : "+ ticketprice);
		}
		else {
			System.out.println("Your total amount is :"+ticketprice);
		}
	}

}

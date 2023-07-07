package caseStudy2;

import java.util.Scanner;

public class TheatreBookingApp {
	static String TicketCategory;
	static int NoOfTicket;
	public static void main(String[] args) {
		TicketSelection();
		
	}
	public static void TicketSelection() {
		System.out.println("Which cateogory ticket you want: Gold or Silver ?");
		Scanner ip1=new Scanner(System.in);
		TicketCategory=ip1.next();
		TicketCategory=TicketCategory.toUpperCase();
			if(TicketCategory.equals("GOLD")||TicketCategory.equals("SILVER")) {
				System.out.println("How many tickets do you want ?");
					Scanner ip2=new Scanner(System.in);
					NoOfTicket=ip2.nextInt();
						if(NoOfTicket>0)
							TicketBooking();
						else
							System.out.println("Please enter a valid number");
			}
			else
				System.out.println("Please enter 'Gold' or 'Silver' as an category: Thanks");
	}
	public static void TicketBooking() {
		int priceGold = 200;
		int priceSilver = 150;
		if(TicketCategory.equals("GOLD")) {
			System.out.println("Your total amount is :"+ (priceGold*NoOfTicket));
		}
		else 
			System.out.println("Your total amount is :"+ (priceSilver*NoOfTicket));
		
		
	}

}

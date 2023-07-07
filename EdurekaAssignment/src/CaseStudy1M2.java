import java.util.Scanner;

public class CaseStudy1M2 {
	static Double finalamount=0.0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] drinks = {"MangoJuice","AppleJuice","KiwiJuice","OrangeJuice"};
		Double [] prices = {50.0,60.0,70.0,45.0};
		menu(drinks, prices);
		order(drinks, prices);
	}
	public static void menu(String [] drinks,Double [] prices) {
		System.out.println("Drinks\t\tPrices");
		for(int i=0;i<drinks.length;i++) {
			System.out.println(drinks[i]+"\t"+prices[i]);
		}
	}
	public static void order(String [] drinks,Double [] prices) {
		System.out.println("How many drink do you want:");
		Scanner ip = new Scanner(System.in);
		int n=ip.nextInt();
		String [] Drinknames = new String[n];

		System.out.println("Enter your drniks name");
		for(int k=0;k<n;k++) {
			Drinknames[k]=ip.next();
		}


		for(int i=0;i<n;i++) {
			for(int j=0;j<drinks.length;j++)
				if(drinks[j].equals(Drinknames[i])) {
					finalamount=(finalamount + prices[j]);
				}	
		}
		System.out.println("Your bill amount :"+finalamount);
	}

}

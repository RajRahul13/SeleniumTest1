import java.util.Scanner;

abstract class Bank {
	abstract void RateOfInterest();
}

class Bank1 extends Bank{
	void RateOfInterest() {
		System.out.println("Rate of interest of Bank1 is 7%");
	}
}

class Bank2 extends Bank{
	void RateOfInterest() {
		System.out.println("Rate of interest of Bank2 is 7.5%");
	}
}

class Bank3 extends Bank{
	void RateOfInterest() {
		System.out.println("Rate of interest of Bank3 is 8%");
	}
}
public class CaseStudy1M3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj;
		System.out.println("Please enter your choice of bank from - 1.Bank1 2.Bank2 3.Bank3");
		Scanner ip = new Scanner(System.in);
		String Bankip = ip.next();
		if(Bankip.equals("Bank1")) {
			obj=new Bank1();
			obj.RateOfInterest();
		}
		if(Bankip.equals("Bank2")) {
			obj=new Bank2();
			obj.RateOfInterest();
		}
		if(Bankip.equals("Bank3")) {
			obj=new Bank3();
			obj.RateOfInterest();
		}
	}

}

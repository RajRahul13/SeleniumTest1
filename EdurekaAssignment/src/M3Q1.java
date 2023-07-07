import java.util.Scanner;

abstract class account{
	int accountNumber;
	String name;
	double amount;
	final double min_amount=500;
	abstract public void account_create();
	abstract public void deposit();
	abstract public void withdraw();
	public void interest_rate() {
		
	}
}
class SB_Account extends account{
	
	public void account_create() {
		System.out.println("Your saving account has been created!");
	}
	public void withdraw(){
		System.out.println("total amount in your saving account after withdrawal is:"+amount);
	}
	public void deposit(){
		System.out.println("total amount in your saving account after deposit is:"+amount);
	}
	public void interest_rate() {
		System.out.println("Interest rate payout for saving account is 4% per month!");
	}
}
class Current_Account extends account{
	public void account_create() {
		System.out.println("Your current account has been created!");
	}
	public void withdraw(){
	
		System.out.println("total amount in your current account after withdrawal is:"+amount);
	}
	public void deposit(){
		System.out.println("total amount in your current account after deposit is:"+amount);
	}
}
public class M3Q1 {

	public static void main(String[] args) {
		System.out.println("Please enter choice of account you want to create - 1.Saving 2.Currrent");
		Scanner ip=new Scanner(System.in);
		String choice=ip.next();
		choice = choice.toUpperCase();
		account b;
		if (choice.equals("SAVING")){
		b = new SB_Account();
			b.account_create();
			b.interest_rate();
			
			//deposit
			System.out.println("Please enter amount you want to deposit!!");
			double cash=ip.nextDouble();
			b.amount=b.amount+cash;
			b.deposit();
			
			//withdraw
			System.out.println("Please enter amount you want to withdraw!!");
			double withdraw=ip.nextDouble();
			b.amount=b.amount-withdraw;
				if(b.amount>b.min_amount) {
					b.withdraw();
				}
				else {
				System.out.println("You have account balance will be less than min amount if you withdraw this amount!! Please keep minimum account balanace. ");
				}
			
			
		}
		if(choice.equals("CURRENT")) {
		b = new Current_Account();
			b.account_create();
			
			//deposit
			System.out.println("Please enter amount you want to deposit!!");
			double cash=ip.nextDouble();
			b.amount=b.amount+cash;
			b.deposit();
			
			//withdraw
			
			System.out.println("Please enter amount you want to withdraw!!");
			double withdraw=ip.nextDouble();
			b.amount=b.amount-withdraw;
				if(b.amount > b.min_amount) {
					b.withdraw();
				}
				else{
				System.out.println("You have account balance will be less than min amount if you withdraw this amount!! Please keep minimum account balanace. ");
				}
			
		}
		
			
	

	}

}

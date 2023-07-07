import java.util.Scanner;

class Mobile{
	Scanner ip=new Scanner(System.in);
	void dial(){
		System.out.println("Enter your 10 digit mobile number");
		int num = ip.nextInt();
		System.out.println("Your entered number is :"+num);
	}
	void receive() {
		System.out.println("Youre getting a call , Please receive or ignore!!");
	}
	void message() {
		System.out.println("Please enter your message!!");
		String msg = ip.next();
		System.out.println("Your entered message :"+msg);
	}
	void display(String message) {
		System.out.println("Your message to display "+message);
	}
}
public class CaseStudy2M2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile functn = new Mobile();
		functn.dial();
		functn.receive();
		functn.message();
		functn.display("Hi this is tom, please call back!!!");
	}

}

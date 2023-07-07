package forLoop;

public class NumEvenOdd {

	public static void main(String[] args) {
		NumevenoddForloop();
	}
	public static void NumevenoddForloop() {
		System.out.println("10 even numbers are as follows :");
		for(int i=1;i<=20;i++) {
			if(i%2==0)
				System.out.println(i);
		}
		System.out.println("10 odd numbers are as follows :");
		for(int i=1;i<=20;i++) {
			if(i%2!=0)
				System.out.println(i);
		}
			
	}

}

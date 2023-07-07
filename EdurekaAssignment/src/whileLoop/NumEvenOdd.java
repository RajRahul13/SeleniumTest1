package whileLoop;

public class NumEvenOdd {

	public static void main(String[] args) {
		NumevenoddForloop();
	}
	public static void NumevenoddForloop() {
		int i=1,j=1;
		System.out.println("10 even numbers are as follows :");
		while(i<=20) {
			if(i%2==0)
				System.out.print(" "+i);
			i++;
		}
		System.out.println();
		System.out.println("10 odd numbers are as follows :");
		while(j<=20) {
			if(j%2!=0)
				System.out.print(" "+j);
			j++;
		}
			
	}

}

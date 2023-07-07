package dowhileLoop;

public class NumEvenOdd {

	public static void main(String[] args) {
		NumevenoddForloop();
	}
	public static void NumevenoddForloop() {
		int i=1,j=1;
		System.out.println("10 even numbers are as follows :");
		do {
			if(i%2==0)
				System.out.print(" "+i);
			i++;
		}while(i<=20);
		System.out.println();
		System.out.println("10 odd numbers are as follows :");
		 do {
			if(j%2!=0)
				System.out.print(" "+j);
			j++;
		}while(j<=20);
			
	}

}

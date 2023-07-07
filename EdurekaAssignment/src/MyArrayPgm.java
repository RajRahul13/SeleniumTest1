import java.util.Arrays;
import java.util.Scanner;

interface queue1{
	public void insert();
	public void delete();
}

class queueclass1 implements queue1{
	int m=0;
	String queuearr1[]=new String[10];
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("enter number of people you want to insert in queue");
		Scanner ip = new Scanner(System.in);
		int n=ip.nextInt();
		System.out.println("enter names of people you want to insert in queue");
		String queuearr[] = new String[n];
		for(int i=0;i<n;i++) {
			queuearr[i]= ip.next();
		}
		
//		for(int i=0;i<n;i++) {
//			queuearr1[i]=queuearr[i];
//		}
		System.out.println("your queue elements are :"+Arrays.toString(queuearr));
		
		System.out.println("enter name of person you want to delete from queue");
		String rmvuser=ip.next();
		String queuearrnew[] = new String[queuearr.length-1];
		int k=0;
		for(int i=0;i<queuearr.length;i++) {
			if(queuearr[i]!=rmvuser) {
				queuearrnew[k]=queuearr[i];
				k++;
			}
		}
		System.out.println("your queue elements post deleting are :"+Arrays.toString(queuearrnew));
	}	

	

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("enter name of person you want to delete from queue");
		Scanner ip = new Scanner(System.in);
		String rmvuser=ip.next();
		String queuearrnew[] = new String[queuearr1.length];
		System.out.println("your queue elements are :"+Arrays.toString(queuearrnew));
		for(int i=0,k=0;i<queuearr1.length;i++) {
			if(queuearr1[i]!=rmvuser) {
				queuearrnew[k]=queuearr1[i];
				k++;
			}
		}
		System.out.println("your queue elements post deleting are :"+Arrays.toString(queuearrnew));
		
	}
	
}

public class MyArrayPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		queueclass qc=new queueclass();
		qc.insert();
		
		
		//qc.delete();
	}

}

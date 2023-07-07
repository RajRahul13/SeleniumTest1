import java.util.Arrays;
import java.util.Scanner;

interface queue{
	public void insert();
	public void delete();
}

class queueclass implements queue{
	int m=0;
	String queuearr1[]=new String[10];
	@Override
	public void insert() {
		int queuearr[]= {1,2,3,4,5,6};
		System.out.println("value insterted to queue :"+Arrays.toString(queuearr));
		}

	

	@Override
	public void delete() {
		int queuearr[]= {1,2,3,4,5,6};
		int queuearrnew[]=new int[queuearr.length-1];
		int j=3;
		for(int i=0,k=0;i<queuearr.length;i++) {
			if(queuearr[i]!=j) {
				queuearrnew[k]=queuearr[i];
				k++;
			}
		}System.out.println("value after deleting from queue :"+Arrays.toString(queuearrnew));
	}
	
}

public class M4Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		queueclass qc=new queueclass();
		qc.insert();
		qc.delete();
	}

}

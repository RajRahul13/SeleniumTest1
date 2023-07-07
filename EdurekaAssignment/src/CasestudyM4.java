class thread1 extends Thread{
	public void run() {
		System.out.println("Thread1 starts");
		int i=0;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("Thread1 ends");
	}
}
class thread2 extends Thread{
	public void run() {
		System.out.println("Thread2 starts");
		int i=101;
		while(i<=110) {
			System.out.println(i);
			i++;
		}
		System.out.println("Thread2 ends");
	}
}
public class CasestudyM4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread1 t1=new thread1();
		thread2 t2=new thread2();
		
		t1.start();
		t2.start();
	}

}

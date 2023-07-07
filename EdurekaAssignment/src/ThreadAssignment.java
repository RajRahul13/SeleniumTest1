class tablethread extends Thread{
	public void run() {
		int i=1;
		int num=5;
		System.out.println("table thread started");
		while(i<=10) {
			num=num*i;
			System.out.println(num);
			i++;
			num=5;
		}
		System.out.println("table thread ended");
		
	}
}
public class ThreadAssignment {

	public static void main(String[] args) {
		tablethread th=new tablethread();
		th.start();
		System.out.println("Main thread for 20 even numbers started"); 
		System.out.println("first 20 even numbers are as follows :");
		for(int i=2;i<=40;i++) {
			if(i%2==0) {
				System.out.println(i);
				i++;
			}
			
		}
		System.out.println("Main thread for 20 even numbers ended");
			
	}

}

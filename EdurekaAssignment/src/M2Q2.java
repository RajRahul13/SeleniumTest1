	
public class M2Q2 {

	public static void main(String[] args) {
		 String []  id = {"00","002","003","004","005"};
		 String [] name = {"John","Clark","Nancy","Joe","Mary"};
		 int []  salary = {600000,550000,500000,500000,300000};
		// TODO Auto-generated method stub
		display(id,name,salary);
		System.out.println("************************************************************************************");
		display(id,name);
	}
	public static void display(String [] id,String [] name,int [] salary) {
		System.out.println("ID\tName\tSalary");
		for(int i=0;i<5;i++) {
			System.out.println(id[i]+"\t"+name[i]+"\t"+salary[i]);
		}
	}
	public static void display(String [] id,String [] name) {
		System.out.println("ID\tName");
		for(int i=0;i<5;i++) {
			System.out.println(id[i]+"\t"+name[i]);
		}
	}
}

	
public class M2Q3 {

	public static void main(String[] args) {
		 int regno[] = {00,002,003,004,005};
		 String [] Empname = {"John","Clark","Nancy","Joe","Mary"};
		 double []  salary = {600000,550000,500000,500000,300000};
		 String name;
		// TODO Auto-generated method stub
		
		 display("John", regno, Empname, salary);
		 System.out.println("************************************************************************************");
		display(regno, Empname, salary);
		System.out.println("************************************************************************************");
		display(regno, Empname);
		
	}
	public static void display(int regno[] ,String [] Empname,double []  salary) {
		System.out.println("ID\tName\tSalary");
		for(int i=0;i<5;i++) {
			System.out.println(regno[i]+"\t"+Empname[i]+"\t"+salary[i]);
		}
	}
	public static void display(int regno[],String [] Empname) {
		System.out.println("ID\tName");
		for(int i=0;i<5;i++) {
			System.out.println(regno[i]+"\t"+Empname[i]);
		}
	}
	
	public static void display (String name, int regno[], String Empname[], double salary[]){
		for(int i=0;i<5;i++) {
			if(Empname[i].equals(name)) {
				System.out.println("ID\tName\tSalary");
				System.out.println(regno[i]+"\t"+Empname[i]+"\t"+salary[i]);
			}
		}
	}
}

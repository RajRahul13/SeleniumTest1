import java.util.Scanner;

class EmployeeWorking{
	double salary;
	void EmployeeWorking() {
	}
	double earn(){
		return 0;	
	}
}
class Tester extends EmployeeWorking {
	void work(){
		System.out.println("Testser work should be quality of end product!");
	}
	double earn(){
		System.out.println("Salary of tester :"+ salary);
		return salary;
		
	}
}
class Developer extends EmployeeWorking {
	void work() {
		System.out.println("Developer work should be clean code.");
	}
	double earn(double f) {
		System.out.println("Salary of developer :" +salary);
		return salary;
		}
}

public class CaseStudy2M3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select either Tester and Developer");
		Scanner ip = new Scanner (System.in);
		String choice=ip.next();
		
		if(choice.equals("Tester")) {
			Tester t=new Tester();
			t.salary=80000;
			t.work();
			t.earn();
		}
		
		if(choice.equals("Developer")) {
			Developer d=new Developer();
			d.salary=90000;
			d.work();
			d.earn(d.salary);
		}
		
	}

}

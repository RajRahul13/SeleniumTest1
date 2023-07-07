import java.util.Scanner;

interface HrTeam {
	void hireEmployee();
}

class HR implements HrTeam{

	@Override
	public void hireEmployee() {
		// TODO Auto-generated method stub
		System.out.println("This department name is :HR");
	}
	
}

class TECH implements HrTeam{

	@Override
	public void hireEmployee() {
		// TODO Auto-generated method stub
		System.out.println("This department name is :TECH");
	}
	
}

class PRODUCT implements HrTeam{

	@Override
	public void hireEmployee() {
		// TODO Auto-generated method stub
		System.out.println("This department name is :PRODUCT");
	}
	
}
class InvalidmarksException  extends Exception  
{  
	public InvalidmarksException (String str)  
	{   
		super(str);  
	}  
}  
class TestCustomException1  
{   
	static void validate (double marks) throws InvalidmarksException{    
		if(marks < 71){    
			throw new InvalidmarksException("marks is not valid to apply");    
		}  
		else {   
			System.out.println("welcome to our company");   
		}   
	}
}	

public class caseStudy2M4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HR hr=new HR();
		hr.hireEmployee();
		TECH t = new TECH();
		t.hireEmployee();
		PRODUCT p =new PRODUCT();
		p.hireEmployee();
		
		System.out.println("Please enter your marks");
		Scanner ip = new Scanner(System.in);
		double marks = ip.nextDouble();
		TestCustomException1 tc = new TestCustomException1();
		try  
        {   
            tc.validate(marks);  
        }  
        catch (InvalidmarksException ex)  
        {  
            System.out.println("Caught the exception");    
            System.out.println("Exception occured: " + ex);  
        } 
		
		
	}
	
}


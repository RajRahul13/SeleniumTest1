import java.util.*;
public class Casestudy2M5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> al = new ArrayList<String>();
		al.add("Country1");
		al.add("Country2");
		al.add("Country3");
		al.add("Country4");
		al.add("Country5");
		al.add("Country6");
		al.add("Country7");
		al.add("Country8");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		//sorted output 
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(;;) {
			System.out.println("w");
		}
		
	}

}

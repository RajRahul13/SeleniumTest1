import java.util.*;
import java.util.Map.Entry;

public class Casestudy1M5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> hm = new HashMap<Integer,String>();
		hm.put(5, "Student5");
		hm.put(2, "Student2");
		hm.put(4, "Student4");
		hm.put(3, "Student4");
		hm.put(1, "Student1");
		//1st testcase
		System.out.println("id"+"\t"+"Students");
		Iterator<Map.Entry<Integer, String>> itr = hm.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		//2nd testcase
		//deleting 2 records
		hm.remove(1);
		hm.remove(2);
		System.out.println("After removing 2 records of key 1 & 2");
		System.out.println("id"+"\t"+"Students");
		Iterator<Map.Entry<Integer, String>> itr1 = hm.entrySet().iterator();
		while(itr1.hasNext()) {
			Entry<Integer, String> entry = itr1.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		//3rd tsetcase
		hm.replace(3, "ModifiedStudent3");
		hm.replace(5, "ModifiedStudent5");
		System.out.println("After modifying 2 records of key 3 & 5");
		System.out.println("id"+"\t"+"Students");
		
		Iterator<Map.Entry<Integer, String>> itr2 = hm.entrySet().iterator();
		while(itr2.hasNext()) {
			Entry<Integer, String> entry = itr2.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		//4th testcase
		String cmpval1 = hm.get(3);
		String cmpval2 = hm.get(4);
		System.out.println("comapring student record at id 3 and 4");
		if(cmpval1.equals(cmpval2)) {
			System.out.println(cmpval1+" equals "+cmpval2);
		}else
		{
			System.out.println(cmpval1+" not equals "+cmpval2);
		}
		
		//5th testcase
		System.out.println("sorted values in increasing order");
		Iterator<Map.Entry<Integer, String>> itr3 = hm.entrySet().iterator();
		while(itr3.hasNext()) {
			Entry<Integer, String> entry = itr3.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
	}

}

package co.edureka.collectionassignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> hm = new HashMap <Integer,String>();
		hm.put(1, "raj");
		hm.put(null, "rahul");
		hm.put(3, "rakesh");
		hm.put(4, "niraj");
		hm.put(5, null);
		
		for(int i=1;i<=hm.size();i++)
		{
			System.out.println(hm.get(i));
		}
		
		System.out.println("Iterating Hashmap...");  
		for(Map.Entry m : hm.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		} 
	}

}

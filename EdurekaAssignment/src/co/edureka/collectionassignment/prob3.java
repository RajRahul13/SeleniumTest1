package co.edureka.collectionassignment;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable <String,Integer> ht = new Hashtable<String,Integer>();
		ht.put("stud1", 50);
		ht.put("stud2", 60);
		ht.put("stud3", 70);
		ht.put("stud4", 80);
		ht.put("stud5", 90);
		
		Iterator<Map.Entry<String, Integer>>itr = ht.entrySet().iterator();
		System.out.println("student"+"\t"+"marks");
		while(itr.hasNext()){
		    Entry<String, Integer> value = itr.next();
		    System.out.println(value.getKey()+"\t"+value.getValue());
		}
		//to get student with highest marks
		int max = Collections.max(ht.values());
		for(Entry<String, Integer> entry : ht.entrySet()) {
			if(entry.getValue()==max) {
				System.out.println("Student with highest marks is :"+entry.getKey());
			}
		}
		
		
		
	}

}

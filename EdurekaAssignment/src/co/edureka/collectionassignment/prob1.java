package co.edureka.collectionassignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			al.add(i);
		}
		System.out.println(al);
		System.out.println(al.size());
		
		//using iterator
		System.out.println("uisng iterator");
		//getting the Iterator 
		ListIterator itr=al.listIterator();
		//check if iterator has the elements  
		while(itr.hasNext()) {
			//printing the element and move to next  
			System.out.println(itr.next());
		}
		
		System.out.println("getting values using For loop");
		for(int i=0;i<10;i++) {
			System.out.println(al.get(i));
		}	
		
	}

}

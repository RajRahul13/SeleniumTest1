package test;

public class DuplicateVaueCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For string array
		
		String strarr[] = {"raj","rahul","raju","raj","raj","rahul"};
		int Count=1;
		for(int i=0;i<strarr.length;i++) {
			
			for(int j=i+1;j<strarr.length;j++) {
				
				if(strarr[i]==strarr[j]) 
					System.out.println(strarr[j]);
					Count++;
					//System.out.println("Dup count "+j);
				
			}
		}
		if(Count==1) {
			System.out.println("Duplicate not found!!");
		}
		
		/* //Initialize array   
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
          
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }*/ 

	}

}

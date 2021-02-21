package sumonBhai;

import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {

		// array list 
		// non genaric. open for every one
		
		ArrayList ashik=new ArrayList (); // Daynamic
		
		ashik.add("Islam");
		ashik.add(225);
		ashik.add(10.25f);
		ashik.add(true);
		ashik.add(null);
		
		System.out.println(ashik);
		
		System.out.println("The size of arrayList is : "+ashik.size());  // size 5
		
		
	for(int a=0; a<ashik.size(); a++) {
			System.out.println(ashik.get(a));
		}
		
		// Generic array
		
		ArrayList<Integer>islam=new ArrayList<Integer>() ;
		islam.add(1234);
		islam.add(24568);
		islam.add(5050);
		
		System.out.println(islam);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

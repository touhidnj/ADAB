package array;

public class Concept_01 {

	public static void main(String[] args) {
		
		int[]ashik=new int[3];
		ashik[0]=10;
		ashik[1]=12;
		ashik[2]=20;
		
	// to check length
		System.out.println(ashik.length);
		System.out.println("00000000000");
		
		for (int a=0; a<ashik.length;a++) {
			System.out.println(ashik[a]);
		}
		System.out.println("...............................");
	// different betewen length and size. size is for dinamic array and length is for static array  
		
		// need to fix 
		for (int z=ashik.length-1; z>=0;  z--) {
		System.out.println(ashik[z]);}
		
				// [] [] first one Row, 2nd one indicate column
		
		
		
		
	}

}

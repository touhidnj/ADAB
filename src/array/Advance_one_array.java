package array;

public class Advance_one_array {

	public static void main(String[] args) {

		
		int[]a= {10,15,89,77,47,56,32,258, 478   };
		
		System.out.println(a.length); // print length
		System.out.println(a[8]);       // print index 8 value
		System.out.println(a[1]-a[0]);  // print index 1 - index 0
		System.out.println(a[0]*a[8]-a[7] );  //print index 0*8 - index 7
		System.out.println(a[8]/a[0]);             // print division
		System.out.println("----------------");
		
		for (int i:a) {
						System.out.println(i);                // print all a values   
						}
		
				
	}

}

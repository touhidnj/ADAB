package array;
public class String_array {
	public static void main(String[] args) {
		// Fixt array called Static array
		
		String ar[]=new String [5];         // static array 
		ar[0]="Ashik Bhai";
		ar[1]="Dedar Bhai";
		ar[2]="Sohag Bhai";
		ar[3]="Khaled Bhai";
		ar[4]="Babul Bhai";
		
		for (int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		} 
		System.out.println("--------------");
		
		                                            // not wise to use this way  because data number can be change in real time 
	//	for (int j=4; j>=0; j--) {
		//	System.out.println(ar[j]);
		
		
		for (int k=ar.length-1; k>=0; k--) {
			System.out.println(ar[k]);
		
		}
		
						
	}

}

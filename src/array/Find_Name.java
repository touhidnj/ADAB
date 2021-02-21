 package array;

public class Find_Name {

	public static void main(String[] args) {
		
		// Now find some name 
		
		String[] [] Name= {
		{ " Mohammed" , "Munshi" , "Begum", "Master", "Chudhory", "Rahman"	},    
		{ " Zia", " Sumon", " Akram", " Dedar", " Babul", " Alam"       	}
					} ;
		
		
		System.out.println("The Name is No 1 : "+Name[0][2]+Name[1][0]);
		System.out.println("The Name is No 2 : "+Name[0][1]+Name[1][2]);
		System.out.println("The Name is No 3  : "+Name[0][3]+Name[1][1]);
		System.out.println("The Name is No 4  : "+Name[0][0]+Name[1][3]);
		System.out.println("The Name is No 5 : "+Name[0][4]+Name[1][5]);
		System.out.println("The Name is No 6 : "+Name[0][5]+Name[1][4]);

	}

}

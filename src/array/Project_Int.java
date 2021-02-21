package array;

public class Project_Int {

	public static void main(String[] args) {

		
		int[]ashik= {2,4,6,8,10 }; // this is called "Array literalt" 
		System.out.println(ashik[2]+ashik[4]);
		System.out.println("Multipication is:"+ashik[1]*ashik[4]);
		
		float[] afia= {10.25f,400f,225f,350f,50f} ;
		float total= afia[0]+afia[1];
		System.out.println("This is afia's nuber:" +total);
		
		for(int x=0;x<afia.length;x++) { 
			System.out.println(afia[x]); 
		}
		
		
		char[]A= {'A','B','C','F','A','H','I','x' } ;
		System.out.println("The name is: "+A[0]+A[3]+A[6]+A[0]);
		
		String[] d= {"My ","DEDAR ","House","Name ","BD" , "is "};
		System.out.println(d[ 0]+d[ 3 ] + d[5]+d[ 1] ); // How to make space ???
		
		String[] java= {"We ","5 ","are " ,"From ","Sumon ","at " ,"Learning ","PNT","Programing ","java ", "core ", "More " , "Bhai "};
		System.out.println(java[0]+java[1]+java[2]+java[6]+java[10]+java[9]+java[8]+java[3]+java[4]+java[12] +java[5]+java[7]);
		
	}

}

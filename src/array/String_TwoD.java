package array;

import java.util.ArrayList;

public class String_TwoD {

	public static void main(String[] args) {

		// object 2D arryay for multy type data, like create user name pass word 
		
			String multiData[][]=new  String [3][2];    // [3] Row and [2] Column 
					
		multiData[0][0]="ashik@pnt" ;   // user name
		multiData[0][1]= "12345";          // pasword
		multiData[1][0]= "afia@pnt";
		multiData[1][1]="6789";
		multiData[2][0]="dedar@pnt";
		multiData[2][1]="101113";
	
		System.out.println(multiData[0][0]+	multiData[0][1]);
		System.out.println(multiData[1][0]+multiData[1][1]);
		System.out.println(multiData[2][0]+multiData[2][1]);
		System.out.println("..................................");
		
		System.out.println(multiData.length);
		
for(int i=0; i<multiData.length;i++) {
	for(int j=0; j<multiData.length-1; j++) {  // As our row size and collumn is not same we to reduce column 1 iteration
		System.out.println(multiData[i][j]);
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
	}

}

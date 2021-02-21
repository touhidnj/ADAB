package array;

public class Project_01 {

	public static void main(String[] args) {
/* declare arrays of other types:
byte[] anArrayOfBytes;
short[] anArrayOfShorts;
long[] anArrayOfLongs;
float[] anArrayOfFloats;
double[] anArrayOfDoubles;
boolean[] anArrayOfBooleans;
char[] anArrayOfChars;
String[] anArrayOfStrings;
  */
		int[]num1=new int[5]; // Static array
		num1[0]=15;
		num1[1]=20;
		num1[2]=10;
		num1[3]=10;
		num1[4]=151;
		
		//to print all array values we use for loop
		for(int k=0;k<num1.length;k++){
			System.out.println(num1[k]); }
		
		int total= num1.length;
		System.out.println(total);
		int sum = num1[4]-num1[0]-num1[1]-num1[2]-num1[3];
		
		System.out.println("Total value :"+sum);
				
		//String []person=new String[3];
		// [] [] first one Row 2nd one indicate column
		String [][]name={
			{"MR ", "Mrs ","Ms " },{"Dedar", "Afia" }
		};
		System.out.println("The name is :" +name[0][0]+name[1][0]);
		System.out.println("Her name is: "+name[0][1]+name[1][1]);
	}

}
 
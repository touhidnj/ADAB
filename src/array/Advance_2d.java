 package array;

public class Advance_2d {

	public static void main(String[] args) {

		int [][]a= {  {2,4,6,8},  {10,20,30,40}, {100,200,300,400}, {5,10,15,20}, {1,2,3,4}         };  // 5 rows and 4 column
		
		System.out.println("Number of Rows is :" +a.length);  // print row
		System.out.println("Number of Columns is :" + a[0].length);  // print columns
		
		System.out.println(a[0][0]);   //print 2
		System.out.println(a[1][3]);   //print 40
		System.out.println(a[2][3]);      //print 400
		System.out.println(a[3][2]);      //print 15
		System.out.println(a[4][1]);     //print 2
		
			
		// print all array values step by step
		
		for (int b[]:a) {                                            // here b is single array which representing variable a.
			for (int i:b) {                                            //Now i is representing b.
				System.out.print(i);                           // print step by step all values. 
						}
					}
						
	}

}

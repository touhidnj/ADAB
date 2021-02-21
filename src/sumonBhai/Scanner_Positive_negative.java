package sumonBhai;

import java.util.Scanner;

public class Scanner_Positive_negative {

	public static void main(String[] args) {
				
    // Creating Positive Negative by Scanner
		System.out.print("This number is = "); // this is first line to ask number 
		
		Scanner pnt = new Scanner(System.in);
		
		// we can do with float too
		double disit = pnt.nextDouble();
		
		if (disit>0.0) {
			System.out.println("Positive");
		}
		else if (disit<0.0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Number is Zero");
		}
		
			pnt.close();
	}

}

package sumonBhai;

import java.util.Scanner;

public class Scanner_NP_float {

	public static void main(String[] args) {
		
		
		System.out.println("My number is :");

		Scanner ashik = new Scanner(System.in);
		
		float a = ashik.nextFloat();
		
		if (a>0.0f) {
			System.out.println("Positive");
		}else if (a<0.0f) {
			System.out.println("Negative");
		}
		else {
			System.out.println("No value");
		}
		
		ashik.close();
	}

}

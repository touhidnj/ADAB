package sumonBhai;

import java.util.Scanner;

public class Scanner_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner ashik= new Scanner(System.in);
		
		String a;
		
		System.out.print("What is your goal? : ");
		
		// .next() if use this way after congratulation it will not show all but .nextLine() show all
		a = ashik.nextLine();
		
		System.out.println("Congratulation ashik:\n"+ a);

	}

}

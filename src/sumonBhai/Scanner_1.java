package sumonBhai;

import java.util.Scanner;

public class Scanner_1 {

	public static void main(String[] args) {
		// using of Scanner, we don't need to declare int value . on console we can do any thing by providing number.
		// Thats why use of Scanner we can say "USER GIven Number Program"
// Using input string that is system.in
		
		
		Scanner Ashik = new Scanner(System.in);
		
		System.out.println("This is number for a ");
				int a = Ashik.nextInt();

		System.out.println("This is number for b");
				int b= Ashik.nextInt();
		
		System.out.println("this is number fro c");
		 		int c = Ashik.nextInt();
		
		int d= a*b/c;
		
		System.out.println("Multiplication of a , b divition c = "+ d); // To print variable value need + and variable name
		
		Ashik.close();
		
	}

}

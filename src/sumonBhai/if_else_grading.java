package sumonBhai;

import java.util.Scanner;

public class if_else_grading {

	public static void main(String[] args) {
		 // By using Scanner find grade of a student
		System.out.println("Enter Student Number");
		Scanner eht = new Scanner(System.in);
				int Class_Mark = eht.nextInt();
		
		if (Class_Mark <100 & Class_Mark >= 89) {
		
		System.out.println("Student got grade A");
		
		}else if (Class_Mark <=88 & Class_Mark>= 79 ) {
			
			System.out.println("Student got B+");
		}else if (Class_Mark <=78 & Class_Mark>= 69) {
			System.out.println("Student got B");
		}else if (Class_Mark <=68 & Class_Mark>= 59) {
			System.out.println("Student got c");
		}else {
			System.out.println("Student got F");
		}
	}	
}

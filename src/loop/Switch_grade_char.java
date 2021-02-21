package loop;
import java.util.Scanner;
public class Switch_grade_char {
	
	public static void main(String[] args) {
		// create School grade by Scanner
						         Scanner School= new Scanner(System.in);
		                         System.out.print("Student Name: ");
		                         String a;
		                         a= School.nextLine();
		String g;
		System.out.print("Your Grade is: " );
		g=School.nextLine();
		
   		          char mark='B';
   		            
					//char mark;     // NOT ABLE TO USE SCANNER NEED TO FIND??????????
					//mark=School.n
					
		switch (mark){
		case 'A':
			System.out.println("You got EXELENT MARK.Congratulation " +a);
			break;
		case 'B': 
			System.out.println("You got GOOD MARK.Congratulation "+a);
			break;
		case 'C':
			System.out.println("You done WELL.Best of luck "+a);
			break;
		case 'D':
			System.out.println("You Just PASS " +a);
			break;
		case 'F':
			System.out.println("Better Try Again. You Faild "+a);
			break;         }
		
						
	}

}

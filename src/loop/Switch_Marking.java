package loop;
import java.util.Scanner;
public class Switch_Marking {
	public static void main(String[] args) {
		/* Switch is a control or conditional statement like if-else. Switch statement execute one statement from 
		multipule condition or statement. Switch has 4 keyword(Switch,case,break,default) switch and case must need. */
		
		// Create a marking tabulation program with Scanner.
		Scanner DhakaCollege =new Scanner(System.in);
				System.out.println("This Student Got : ");
		int marks;
				marks=DhakaCollege.nextInt();
		
		switch (marks) {
		case 750:
			System.out.println("Star Marks.Congratulation!");
			break;
		case 600:
			System.out.println("First Divition Marks.Best of Luck!");
			break;
		case 599:
			System.out.println("Second Divition  Marks.Good Luck!");
			break;
		case 449:
			System.out.println(" Third Divition Marks.Bad Luck!");
			break;
		case 359:
			System.out.println("Fail Marks.Try Again!");  // not completed the program. because need to know 359-449 how to write? cte...
			break;     }
		
			}

}

package loop;
public class Loop_While_01 {
	public static void main(String[] args) {
				/* while loop is same like for loop. But here (int a=1) initialization will be declare first. Then (a<=10) Condition will be
		  inside while(a<10). Then carlibrase start { What i want to print that part. then (a++ OR a=a+1); increment/decrement part
		  } parenthesis close.     */
		
		
		int a=1;
		while (a<=10) {
			
			System.out.println(a+ ". I love my Country");
			a=a+2;    } // same as a+=2
		
		int b=20;
		
		while (b>=0) {
			System.out.println(b);
			b-=2;
		}
		
				
	}

}

package JavaBasics;

public class format_Multi {

	public static void main(String[] args) {
		// Multiplication a and b format specifier 
		int a=9; 
		int b=1;
		
		double c=10.00;
		double d = 1.21;
		
		while (b<=10) {System.out.printf("%d * %d =%d\n", a,b, a*b);
			b++;}
		
		System.out.println("--------------------");
		// Multiplication c and d format specifier. after decimal I want 2 digit for that after %.2 
		
		while (d<=10.21) {
			System.out.printf("%.2f * %.2f = %.2f\n",c,d,c*d);
			d++;
		}

	}

}

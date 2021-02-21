package loop;

public class Loop_For_01 {

	public static void main(String[] args) {
		/* We use loop to execute a statement or group of statements multiple times.
		(int a=1) initialization. means counting start point or from which number i want to start/ (a<=10) Condition
		 means how many times i want to 
		see/ (a++ OR a=a+1) increment/decrement means each time how many steps I want to increase or decrease. */
		
		// inside println (a+) means 123.. number/ string "My name is ashik" 10 times. 
		
		for (int a=1; a<=3; a=a+1) {
		System.out.println(a+".My name is ashik"); }
		
		System.out.println("..................");
		
		// To print solid number 
		for (int b=2; b<=12; b=b+2) {
			System.out.println(b);  }
		
		System.out.println("..................");
		
		// To decrease number
		
		for (int b=12; b>=2; b=b-2) {
			System.out.println(b);  }
		
	}
	
	

}

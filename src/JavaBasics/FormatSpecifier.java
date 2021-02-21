package JavaBasics;

public class FormatSpecifier {
	public static void main(String[] args) {
	
		char C ='a';
		int i = 100100;
		short s = 12345;
		long l = 1234567890;
		double d = 12.89;
		byte y= 32;
		float f = 99.0914f;
		boolean b = true;
		
		System.out.printf("Character C = %C\n",C);
				// Integer,short,long and Byte : %d
		
		System.out.printf("Integer i = %d\n",i);
		System.out.printf("Short s = %d\n",s);
		System.out.printf("Long l = %d\n",l);
		System.out.printf("Byte y = %d\n",y);
		
				//double and float %f (In double  after decimal want to see 2 digit thats why .2 after % )
		
		System.out.printf("Double d = %.2f\n",d);
		System.out.printf("Float f = %.3f\n",f);
		
		 		// Boolean %b
		System.out.printf("Boolean b = %b",b);
		
		

	}

}

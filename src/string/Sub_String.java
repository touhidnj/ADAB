package string;

public class Sub_String {

	public static void main(String[] args) {

		String ashik="This is ashik , his PNT number is 7405NJ and babul Bhai number 7406NJ he need to learn java" ;
		
		// sub String by beganig & ending
				String number= ashik.substring(34, 40);
				System.out.println(number);
		
		// by index
				int ind=ashik.indexOf("7");
				System.out.println("index no 7 is :"+ind);
				
		// by reverse 
			     char a=ashik.charAt(34);
			     System.out.println("Character of 34 is :"+a);
			     
			     // find babul number ? Here I copied babul number and put into indexof to find beganig index number.
			     
			     int babul=ashik.indexOf("7406NJ");
			     System.out.println(babul);
	
			    String number1= ashik.substring(63, 68);
				System.out.println(number1);
		
		
		
	}

}

 package loop;

public class Loop_For_02 {

	public static void main(String[] args) {

		Loop_For_02 object = new Loop_For_02();
				object.forme();
				
		System.out.println(".........");
		
		        forashik () ;
	}
	
	//Non Static Method
	 void forme() {
		 for (int a=1; a<=5;a++) {
		System.out.println(a+" ASHIK LearnING JAVA"); }
	 }
		// Static method
	 	 static void forashik()  {
		 for (int i=5; i>=1; i--) {
			 System.out.println(i+".Java for ashik"); }
	 }
		
}

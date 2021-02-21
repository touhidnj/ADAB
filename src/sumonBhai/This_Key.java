package sumonBhai;

public class This_Key {
// create a global variable
	public static int ashik=23456;
	 String a= "This is ashik";

	
	void getashik() {
		int ashik=987;                                 // this is local variable
		String a="Is this ashik ?";
		
		System.out.println(ashik);
		System.out.println(this.ashik);
		System.out.println(a);
		System.out.println(this.a);
			}
	
		public static void main(String[] args) {
			
// This Key create  global variable to local variable 
		
		This_Key obj=new This_Key(); // conostructor
		obj.getashik();
		 
		
		
	}

}

package sumonBhai;

public class Veriable_Diclear {

	// use of excess modifier declare 3 global veritable
	
	public  static int a=30;
	private static int b= 34;
	protected static int c=20;
	 static int d=(a+b+c);
	
	static void ashik() {
		System.out.println ("Print value of d:" + d);
					}
		public static void main(String[] args) {
				//we can do 3 way Number 1
		 		 Veriable_Diclear object = new Veriable_Diclear();
		object.ashik(); 
		
		//we can do 3 way Number 2
		
		ashik();
		
		//we can do 3 way Number 3
		  
		Veriable_Diclear.ashik();
		
		
		
	}

}

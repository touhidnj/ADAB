package sumonBhai;

public class Veriable_Diclear_2 {

	public static void main(String[] args) {
		
		Veriable_Diclear object = new Veriable_Diclear();
		
		object.ashik();
		
		
		// bring object a,b,c,d from Veriable_Diclear java class 
		
		int v =object.a+object.c; // Object b is not possible becouse of privet veriable. but we can add object d 
				
		System.out.println("Value of v is : "+v);

		int x= object.a+object.c+object.d;
		System.out.println("Value of x is : "+x);
	
	}

}

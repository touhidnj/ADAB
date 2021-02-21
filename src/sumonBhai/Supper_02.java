package sumonBhai;

public class Supper_02 extends Supper_01 {
	
	// adding with extends 
	
	String a="-Islam";
	
	void name() {
		super.name();                                 // pulling method from super_01
		
		System.out.println(super.a+a);
	} // supper_01 a variable  is comming by (super. ) 
	
	public Supper_02() {
		
		super () ; // super key word will be first line of the conostructor
		System.out.println("This is child");
	}
	

	public static void main(String[] args) {
		
		Supper_02 obj=new Supper_02();
		obj.name();
		

	}

}

package oops;

public class Class_02 extends Class_01 {

	void me() {
		System.out.println("My goal");                                                // here i create another method that is local 
	}
	
	public static void main(String[] args) {
	
		Class_02 obj=new Class_02();
		obj.country();
		obj.bnp();
		obj.love();
		obj.me();
		
		
	}

	

}

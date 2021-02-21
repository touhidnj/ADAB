 package oops;
public class Test_01 {

	String name, gender,  dob, post;     //1.  Declare Data type without value
	long  phone;
	

	
	void form1() {                                    //2. Declare with method 
		
		System.out.println("Name = "+name);
		System.out.println("Gender = "+gender);
		System.out.println("Post= "+post);
		System.out.println("dob= "+dob);
		System.out.println("Phone= "+phone);
				
		}                                                           //3. Parameter create
	
	void parameter_form(String n, String g,  String d, String p, long ph ) {
		      name=n;
		     gender=g;
		     dob=d;
		     post=p;
		     phone=ph;
	}
		
	
	
	
}

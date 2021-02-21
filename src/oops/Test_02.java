package oops;

public class Test_02 extends Test_01{
	public static void main(String[] args) {
		
				Test_01 form=new Test_01 ();
		 
						form.parameter_form("Rahman", "Male", "10/12/2002", "QA", 606456654);                      // this is parameter. Before run close line 10-20 to understand.
		
		/*form.name="Ashik Islam";
		form.gender= "Male";
		form.post="QA";
		form.dob="10/15/2020";
		form.phone=8326626044L;
		                                                                                     // run by data value
		System.out.println("Name = "+form.name);
		System.out.println("Gender = "+form.gender);
		System.out.println("Post= "+form.post);
		System.out.println("dob= "+form.dob);
		System.out.println("Phone= "+form.phone); 
		
		System.out.println("----------------------------");*/
		
		form.form1();                      // run by method
		
		System.out.println("----------------------");
		
		Test_01 form_2nd=new Test_01 ();
		
		form_2nd.name="Md Dedar";
		form_2nd.gender="Male";
		form_2nd.post="QA";
		form_2nd.dob="11/12/2013";
		form_2nd.phone=6096465500L;
		
		form_2nd.form1();                               // run by method
				
		System.out.println("------------------------");
		
		/*Test_01 para=new Test_01 ();                                                                                                        // not working
		form.parameter_form("Rahman", "Male", "10/12/2002", "QA", 606456654);  
		para.form1();*/
			
	
	}

}

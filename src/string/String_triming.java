package string;

public class String_triming {

	public static void main(String[] args) {
// how to trim: before & after space remove from the line
		
		String pnt="              Now I am at pnt. learnig       java from Sumon vai .                          " ;
		String formatebyAshik = pnt.trim();
		// To see the correction before and after space from line 
				System.out.println(formatebyAshik);
		
				// To split concept
				
				String pnt1 = "ashik@pnt,7405"; // this is just user name passWord
		// To split	 delimiter (need to know delimiter)	
		String ashik[]=pnt1.split(",");
		
		// for user name	
		String usernameashik=ashik[0].trim();
		System.out.println(usernameashik);
		
		//for password
		 	
		String passwordashik=ashik[1].trim();
		System.out.println(passwordashik);
		
				// for String lngth
		
		System.out.println(pnt.length());
		
		// To remove inside space
		
		formatebyAshik.replaceAll("\\s","");
		System.out.println(formatebyAshik.replaceAll("\\s",""));
		
		
		
	}

}

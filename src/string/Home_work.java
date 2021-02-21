package string;
public class Home_work {
public static void main(String[] args) {

	
	String auto="           This is friendly auto sale. Our web page is www.friendlyauto.net but now we can’t log in our web page. Our web page user name is            friendly@auto in capital letter passwordFRI609646. Our phone number60964655  00     .";

	/*# find webpage, user name, password separately.# make all looks good.# convert all upper case.# convert phone number String
# Find the length# Concatenation user name and password.   */

	String fomateauto1=auto.trim();
	
	System.out.println(fomateauto1);
	
	fomateauto1.replaceAll("\\s","");
	
	System.out.println(fomateauto1.replaceAll("\\s",""));
	
	String auto2="www.friendlyauto.net,username:friendly@auto,password:FRI609646";
	
	String delimiterauto[]	=auto2.split(",")	;
	String web=delimiterauto[0].trim();
	System.out.println(web);
	String username=delimiterauto[1].trim();
	System.out.println(username);
	String password=delimiterauto[2].trim();
	System.out.println(password);
	
	System.out.println(auto.length());
	
	String phone="6096465500";
	//int z=Integer.parseInt(phone); // not posibile for long number.
	//System.out.println(z);
	String upper=auto.toUpperCase();
	System.out.println(upper);
	
	
	}

}

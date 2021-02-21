package string;
public class String_concatenation {
public static void main(String[] args) {
		
	    String s1="Ashik Islam";
		String s2 = "BNP"; 
		
		String s3= s1+s2;
		// Normall
				System.out.println(s3);
		// Using concat Method
				System.out.println(s1.concat(s2));
		// to add any string part
		        System.out.println("Here every body suport:  " + s2);
		// String reverse need to apply stringbuffer and reverse method
		        String reverspnt=new StringBuffer(s1).reverse().toString();
		        System.out.println(reverspnt);
		        
		 // Convert String valu to int value 
		        
		        String a="150";
		        String b="125";
		        String c=a+b; // for understanding c is adding string a,b
		        System.out.println(c); // this is String addning thats why result 150125
		        
		        // This is the way to convert string to int
		int x= Integer.parseInt(a);
		int y= Integer.parseInt(b);
		
		int z=x+y;
		System.out.println(z);
		
		// Convert int to string value:
		int ash=500;
		int ik=499;
		
		String i=String.valueOf(ash);
		String k=String.valueOf(ik);
		
		System.out.println(i+k);
		System.out.println(".......................");
		
		int ashikBhai=234567; // do it
		// upper lower case 
		String o="I love my country bangladesh";		
			String v=o.toUpperCase();
		System.out.println(v);
		
		String p="I LOVE MY COUNTRY BANGLADESH";
				
		String u=p.toLowerCase();
		System.out.println(u);
		
		
		
		
		 
		
		
		
		
		        
		        
		        
		        
		        
		        
		        
		        
		        
	}

}

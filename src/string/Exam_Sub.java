package string;

public class Exam_Sub {

	public static void main(String[] args) {
     String str= "user1 is ashik and his password is 3456 and user2 is babul and password 3678" ;
     
     int name=str.indexOf("user1");
     System.out.println(name);

     
     String user1= str.substring(0, 5);
		System.out.println(user1);
     
		
		int name2=str.indexOf("user2");
	     System.out.println(name2);

	     
	     String user2= str.substring(44, 49);
			System.out.println(user2);
		
		
		System.out.println(user1.concat(user2));
		
     
	}

}

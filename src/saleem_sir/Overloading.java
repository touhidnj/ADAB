package saleem_sir;

public class Overloading {

	public static void main(String[] args) {

		Overloading ashik=new Overloading();
		ashik.loading(10, 25, 87);
		ashik.loading("Ashik", "Islam");
		ashik.loading("Islam", 100);
	}

	// Method overloading
	
	public void loading(int a,int b, int c) {
		int s=(a+b+c);
		System.out.println("Value of S is ="+s);
	}
	public void loading(String a, String b) {
		System.out.println(a+" "+b);
		
	}
	public void loading(String a, int b) {
		System.out.println(a+" "+b);
		
	}
	
	
	
}

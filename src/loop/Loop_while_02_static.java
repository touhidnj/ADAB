package loop;

public class Loop_while_02_static {

	public static void main(String[] args) {
		
		Loop_while_02_static object =new Loop_while_02_static();
		
		object.country();
		System.out.println("@@@@@@@@@@@@@@@@");
		love();

	}
// Non Static
	void country () {
		int c=1;
		while (c<=5) {
			System.out.println(c+".Bangladesh");
			c++;  }
	                 }
	
	static void love() {
		int l=1;
		while (l<=5) {
			System.out.println(l+". Love Bangladesh");
			l++;   }
	}
	
}

package sumonBhai;

public class SB_01 {

	public static void main(String[] args) {
	//create object of the class with help of constructor
		SB_01 object = new SB_01();
		
		System.out.println("I LOVE BANGLADESH");

		object.SumonBhai();
		WeAre5();
	} 
	
	// Non Static Method, Must need to create class object 
	
	void SumonBhai() {
		
		System.out.println("Sumon Bhai Also From Bangladesh");
	}

	//Static Method, no need to create class object 
	
	static void WeAre5() {
		System.out.println("here we are 5 learning java from sumonbhai");
	}
}

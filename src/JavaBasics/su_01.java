package JavaBasics;

public class su_01 {

	public static void main(String[] args) {
		// create object of the class with help of constructor
		
		su_01 object = new su_01();
		
		System.out.println("We are learning JAVA");
		
		object.ShumonBhai(); 
		
		WeAre();

	}
	
	void ShumonBhai() { 
		
		// Non Static Method, need to create class object 
		
		System.out.println("Shumon Bhai is helping us");
	}
	
	 // Static Method, no need to create class object 
	
	static void WeAre() {
		System.out.println("We are trying to learn java");
	}
	
}

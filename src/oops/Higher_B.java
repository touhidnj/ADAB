package oops;

public class Higher_B extends Higher_A{
	
	void son_1() {
		
		System.out.println("Son number one is NooR");
	}
	

	public static void main(String[] args) {

		Higher_B obj=new Higher_B();
		obj.Father();
		obj.son_1();
		
		
		
	}

}

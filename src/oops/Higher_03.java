package oops;

public class Higher_03 extends Higher_A {

	 void son_02() {
		 System.out.println("Son 2nd is TooR");
	 }
	
	public static void main(String[] args) {
		
		Higher_03 obj = new Higher_03();
		
		obj.Father();
		obj.son_02();

	}

}

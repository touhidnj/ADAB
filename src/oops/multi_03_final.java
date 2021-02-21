package oops;

public class multi_03_final extends multi_02 {
	void test_03() {
		System.out.println("This is test 03 from class 03");
	}
	

	public static void main(String[] args) {
		
		multi_03_final obj = new multi_03_final();
		obj.test_01();
		obj.test_03();
		obj.test_02();
	}

}

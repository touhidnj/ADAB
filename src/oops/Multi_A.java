package oops;

public class Multi_A {
	
/*when more then 2 class that class heritance is multi inheritence. there imediat class always parent. like a b c class. here first a parent b child. when we work c that time b
		is parant*/
		
	void test_01() {
		System.out.println("This is class A test 01");
	}
		void test_02() {
			System.out.println("This is class A test 02");
		}
}
		class multi_B extends Multi_A{
			void test_03() {
				System.out.println("This is Test_03 from class B");
			}
		}
		class multi_C extends multi_B {
			void test_04() {
				System.out.println("This is test 04 from class C");
			}
		
		public static void main(String[] args) {
			
			multi_C obj=new multi_C ();
						obj.test_01();
						obj.test_02();
						obj.test_03();
						obj.test_04();
			
			 		}
	}



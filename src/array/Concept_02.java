package array;
public class Concept_02 {
	public static void main(String[] args) {

				int [] ashik=new int[100];
				
		for (int a=0; a<100; a++) {
			
			ashik[a]=a;                         // here a value 0 , so [a]=a means 0=0. if we add 100 with a like, ashik[a]=a+100;   it will print 100.101......upto 199.
			
			System.out.println(ashik[a]);
		}
		System.out.println("----------------------");
		
		
		for (int i :ashik) {                           //each loop
			System.out.println(i);
		}
		
	}

}

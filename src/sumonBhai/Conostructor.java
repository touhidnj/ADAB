 package sumonBhai;

public class Conostructor {
	// Default conostuctor
	public Conostructor() {
		System.out.println("This is a conostructor");
	}
		// Parameter Conostructor need data type, when we put any argument in conostructor that is called over loded conostructor.
		public Conostructor(int a) {
		System.out.println("This is a conostructor parameter");
	}
		public Conostructor(String  a) {
			System.out.println("This is parameter conostructor  2nd") ; 
			}
		public Conostructor(char a) {
			System.out.println("This is parameter conostructor  3rd") ;
		}
	/*Conostructor is basicly key of the hole codes. constructor is like a method that doesn't have a return type.constructor let you access a class
	 name of Constructor is same as name of a class, you create an object of the class via constractor to access the methods inside the class   */
				void print() {
					System.out.println("This is a conostructor");
					System.out.println("This is a conostructor parameter");
					System.out.println("This is parameter conostructor  2nd") ; 
					System.out.println("This is parameter conostructor  3rd") ;
				}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Conostructor ashik=new Conostructor();
			Conostructor islam=new Conostructor(10); // 10 is any int number
			Conostructor ashik_islam=new Conostructor("Any value like string");
			Conostructor islam_ashik=new Conostructor('a');
			
			System.out.println("1-----------------");
			ashik.print();
			System.out.println("2-----------------");
			islam.print();
			System.out.println("3-----------------");
			ashik_islam.print();
			System.out.println("-4----------------");
			islam_ashik.print();
			System.out.println("--5---------------");
	}

}

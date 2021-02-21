package saleem_sir;

public class Conostructor {

	public static void main(String[] args) {

		Conostructor islam=new Conostructor();
		Conostructor islam1=new Conostructor("over");
		Conostructor islam2=new Conostructor(10);
	}
	
	public Conostructor() {
		System.out.println("This is a conostructor"); 
					}
	public Conostructor(String  over) {
		System.out.println("This is over loaded conostructor  ") ; }  // over loading conostructor

	public Conostructor(int a) {
				
		System.out.println("Value is ="+10+20) ; } 
	
}
// when we use multiple time same conostructor that time no option to change conostructor name we need to put data type in side the paranthisis. 
//that called over lodaing conostructor
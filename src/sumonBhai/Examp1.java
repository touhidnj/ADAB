package sumonBhai;

public class Examp1 {
	
	public static int a=101;
	private static int b=201;
	protected static int c=301;
	static int s=(a+b+c);
	
	
	static void  print() {
		System.out.println("Value s is ;"+s);
	}
	

	public static void main(String[] args) {

		Examp1  ds=new Examp1 ();
		ds.print();
		System.out.println(ds.a);
		
		
		
		
		
	}

}

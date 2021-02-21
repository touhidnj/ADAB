package oops;

public class Friendly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		friendly("January",40000,29000);
		friendly("February",47000,33000);
		friendly("March",50000,25000);

	}
	
	public static void friendly( String Month ,int income, int expence) {
		
		int profit=income-expence;
		System.out.println( "Friendly profit is "+Month+"="+profit);
		
		
	}
	
	
	

}

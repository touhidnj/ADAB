package sumonBhai;

public class This_02 {
	
	int a=25;
	int b=10;
	
	
	
	void getsum() {
		int c=this.a+this.b;
	    System.out.println(c);
		System.out.println(this.a+this.b );
	}
	
		public static void main(String[] args) {

			This_02 obj=new This_02();
			obj.getsum();
			
			
	}

}

package sumonBhai;

public class Return_This {

	String a="ashik";
	String b="islam";
	
	String total() {
		String z=this.a+this.b;
		System.out.println(z);
		return z;
		
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

			Return_This obj =new Return_This();
			obj.total();
			
			
	}

}

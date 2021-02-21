package string;

public class Trim_delimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sumon="ashik,  dedar,afia,babul";
		
		String delimer[]=sumon.split(",");
		
		String firstName=delimer[0].trim();
		String SecondName=delimer[1].trim();
		String thirdname=delimer[2].trim();
		String forthName=delimer[3].trim();
		
		System.out.println(firstName);
		System.out.println(SecondName);
		System.out.println(thirdname);
		System.out.println(forthName);

				

	}

}

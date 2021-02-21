package saleem_sir;
public class Nested_02 {
	public static void main(String[] args) {

		// Find the Teacher
				String Teacher="MD Saleem";
				String Student1="Islam";
				String Student2="Dedar";
				String Student3="Ashik";
		
		if(Teacher.equals("Islam")) {
			if(Teacher.equals("Dedar")) {
				System.out.println("Our Teacher is Islam");
			}else {
				System.out.println("Our Teacher is Dedar"); }
			}else if(Teacher.equals("Ashik")) {
				System.out.println("Our Teacher is Ashik");
			}else {	System.out.println("Our Teacher is \"MD Saleem\""); 	}
		
				System.out.println("----------------------");
				
		if (Student1.equals("Islam")) {
			if(Student1.equals("Dedar")) { 
				System.out.println("Student1 is Dedar ");
				}else { 
					System.out.println("Student1 is  Islam"); 
					}
			}else if(Student1.equals("Ashik")) { 
				System.out.println("Student1 is  Ashik");	
				}
			else {
				System.out.println("Student1 is MD Saleem"); 	
				}
		System.out.println("------------------");
		
		if (Student2.equals("Dedar")) {
			if (Student2.equals("Islam")) {
				System.out.println("Student2 is Islam");				
				}else {
					System.out.println("Student2 is Dedar");
				}
					}else if (Student2.equals("Ashik")) {
						System.out.println("Student2 is Saleem");
					}else {
						System.out.println("Student2 is Ashik");
					} 
				System.out.println(".....................................");		
				
				if (Student3.equals("MD Saleem")) {
					if(Student3.equals("Islam")) {
						System.out.println("Student3 is Saleem");
					}else {
						System.out.println("Student3 is Islam");
					}
				} else if(Student3.equals("Dedar")) {
					System.out.println("Student3 is Dedar");
				}else {
					System.out.println("Student3 is Ashik");
				}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

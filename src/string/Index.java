package string;

public class Index {

	public static void main(String[] args) {
		
		String a="ashik is learning java";
		String b="ashik,   dedar,   afia         ,babul,sumon";
		String d="Ashik Is Learning JAVA";
		
		System.out.println(b.replaceAll("\\s", ""));
		System.out.println(a.indexOf("is"));
		
		System.out.println(a.charAt(9));
		System.out.println(a.substring(9, 17));
		
		String c[]=b.split(",");
		//String x=c[0].trim();
		System.out.println(c[0].trim());
		System.out.println(c[1].trim());
		System.out.println(c[2].trim());
		System.out.println(c[3].trim());
		System.out.println(c[4].trim());
		
		
		System.out.println(a.contains("JAVA"));
		
		System.out.println(a.contains("java"));
		
		System.out.println(a.equalsIgnoreCase(d));
		
		
		
	}

}

package oops;

public class Encapsulation {

private String name;
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
} 

public String getSalary() {
	return Salary;
}

public void setSalary(String salary) {
	Salary = salary;
}

public int getAmount() {
	return amount;
}

public void setAmount(int amount) {
	this.amount = amount;
}

private String Salary;
private int amount;
	
	
		
	public static void main(String[] args) {

		Encapsulation obj = new Encapsulation();
		obj.setName("Ashik");
		obj.setSalary("January");
		obj.setAmount(3500);
		
		System.out.println("Name ="+obj.getName());
		System.out.println("Month of =" +obj.getSalary());
		System.out.println("Amount=" +obj.getAmount());
		
	}

}

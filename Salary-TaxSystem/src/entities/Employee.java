package entities;

public class Employee {
	
	
	public String name;
	public double grossSalary;
	public double tax;
	public double finalSalary;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary (double percentage) {
		finalSalary += (grossSalary / 100 * percentage);
	}
	
	
}

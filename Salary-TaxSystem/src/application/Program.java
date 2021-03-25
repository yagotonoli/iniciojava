package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		//Develop a programm to read the employee data (name, gross salary and tax). Then, show employee data (name, net salary).
		//Then, raise employee salary based in a percentage data (only the gross salary is afected  by the percentage) and show it;

		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		Employee empl = new Employee();
		
		System.out.print("Insert employee's name: ");
		empl.name = sc.next();
		System.out.print("Insert employee's gross salary: U$ ");
		empl.grossSalary = sc.nextDouble();
		System.out.print("Insert the tax value: U$ ");
		empl.tax = sc.nextDouble();
		System.out.printf("\nEmployee: %s, U$ %.2f", empl.name, empl.netSalary());
		System.out.print("\nHow much, in percentage, do you want to increase the final salary: %");
		empl.increaseSalary(sc.nextDouble());
		
		System.out.printf("Updated Data: %s, U$ %.2f", empl.name, (empl.netSalary() + empl.finalSalary));
		
		sc.close();
	}

}

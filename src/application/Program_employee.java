package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program_employee {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.print("Nome: ");
		employee.name = sc.next();
		//System.out.println();

		System.out.print("Salário bruto: ");
		employee.grossSalary = sc.nextDouble();
		//System.out.println();

		System.out.print("Imposto: ");
		employee.tax = sc.nextDouble();
		System.out.println();
		
		System.out.print("Funcionário: " + employee);
		//System.out.println();
		
		System.out.print("Qual a porcentagem para aumentar o salário? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		//System.out.println();
		
		System.out.print("Dados atualizados: " + employee.toString());
		//System.out.println();
		
		sc.close();

	}
}

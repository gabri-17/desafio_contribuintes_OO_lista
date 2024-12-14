package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program_banco {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double depositoInicial = 0.0;
		String nomeTitularConta, numeroConta;
		char existeDepositoInicial;
		
		System.out.print("Enter account number: ");
		numeroConta = sc.nextLine();
		
		System.out.print("Enter account holder: ");
		nomeTitularConta = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		existeDepositoInicial = sc.nextLine().charAt(0);
		
		if(existeDepositoInicial == 'y') {
			System.out.print("Enter initial deposit value: ");
			depositoInicial = sc.nextDouble();
		}
		
		ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitularConta, depositoInicial);
		
		System.out.println("");
		System.out.println("Acount data: ");
		System.out.println(contaBancaria.toString());
		
		System.out.println("");
		System.out.print("Enter a deposit value: ");
		double valorDeposito = sc.nextDouble();
		contaBancaria.depositar(valorDeposito);
		System.out.println("Updated account data:");
		System.out.println(contaBancaria.toString());
		
		System.out.println("");
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		contaBancaria.sacar(saque);
		System.out.println("Updated account data:");
		System.out.println(contaBancaria.toString());
		
	}
}

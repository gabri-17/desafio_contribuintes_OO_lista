package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program_tax_calculator {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();
		double rendaAnualSalario, rendaAnualServico, rendaAnualCapital, gastosMedicos, gastosEducacionais;
		List<TaxPayer> taxPayers = new ArrayList<TaxPayer>();
		TaxPayer taxPayer = null;
		
		for(int i = 0; i < n; i++) {
			System.out.printf("\nDigite os dados do %d° contribuinte:\n", i + 1);
			System.out.printf("Renda anual com salário: ");
			rendaAnualSalario = sc.nextDouble();
			System.out.printf("Renda anual com prestação de serviço: ");
			rendaAnualServico = sc.nextDouble();
			System.out.printf("Renda anual com ganho de capital: ");
			rendaAnualCapital = sc.nextDouble();
			System.out.printf("Gastos médicos: ");
			gastosMedicos = sc.nextDouble();
			System.out.printf("Gastos educacionais: ");
			gastosEducacionais = sc.nextDouble();
			
			taxPayer = new TaxPayer(rendaAnualSalario, rendaAnualServico, rendaAnualCapital, gastosMedicos, gastosEducacionais);
			taxPayers.add(taxPayer);
		}
		
		for(int i = 0; i < taxPayers.size(); i++) {
			TaxPayer tp = taxPayers.get(i);
			System.out.printf("\nResumo do %d° contribuinte:\n", i + 1);
			System.out.printf("Imposto bruto total: %.2f\n", tp.grossTax());
			System.out.printf("Abatimento: %.2f\n", tp.taxRebate());
			System.out.printf("Imposto devido: %.2f\n", tp.netTax());
		}
		
		sc.close();
	}
}

package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Desafio_imposto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double rendaAnualSalario;
		double rendaPrestacaoServico;
		double ganhoCapital;
		double gastosMedicos;
		double gastosEducacionais;
		double impostoSalario;
		double impostoServico;
		double impostoGanhoCapital;
		double impostoBrutoTotal;
		double salarioMensal;
		double maxDedutivel;
		double gastosDeducoes;
		double abatimento;
		double impostoDevido;
		Locale.setDefault(Locale.US);

		System.out.print("Renda anual com salário: ");
		rendaAnualSalario = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço: ");
		rendaPrestacaoServico = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		ganhoCapital = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		gastosMedicos = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		gastosEducacionais = sc.nextDouble();

		salarioMensal = rendaAnualSalario / 12;
		impostoServico = rendaPrestacaoServico  * 0.15;
		impostoGanhoCapital = ganhoCapital * 0.20;

		if (salarioMensal < 3000) {
			impostoSalario = 0.0;
		} else if (salarioMensal >= 3000 && salarioMensal < 5000) {
			impostoSalario = rendaAnualSalario * 0.10;
		} else if (salarioMensal >= 5000) {
			impostoSalario = rendaAnualSalario * 0.20;
		} else {
			impostoSalario = 0.0;
		}

		// Total de impostos
		impostoBrutoTotal = impostoSalario + impostoServico + impostoGanhoCapital;

		// Cálculo das deduções
		maxDedutivel = 0.30 * impostoBrutoTotal;
		gastosDeducoes = gastosMedicos + gastosEducacionais;
//		 Math.min() - Ele é usado para retornar o menor de dois valores.
		abatimento = Math.min(maxDedutivel, gastosDeducoes);

//		Cálculo do imposto devido
		impostoDevido = impostoBrutoTotal - abatimento;

		System.out.println("\nRELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre salário: %.2f\n", impostoSalario);
		System.out.printf("Imposto sobre serviços: %.2f\n", impostoServico);
		System.out.printf("Imposto sobre ganho de capital: %.2f\n", impostoGanhoCapital);
		
		System.out.println("\nDEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f\n", maxDedutivel);
		System.out.printf("Gastos dedutíveis: %.2f\n", gastosDeducoes);

		System.out.println("\nRESUMO:");
		System.out.printf("Imposto bruto total: %.2f\n", impostoBrutoTotal);
		System.out.printf("Abatimento: %.2f\n", abatimento);
		System.out.printf("Imposto devido: %.2f\n", impostoDevido);
		sc.close();
	}

}

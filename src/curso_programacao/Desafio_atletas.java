package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Desafio_atletas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//		 %n -> quebra de linha.
//		%% -> representar % no print().

		int numeroAtletas, totalHomens = 0, totalMulheres = 0;
		double altura = 0.0, peso, pesoTotal = 0, pesoMedio, maiorAltura = 0, percHomens = 0, alturaMulheresTotal = 0,
				alturaMediaMulheres = 0;
		char sexo;
		String nome, atletaMaisAlto = "";

		System.out.print("Qual a quantidade de atletas? ");
		numeroAtletas = sc.nextInt();

		for (int i = 0; i < numeroAtletas; i++) {
			System.out.println("Digite os dados do atleta numero " + (i + 1));
			System.out.print("Nome: ");
			nome = sc.next();
			sc.nextLine(); // sc.nextLine();

			System.out.print("Sexo: ");
			sexo = sc.next().toUpperCase().charAt(0);
			while (sexo != 'F' && sexo != 'M') {
				System.out.print("Valor invalido! Favor digitar F ou M: ");
				sexo = sc.next().charAt(0);
				if (sexo == 'F' || sexo == 'M') {
					break;
				}
			}

			
			while (true) {
				System.out.print("Altura: ");
				altura = sc.nextDouble();
				if(altura <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo não nulo: ");
				}
				else {
					break;
				}
			}

			while (true) {
				System.out.print("Peso: ");
				peso = sc.nextDouble();
				if (peso <= 0) {
					System.out.print("Valor invalido! Favor digitar um valor positivo não nulo: ");
				} else {
					break;
				}
			}

			// Atualizando os dados para o relatório
			pesoTotal += peso;
			if (sexo == 'M') {
				totalHomens++;
			} else {
				totalMulheres++;
				alturaMulheresTotal += altura;
			}

			if (altura > maiorAltura) {
				maiorAltura = altura;
				atletaMaisAlto = nome;
			}

		}

		System.out.println("\nRelatório:");
		pesoMedio = pesoTotal / numeroAtletas;
		System.out.printf("Peso médio dos atletas: %.2f kg%n", pesoMedio);
		System.out.println("Atleta mais alto: " + atletaMaisAlto);
		percHomens = ((double) totalHomens / numeroAtletas) * 100.0;
		System.out.printf("Porcentagem de homens: %.2f %%%n", percHomens);

		if (totalMulheres > 0) {
			alturaMediaMulheres = alturaMulheresTotal / totalMulheres;
			System.out.printf("Altura média das mulheres: %.2f m%n", alturaMediaMulheres);
		} else {
			System.out.println("Não há mulheres cadastradas");
		}

		sc.close();

	}
}

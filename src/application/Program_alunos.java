package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class Program_alunos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Alunos alunos = new Alunos();
		alunos.nome = sc.next();
		alunos.nota_1 = sc.nextDouble();
		alunos.nota_2 = sc.nextDouble();
		alunos.nota_3 = sc.nextDouble();

		// alunos.notaFinal() : membros de instância: para cada objeto vai se ter um
		// comportamento diferente.
		System.out.printf("Nota final = %.2f%n", alunos.notaFinal());

		if (alunos.notaFinal() < 60.0) {
			System.out.println("Reprovado");
			System.out.printf("Faltam %.2f pontos%n", alunos.pontosPerdidos());
		} else {
			System.out.println("Aprovado");
		}
		sc.close();
	}
}

import java.util.Scanner;

public class Exercicio_duracao {
	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na
		 * tela esta duração no formato horas:minutos:segundos.
		 */
		
		Scanner sc = new Scanner(System.in);
		int segundos, horas, minutos, resto, totalSegundos;
		
		System.out.print("Digite a duracao em segundos:");
		totalSegundos = sc.nextInt();
		
		horas = totalSegundos / 3600;
		resto = totalSegundos % 3600;
		minutos = resto / 60;
		segundos = resto % 60;
		sc.close();
		
		System.out.printf("%d:%d:%d", horas, minutos, segundos);
		
		
	}
}

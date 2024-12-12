import java.util.Locale;
import java.util.Scanner;

public class Exercicio_tempo_de_jogo {
	public static void main(String[] args) {
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
		 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
		 * uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int horaInicial, horaFinal;
		
		System.out.print("Hora inicial: ");
		horaInicial = sc.nextInt();
		
		System.out.print("Hora final: ");
		horaFinal = sc.nextInt();
		
		if(horaInicial < horaFinal) {
			System.out.printf("O jogo durou %d hora(s).", horaFinal - horaInicial);
		}
		else {			
			System.out.printf("O jogo durou %d hora(s).", 24 - (horaInicial - horaFinal));
		}
		
		sc.close();
	}
}

import java.util.Scanner;

public class Estrutura_switch_case {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		case 1: {
			dia = "domingo";
			break;
		}
		case 2: {
			dia = "segunda";
			break;
		}
		case 3: {
			dia = "terça";
			break;
		}
		case 4: {
			dia = "quarta";
			break;
		}
		case 5: {
			dia = "quinta";
			break;
		}
		case 6: {
			dia = "sexta";
			break;
		}
		case 7: {
			dia = "sábado";
			break;
		}
		default:
			dia = "Valor inválido!!";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		sc.close();
		
	}
}

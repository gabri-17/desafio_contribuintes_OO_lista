import java.util.Locale;
import java.util.Scanner;

public class Exercicio_senha_fixa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		int senha = sc.nextInt();
		
		while(true) {
			if(senha != 2302) {
				System.out.print("Senha Invalida! Tente novamente: ");
				senha = sc.nextInt();
			}
			else {
				System.out.print("Acesso permitido!");
				break;
			}
		}
		sc.close();
	}
}

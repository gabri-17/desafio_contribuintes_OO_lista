import java.util.Scanner;

public class TesteEntrada_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1, s2, s3;

		s1 = sc.nextLine(); // nextLine() Ler a linha inteira.
		s2 = sc.nextLine(); 
		/*
		Como limpar um buffer de leitura -> como consumir aquela 
		quebra de linha que fica pendente.
		*/
		s3 = sc.nextLine();
		// next().charAt() -> serve para ler um caractere.
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}
}

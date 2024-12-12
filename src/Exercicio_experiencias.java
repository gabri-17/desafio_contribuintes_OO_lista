import java.util.Locale;
import java.util.Scanner;

public class Exercicio_experiencias {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos casos de teste serao digitados? ");
		int n, quantCobaias = 0, totalCobaias = 0, totalCoelhos = 0, totalSapos = 0, totalRatos = 0;
		double percCoelhos = 0, percRatos = 0, percSapos = 0;
		char tipoCobaia;
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.print("Quantidade de cobaias: ");
			quantCobaias = sc.nextInt();
			System.out.print("Tipo de cobaia: ");
			tipoCobaia = sc.next().charAt(0);
			if(tipoCobaia == 'C') {
				totalCoelhos += quantCobaias;
			} 
			else if(tipoCobaia == 'S') {
				totalSapos += quantCobaias;
			} 
			else if(tipoCobaia == 'R') {
				totalRatos += quantCobaias;
			} 
		}
		
		totalCobaias = totalCoelhos + totalRatos + totalSapos;
		percCoelhos = ((double)totalCoelhos / totalCobaias)  * 100.0;
		percSapos = ((double)totalSapos / totalCobaias) * 100.0;
		percRatos = ((double)totalRatos / totalCobaias) * 100.0;
		System.out.println("\nRelatório final:");
		System.out.println("Total: " + totalCobaias + " cobaias");
		System.out.println("Total de coelhos: " + totalCoelhos);
		System.out.println("Total de ratos: " + totalRatos);
		System.out.println("Total de sapos: " + totalSapos);
		System.out.printf("Percentual de coelhos: %.2f%%\n", percCoelhos);
		System.out.printf("Percentual de ratos: %.2f%%\n", percRatos);
		System.out.printf("Percentual de sapos: %.2f%%\n", percSapos);
		sc.close();
		
	}
}

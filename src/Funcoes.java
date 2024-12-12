import java.util.Scanner;

public class Funcoes {
	// main: função que vai ser executada em primeiro lugar, por padrão.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		showResult(higher);
		
		
		sc.close();
	}
	
	// Parâmetros: quais os dados que a função recebe de entrada.
	public static int max(int x, int y, int z) {
		// Quando a função acaba, as variáveis são desalocadas.
		int aux;
		if(x > y && y > z) {
			aux = x;
		} else if(y > z) {
			aux = y;
		} else {
			aux = z;
		}
		
		return aux;
	}
	
	// void (tipo que a função retorna - vazio): quando a função, simplesmente, faz uma ação sem 
	// retornar um valor para ser reaproveitado pelo programa.
	public static void  showResult(int value) {
		System.out.println("Higher = " + value);
	}
}

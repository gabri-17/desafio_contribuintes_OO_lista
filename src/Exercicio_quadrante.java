import java.util.Locale;
import java.util.Scanner;

public class Exercicio_quadrante {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os valores das coordenadas X e Y: ");
		int coordenada_x = sc.nextInt();
		int coordenada_y = sc.nextInt();
		while (true) {
			if(coordenada_x == coordenada_y ) {
				System.out.println("Quadrante 1");
				System.out.println("Digite os valores das coordenadas X e Y: ");
				coordenada_x = sc.nextInt();
				coordenada_y = sc.nextInt();
			}
			else if (coordenada_x < 0 && coordenada_y > 0) {
				System.out.println("Quadrante 2");
				System.out.println("Digite os valores das coordenadas X e Y: ");
				coordenada_x = sc.nextInt();
				coordenada_y = sc.nextInt();
			}
			else if (coordenada_x < 0 && coordenada_y < 0) {
				System.out.println("Quadrante 3");
				System.out.println("Digite os valores das coordenadas X e Y: ");
				coordenada_x = sc.nextInt();
				coordenada_y = sc.nextInt();
			}
			else if (coordenada_y < 0 && coordenada_x > 0) {
				System.out.println("Quadrante 4");
				System.out.println("Digite os valores das coordenadas X e Y: ");
				coordenada_x = sc.nextInt();
				coordenada_y = sc.nextInt();
			}
			else {
				break;
			}
		}
		sc.close();
	}
}

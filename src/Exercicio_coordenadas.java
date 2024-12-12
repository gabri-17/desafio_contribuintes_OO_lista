import java.util.Scanner;

public class Exercicio_coordenadas {
	public static void main(String[] args) {
		/*
		 * Leia os valores das coordenadas X e Y de um ponto no plano cartesiano. A
		 * seguir, determine qual o quadrante ao qual pertence o ponto (Q1, Q2, Q3 ou
		 * Q4). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto
		 * estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”.
		 */
		
		Scanner sc = new Scanner(System.in);
		double coordenadaX, coordenadaY;
		
		System.out.print("Valor de X: ");
		coordenadaX = sc.nextDouble();
		
		System.out.print("Valor de Y: ");
		coordenadaY = sc.nextDouble();
		
		if(coordenadaX == coordenadaY) {
			System.out.print("Origem");
		}
		else if(coordenadaX > 0 && coordenadaY > 0) {
			System.out.print("Q1");
		}
		else if(coordenadaX < 0 && coordenadaY > 0) {
			System.out.print("Q2");
		}
		else if(coordenadaX < 0 && coordenadaY < 0) {
			System.out.print("Q3");
		}
		else if(coordenadaX > 0 && coordenadaY < 0) {
			System.out.print("Q4");
		}
		else if((coordenadaX > 0 || coordenadaX < 0) && coordenadaY == 0) {
			System.out.print("Eixo X");
		}
		else if(coordenadaX == 0 && (coordenadaY > 0 || coordenadaY < 0)) {
			System.out.print("Eixo Y");
		}
		
		sc.close();
	}
}

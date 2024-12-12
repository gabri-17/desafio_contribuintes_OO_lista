package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

/*
 * Classe: tipo estruturado que pode conter (membros):
 * Atributos (dados / campos)
 * Métodos (funções / operações)
 * */
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * Variáveis criadas em uma área da memória chamada Stack (área onde são criadas
		 * as variáveis estáticas -> variáveis que são declaradas no programa).
		 * 
		 * Aqui dentro da variável vai estar endereço de memória (endereço do objeto que
		 * foi criado na memória Heap).
		 */
		Triangle x, y;

		/*
		 * Criação dos objetos dinâmicos durante a execução na área de memória Heap.
		 */
		x = new Triangle(); // Para que o objeto exista é necessário instanciar (criar o objeto).
		y = new Triangle();

		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble(); // Armazena os dados lidos em cada um dos atributos do objeto X.
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble(); // Armazena os dados lidos em cada um dos atributos do objeto Y.
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area(); // Chamada do método para calcular a área de cada um dos triângulos.

		double areaY = y.area();

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}

		sc.close();
	}
}

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_temperatura {
	public static void main(String[] args) {
		/*
		 * Deseja-se converter uma medida de temperatura da escala Celsius para
		 * Fahrenheit ou vice-versa. Para isso, você deve construir um programa que leia
		 * a letra "C" ou "F" indicando em qual escala vai ser informada uma
		 * temperatura. Em seguida o programa deve mostrar a temperatura na outra escala
		 * com duas casas decimais.
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		char valorDigitado;
		double tempFahrenheit, tempCelsius;
		
		System.out.print("Digite F (ºF) ou C (ºC): ");
		valorDigitado = sc.next().charAt(0);
		if(valorDigitado == 'F') {
			System.out.println("Digite a temperatura em Fahrenheit");
			tempFahrenheit = sc.nextDouble();
			tempCelsius = (5.0/9.0)*(tempFahrenheit - 32);
			
			System.out.printf("Temperatura equivalente em Celsius: %.2f ºC", tempCelsius);
		}
		else if (valorDigitado == 'C') {
			System.out.println("Digite a temperatura em Celsius");
			tempCelsius = sc.nextDouble();
			tempFahrenheit = (tempCelsius * (9.0/5.0)) + 32;
			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f ºF", tempFahrenheit);
		}
		else {
			System.out.println("Valor incorreto!!");
		}
		
	}
}

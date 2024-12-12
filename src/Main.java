import java.util.Locale;

// Todo código escrito tem que estar dentro de classes.
public class Main {
	// Código organizado em funções
	public static void main(String[] args) {
		//int y = 32;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		double x = 10.35784;
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		
		System.out.println("Products:");
		System.out.printf("Computer, which price is $  %.2f%n", price1);
		System.out.printf("Office desk, which price is $ %.2f%n", price2);
		
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
		
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rounded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Rounded (three decimal places): %.3f%n", measure);
		System.out.println("------------------------------------------------");
		System.out.println(x);
		// %n -> quebra de linha.
		System.out.printf("%.2f%n", x); // %.2f: Padrão para delimitar casas decimais.
		System.out.printf("%.4f%n", x);
		
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x); // x = %.2f
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		
		
		
		
		// Define onde o programa vai começar
		//System.out.println("Olá mundo!");
		
		//System.out.println("Bom dia!"); // quebra de linhaimport java.util.Locale;



}

}

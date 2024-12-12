
public class Escopo_inicializacao {
	public static void main(String[] args) {
		double price = 400.00;
		double discount;
		
		if(price < 200.00) {
			// Variáveis que forem declaradas dentro da estrutura só irão existir durante a execução 
			// dessa estrutura.
			discount = price * 0.1;
		}
		else {
			discount = 0;
		}
		
		System.out.println(discount); // Variável tem que ser iniciada para ser usada.
	}
}

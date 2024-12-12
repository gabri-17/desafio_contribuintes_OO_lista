package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		// this: autoreferência para o objeto.
		// this: para ferenciar o atributo da classe.
		// this.quantity = atributo da minha classe.
		// quantity = veio como argumento.
		this.quantity += quantity; // Explicita que se quer acessar o atributo da classe.
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		// Implementação da minha versão do toString() -> sobreposição.
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, " 
				+ "Total: $ " 
				+ String.format("%.2f", totalValueInStock());
	}
}

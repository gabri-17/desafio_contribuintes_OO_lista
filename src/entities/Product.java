package entities;

public class Product {

	String name;
	private double price; // Está sendo referenciado em this.price
	private int quantity;
	

//	public Product() {
//
//	}
//
//	// Construtor: é executado no momento da instanciação do objeto.
//	public Product(String name, double price, int quantity) {
//		// This serve para diferenciar o atributo do objeto do parâmetro do construtor.
//		this.name = name; // this: referência para o próprio objeto.
//		this.price = price; // this.price -> está se referenciando ao atributo do objeto.
//		this.quantity = quantity;
//	}
//
//	// Sobrecarga: disponibilizar mais de uma versão da mesma operação.
//	public Product(String name, double price) {
//		// O Java por padrão, inicia números de objetos e array's com o valor 0.
//		this.name = name;
//		this.price = price;
//	}
	
	public Product() {	
	}
	
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public double totalValueInStock() {
		return price * quantity;
	}
	
	// Método que vai obter -> get()
	// Método que vai alterar -> set()
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	// Métodos de entrada e saída no estoque.
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

	// Fim dos métodos de entrada e saída no estoque.
	
	public String toString() {
		// Implementação da minha versão do toString() -> sobreposição.
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, " + "Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}

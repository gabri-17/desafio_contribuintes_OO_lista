package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program_2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		// nextLine() lê até encontrar uma quebra de linha.
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
//		Equals: operação que está definida na classe object (Product é um objeto do tipo object)
//		product.equals(product;)
		System.out.println();
		System.out.println("Product data: " + product); // Chamada do toString() não é necessário, o Java detecta 
		// implicitamente.
		
		System.out.print("Enter the numer of products to be added in stock: ");
		int quantity= sc.nextInt();
		product.addProducts(quantity); // atualização da quantidade dentro do objeto product.
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.print("Enter the numer of products to be removed from stock: ");
		quantity= sc.nextInt();
		product.removeProducts(quantity); // atualização da quantidade dentro do objeto product.
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println(product.name + ", " + product.price + ", " + product.quantity);
		
		// Classe não pode ser instanciada -> não se cria um objeto daquela classe.
		
		
		sc.close();
	}
}

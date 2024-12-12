package entities;

public class Triangle {
	// Na memória, a variável X e Y vai apontar para um objeto composto por três atributos.
	// Quando a variável é do tipo classe, é necessário instanciar a variável.
	
	public double a;
	public double b;
	public double c;
	
	public double area () {
		double p = (a + b + c) / 2.0;
		double result = Math.sqrt(p *(p - a) * (p - b) * (p - c));
		return result;
	}
//	Diagrama UML -> serve para representar classes e as relações entre elas.
//	Coesão: cada classe é responsável por si mesma.
}

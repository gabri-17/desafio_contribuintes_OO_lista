package entities;

public class Alunos {
	public String nome;
	public double nota_1;
	public double nota_2;
	public double nota_3;
	
	
	public double notaFinal() {
		return nota_1 + nota_2 + nota_3;
	}
	
	public double pontosPerdidos() {
		if(notaFinal() < 60.0) {
			return 60.0 - notaFinal();
		}
		else {
			return 0.0;
		}
	}
}

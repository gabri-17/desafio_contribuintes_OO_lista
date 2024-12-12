
public class TesteProcessamento {
	public static void main(String[] args) {
		double b, B, h, d, area, resultado; 
		int a, c, e;
		
		/* 
		 * Boa prática: Sempre indicar o tipo do número, se a expressão for de
		 * ponto flutuante (não inteira).
		*/
		
		d = 5.0;
		e = (int)d;
		a = 5;
		c = 2;
		b = 6.0; // f: usar para o tipo float
		B = 8.0;
		h = 5.0;
		
		
		resultado = (double) a / c; // casting: conversão explícita de tipos de dados.
		area = (b + B) / 2.0 * h;
		System.out.println(resultado);
		System.out.println(e);
		System.out.println(area);
		
	}
	
	
}

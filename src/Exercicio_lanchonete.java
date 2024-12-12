import java.util.Locale;
import java.util.Scanner;

public class Exercicio_lanchonete {
	public static void main(String[] args) {
		/*
		 * Uma lanchonete possui vários produtos. Cada produto possui um código e um
		 * preço. Você deve fazer um programa para ler o código e a quantidade comprada
		 * de um produto (suponha um código válido), e daí informar qual o valor a ser
		 * pago, com duas casas decimais.
		 */
		Scanner sc =  new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int codigoProduto, quantidadeComprada;
		double valorPago = 0;
		
		System.out.print("Código do produto comprado: ");
		codigoProduto = sc.nextInt();
		
		System.out.print("Quantidade comprada: ");
		quantidadeComprada = sc.nextInt();
		
		
		if(codigoProduto == 1) {
			valorPago = quantidadeComprada * 5.0;
		}
		else if (codigoProduto == 2){
			valorPago = quantidadeComprada * 3.5;
		}
		else if (codigoProduto == 3){
			valorPago = quantidadeComprada * 4.8;
		}
		else if (codigoProduto == 4){
			valorPago = quantidadeComprada * 8.9;
		}
		else{
			valorPago = quantidadeComprada * 7.32;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f\n", valorPago);
	}
}

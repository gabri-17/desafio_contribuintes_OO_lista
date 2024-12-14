package entities;

public class ContaBancaria {
	private String numeroConta;
	private String nomeTitularConta;
	private double saldo;

	public ContaBancaria(String numeroConta, String nomeTitularConta, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitularConta = nomeTitularConta;
		this.saldo = depositoInicial;
	}

	public void setNomeTitularConta(String nomeTitularConta) {
		this.nomeTitularConta = nomeTitularConta;
	}

	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
		}
	}

	public void sacar(double valor) {
		if (valor > 0) {
			saldo -= valor + 5.00;
		}
	}

	public String toString() {
		return "Acount " + numeroConta + ", " + nomeTitularConta + ", " + "Balance: $ "
				+ String.format("%.2f", saldo);
	}

}

package correcoes;

public class Account {
	
	private int number;
	private String holder; // titular
	private double balance;
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	// Uso do método deposit() nos outros lugares.
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit); // Proteção contra mudanças futuras no construtor.
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	// O saldo da conta só pode ser alterado por meio de saque ou depósito.
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		// Encapsulando a regra de negócio relativa a depósito dentro desse método.
		// Encapsulamento de um ponto alteração para caso essa regra mude no futuro.
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
	
}

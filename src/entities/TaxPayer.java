package entities;

public class TaxPayer {
	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;

	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,
			double educationSpending) {
		super();
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}

	public double salaryTax() {
		// Cálculo do salário mensal.
		double monthlySalary = getSalaryIncome() / 12;

		// Condições da tabela no desafio para pagar imposto.
		if (monthlySalary < 3000) {
			return 0;
		} else if (monthlySalary < 5000) {
			return getSalaryIncome() * 0.10;
		} else {
			return getSalaryIncome() * 0.20;
		}

	}

	public double servicesTax() {
		// Se houver renda de serviços, o imposto é 15% dessa renda.
		if (getServicesIncome() > 0.0) {
			return getServicesIncome() * 0.15;
		} else {
			return 0;
		}
	}

	public double capitalTax() {
		// Se houver ganhos de capital, o imposto é 20% desses ganhos.
		if (getCapitalIncome() > 0.0) {
			return getCapitalIncome() * 0.20;
		} else {
			return 0;
		}
	}

	public double grossTax() {

		double serviceTax = getServicesIncome() * 0.15;
		double capitalTax = getCapitalIncome() * 0.20;

		// Calcula o imposto bruto total somando os impostos de salário, serviços e
		// ganhos de capital.
		return salaryTax() + serviceTax + capitalTax;
	}

	public double taxRebate() {
		// Soma os gastos com saúde e educação.
		double totalExpenses = getHealthSpending() + getEducationSpending();

		// Calcula o máximo de abatimento permitido (30% do imposto bruto).
		double maxRebate = grossTax() * 0.30;

		if (totalExpenses > maxRebate) {
			return maxRebate;
		} else {
			return totalExpenses;
		}
	}

	public double netTax() {
		// Calcula o imposto líquido a ser pago, subtraindo o abatimento do imposto
		// bruto.
		return grossTax() - taxRebate();
	}

	@Override
	public String toString() {
		return String.format("Imposto bruto total: %,2f\n" + "Abatimento: %.2f\n" + "Imposto devido: %.2f\n",
				grossTax(), taxRebate(), netTax());
	}

}

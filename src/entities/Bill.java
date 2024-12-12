package entities;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	public double priceBeers = 5.0;
	public double priceSoftDrink = 3.0;
	public double priceBarbecue = 7.0;
	public double ticketMan = 10.0;
	public double ticketWoman = 8.0;
	public double totalConsumption = feeding();
	
	
	public double feeding() {
		double totalBeers = beer * priceBeers;
		double totalSoftDrink = softDrink * priceSoftDrink;
		double totalBarbecue = barbecue * priceBarbecue;
		
		return totalBeers + totalSoftDrink + totalBarbecue;
	}
	
	public double couvert() {
		return 4.00;
	}
	
	public double ticket() {
		double genderUpperCase = Character.toUpperCase(gender);
		if(genderUpperCase == 'M') {
			return ticketMan;
		}
		else if(genderUpperCase == 'F') {
			return ticketWoman;
		}
		else {
			throw new IllegalArgumentException("Sexo inválido. Use 'F' para feminino ou 'M' para masculino.");
		}
	}
	
	public double total() {
		totalConsumption = feeding();
		double totalTicket = ticket();
		
		if(totalConsumption > 30) {
			return totalConsumption + totalTicket;
		}
		else {
			return totalConsumption + totalTicket + couvert();
		}
	}
	
	public void imprimirRelatorio() {
		System.out.println("");
		System.out.printf("Relatório:\n");
		System.out.printf("Total Consumo: R$ %.2f\n", feeding());
        
        if (feeding() <= 30) {
            System.out.printf("Taxa de Couvert = R$ %.2f\n", couvert());
        } else {
            System.out.println("Isento de Couvert");
        }
        
        System.out.printf("Ingresso: R$ %.2f\n", ticket());
        
        System.out.println("");
        System.out.printf("Total a Pagar = R$ %.2f\n", total());
	}
}

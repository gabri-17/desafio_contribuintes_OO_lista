package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program_combate {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Champion champion1;
		Champion champion2;
		
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sc.next();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		
		champion1 = new Champion(name, life, attack, armor);
		
		sc.nextLine();
		
		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		String name_2 = sc.next();
		System.out.print("Vida inicial: ");
		int life_2 = sc.nextInt();
		System.out.print("Ataque: ");
		int attack_2 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor_2 = sc.nextInt();
		
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int turns = sc.nextInt();
		
		while(turns <= 0) {
			System.out.print("Valor Inválido! Por favor, digite uma quantidade positiva e não nula: ");
			turns = sc.nextInt();
		}
		
		champion2 = new Champion(name_2, life_2, attack_2, armor_2);
		
		for(int i = 0;i < turns; i++) {
			if(!champion1.estaVivo() || !champion2.estaVivo()) {
				break;
			}
			
			champion1.takeDamage(champion2.getAttack());
			champion2.takeDamage(champion1.getAttack());
			
			System.out.println();
			System.out.println("Resultado do turno " + (i + 1) + ":");
			System.out.println(champion1.status());
			System.out.print(champion2.status());
			System.out.println();
		}
		
		System.out.println();
		System.out.println("FIM DO COMBATE.");
		sc.close();
		
	}
}

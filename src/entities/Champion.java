package entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	
	
	
	public String getName() {
		return name;
	}


	public int getLife() {
		return life;
	}


	public void setLife(int life) {
		this.life = life;
	}


	public int getAttack() {
		return attack;
	}



	public int getArmor() {
		return armor;
	}


	public void takeDamage(int damage) {
		int danoEfetivo = Math.max(damage - armor, 1);
		life -= danoEfetivo;
		if (life < 0) {
			life = 0;
		}
	}
	
	public String status() {
		return name + ": " + life + " de vida" + (life == 0 ? " (morreu)": "");
	}
	
	public boolean estaVivo() {
		return life > 0;
	}
}

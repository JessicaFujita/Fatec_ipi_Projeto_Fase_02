package warriors.humans;

import weapons.WeaponBehavior;

public abstract class Character {
	private String nome;
	private double vida = 1;
	WeaponBehavior weaponbehavior;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setVida(double vida) {
		this.vida = vida;
	}
	
	public abstract String attack();
	
	public void setWeaponbehavior(WeaponBehavior w) {
		this.weaponbehavior = w;
	}
	public void takeDamage() {
		this.vida -= 0.1;
	}
	public boolean isAlive() {
		return this.vida > 0;
	}
	public double getVida() {
		return this.vida;
	}
	
	
}

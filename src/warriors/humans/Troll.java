package warriors.humans;

public class Troll extends Character {
	public Troll() {
		setNome("Troll");
	}
	@Override
	public String attack() {
//		System.out.print(this.getNome() + ": " );
		return "com " + this.weaponbehavior.useWeapon();	
	}
}

package battle;
import warriors.humans.Character;

public class Fight {
	private Character fighter01, fighter02;
	public Fight(Character f1, Character f2){
		this.fighter01 = f1;
		this.fighter02 = f2;
	}
	public Character getFighter01() {
		return this.fighter01;
	}
	public Character getFighter02() {
		return this.fighter02;
	}
	public void fighter01Attack() {
//		System.out.println(this.fighter01.getNome() + " life: " + this.fighter01.getVida() + " :: " + this.fighter02.getNome() + " life: " + this.fighter02.getVida());
		System.out.println(this.fighter01.getNome() + " atacando " + this.fighter02.getNome() + ", " + this.fighter01.attack());
		fighter02.takeDamage();
	}
	public void fighter02Attack() {
//		System.out.println(this.fighter01.getNome() + " life: " + this.fighter01.getVida() + " :: " + this.fighter02.getNome() + " life: " + this.fighter02.getVida());
		System.out.println(this.fighter02.getNome() + " atacando " + this.fighter01.getNome() + ", " + this.fighter02.attack());
		fighter01.takeDamage();
	}
	
	public boolean checkBattle() {
		return this.fighter01.isAlive() && this.fighter02.isAlive();
	}
	
	public Character whoWins() {
		if(this.fighter01.isAlive()) {
			return this.fighter01;
		}
		else {
			return this.fighter02;		
		}	
	}
	
	public String whosBattle() {
		return this.fighter01.getNome() + " VS " + this.fighter02.getNome();
	}
}

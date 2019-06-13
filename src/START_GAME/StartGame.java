package START_GAME;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import battle.Fight;
import warriors.*;
import warriors.birds.BushTurkey;
import warriors.birds.BushTurkeyAdapter;
import warriors.birds.Goose;
import warriors.birds.GooseAdapter;
import warriors.humans.Character;
import warriors.humans.King;
import warriors.humans.Knight;
import warriors.humans.Queen;
import warriors.humans.Troll;
import weapons.*;

public class StartGame {
	//######### MAIN PARA TESTE DO REQUISITO 02 DA PARTE 01/02 DO PORJETO
	public static void main(String[] args) {
		List <Fight> fight = new ArrayList <>();
		Random gerador = new Random();
		Character winner;
		Character semiFinalista = null;
		int round = 0;
		for (int i = 0 ; i < 10 ; i++) {
			int p1 = gerador.nextInt(4);
			Character f1 = null, f2 = null;			
			switch(p1) {
				case 0:
					f1 = new King();
					break;
				case 1:
					f1 = new Knight();
					break;
				case 2:
					f1 = new Queen();
					break;
				case 3:
					f1 = new Troll();
					break;
			}			
			int p2 = gerador.nextInt(4);
			switch(p2) {
			
				case 0:
					f2 = new King();
					break;
				case 1:
					f2 = new Knight();
					break;
				case 2:
					f2 = new Queen();
					break;
				case 3:
					f2 = new Troll();
					break;
			}
			fight.add(new Fight(f1, f2));
		}
		for(Fight f : fight) {
			int weaponP1 = gerador.nextInt(4);
			switch (weaponP1) {
			case 0:
				f.getFighter01().setWeaponbehavior(new AxeBehavior());
				break;
			case 1:
				f.getFighter01().setWeaponbehavior(new BowAndArrowBehavior());
				break;
			case 2:
				f.getFighter01().setWeaponbehavior(new KnifeBehavior());
				break;
			case 3:
				f.getFighter01().setWeaponbehavior(new SwordBehavior());
				break;
			}
			int weaponP2 = gerador.nextInt(4);
			switch (weaponP2) {
			case 0:
				f.getFighter02().setWeaponbehavior(new AxeBehavior());
				break;
			case 1:
				f.getFighter02().setWeaponbehavior(new BowAndArrowBehavior());
				break;
			case 2:
				f.getFighter02().setWeaponbehavior(new KnifeBehavior());
				break;
			case 3:
				f.getFighter02().setWeaponbehavior(new SwordBehavior());
				break;
			}
		}
		
		//Start battle here
		for(int i=0; i<5; i++) {
			Character p1 = null, p2 = null;
			List <Fight> results = new ArrayList <> ();
			int cont = 0;
			for(Fight f : fight) {
					cont++;
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("\nBattle: " + cont + " - " + f.whosBattle() +"\n");
					System.out.println("-----------------------[Description Battle]---------------------------\n");
					while(f.checkBattle()) {
						boolean whoAttack = gerador.nextDouble() <= 0.5;
						if(whoAttack) {
							f.fighter01Attack();
						}
						else {
							f.fighter02Attack();
						}
					}
					System.out.println("\n**************************************************");
					System.out.println("Winner fase 01:" + f.whoWins().getNome()+ "\n");
					System.out.println("****************************************************");
					winner = f.whoWins();
					if(i == 1) {
						if(cont == 5) {
							semiFinalista = f.whoWins();
						}
						else {
							if(round == 0) {
								p1 = winner;
								p1.setVida(1);
								round = 1;
							}
							else {
								p2 = winner;
								p2.setVida(1);
								round= 0;
								results.add(new Fight(p1, p2));
							}
						}
					}
					else {
						
						if(i == 3) {
							if(round == 0) {
								p1 = winner;
								p1.setVida(1);
								p2 = semiFinalista;
								p2.setVida(1);
								round= 0;
								results.add(new Fight(p1, p2));
							}
						}
						else {
							if(round == 0) {
								p1 = winner;
								p1.setVida(1);
								round = 1;
							}
							else {
								p2 = winner;
								p2.setVida(1);
								round= 0;
								results.add(new Fight(p1, p2));
							}
						}
						
					}

					System.out.println("////////////////////////////////////////////////////\n\n");

				}
				fight = results;
				System.out.println("\n*****************************************************");
				if(i==4) {
					System.out.println("\n-------------------------------------------------");
					System.out.println("\nCampeão primeiro campeonato: " + p1.getNome());
					System.out.println("\n-------------------------------------------------");
				}
			}
		
		
		/******************************* ---------------------------- *******************************
		 * 								Batalha com Vetor Aqui (tá bugado) 
		 * 			
		 * *****************************----------------------------- *******************************
		 */
		
		Fight fight2[] = new Fight[10];
		Character winner2;
		Character semiFinalista2 = null;
		int round2 = 0;
		for (int i = 0 ; i < 10 ; i++) {
			int p1 = gerador.nextInt(6);
			Character f1 = null, f2 = null;			
			switch(p1) {
				case 0:
					f1 = new King();
					break;
				case 1:
					f1 = new Knight();
					break;
				case 2:
					f1 = new Queen();
					break;
				case 3:
					f1 = new Troll();
					break;
				case 4:
					f1 = new GooseAdapter(new Goose());;
					break;
				case 5:
					f1 = new BushTurkeyAdapter(new BushTurkey());
					break;
			}			
			int p2 = gerador.nextInt(6);
			switch(p2) {			
				case 0:
					f2 = new King();
					break;
				case 1:
					f2 = new Knight();
					break;
				case 2:
					f2 = new Queen();
					break;
				case 3:
					f2 = new Troll();
					break;
				case 4:
					f2 = new GooseAdapter(new Goose());;
					break;
				case 5:
					f2 = new BushTurkeyAdapter(new BushTurkey());
					break;
			}
			fight2[i] = new Fight(f1, f2);
		}
		for(Fight f : fight2) {
			int weaponP1 = gerador.nextInt(4);
			switch (weaponP1) {
			case 0:
				f.getFighter01().setWeaponbehavior(new AxeBehavior());
				break;
			case 1:
				f.getFighter01().setWeaponbehavior(new BowAndArrowBehavior());
				break;
			case 2:
				f.getFighter01().setWeaponbehavior(new KnifeBehavior());
				break;
			case 3:
				f.getFighter01().setWeaponbehavior(new SwordBehavior());
				break;
			}
			int weaponP2 = gerador.nextInt(4);
			switch (weaponP2) {
			case 0:
				f.getFighter02().setWeaponbehavior(new AxeBehavior());
				break;
			case 1:
				f.getFighter02().setWeaponbehavior(new BowAndArrowBehavior());
				break;
			case 2:
				f.getFighter02().setWeaponbehavior(new KnifeBehavior());
				break;
			case 3:
				f.getFighter02().setWeaponbehavior(new SwordBehavior());
				break;
			}
		}
		
		//Start battle here
		int t = 0;
				for(int i=0; i<4; i++) {
					switch (i) {
					case 0:
						t = 5;
						break;
					case 1:
						t = 2;
						break;
					case 2:
						t = 1;
						break;
					case 3:
						t = 1;
						break;						
					default:
						break;
					}
					
					Character p1 = null, p2 = null;
					Fight results[] = new Fight[t];
					int cont = 0;
					int j = 0; /*Cont do vetor */
					for(Fight f : fight2) {
							cont++;
							System.out.println("-----------------------------------------------------------------------");
							System.out.println("\nBattle: " + cont + " - " + f.whosBattle() +"\n");
							System.out.println("-----------------------[Description Battle]---------------------------\n");
							while(f.checkBattle()) {
								boolean whoAttack = gerador.nextDouble() <= 0.5;
								if(whoAttack) {
									f.fighter01Attack();
								}
								else {
									f.fighter02Attack();
								}
							}
							System.out.println("\n**************************************************");
							System.out.println("Winner fase 02:" + f.whoWins().getNome()+ "\n");
							System.out.println("****************************************************");
							winner2 = f.whoWins();
							if(i == 1) {
								if(cont == 5) {
									semiFinalista2 = f.whoWins();
								}
								else {
									if(round2 == 0) {
										p1 = winner2;
										p1.setVida(1);
										round2 = 1;
									}
									else {
										p2 = winner2;
										p2.setVida(1);
										round2= 0;
										results[j] = new Fight(p1, p2);
										j++;
									}
								}
							}
							else {
								
								if(i == 3) {
									if(round2 == 0) {
										p1 = winner2;
										p1.setVida(1);
										p2 = semiFinalista2;
										p2.setVida(1);
										round2= 0;
										results[j] = new Fight(p1, p2);
										j++;
									}
								}
								else {
									if(round2 == 0) {
										p1 = winner2;
										p1.setVida(1);
										round2 = 1;
									}
									else {
										p2 = winner2;
										p2.setVida(1);
										round2= 0;
										results[j] = new Fight(p1, p2);
										j++;
									}
								}
								
							}

							System.out.println("////////////////////////////////////////////////////\n\n");

						}
						fight2 = results;
						
						System.out.println("\n*****************************************************");
						if(i==4) {
							System.out.println("\n-------------------------------------------------");
							System.out.println("\nCampeão segunda campeonato: " + p1.getNome());
							System.out.println("\n-------------------------------------------------");
						}
					}
		
		
		}		
}



import java.util.*;

//Imena sama objasnjavaju sta sta radi tako da nemoram komentirat
public class transfernovca {

	static Scanner unos = new Scanner(System.in);

	public static void deposit(ArrayList<KreiranjeRacuna> Racuni, int broj) {
		int check = provjera.ProvjeraUnosaRacuna(Racuni, broj);
		if (check != 0) {

			for (int i = 0; i < Racuni.size(); i++) {
				if (Racuni.get(i).getbrracuna() == check) {
					System.out.println("Unesite broj para koji zelite da polozite");
					Racuni.get(i).setiznos(
							Racuni.get(i).getiznos() + provjera.PokusavanjeDizanjaParaUMinusu(unos.nextInt()));
					System.out.println("Stanje na vasem racunu je : " + Racuni.get(i).getiznos() + "KM");

				}
			}
		}

	}

	public static void Withdraw(ArrayList<KreiranjeRacuna> Racuni, int broj) {
		int check = provjera.ProvjeraUnosaRacuna(Racuni, broj);
		if (check != 0) {
			for (int i = 0; i < Racuni.size(); i++) {
				if (Racuni.get(i).getbrracuna() == check) {
					System.out.println("Unesite koliko para zelite podignuti 0 prekida operaciju ");
					Racuni.get(i).setiznos(
							Racuni.get(i).getiznos() - provjera.ProvjeraDaLiImaDovoljnoPara(Racuni, i, unos.nextInt()));
					System.out.println("Staje na vasem racunu je : " + Racuni.get(i).getiznos() + "KM");
				}
			}
		}
	}

	public static void PrebacivanjeNovca(ArrayList<KreiranjeRacuna> Racuni, int broj) {
		int check = provjera.ProvjeraUnosaRacuna(Racuni, broj);
		if (check != 0) {
			for (int i = 0; i < Racuni.size(); i++) {
				if (Racuni.get(i).getbrracuna() == check) {
					int prviracun = i;
					System.out.println("Unesite drugi racun");
					int check2 = provjera.ProvjeraUnosaRacunaDupli(Racuni, Racuni.get(i).getbrracuna(), unos.nextInt());
					if (check2 != 0) {
						for (int j = 0; j < Racuni.size(); j++) {
							if (Racuni.get(j).getbrracuna() == check2) {
								System.out.println("Unesite koliko zelite da prebacite na drugi racun");
								int razlika = provjera.ProvjeraDaLiImaDovoljnoPara(Racuni, i, unos.nextInt());
								Racuni.get(prviracun).setiznos(Racuni.get(prviracun).getiznos() - razlika);
								Racuni.get(j).setiznos(Racuni.get(j).getiznos() + razlika);
								System.out.println("Transfer uspjesan hvala na povjerenju");
							}
						}
					}
				}
			}
		}
	}

}

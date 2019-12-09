import java.util.ArrayList;
import java.util.Scanner;

//imena sama kazu sta sta radi ps (ProvjeraIndexRacuna sam napravio i ostavio ona vraca index racuna zasad je ne koristim ali u buduce mozda)
public class provjera {
	static Scanner unos = new Scanner(System.in);

	public static int checkacc(ArrayList<KreiranjeRacuna> Racuni, int broj) {

		for (int i = 0; i < Racuni.size(); i++) {

			if (broj == Racuni.get(i).getbrracuna()) {
				int test = Racuni.get(i).getbrracuna();
				return test;
			}
		}
		return 0;

	}

	public static int ProvjeraIndexRacuna(ArrayList<KreiranjeRacuna> Racuni, int broj) {
		int check = checkacc(Racuni, broj);
		for (int i = 0; i < Racuni.size(); i++) {
			if (check == Racuni.get(i).getbrracuna()) {
				return i;
			}

		}
		return 0;
	}

	public static double StanjeNaRacunu(ArrayList<KreiranjeRacuna> Racuni, int broj) {

		int brojracuna = ProvjeraUnosaRacunaDeposit(Racuni, broj);

		if (brojracuna != 0) {
			for (int i = 0; i < Racuni.size(); i++) {
				if (brojracuna == Racuni.get(i).getbrracuna())
					return Racuni.get(i).getiznos();
			}
		}
		return 0;

	}

	public static int ProvjeraDaLiImaDovoljnoPara(ArrayList<KreiranjeRacuna> Racuni, int broj, int broj2) {
		while (Racuni.get(broj).getiznos() < broj2) {

			System.out.println("Greska u unosu ili nemate dovoljno para na racunu unesite 0 da prekinete operaciju");
			broj2 = unos.nextInt();

			if (broj2 == 0) {
				break;
			}
		}
		return broj2;

	}

	public static int PokusavanjeDizanjaParaUMinusu(int broj) {
		while (broj <= 0) {
			System.out.println("Niste unijeli pravilno vase novcanice pkusajte ponovo 0 prekida operaciju");
			broj = unos.nextInt();
			if (broj == 0) {
				break;
			}
		}

		return broj;

	}

	public static int ProvjeraUnosaRacunaDeposit(ArrayList<KreiranjeRacuna> Racuni, int broj) {

		int brojracuna = checkacc(Racuni, broj);

		while (brojracuna == 0) {
			System.out.println("Pogresan ili nepostojeci racun molimo pokusajte ponovo ili pritisnite 1 da prekinete");
			broj = unos.nextInt();
			brojracuna = checkacc(Racuni, broj);
			if (broj == 1) {
				break;
			}

		}
		return brojracuna;
	}

}

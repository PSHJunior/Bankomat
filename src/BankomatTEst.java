import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class BankomatTEst {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		System.out.println("*---------------------------------*");
		System.out.println("*Dobro dosli u procredit bank     *");
		System.out.println("*Odaberite opciju :               *");
		System.out.println("*1 - Kreirajte novi racun         *");
		System.out.println("*2 - Transfer novca               *");
		System.out.println("*3 - Podiznanje novca             *");
		System.out.println("*4 - Polog novca                  *");
		System.out.println("*5 - Stanje na racunu             *");
		System.out.println("*---------------------------------*");
		int korisnik = unos.nextInt();
		ArrayList<KreiranjeRacuna> Racuni = new ArrayList<KreiranjeRacuna>();
		KreiranjeRacuna cust1 = new KreiranjeRacuna("Emir", "Prezime", 100001);
		KreiranjeRacuna cust2 = new KreiranjeRacuna("Emir", "Prezime", 100002);
		// Static je variabla i svaki put kad se kreira novu account ide +1 tako da nema
		// duplikata i svaki je zaseban
		Racuni.add(cust1);
		Racuni.add(cust2);
		switch (korisnik) {
		case 1:
			System.out.println("Unesite vase ime");
			cust1.setime(unos.next());
			System.out.println("Unesite vase prezime");
			cust1.setprezime(unos.next());
			System.out.println("Broj vaseg racuna je " + cust1.getbrracuna());
			Racuni.add(cust1);
			System.out.println(
					"Vasa pocetnicka suma novca je minimalan polog koji ste uplatili za kreiranje racuna : 10KM");
			System.out.println("Vas broj racuna je : " + cust1.getbrracuna());
			break;
		case 2:
			System.out.println("Unesite broj prvog racuna");
			transfernovca.PrebacivanjeNovca(Racuni, unos.nextInt());
			break;
		case 3:
			System.out.println("Unesite broj racuna");
			int brracuna = unos.nextInt();
			transfernovca.Withdraw(Racuni, brracuna);
			System.out.println("Hvala vam na povjerenju i koristenju nase banke");
			break;
		case 4:
			System.out.println("Unesite broj racuna");
			int dodaj = unos.nextInt();
			transfernovca.deposit(Racuni, dodaj);
			break;
		case 5:
			System.out.println("Unesite broj racuna");
			System.out.println("Stanje na vasem racunu je : " + provjera.StanjeNaRacunu(Racuni, unos.nextInt()) + "KM");
			
			break;
		}
		System.out.println(cust1.getiznos());
		System.out.println(cust2.getiznos());
	}

}

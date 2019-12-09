import java.util.ArrayList;
import java.util.Scanner;

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
		

	

	public static double StanjeNaRacunu(ArrayList<KreiranjeRacuna> Racuni, int broj) {
		ProvjeraUnosaRacunaDeposit(Racuni,broj);
		int brojracuna = checkacc(Racuni, broj);

		if (brojracuna != 0) {
			for (int i = 0; i < Racuni.size(); i++) {
				if (brojracuna == Racuni.get(i).getbrracuna())
					return Racuni.get(i).getiznos();
			}
		}
		return 0;
	}
	public static int ProvjeraUnosaRacunaDeposit(ArrayList<KreiranjeRacuna> Racuni,int broj) {
	  
		int brojracuna = checkacc( Racuni,broj);
		
		while(brojracuna == 0) {
			System.out.println("Pogresan ili nepostojeci racun molimo pokusajte ponovo ili pritisnite 1 da prekinete");
			broj=unos.nextInt();
			brojracuna = checkacc( Racuni,broj);
			if (broj == 1) {
				break;
			}
		   
		}
		return brojracuna;
	}

}

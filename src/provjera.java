import java.util.ArrayList;
import java.util.Scanner;

public class provjera {
	Scanner unos = new Scanner(System.in);

	public static int checkacc(ArrayList<KreiranjeRacuna> Racuni, int broj) {
		
		for (int i = 0; i < Racuni.size(); i++) {
			
			if (broj == Racuni.get(i).getbrracuna()) {
				int test = Racuni.get(i).getbrracuna();
				return test;
			}
		}
		return 0;

	}

}

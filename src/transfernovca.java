import java.util.*;

public class transfernovca {

	static Scanner unos = new Scanner(System.in);
	

	public static void deposit(ArrayList<KreiranjeRacuna> Racuni, int broj) {
		
		int check = provjera.checkacc(Racuni, broj);
		if(check != 0) {
			System.out.println("Drugi");
			for(int i = 0 ; i < Racuni.size(); i++) {
				if(Racuni.get(i).getbrracuna()== check) {
					System.out.println("Unesite broj para koji zelite da depositujete");
					Racuni.get(i).setiznos(Racuni.get(i).getiznos() + unos.nextInt());

				}
			}
		}

	}
	public static void Withdraw(ArrayList<KreiranjeRacuna> Racuni, int broj) {
		int check = provjera.checkacc(Racuni, broj);
		if (check !=0) {
			for (int i = 0 ; i < Racuni.size(); i++) {
				if (Racuni.get(i).getbrracuna()== check) {
					System.out.println("Unesite koliko para zelite podignuti");
					Racuni.get(i).setiznos(Racuni.get(i).getiznos()-unos.nextInt());
				}
			}
		}
	}



}

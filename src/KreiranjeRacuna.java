
public class KreiranjeRacuna {
	private int brojracuna;
	private String ime;
	private String prezime;
	private double iznos;
	private String password;

	KreiranjeRacuna(String ime, String prezime, int brojracuna) {
		this.iznos = 100;
		this.ime = ime;
		this.prezime = prezime;

		this.brojracuna = brojracuna;
	}

	public void setbrojracuna(int brojracuna) {
		this.brojracuna = brojracuna;
	}

	public void setime(String ime) {
		this.ime = ime;
	}

	public void setprezime(String prezime) {
		this.prezime = prezime;
	}

	public void setiznos(double iznos) {
		this.iznos = iznos;
	}

	public int getbrracuna() {
		return this.brojracuna;
	}

	public String getime() {
		return ime;
	}

	public String getprezime() {
		return prezime;
	}

	public double getiznos() {
		return iznos;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	public String getpass() {
		return password;
	}

}

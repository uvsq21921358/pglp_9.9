package uvsq21921358;

public class Carre implements Forme{
	
	private double longeur;
	private double largeur;
	
	public Carre( double longeur, double largeur) {
		this.longeur=longeur;
		this.largeur=largeur;
	}
	
	
	@Override
	public String toString() {
		return "Carre (" + ", longeur=" + longeur + ", largeur=" + largeur + ")";
	}

	public void move(double x, double y) {
				
	}
	
	public void affiche() {
		Affichage affichage=new Affichage();
		affichage.afficher(this.toString());
	}
	
}

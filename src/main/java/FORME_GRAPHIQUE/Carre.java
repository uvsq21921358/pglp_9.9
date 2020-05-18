package FORME_GRAPHIQUE;

/**
 * 
 * @author Nayima
 * La classe Carré initialisée avec son nom, l'origine de type point2D et le coté.
 *
 */
public class Carre implements Forme{  
	
	private String nomCarre;
	private Point2D origine;
	private double cote;
		
	public Carre(String nomCarre,double x, double y, double cote) {
		this.nomCarre = nomCarre;
		this.origine =new Point2D("origine",x,y);
		this.cote = cote;
	}

	/**
	 * Methode d'affichage du type carre
	 */
	@Override
	public String toString() {
		return "Carre (origine= (" + origine.getX() + ";" + origine.getY() + "), cote=" + cote + ")";
	}


	public String getNomCarre() {
		return nomCarre;
	}

	public void setNomCarre(String nomCarre) {
		this.nomCarre = nomCarre;
	}

	public Point2D getOrigine() {
		return origine;
	}

	public void setOrigine(Point2D origine) {
		this.origine = origine;
	}

	public double getCote() {
		return cote;
	}

	public void setCote(double cote) {
		this.cote = cote;
	}

	
	/**
	 * Methode de deplacement du carre
	 * @param x
	 * @param y
	 * @param z
	 */
	public void move(double x, double y) {
		origine.move(x,y);

	}
	
	/**
	 * Methode d'affichage d'un carre
	 */
	/*public void affiche() {
		Affichage affichage=new Affichage();
		affichage.afficher(this.toString());
	}*/

	@Override
	public void print() {
		Affichage affichage=new Affichage();
		affichage.afficher(this.toString());
		
	}

	@Override
	public String getNom() {

		return getNomCarre();
	}

	
	
}

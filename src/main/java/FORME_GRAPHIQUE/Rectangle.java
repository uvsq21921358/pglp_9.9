package FORME_GRAPHIQUE;

public class Rectangle implements Forme {

	private String nomR;
	private Point2D origineR;
	private double Longueur;
	private double Largeur;
	
	public Rectangle(String nomR, double x, double y ,double longueur, double largeur) {
		this.nomR = nomR;
		this.origineR = new Point2D("origine Rectangle",x,y);
		Longueur = longueur;
		Largeur = largeur;
	}

	
	@Override
	public String toString() {
		return "Rectangle (origine=" + origineR.getX() + ";" + origineR.getY() + "),Longueur=" + Longueur + ", Largeur=" + Largeur + ")";
	}


	public String getNomR() {
		return nomR;
	}


	public void setNomR(String nomR) {
		this.nomR = nomR;
	}


	public Point2D getOrigineR() {
		return origineR;
	}


	public void setOrigineR(Point2D origineR) {
		this.origineR = origineR;
	}


	public double getLongueur() {
		return Longueur;
	}


	public void setLongueur(double longueur) {
		Longueur = longueur;
	}


	public double getLargeur() {
		return Largeur;
	}


	public void setLargeur(double largeur) {
		Largeur = largeur;
	}


	@Override
	public void move(double x, double y) {
		origineR.move(x,y);		
	}
	
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
		return getNomR();
	}


	
	
}

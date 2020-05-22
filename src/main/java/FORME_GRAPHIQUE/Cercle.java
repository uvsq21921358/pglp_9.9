/**
 * 
 */
package FORME_GRAPHIQUE;

/**
 * @author SIMPORE
 * Cette classe initiale un cercle avec un nom, un centre de de type point et un rayon. 
 * Elle est contituee  des  methodes:
 * move qui permet de faire deplacer le centre c'est a dire mettre a jour les coordonn�es et de
 * affiche qui permet d'afficher les informations ou la mise a jour
 *
 */
public class Cercle implements Forme{ 

	private String nomC;
	private Point2D centre;
	private double rayon; 
	
	public Cercle(String nomC, double x, double y, double rayon) {
		this.nomC=nomC;
		this.centre = new Point2D("Centre",x,y);
		this.rayon = rayon;
	}
	

	/**
	 * Methode de deplacement du cercle
	 */
	public void move(double x, double y) {
		this.centre.setX(this.centre.getX()+x);
	    this.centre.setY(this.centre.getY()+y);
	}
	
	/**
	 * Syntaxe à afficher lors de la saisie d'un cercle
	 */
	@Override
	public String toString() {
		return "Cercle(centre= (" +centre.getX() + "," +centre.getY() + "), rayon=" + rayon + ")";
	}


	public String getNomC() {
		return nomC;
	}


	public void setNomC(String nomC) {
		this.nomC = nomC;
	}


	public Point2D getCentre() {
		return centre;
	}


	public void setCentre(Point2D centre) {
		this.centre = centre;
	}


	public double getRayon() {
		return rayon;
	}


	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	/**
	 * Cette classe permettait d'afficher l
	 */
	/*public void affiche() {
		Affichage affichage=new Affichage();
		affichage.afficher(this.toString());
	}*/

	/**
	 * Methode d'affichage du cercle
	 */
	@Override
	public void print() {
		Affichage affichage=new Affichage();
		affichage.afficher(this.toString());
		
	}

	/*
	 * Methode qui permet de retourner le nom de la forme. Ici c'est le cercle 
	 */
	@Override
	public String getNom() {
		return getNomC();
	}



}

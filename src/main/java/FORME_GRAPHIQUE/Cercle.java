/**
 * 
 */
package FORME_GRAPHIQUE;

/**
 * @author SIMPORE
 * Cette classe initiale un cercle avec un nom, un centre de point et un rayon. 
 * Elle est contituée des méthodes:
 * move qui permet de faire deplacer le centre c'est a dire mettre à jour les coordonnées et de
 * affiche qui permet d'afficher les informations ou la mise à jour
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
	

	public void move(double x, double y) {
		this.centre.setX(this.centre.getX()+x);
	    this.centre.setY(this.centre.getY()+y);
	}
	
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


	@Override
	public void print() {
		Affichage affichage=new Affichage();
		affichage.afficher(this.toString());
		
	}


	@Override
	public String getNom() {
		return getNomC();
	}



}

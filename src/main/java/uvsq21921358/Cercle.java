/**
 * 
 */
package uvsq21921358;

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
		this.centre = new Point2D(x,y);
		this.rayon = rayon;
	}
	

	public void move(double x, double y) {
		centre.move(x, y);	
	}
	
	@Override
	public String toString() {
		return "Cercle(centre= (" +centre.x + "," +centre.y + "), rayon=" + rayon + ")";
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


	public void affiche() {
		Affichage affichage=new Affichage();
		affichage.afficher(this.toString());
	}

}

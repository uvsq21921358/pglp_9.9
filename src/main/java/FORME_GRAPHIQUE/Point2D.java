package FORME_GRAPHIQUE;

/**
 * @author SIMPORE
 * Cette classe permet d'initialiser un point. Elle sera utiliser dans la classe Cercle pour l'initialisation du centre, egalement dans la classe carre.
 *
 */
public class Point2D {
	
	private String nom;
	private double x;
	private double y;
	
	public Point2D (String nom,double x,double y) {
		this.nom=nom;
	    this.x = x;
	    this.y = y;
	}

	/**
	 * Methode de return du tostring
	 */
	@Override
	public String toString() {
		return "Point [nom=" + nom + ", x=" + x + ", y=" + y + "]";
	}
	
	/**
	 * Methode move pour le deplacement d'un point
	 * @param a
	 * @param b
	 */
	public void move(double a, double b) {
		setX(getX()+a);
		setY(getY()+b);
	}

	/**
	 * les geteurs et les seteurs 
	 * @return
	 */
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	

}

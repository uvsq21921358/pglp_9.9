package uvsq21921358;

/**
 * @author SIMPORE
 * Cette classe permet d'initialiser un point. Elle sera utiliser dans la classe Cercle pour l'initialisation du centre.
 *
 */
public class Point2D implements Forme{
	
	double x,y;
	
	public Point2D (double x,double y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public String toString() {
		return "Point [ x=" + x + ", y=" + y + "]";
	}

	public void move(double a, double b) {
		x=x+a;
		y=y+b;
	}

}

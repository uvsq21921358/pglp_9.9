package FORME_GRAPHIQUE;
/**
 * 
 * @author SIMPORE
 *La classe triangle est initialise avec un nom, et 3 points. Pour cette forme, le deplacement se fait sur les 3 points.
 */

public class Triangle implements Forme{

	private String NomT;
	private Point2D P1;
	private Point2D P2;
	private Point2D P3;
	
	public Triangle(String NomT, double a, double b, double c, double d, double e, double f) {
		this.P1 = new Point2D("origineP1",a,b);
		this.P2 = new Point2D("origineP2",c,d);
		this.P3 = new Point2D("origineP3",e,f);
	}

	public String getNomT() {
		return NomT;
	}

	public void setNomT(String nomT) {
		NomT = nomT;
	}

	public Point2D getP1() {
		return P1;
	}

	public void setP1(Point2D p1) {
		P1 = p1;
	}

	public Point2D getP2() {
		return P2;
	}

	public void setP2(Point2D p2) {
		P2 = p2;
	}

	public Point2D getP3() {
		return P3;
	}

	public void setP3(Point2D p3) {
		P3 = p3;
	}

	/**
	 * Syntaxe à afficher lors de la saisie d'un triangle
	 */
	@Override
	public String toString() {
		return "Triangle ( P1= (" + P1.getX() + ";" + P1.getY() +"), P2=(" + P2.getX() + ";" + P2.getY() +"), P3=(" + P3.getX() + ";" + P3.getY() +"))";
	}

	/**
	 * Methode de deplacement du triangle
	 */
	@Override
	public void move(double x, double y) {
		P1.move(x, y);
		P2.move(x, y);
		P3.move(x, y);	
	}
	
	/*public void affiche() {
		Affichage affichage=new Affichage();
		affichage.afficher(this.toString());
	}*/

	/**
	 * Methode d'affichage du triangle
	 */
	@Override
	public void print() {
		Affichage affichage=new Affichage();
		affichage.afficher(this.toString());
	}

	/*
	 * Methode qui permet de retourner le nom de la forme. Ici c'est le triangle 
	 */
	@Override
	public String getNom() {

		return getNomT();
	}


	
}

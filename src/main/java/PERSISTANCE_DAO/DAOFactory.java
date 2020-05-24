package PERSISTANCE_DAO;
/**
 * Classe abstraite DAOFactory qui permettra de faire appelle à la méthode adéquate sur la forme demandé
 */
import FORME_GRAPHIQUE.Carre;
import FORME_GRAPHIQUE.Cercle;
import FORME_GRAPHIQUE.Rectangle;
import FORME_GRAPHIQUE.Triangle;

public abstract class DAOFactory {

	public static DAO<Cercle> getCercleDAO() {
		return new CercleDAO();
	}
	
	public static DAO<Carre> getCarreDAO() {
		return new CarreDAO();
	}
	
	public static DAO<Rectangle> getRectangleDAO() {
		return new RectangleDAO();
	}
	
	public static DAO<Triangle> getTriangleDAO() {
		return new TriangleDAO();
	}
	
	/*public enum DAOType { CERCLE,CARRE };
	public abstract  DAO<Cercle> getCercle();
	public abstract  DAO<Carre> getCarre();
	
	public  DAO<Cercle> getFactory(DAOType type) {
		if (type == DAOType.CERCLE) { 
			return DAO<Cercle> new CercleDAO();
		}
		if (type == DAOType.CARRE){ 
			return (Forme)new CarreDAO();
		}
		return null;
	
	}*/
	
}

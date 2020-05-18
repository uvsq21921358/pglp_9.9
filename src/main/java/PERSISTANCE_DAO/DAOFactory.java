package PERSISTANCE_DAO;

import FORME_GRAPHIQUE.Carre;
import FORME_GRAPHIQUE.Cercle;
import FORME_GRAPHIQUE.Forme;

public abstract class DAOFactory {

	public enum DAOType { CERCLE,CARRE };
	public static  DAO<Cercle> getCercleDAO() {
		// TODO Auto-generated method stub
		return null;
	}
	public abstract  DAO<Carre> getCarre();
	
	public static Forme getFactory(DAOType type) {
		if (type == DAOType.CERCLE) { 
			return (Forme) new CercleDAO();
		}
		if (type == DAOType.CARRE){ 
			return (Forme)new CarreDAO();
		}
		return null;
	
	}
	
}

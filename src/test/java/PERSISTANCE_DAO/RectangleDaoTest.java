package PERSISTANCE_DAO;

import static org.junit.Assert.*;

import org.junit.Test;

import FORME_GRAPHIQUE.Rectangle;
import PERSISTANCE_DAO.DAO;
import PERSISTANCE_DAO.RectangleDAO;
/**
 * test d'implementation de la  creation d'un rectagle
 * @author utilisateur
 *
 */
public class RectangleDaoTest {

	@Test 
	public void createTest() {
		Rectangle Rect=new Rectangle ("Mon_Rect", 1,1,8,4);
		DAO<Rectangle> DR1= new RectangleDAO();
		DR1.create(Rect);
	}

}

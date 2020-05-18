package uvsq21921358;

import static org.junit.Assert.*;

import org.junit.Test;

import FORME_GRAPHIQUE.Rectangle;
import PERSISTANCE_DAO.DAO;
import PERSISTANCE_DAO.RectangleDAO;

public class RectangleDaoTest {

	@Test 
	public void createTest() {
		Rectangle Rect=new Rectangle ("Mon_Rect", 1,1,8,4);
		DAO<Rectangle> DR1= new RectangleDAO();
		DR1.create(Rect);
	}

}

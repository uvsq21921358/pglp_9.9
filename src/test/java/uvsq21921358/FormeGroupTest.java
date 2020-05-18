package uvsq21921358;

import static org.junit.Assert.*;

import org.junit.Test;

import FORME_GRAPHIQUE.Carre;
import FORME_GRAPHIQUE.Cercle;
import FORME_GRAPHIQUE.FormeGroup;
import FORME_GRAPHIQUE.Rectangle;
import FORME_GRAPHIQUE.Triangle;

public class FormeGroupTest {

	/**
	 * Implementation de creation de groupe de cercle
	 */
	/*@Test
	public void AddCercletest() { 
		Cercle C1=new Cercle(null, 0,0,3);
		Cercle C2=new Cercle(null, 1,2,3);
		FormeGroup fg=new FormeGroup();
		fg.addForme(C1);
		fg.addForme(C2);
		System.out.println(fg.formeList.size()); 
	}
	 
	/**
	 * Implementation du deplacement de groupe de cercle
	 */
	/*@Test() 
	public void MoveCercleTest() { 
		Cercle C1=new Cercle(null, 0,0,3);
		Cercle C2=new Cercle(null, 1,2,3);
		FormeGroup fg=new FormeGroup();
		fg.addForme(C1);
		fg.addForme(C2);
		fg.move(2, 1);
		
		fg.AffichonsGroup();
		
	}
	
	/**
	 * Implementation de creation de groupe de carre
	 */
	/*@Test
	public void AddCarretest() {
		Carre C1=new Carre(null, 0,0,3);
		Carre C2=new Carre(null, 1,2,3);
		FormeGroup fg=new FormeGroup();
		fg.addForme(C1);
		fg.addForme(C2);
		System.out.println(fg.formeList.size());
	}
	
	/**
	 * Implementation du deplacement de groupe de carre
	 */
	/*@Test()
	public void MoveCarreTest() { 
		Carre C1=new Carre(null, 0,0,3);
		Carre C2=new Carre(null, 1,2,3);
		FormeGroup fg=new FormeGroup();
		fg.addForme(C1);
		fg.addForme(C2);
		fg.move(2, 1);
		
		fg.AffichonsGroup();
		
	}
	
	/**
	 * Implementation de creation de groupe de Rectangle
	 */
	/*@Test
	public void AddRectangletest() {
		Rectangle R1=new Rectangle(null, 0,0,6,3);
		Rectangle R2=new Rectangle(null, 1,1,8,4);
		FormeGroup fg=new FormeGroup();
		fg.addForme(R1);
		fg.addForme(R2);
		System.out.println(fg.formeList.size());
	}
	
	/**
	 * Implementation du deplacement de groupe de rectangle
	 */
	/*@Test()
	public void MoverectangleTest() { 
		Rectangle R1=new Rectangle(null, 0,0,6,3);
		Rectangle R2=new Rectangle(null, 1,1,8,4);
		FormeGroup fg=new FormeGroup();
		fg.addForme(R1);
		fg.addForme(R2);
		fg.move(2, 1);
		
		fg.AffichonsGroup();
		
	}
	
	/**
	 * Implementation de creation de groupe de Triangle
	 */
	/*@Test
	public void AddTriangletest() {
		Triangle T1 =new Triangle (null,0,2,3,3,5,6);
		Triangle T2 =new Triangle (null,1,3,3,4,5,6);
		FormeGroup fg=new FormeGroup();
		fg.addForme(T1);
		fg.addForme(T2);
		System.out.println(fg.formeList.size());
	}
	
	/**
	 * Implementation du deplacement de groupe de Triangle
	 */
	/*@Test()
	public void MoveTriangleTest() { 
		Triangle T1 =new Triangle (null,1,2,3,4,5,6);
		Triangle T2 =new Triangle (null,1,2,3,4,5,6);
		FormeGroup fg=new FormeGroup();
		fg.addForme(T1);
		fg.addForme(T2);
		fg.move(2, 1);
		
		fg.AffichonsGroup();
		
	}
	
	/**
	 * Implementation de creation de groupe de cercle, carre , Rectangle et triangle
	 */
	/*@Test
	public void AddGrouptest() {
		Carre Ca1=new Carre(null, 0,0,3);
		Carre Ca2=new Carre(null, 1,2,3);
		Cercle Ce1=new Cercle(null, 0,0,3);
		Cercle Ce2=new Cercle(null, 1,2,3);
		Triangle T1 =new Triangle (null,0,2,3,3,5,6);
		Triangle T2 =new Triangle (null,1,3,3,4,5,6);
		FormeGroup fg=new FormeGroup();
		fg.addForme(Ca1);
		fg.addForme(Ca2);
		fg.addForme(Ce1);
		fg.addForme(Ce2);
		fg.addForme(T1);
		fg.addForme(T2);
		System.out.println(fg.formeList.size());
		fg.AffichonsGroup();
	}
	
	/**
	 * Implementation du deplacement de groupe de cercle, carre , rectangle et triangle
	 */
	@Test()
	public void MoveGroupTest() { 
		Carre Ca1=new Carre(null, 0,0,3);
		Carre Ca2=new Carre(null, 1,2,3);
		Cercle Ce1=new Cercle(null, 0,0,3);
		Cercle Ce2=new Cercle(null, 1,2,3);
		Triangle T1 =new Triangle (null,0,2,3,3,5,6);
		Triangle T2 =new Triangle (null,1,3,3,4,5,6);
		FormeGroup fg=new FormeGroup();
		fg.addForme(Ca1);
		fg.addForme(Ca2);
		fg.addForme(Ce1);
		fg.addForme(Ce2);
		fg.addForme(T1);
		fg.addForme(T2);
		fg.move(2, 1);
		
		fg.AffichonsGroup();
		
	}
}

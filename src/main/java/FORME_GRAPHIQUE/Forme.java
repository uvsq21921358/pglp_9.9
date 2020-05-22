package FORME_GRAPHIQUE;
/**
 * 
 * @author SIMPORE
 *Interface graphique Forme pour la définition de toutes les autres formes
 */
public interface Forme {
	
	void move(double x, double y);
	  void print();
	  String getNom();

}

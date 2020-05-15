package uvsq21921358;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FormeGroup implements Forme{
	
	public List<Forme> formeList;
	
	public FormeGroup() {
		formeList = new ArrayList<Forme>();
	}
	
	public void addForme(Forme f) {
		formeList.add(f);
	}
	
	public void removeForme(Forme f) {
		formeList.remove(f);
	}
	
	public List<Forme> getAllForme() {
		return formeList;
	}
	
	public Iterator<Forme> iterator() {
		return formeList.listIterator();
	}

	public void move(double x, double y) {
		for (Forme form : formeList) {
			form.move(x,y);
		}
		
	}
	
	public void AffichonsGroup() {
		for (int i=0; i<formeList.size();i++) {
			System.out.println(formeList.get(i));
		}
	}

}

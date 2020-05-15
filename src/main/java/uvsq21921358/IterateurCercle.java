package uvsq21921358;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class IterateurCercle implements Iterator<Forme>{
	
	private FormeGroup racine;
	protected Collection<Forme> collection;
	public IterateurCercle(FormeGroup racine, Collection<Forme> collection) {
		this.racine = racine;
		this.collection = collection;
		this.collection.addAll(racine.getAllForme());
	}
	
	public boolean hasNext() {
		return !collection.isEmpty();
	}
	
	/*public Forme next() {
		if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Forme F = getFromCollection();
        if(F.isGroupe()) {
        	collection.addAll(((FormeGroup) F).getAllForme());
        }
		return F;
	}
	abstract protected Forme getFromCollection();
	public Forme getRacine() {
		return racine;
	}*/
	
}

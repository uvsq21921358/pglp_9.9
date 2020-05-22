package PERSISTANCE_DAO;

import java.util.List;
/**
 * Interface DAO. Elle sera redefinit pour chaque forme suivant des parmètres precis.
 * @author SIMPORE
 *
 * @param <T>
 */
public interface DAO<T>{
	
	T create(T obj);
	T read(String id);
	T update(T obj);
	void delete(T obj);
	abstract List<T> findAll();
}

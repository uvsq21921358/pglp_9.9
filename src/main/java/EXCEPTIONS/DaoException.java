package EXCEPTIONS;

public class DaoException extends Exception {

	public DaoException (String name) {
		System.out.println("Erreur avec la Base de donnée : \"" + name+ "\"");
	}
}

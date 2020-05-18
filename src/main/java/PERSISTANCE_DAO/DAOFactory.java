package uvsq21921358;

public class DAOFactory {

	public DAO<Cercle> cercle(){
		return new CercleDAO();
	}
}

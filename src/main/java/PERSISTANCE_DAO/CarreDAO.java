package PERSISTANCE_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import FORME_GRAPHIQUE.Carre;
import FORME_GRAPHIQUE.Cercle;

public class CarreDAO implements DAO<Carre>{

	private static String base = Connexion.base;
	
	@Override
	public Carre create(Carre obj) { 
		try (Connection connect = DriverManager.getConnection(base)){
			PreparedStatement prepare = connect.prepareStatement("INSERT INTO Carre (nomCarre, x, y, cote) VALUES (?, ?, ?, ?)");
			prepare.setString(1, obj.getNomCarre());
			prepare.setDouble(2, obj.getOrigine().getX());
			prepare.setDouble(2, obj.getOrigine().getY());
			prepare.setDouble(1, obj.getCote());
			System.out.println("Creation reussie " + obj);
			int result = prepare.executeUpdate();
			assert result == 1; 
		}
		catch (SQLException e){
			e.printStackTrace(); 
		}
		return obj;
	}

	@Override
	public Carre read(String id) {
		Carre CAR1 = null;
		try (Connection connect = DriverManager.getConnection(base)){
			System.out.println(" Recherche " + id);
			PreparedStatement prepare = connect.prepareStatement("SELECT * FROM Carre WHERE nomCarre = ?");
			prepare.setString(1, id);
			ResultSet result = prepare.executeQuery();
			if(result.next()){
				CAR1 = new Carre(result.getString("nomCarre"),result.getDouble("x"), result.getDouble("y"),result.getDouble("cote"));
				result.close();
			}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return CAR1;
	}

	@Override
	public Carre update(Carre obj) {
		try (Connection connect = DriverManager.getConnection(base)) {
			PreparedStatement prepare = connect.prepareStatement("UPDATE Carre "+ "SET x = ? and y = ? and cote = ?"+ "WHERE nomCarre = ?");
			prepare.setDouble(1, obj.getOrigine().getX());
			prepare.setDouble(2, obj.getOrigine().getY());
			prepare.setString(3, obj.getNomCarre());
			int result = prepare.executeUpdate();
			assert result == 1;
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		System.out.println("Mise A Jour " + obj);
		return obj;
	}

	@Override
	public void delete(Carre obj) {
		try (Connection connect = DriverManager.getConnection(base)){
			PreparedStatement prepare = connect.prepareStatement("DELETE FROM Carre "+ "WHERE nomCarre = ?");
			prepare.setString(1, obj.getNomCarre());
			int result = prepare.executeUpdate();
			assert result == 1;
			System.out.println("Suppression reussie " + obj);
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Carre> findAll() {
		 List<Carre> liste = new ArrayList<>();
			try (Connection connect = DriverManager.getConnection(base)){
				PreparedStatement prepare = connect.prepareStatement("SELECT FROM Carre "+ "WHERE nomCarre = ?");
				ResultSet result = prepare.executeQuery();
		      while(result.next()){
		        liste.add(new Carre(result.getString("nomCarre"),result.getDouble("x"), result.getDouble("y"),result.getDouble("cote")));
		      }
		    
		    }catch(Exception e){
		      e.printStackTrace();
		    }
		  
		    return liste;
	}

}

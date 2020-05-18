package PERSISTANCE_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import FORME_GRAPHIQUE.Cercle;

public class CercleDAO implements DAO<Cercle>{

	private static String base = Connexion.base;

	@Override
	public Cercle create(Cercle obj) {
		try (Connection connect = DriverManager.getConnection(base)){
			PreparedStatement prepare = connect.prepareStatement("INSERT INTO Cercle (nomC, x, y, rayon)" +"VALUES (?, ?, ?, ?)");
			prepare.setString(1, obj.getNomC());
			prepare.setDouble(2, obj.getCentre().getX());
			prepare.setDouble(3, obj.getCentre().getY());
			prepare.setDouble(4, obj.getRayon());
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
	public Cercle read(String id) {
		Cercle C1 = null;
		try (Connection connect = DriverManager.getConnection(base)){
			System.out.println(" Recherche " + id);
			PreparedStatement prepare = connect.prepareStatement("SELECT * FROM Cercle WHERE nomC = ?");
			prepare.setString(1, id);
			ResultSet result = prepare.executeQuery();
			if(result.next()){
				C1 = new Cercle(result.getString("nomC"),result.getDouble("x"), result.getDouble("y"),result.getDouble("Rayon"));
				result.close();
			}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return C1;
	}

	@Override
	public Cercle update(Cercle obj) {
		try (Connection connect = DriverManager.getConnection(base)) {
			PreparedStatement prepare = connect.prepareStatement("UPDATE Cercle SET x = ? and y = ? and rayon = ? WHERE nomC = ?");
			prepare.setDouble(2, obj.getCentre().getX());
			prepare.setDouble(3, obj.getCentre().getY());
			prepare.setDouble(4, obj.getRayon());
			prepare.setString(1, obj.getNomC());
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
	public void delete(Cercle obj) {
		try (Connection connect = DriverManager.getConnection(base)){
			PreparedStatement prepare = connect.prepareStatement("DELETE FROM Cercle "+ "WHERE nomC = ?");
			prepare.setString(1, obj.getNomC());
			int result = prepare.executeUpdate();
			assert result == 1;
			System.out.println("Suppression reussie " + obj);
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		
	}


	@Override
	public List<Cercle> findAll() {
		 List<Cercle> liste = new ArrayList<>();
			try (Connection connect = DriverManager.getConnection(base)){
				PreparedStatement prepare = connect.prepareStatement("SELECT FROM Cercle "+ "WHERE nomC = ?");
				ResultSet result = prepare.executeQuery();
		      while(result.next()){
		        liste.add(new Cercle(result.getString("nomC"),result.getDouble("x"), result.getDouble("y"),result.getDouble("rayon")));
		      }
		    
		    }catch(Exception e){
		      e.printStackTrace();
		    }
		  
		    return liste;
		  }
	}

	


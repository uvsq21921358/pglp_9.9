package uvsq21921358;

import static org.junit.Assert.*;

import org.junit.Test;

import CMD.CommandCercle;
import CMD.CommandPrint;
import CMD.CommandRedo;
import CMD.CommandUndo;
import CMD.Interpreteur;

public class CommandRedoTest {

	@Test
	  public void execute() throws Exception {
	    Interpreteur interprete = new Interpreteur();
	    interprete.setParametersT(new String[]{"c7", "2", "2", "6"});
	    CommandCercle Cercle = new CommandCercle(interprete);
	    Cercle.execute();
	    interprete.setParametersT(new String[]{"c8", "5", "5", "2"});
	    Cercle = new CommandCercle(interprete);
	    Cercle.execute();
	    CommandPrint commande = new CommandPrint(interprete);
	    commande.execute();
	    CommandUndo commandeUndo = new CommandUndo(interprete);
	    commandeUndo.execute();
	    commande = new CommandPrint(interprete);
	    commande.execute();
	    CommandRedo commandeRedo = new CommandRedo(interprete);
	    commandeRedo.execute();
	    commande = new CommandPrint(interprete);
	    commande.execute();
	  }

}

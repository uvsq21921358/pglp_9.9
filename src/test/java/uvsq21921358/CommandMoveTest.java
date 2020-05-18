package uvsq21921358;

import static org.junit.Assert.*;

import org.junit.Test;

import CMD.CommandCercle;
import CMD.CommandPrint;
import CMD.Interpreteur;
import CMD.MoveCommand;

public class CommandMoveTest {

	 @Test
	  public void executeTest(){
	    Interpreteur interprete = new Interpreteur();
	    interprete.setParametersT(new String[]{"c5", "0", "0", "1"});
	    CommandCercle commandeCercle = new CommandCercle(interprete);
	    commandeCercle.execute();
	    interprete.setParametersT(new String[]{"c5", "50", "50"});
	    MoveCommand commandeMove = new  MoveCommand (interprete);
	    commandeMove.execute();
	    CommandPrint comAff=new CommandPrint(interprete); 
		comAff.execute();
	  }


}

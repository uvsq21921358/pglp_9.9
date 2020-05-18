package uvsq21921358;

import org.junit.Test;

import CMD.CommandCarre;
import CMD.CommandPrint;
import CMD.Interpreteur;
import FORME_GRAPHIQUE.FormeGroup;

public class CommandCarraTest {

	@Test
	public void executeTest() {
		
		FormeGroup form=new FormeGroup();
		Interpreteur inter=new Interpreteur();
		inter.setParametersT(new String[] {"Mon_carre@", "0","0","4"});
		CommandCarre com=new CommandCarre(inter);
		com.execute(); 
		CommandPrint comAff=new CommandPrint(inter); 
		comAff.execute();
	}
	
	@Test
	public void erreurSaisi_Parametre_Test() {
		FormeGroup form1=new FormeGroup();
		Interpreteur inter=new Interpreteur();
		inter.setParametersT(new String[] {"Mon_Carree@","0","3"});
		CommandCarre com=new CommandCarre(inter);
		com.execute(); 
		CommandPrint comAff=new CommandPrint(inter); 
		comAff.execute();
	}
	
	@Test
	public void erreurSaisi__Test() {
		FormeGroup form1=new FormeGroup();
		Interpreteur inter=new Interpreteur();
		inter.setParametersT(new String[] {"Mon_Carree@","0","3","ddd"});
		CommandCarre com=new CommandCarre(inter);
		com.execute(); 
		CommandPrint comAff=new CommandPrint(inter); 
		comAff.execute();
	}
}

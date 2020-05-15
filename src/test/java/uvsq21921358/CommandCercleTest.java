package uvsq21921358;

import static org.junit.Assert.*;

import org.junit.Test;

public class CommandCercleTest {

	@Test
	public void executeTest() {
		FormeGroup form=new FormeGroup();
		CommandCercle com=new CommandCercle(new String[] {"C1","12","13","18"}, form);
		com.execute();
		form.AffichonsGroup();
	}

	@Test
	public void erreur1Test() {
		FormeGroup form1=new FormeGroup();
		CommandCercle com=new CommandCercle(new String[] {"C2","0"}, form1);
		com.execute();
		form1.AffichonsGroup();
	}
	
	@Test
	public void erreur2Test() {
		FormeGroup form2=new FormeGroup();
		CommandCercle com=new CommandCercle(new String[] {"C3","12","13","faux"}, form2);
		com.execute();
		form2.AffichonsGroup();
	}
}

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	
	@Test
	public void test_Kretanje_Komanda_f(){
	PlanetExplorer explorer=new PlanetExplorer(0,0,"N");
	String position=explorer.executeCommand("f");
	assertEquals("Not expected","1, 0",position);
	
	}
	
	@Test
	public void test_Kretanje_Komanda_b(){
	PlanetExplorer explorer=new PlanetExplorer(0,0,"N");
	String position=explorer.executeCommand("b");
	assertEquals("Not expected position","0, -1",position);
	}
	
	@Test
	public void test_Komanda_fl(){
		PlanetExplorer explorer=new PlanetExplorer(0,0,"N");
		String position=explorer.executeCommand("fl");
		assertEquals("Not expected position","1, 0, E", position);
	}
	@Test
	public void test_Komanda_bl(){
		PlanetExplorer explorer=new PlanetExplorer(0,0,"N");
		String position=explorer.executeCommand("bl");
		assertEquals("Not expected position","0, -1, E",position);
	}
	@Test
	public void test_Komanda_r(){
		PlanetExplorer explorer=
	}
	
}

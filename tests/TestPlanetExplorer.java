import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_Kretanje_Komanda_f(){
	PlanetExplorer explorer=new PlanetExplorer(100,100,"N");
	String expected=String.valueOf(explorer.executeCommand("f"));
	assertEquals("Not expected","1,0,N",expected);
	
	}
}

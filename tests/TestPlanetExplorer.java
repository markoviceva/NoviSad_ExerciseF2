import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_Kretanje_Komanda_f(){
	PlanetExplorer explorer=new PlanetExplorer(100,100,"(5,5),(7,8)");
	
	String expected=explorer.executeCommand("f");
	assertEquals("Not expected","1,0,N",expected);
	
	}
}

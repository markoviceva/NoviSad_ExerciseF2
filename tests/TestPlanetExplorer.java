import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_Kretanje_Komanda_f(){
	PlanetExplorer explorer=new PlanetExplorer(0,0,N);
	String expected=explorer.executeCommand("f");
	assertEquals("Not expected","1,0,N",expected);
	
	}
}

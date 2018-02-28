package JUnit;
import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void test() {
		assertEquals(true, testmain.joc(100, 100, 100, 10, 10, 10, 1)); // Ens assegurem que guanyi l'exèrcit de la xocolata.
		assertEquals(false, testmain.joc(50, 50, 50, 100, 100, 100, 2)); // Ens assegurem que guanyi l'exèrcit de la nata.
		assertEquals(true, testmain.joc(100, 100, 100, 120, 120, 120, 1)); // Deixem constància de que el número de tropes no ho és tot, també priva l'ordre dels d'atacs.
	}
}

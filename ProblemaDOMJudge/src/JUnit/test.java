package JUnit;
import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void test() {
		assertEquals(true, testmain.joc(100, 100, 100, 10, 10, 10, 1)); // Ens assegurem que guanyi l'ex�rcit de la xocolata.
		assertEquals(false, testmain.joc(50, 50, 50, 100, 100, 100, 2)); // Ens assegurem que guanyi l'ex�rcit de la nata.
		assertEquals(true, testmain.joc(100, 100, 100, 120, 120, 120, 1)); // Deixem const�ncia de que el n�mero de tropes no ho �s tot, tamb� priva l'ordre dels d'atacs.
	}
}

package controlador;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Pruebasmetodos {

	@Test
	void test() {
		
		Numero n = new Numero();
		boolean res = n.esNumero("3");
		assertTrue(res);
		
		n = new Numero();
		res = n.esNumero("a");
		assertFalse(res);
		
	}

}

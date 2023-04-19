import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCPF {
	
	CPF cpf = new CPF("112.321.453-78");

	@Test
	void testGetCPF() {
		assertEquals("112.321.453-78", cpf.getCPF());
	}

	@Test
	void testToString() {
		assertEquals("112.321.453-78", cpf.toString());
	}

	@Test
	void testIsValido() throws CpfInvalidoException {
		assertTrue(cpf.isValido());
	}

}

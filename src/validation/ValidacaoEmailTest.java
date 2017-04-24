package validation;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidacaoEmailTest {

	@Test
	public void test() {
		
		assertEquals(true, ValidacaoEmail.isEmail("teste@gmail.com"));
	}

}

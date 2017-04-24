package validation;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ValidacaoEmailTest {

	@Test
	public void test() {
		ValidacaoEmail email = new ValidacaoEmail();
		
		Assert.assertEquals(true, email.isEmail("a@gmail.com"));
	}

}

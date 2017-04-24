package validation;

import static org.junit.Assert.*;

import org.junit.Test;


public class ValidacaoCPFTest {

	ValidacaoCPF cpf = new ValidacaoCPF();
	
	@Test
	public void testeValidacao() 
	{		
		String teste = "121.722.636-21";
		
		teste = teste.replaceAll("[.-]","");
		
		assertEquals("12172263621", teste);
		
		//Assert.assertEquals(true, cpf.isCPF("12172263621"));
	}
}

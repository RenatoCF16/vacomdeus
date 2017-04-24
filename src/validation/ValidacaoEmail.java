package validation;

public class ValidacaoEmail 
{
	public static boolean isEmail(String email)
	{
		if(email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
			return true;
		
		return false;
	}
}

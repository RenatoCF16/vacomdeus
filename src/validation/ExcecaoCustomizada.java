package validation;

public class ExcecaoCustomizada extends Exception
{
	/*construtor que passa a mensagem para a classe herdadora*/
	public ExcecaoCustomizada(String msg)
	{
		super(msg);
	}
	
	/*
	public ExcecaoCustomizada(String msg, Throwable causa)
	{
		super(msg,causa);
	}*/
}

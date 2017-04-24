package general;

public enum StatusVoo 
{
	confirmado("O V�o est� na program��o correta"),
	cancelado("O V�o foi cancelado"),
	Atrasado("O V�o est� atrasado");
	
	/*mensagem que o tipo carrega*/
	private String mensagem;
	
	/*construtor da classe*/
	StatusVoo(String mensagem)
	{
		this.mensagem = mensagem;
	}
	
	/*retorna a mensagem da enumeracao*/
	public String getMensagem() 
	{
		return mensagem;
	}
}

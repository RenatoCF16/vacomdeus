
public enum StatusVoo 
{
	confirmado("O Vôo está na programção correta"),
	cancelado("O Vôo foi cancelado"),
	Atrasado("O Vôo está atrasado");
	
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

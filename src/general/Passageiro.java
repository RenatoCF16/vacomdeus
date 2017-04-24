package general;
import java.util.Date;

public class Passageiro 
{
	/*nome completo do passageiro*/
	private String nome;
	
	/*telefone do passageiro*/
	private String telefone;
	
	/*email do passageiro valido*/
	private String cpf;
	
	/*email do passageiro valido*/
	private String email;
	
	/*data de nascimento do passageiro*/
	private Date dataNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) 
	{
		this.cpf = cpf;		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}

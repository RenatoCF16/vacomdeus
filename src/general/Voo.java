package general;
import java.util.Date;

public class Voo 
{	
	
	//Declarações 
	
	/*numero de identicacao do voo*/
	private int idVoo;
	/*nome da companhia que realiza o trajeto*/
	private String companhiaAerea;
	/*numero de identificacao da aeronave*/
	private Aviao aviao;
	/*data de realizacao do voo*/
	private Date dataVoo;
	/*condicao em que o voo se encontra*/
	private StatusVoo statusVooo;
	/*ponto de partida do voo*/
	private String localOrigem;
	/*ponto de destino do voo*/
	private String localDestino;

	
	//Construtor do Voo já recebendo os dados
	public Voo(int idVoo, String companhiaAerea, Aviao aviao, Date dataVoo,  StatusVoo statusVooo, 
			String localOrigem, String localDestino) {
		
		this.idVoo = idVoo; 
		this.companhiaAerea = companhiaAerea;
		this.aviao = aviao; 
		this.dataVoo = dataVoo;
		this.statusVooo = statusVooo;
		this.localOrigem = localOrigem; 
		this.localDestino = localDestino;
	}
	
	//Construtor do Voo sem receber os dados
	public Voo() {
		
	}

	
	//Gets e Sets
	public int getIdVoo() {
		return idVoo;
	}

	public void setIdVoo(int idVoo) {
		this.idVoo = idVoo;
	}

	public String getCompanhiaAerea() {
		return companhiaAerea;
	}

	public void setCompanhiaAerea(String companhiaAerea) {
		this.companhiaAerea = companhiaAerea;
	}
public Aviao getAviao() {
		return aviao;
	}

	public void setAviao(Aviao aviao) {
		this.aviao = aviao;
	}

	public Date getDataVoo() {
		return dataVoo;
	}

	public void setDataVoo(Date dataVoo) {
		this.dataVoo = dataVoo;
	}

	public StatusVoo getStatusVooo() {
		return statusVooo;
	}

	public void setStatusVooo(StatusVoo statusVooo) {
		this.statusVooo = statusVooo;
	}

	public String getLocalOrigem() {
		return localOrigem;
	}

	public void setLocalOrigem(String localOrigem) {
		this.localOrigem = localOrigem;
	}

	public String getLocalDestino() {
		return localDestino;
	}

	public void setLocalDestino(String localDestino) {
		this.localDestino = localDestino;
	}		
}
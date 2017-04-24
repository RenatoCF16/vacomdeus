package persistence;

import java.util.ArrayList;
import java.util.Hashtable;

import general.*;

import general.Passageiro;

public class Voo {
	// TODO: uma hastable para cada voo
	
	private Hashtable<String, Passageiro> passageiros = new Hashtable<>();
	
	public void inserirPassageiro(String cpf, Passageiro passageiro)
	{
		passageiros.put(cpf, passageiro);
	}
}

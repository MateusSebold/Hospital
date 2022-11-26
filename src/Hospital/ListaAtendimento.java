package Hospital;

import java.util.ArrayList;
import java.util.List;

public class ListaAtendimento {
	
	protected Atendimento atendimento;
	List<Atendimento> listAtendimentos = new ArrayList<Atendimento>();
	
	public Atendimento getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}
	
	public void addLista() {
		listAtendimentos.add(atendimento);
	}
	
	public List<Atendimento> mostraLista(){ 
		for ( Atendimento Atendimento : listAtendimentos) {
		    return (List<Atendimento>) listAtendimentos;
		}
		return null;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ListaAtendimento [atendimento=");
		builder.append(atendimento);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}

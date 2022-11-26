package Hospital;

public class Atestado extends Operacao {
	
	private int cid;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public void emitirAtestado(Atendimento atendimento) {
		
		System.out.println("O Paciente foi atenido");
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atestado [cid=");
		builder.append(cid);
		builder.append("]");
		return builder.toString();
	}
	
	
}

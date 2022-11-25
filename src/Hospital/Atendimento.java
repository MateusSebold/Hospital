package Hospital;

public class Atendimento extends Operacao {
	
	private int prioridade;
	private int estado;
	protected Paciente paciente;
	protected Paciente medico;
	
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Paciente getMedico() {
		return medico;
	}
	public void setMedico(Paciente medico) {
		this.medico = medico;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atendimento [prioridade=");
		builder.append(prioridade);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", paciente=");
		builder.append(paciente);
		builder.append(", medico=");
		builder.append(medico);
		builder.append("]");
		return builder.toString();
	}
}

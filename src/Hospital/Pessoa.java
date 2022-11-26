package Hospital;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
public class Pessoa {
	
	private Date dataNascimento;
	private String nome;
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int calcularIdade() {
		
		Calendar hoje = Calendar.getInstance();
		Calendar dataNasci = new GregorianCalendar();

        dataNasci.setTime(getDataNascimento());
		int idade = hoje.get(Calendar.YEAR) - dataNasci.get(Calendar.YEAR);
		return idade;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [dataNascimento=");
		builder.append(dataNascimento);
		builder.append(", nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
}

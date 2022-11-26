package Hospital;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Operacao {
	private Date inicio;
	private Date fim;
	
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public Date getFim() {
		return fim;
	}
	public void setFim(Date fim) {
		this.fim = fim;
	}
	
	public Date tenmpoTotal() {
		return null;
	}
	
	public int tempoTotal() {
		
		Calendar inicio = new GregorianCalendar();;
		Calendar fim = new GregorianCalendar();
		
        fim.setTime(getFim());
        inicio.setTime(getFim());
        
		int tempo = fim.get(Calendar.HOUR) - inicio.get(Calendar.HOUR);
		return tempo;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Operacao [inicio=");
		builder.append(inicio);
		builder.append(", fim=");
		builder.append(fim);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}

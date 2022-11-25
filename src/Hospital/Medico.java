package Hospital;

import java.util.ArrayList;
import java.util.List;
public class Medico extends Pessoa {
	
	private List<Especialidade> especialidades = new ArrayList<Especialidade>();

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medico [especialidades=");
		builder.append(especialidades);
		builder.append("]");
		return builder.toString();
	}
}

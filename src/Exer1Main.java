import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Exer1Main {

	public static void main(String[] args) {
		
		List<Date> lista = exer1.diaDoMesAno(6,2001);
		for (Iterator iter = lista.iterator(); iter.hasNext();) {
			Date element = (Date) iter.next();
			System.out.println(element);
			
		}
		
	}

}

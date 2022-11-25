import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
public class exer1 {

	
		public static List<Date> diaDoMesAno(int mes, int ano){
			
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.MONTH, mes);
			cal.set(Calendar.YEAR, ano);
			int quantidadeDias = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			List<Date> listDias = new ArrayList<Date>();
			for(int x =1; x <= quantidadeDias; x++) {
				Calendar calendario = Calendar.getInstance();
				calendario.set(Calendar.DATE, x);
				calendario.set(Calendar.MONTH, mes);
				calendario.set(Calendar.YEAR, ano);
				
				Date hoje = calendario.getTime();
				listDias.add(hoje);
			}
			return listDias;
		}
		public static long segundosEntreDatas(Date inicio, Date fim) {
			long secIn = inicio.getTime();
			long secFi = inicio.getTime();
			long dif = (secFi - secIn)/1000;
			return dif;
		}
		
}



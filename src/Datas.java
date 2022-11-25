

import java.util.Date;
import java.util.Calendar;
public class Datas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar calendario =  Calendar.getInstance();
		calendario.set(Calendar.DAY_OF_MONTH, 13);
		calendario.set(Calendar.MONTH, 6);
		calendario.set(Calendar.YEAR, 2001);
		calendario.set(Calendar.HOUR_OF_DAY, 16);
		calendario.set(Calendar.MINUTE, 38);
		calendario.set(Calendar.SECOND, 51);
		Date dt = calendario.getTime();
		
		System.out.println(dt);
		
	}

}

package dateCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class EjercicioDateCalendar {

	public static void main(String[] args) {
		Date fechaParseada = null;
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		Calendar fechaCalendar = new GregorianCalendar();
		try {
			fechaParseada = sdf.parse(JOptionPane.showInputDialog("Dame una fecha"));
		} catch (ParseException e) {
			System.out.println ("Error en el parseo de la fecha");
			e.printStackTrace();
		}
		System.out.println("Fecha parseada: " + sdf.format(fechaParseada));
		
		fechaCalendar.setTime(fechaParseada);
		
		System.out.println(fechaCalendar.getTime());
		
		Date fechaAPartirDeCalendar = new Date(fechaCalendar.getTimeInMillis());
		System.out.println("Fecha a partir de Calendar con campos individualizados: " + 
		new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss").format(fechaAPartirDeCalendar));
		
		fechaCalendar.add(Calendar.DAY_OF_MONTH,3);
		System.out.println("Ahora mas 3 dias : " + fechaCalendar.getTime());
		
		fechaCalendar.add(Calendar.WEEK_OF_YEAR,2);
		System.out.println("Ahora mas 2 semanas : " + fechaCalendar.getTime());
		
		fechaCalendar.add(Calendar.DAY_OF_YEAR,300);
		System.out.println("Ahora mas 300 dias : " + fechaCalendar.getTime());
		
		fechaCalendar.add(Calendar.YEAR,4);
		System.out.println("Ahora mas 4 años : " + fechaCalendar.getTime());
		
		
		
	}

}

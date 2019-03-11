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
		
	}

}

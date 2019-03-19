package base_de_datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import com.mysql.jdbc.Statement;

public class Ejemplo04_CreacionDatosEnEsquema {

	private static String tablas[] = new String[] {"etapa", "ciclista"};
	private static String nombres[] = new String[] {"Eva", "Juan", "Carmen", "Pablo", "Rafa", "Pilar", "Pedro", 
			"Lola", "Casimiro", "Gertrudis", "Eustaquio", "Gerarda", "Nepomunosio", "Argimira", "Ascensio", "Baltasara", "Baudilio", "Bernabea"};
	private static String nomeq[] = new String[] {"TVM","Amore Vita","Kelme","Banesto"};
//	private static String apellidos[] = new String[] {"Gonzalez", "Lopez", "Gutierrez", "Ruiz", "Jurado", "Carrasco", "Flores", 
//			"Sanchez", "Bose", "Martin", "Martinez", "Santos", "Pozo", "Quijano", "Romero", "Pisano", "Cuevas", "Sanz"};
//	private static String tiposEmpresas[] = new String[] {"Hermanos", "Sociedad", "Concesionario", "Coches de"};
	private static String localidades[] = new String[] {"Lucena", "Cabra", "Priego de Cordoba", "Puente Genil", "Benameji", "Palenciana","Baena","Albendin"};
//	private static String fabricantes[] = new String[] {"Renault", "Citroen", "Peugeot", "Dacia", "Kia", "Hyundai", "Honda"};
//	private static String colores[] = new String[] {"Blanco", "Negro", "Azul", "Rojo", "Verde", "Amarillo", "Gris"};
//	private static String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	private static SimpleDateFormat sdfFechaNacimiento = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static int CONT_NOTIFICACION_INSERCION = 10;
	private static int REGISTROS_A_INSERTAR_EN_CONCESIONARIO = 20;
	private static int REGISTROS_A_INSERTAR_EN_CLIENTE = 10000;
	private static int REGISTROS_A_INSERTAR_EN_COCHE = 10000;
	private static boolean LOG = false;
	
	
	
	/**
	 * 
	 * @param conn
	 * @throws SQLException
	 */
	private static void vaciarTablas (Connection conn) throws SQLException {
		Statement s = (Statement) conn.createStatement();
		
		if (LOG)
			System.out.println("Eliminando los registros de todas las tablas");
		
		for (String tabla : tablas) {
			int registrosAfectados = s.executeUpdate("delete from tutorialjavacoches." + tabla);
			if (LOG)
				System.out.println("\t" + registrosAfectados + " registros eliminados en la tabla " + tabla);
		}
		s.close();
	}
	
	
	/**
	 * @throws ImposibleConectarException 
	 * @throws SQLException 
	 * 
	 */
	private static void creacionDatosCiclista (Connection conn) throws SQLException, ImposibleConectarException {
		PreparedStatement ps = (PreparedStatement) conn.
				prepareStatement("INSERT INTO ciclistas (dorsal, nombre, edad, nomeq) VALUES  (?, ?, ?, ?)");
		int registrosInsertados;
		int contRegistrosInsertados = 0;		
		
		if (LOG)
			System.out.println("\nInsertando registros de en la tabla concesionario");

		for (int i = 0; i < REGISTROS_A_INSERTAR_EN_CONCESIONARIO; i++) {
			ps.setInt(1, (int) Math.round(Math.random()*20));
			ps.setString(2, getStringAlAzar(nombres));
			ps.setInt(3, (int) Math.round(Math.random()*20));
			ps.setString(4, getStringAlAzar(nomeq));
			registrosInsertados = ps.executeUpdate();
			if (registrosInsertados != 1) {
				throw new SQLException ("No ha sido posible la inserci�n con ciclistas");
			}
			contRegistrosInsertados++;
			if (contRegistrosInsertados % CONT_NOTIFICACION_INSERCION == 0 && LOG) {
				System.out.println("\t" + contRegistrosInsertados + " registros insertados en tabla concesionario");
			}
		}
		ps.close();
	}
	
	
	/**
	 * @throws ImposibleConectarException 
	 * @throws SQLException 
	 * 
	 */
	private static void creacionDatosEtapa (Connection conn) throws SQLException, ImposibleConectarException {
		PreparedStatement ps = (PreparedStatement) conn.
				prepareStatement("INSERT INTO etapa (netapa, km, salida, llegada,dorsal) VALUES  (?, ?, ?, ?,?)");
		int registrosInsertados;
		int contRegistrosInsertados = 0;		
		
		if (LOG)
			System.out.println("\nInsertando registros de en la tabla cliente");

		for (int i = 0; i < REGISTROS_A_INSERTAR_EN_CLIENTE; i++) {
			
			ps.setInt(1, (int) Math.round(Math.random()*20));
			ps.setInt(2, (int) Math.round(Math.random()*20));
			ps.setString(3, getStringAlAzar(localidades));
			ps.setString(4, getStringAlAzar(localidades));
			ps.setInt(5, (int) Math.round(Math.random()*20));

			registrosInsertados = ps.executeUpdate();
			if (registrosInsertados != 1) {
				throw new SQLException ("No ha sido posible la inserci�n en etapa");
			}
			contRegistrosInsertados++;
			if (contRegistrosInsertados % CONT_NOTIFICACION_INSERCION == 0 && LOG) {
				System.out.println("\t" + contRegistrosInsertados + " registros insertados en tabla cliente");
			}
		}
		ps.close();
	}
	
	
	
	/**
	 * @throws ImposibleConectarException 
	 * @throws SQLException 
	 * 
	 */
	
	private static int getIdAzarEnTabla (Connection conn, String tabla) throws SQLException {
		int maxId = maxIdEnTabla(conn, tabla);
		int idAzar;
		
		Statement s = (Statement) conn.createStatement();
		ResultSet rs;
		do {
			idAzar = Utils.obtenerNumeroAzar(1, maxId);
			rs = s.executeQuery("select * from tutorialjavacoches." + tabla + " where id = " + idAzar);
		} while (!rs.next());
		
		rs.close();
		s.close();
		return idAzar;
	}


	
	/**
	 * 
	 * @param conn
	 * @param tabla
	 * @return
	 * @throws SQLException
	 */
	private static ArrayList<Integer> getIdsEnTabla (Connection conn, String tabla) throws SQLException {
		ArrayList<Integer> ids = new ArrayList<Integer>();
		
		Statement s = (Statement) conn.createStatement();
		ResultSet rs;
		rs = s.executeQuery("select id from tutorialjavacoches." + tabla + " order by id");
		
		while (rs.next()) {
			ids.add(rs.getInt(1));
		}
		
		rs.close();
		s.close();
		return ids;
	}

	
	
	/**
	 * 
	 * @return
	 */
	private static String getFechaAzar (int anioMin, int anioMax, SimpleDateFormat sdf) {
		Calendar calendar = new GregorianCalendar(Utils.obtenerNumeroAzar(anioMin, anioMax) /*a�o*/, Utils.obtenerNumeroAzar(0, 11) /*mes*/, Utils.obtenerNumeroAzar(1, 31) /*d�a*/, 
				Utils.obtenerNumeroAzar(0, 23) /*hora*/, Utils.obtenerNumeroAzar(0, 59) /*minuto*/, Utils.obtenerNumeroAzar(0, 59) /*segundo*/);
	
		return sdf.format(calendar.getTime());
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	/*private static String getModeloCoche () {
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < 2; i++) {
			sb.append(abecedario.charAt(Utils.obtenerNumeroAzar(0, abecedario.length()-1)));
		}
		for (int i = 0; i < 2; i++) {
			sb.append(Utils.obtenerNumeroAzar(0, 9));
		}
		
		return sb.toString();
	}*/
	
	
	
	/**
	 * 
	 * @return
	 */
	/*private static String getDNICIFAzar () {
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < 8; i++) {
			sb.append(Utils.obtenerNumeroAzar(0, 9));
		}
		sb.append(abecedario.charAt(Utils.obtenerNumeroAzar(0, abecedario.length()-1)));
		
		return sb.toString();
	}*/
	
	
	
	/**
	 * 
	 * @return
	 */
	private static String getBastidorAzar () {
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < 17; i++) {
			sb.append(Utils.obtenerNumeroAzar(0, 9));
		}
		
		return sb.toString();
	}
	
	
	
	/**
	 * 
	 * @param strings
	 * @return
	 */
	private static String getStringAlAzar (String strings[]) {
		return strings[Utils.obtenerNumeroAzar(0, strings.length - 1)];
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	private static float getPrecioAzar (int min, int max) {
		return (float) (Utils.obtenerNumeroAzar(min, max-1) + (Utils.obtenerNumeroAzar(0, 99) / 100.0));
	}
	
	
	/**
	 * 
	 * @param conn
	 * @param tabla
	 * @return
	 * @throws SQLException
	 */
	private static int nextIdEnTabla (Connection conn, String tabla) throws SQLException {
		return maxIdEnTabla(conn, tabla) + 1;
	}
	
	
	
	/**
	 * 
	 * @param conn
	 * @param tabla
	 * @return
	 * @throws SQLException
	 */
	private static int maxIdEnTabla (Connection conn, String tabla) throws SQLException {
		Statement s = (Statement) conn.createStatement();

		String sql = "select max(id) from tutorialjavacoches." + tabla;
		ResultSet rs = s.executeQuery(sql);
		int max = 1; 
		if (rs.next() ) {
			max = rs.getInt(1);
		}
		rs.close();
		s.close();
		return max;
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			long startTime = new Date().getTime();
			
			Connection conn;
			conn = ConnectionManagerV2.getConexion();
			
			// Limpieza en las tablas
			vaciarTablas(conn);
			creacionDatosCiclista(conn);
			creacionDatosEtapa(conn);
			
			long usedMillis = new Date().getTime() - startTime;
			int secs = (int) (usedMillis/1000);
			System.out.println("\nProceso terminado en " + secs + " segundos y " + (usedMillis - secs * 1000) + " milisegundos");
			
		} catch (SQLException | ImposibleConectarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

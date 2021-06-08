package conexion;

/**
 * <h1>Clase Conexion-Proyecto Integrado.</h1>
 * 
 * @author David, Alex y Eric.
 * 
 * @since 01/06/2021
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	
	/**
	 * Estos son los atributos que se necesitan para la conexion a la base de datos en el aws
	 * 
	 */

	private final static String url = "jdbc:mysql://54.163.1.1/deliverybufa";
	private final static String user = "conecta";
	private final static String pass = "12345678";
	private Connection conexion;
	
	/**
	 * 
	 * Este metodo es el que conecta a la base de datos, usando los atributos previos
	 * 
	 */

	public Conexion() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conexion = DriverManager.getConnection(url, user, pass);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	/**
	 * @return the conexion
	 */
	public Connection getConexion() {
		return conexion;
	}
	
}

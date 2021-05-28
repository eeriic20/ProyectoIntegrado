package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import vista.*;
public class Conexion {

	private final static String url = "jdbc:mysql://52.45.93.173/deliverybufa";
	private final static String user = "conecta";
	private final static String pass = "12345678";
	private Connection conexion;

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

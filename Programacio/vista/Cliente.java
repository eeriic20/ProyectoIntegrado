package vista;

import java.sql.Date;

public class Cliente extends Usuario {

	public Cliente() {

		super();

	}

	public Cliente(String nombreUsuario, String contrasenya, String nombre, String apellidos, String correoElectronico,
			String direccion, Date fechaNacimiento, int cP, String localidad, String genero) {

		super(nombreUsuario, contrasenya, nombre, apellidos, correoElectronico, direccion, fechaNacimiento, cP,
				localidad, genero);

	}

}

package modelo;

import java.sql.Date;

/**
 * <h1>Clase Cliente-Proyecto Integrado.</h1>
 * 
 * @author David, Alex y Eric.
 * 
 * @since 25/05/2021
 *
 */
public class Cliente extends Usuario {

	/**
	 * 
	 * <h2>Constructor por defecto.</h2>
	 * 
	 * Este es el constructor con todos los parámetros por defecto y heredado de la
	 * clase Usuario.
	 * 
	 */
	public Cliente() {

		super();

	}

	/**
	 * 
	 * <h2>Constructor con todos los parámetros.</h2>
	 * 
	 * Constructor con todos los datos insertados por parámetro heredado de la clase.
	 * Usuario
	 * 
	 * @param nombreUsuario     este es el nombre del usuario que usara para el
	 *                          registro.
	 * @param contrasenya       esta es la contraseña que se usara para el registro.
	 * @param nombre            es el nombre real del usuario.
	 * @param apellidos         son los apellidos reales de la persona.
	 * @param correoElectronico es el correo electrónico de la persona.
	 * @param direccion         es donde vive esa persona.
	 * @param fechaNacimiento   la fecha en la que nació.
	 * @param cP                el código postal de su localidad.
	 * @param localidad         el nombre de la localidad.
	 * @param genero            el género de la persona (chico o chica).
	 */

	public Cliente(String nombreUsuario, String contrasenya, String nombre, String apellidos, String correoElectronico,
			String direccion, Date fechaNacimiento, int cP, String localidad, String genero) {

		super(nombreUsuario, contrasenya, nombre, apellidos, correoElectronico, direccion, fechaNacimiento, cP,
				localidad, genero);

	}
}

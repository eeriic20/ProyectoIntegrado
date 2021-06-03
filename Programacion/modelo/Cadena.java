package modelo;

public class Cadena {

	/**
	 * <h1>Clase Cadena-Proyecto Integrado.</h1>
	 * 
	 * @author David, Alex y Eric.
	 * 
	 * @since 25/05/2021
	 *
	 */

	private String nombre;

	/**
	 * <h2>Constructor con parametros por defecto.</h2>
	 * 
	 * Este es el constructor con los datos por defecto.
	 */
	public Cadena() {

	}

	/**
	 * <h2>Constructor con los datos modificables por parámetro.</h2>
	 * 
	 * Este es el constructor con los datos modificables por parámetros.
	 * 
	 * @param nombre
	 */
	public Cadena(String nombre) {

		this.nombre = nombre;
	}

	/**
	 * 
	 * <h2>Getters y setters.</h2>
	 * 
	 * Estos son los getters y setters de la clase.
	 * 
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

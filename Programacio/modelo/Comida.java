package modelo;

public class Comida {

	/**
	 * <h1>Clase Comida-Proyecto Integrado.</h1>
	 * 
	 * @author David, Alex y Eric.
	 * 
	 * @since 25/05/2021
	 *
	 */

	private String nombre;
	private double precio;
	private Cadena cadena;

	/**
	 * <h2>Constructor con par�metros por defecto.</h2>
	 * 
	 * Este es el constructor con todos los par�metros por defecto.
	 * 
	 */
	public Comida() {

	}

	/**
	 * <h2>Constructor con todos los datos modificables por par�metros.</h2>
	 * 
	 * @param nombre es el nombre del men�.
	 * @param precio es el precio unitario del men�.
	 * @param cadena es la cadena que distribuye el men�.
	 */
	public Comida(String nombre, double precio, Cadena cadena) {

		this.nombre = nombre;
		this.precio = precio;
		this.cadena = cadena;

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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Cadena getCadena() {
		return cadena;
	}

	public void setCadena(Cadena cadena) {
		this.cadena = cadena;
	}

}

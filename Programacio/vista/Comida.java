package vista;

public class Comida {

	/**
	 * @since 25-05-2021
	 */
	private String nombre;
	private double precio;
	private Cadena cadena;
	
	/**
	 * Constructor sin parametros
	 */
	public Comida() {
	
		
	}
	/**
	 * 
	 * @param nombre
	 * @param precio
	 * @param cadena
	 */
	public Comida(String nombre, double precio, Cadena cadena) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.cadena = cadena;
		
	}
	/**
	 * 
	 * @return
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

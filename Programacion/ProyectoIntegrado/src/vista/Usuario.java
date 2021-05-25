package vista;

import java.sql.Date;

/**
 * <h1>Clase Usuario<h1>
 * 
 * @author
 * @since 25/05/2021
 *
 */

public class Usuario {

	private String nombreUsuario;
	private String contrasenya;
	private String nombre;
	private String apellido;
	private String correoElectronico;
	private Date fechaNacimiento;
	private String direccion;
	private int codigoPostal;
	private String localidad;
	private String genero;
	
	/**
	 * 
	 * <h2>Constructor por defecto<h2>
	 * 
	 * Este constructor es el que se inicializa con todos los parametros por defecto
	 *  
	 */

	public Usuario() {

	}
	
	/**
	 * 
	 * <h2>Constructor con todos los datos insertados por parametro<h2>
	 * 
	 * Este es el constructor en el que se pueden editar todos los datos por parametro
	 * 
	 * @param nombreUsuario es el nombre del usuario necesario para logearse
	 * @param contrasenya es la contraseña del usuario necesaria para logearse
	 * @param nombre el nombre real del usuario
	 * @param apellido es el apellido del usuario
	 * @param correoElectronico hola
	 * @param fechaNacimiento
	 * @param direccion
	 * @param codigoPostal
	 * @param localidad
	 * @param genero
	 */

	public Usuario(String nombreUsuario, String contrasenya, String nombre, String apellido, String correoElectronico,
			Date fechaNacimiento, String direccion, int codigoPostal, String localidad, String genero) {

		this.nombreUsuario = nombreUsuario;
		this.contrasenya = contrasenya;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correoElectronico = correoElectronico;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
		this.genero = genero;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasenya() {
		return contrasenya;
	}

	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	

}

package modelo;

import java.sql.Date;

/**
 * <h1>Clase Empleado-Proyecto Integrado.</h1>
 * 
 * @author David, Alex y Eric.
 * 
 * @since 25/05/2021
 *
 */
public class Empleado extends Usuario {

	private int nomina;
	private String dni;
	private boolean carnet;
	private String tipoVehiculo;
	private int numRepartos;
	private boolean disponibilidad;

	/**
	 * 
	 * <h2>Constructor por defecto.</h2>
	 * 
	 * Este es el constructor con todos los parámetros por defecto y heredado de la
	 * clase Usuario.
	 * 
	 */
	public Empleado() {

		super();

	}

	/**
	 * 
	 * <h2>Constructor con todos los parametros</h2>
	 * 
	 * Este es el constructor en el que se introducen todos los datos por parametro.
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
	 * @param nomina            el sueldo del empleado.
	 * @param dni               el carnet de identificación del empleado.
	 * @param carnet            si el empleado es poseedor del carnet de conducir.
	 * @param tipoVehiculo      el tipo de vehículo (bicicleta, turismos, moto...).
	 * @param numRepartos       el número de rapartos realizados por el empleado,
	 *                          necesario para la nómina.
	 * 
	 */

	public Empleado(String nombreUsuario, String contrasenya, String nombre, String apellidos, String correoElectronico,
			String direccion, Date fechaNacimiento, int cP, String localidad, String genero, int nomina, String dni,
			boolean carnet, String tipoVehiculo, int numRepartos, boolean disponibilidad) {

		super(nombreUsuario, contrasenya, nombre, apellidos, correoElectronico, direccion, fechaNacimiento, cP,
				localidad, genero);

		this.carnet = carnet;
		this.dni = dni;
		this.nomina = nomina;
		this.numRepartos = numRepartos;
		this.tipoVehiculo = tipoVehiculo;
		this.disponibilidad = disponibilidad;

	}

	/**
	 * 
	 * <h2>Getters y setters.</h2>
	 * 
	 * Estos son los getters y setters de la clase.
	 * 
	 */

	public int getNomina() {
		return nomina;
	}

	public void setNomina(int nomina) {
		this.nomina = nomina;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public boolean isCarnet() {
		return carnet;
	}

	public void setCarnet(boolean carnet) {
		this.carnet = carnet;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public int getNumRepartos() {
		return numRepartos;
	}

	public void setNumRepartos(int numRepartos) {
		this.numRepartos = numRepartos;
	}
	
	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

}

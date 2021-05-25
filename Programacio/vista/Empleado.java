package vista;

import java.sql.Date;

public class Empleado extends Usuario {

	private int nomina;
	private String dni;
	private boolean carnet;
	private String tipoVehiculo;
	private int numRepartos;

	public Empleado() {

		super();

	}

	public Empleado(String nombreUsuario, String contrasenya, String nombre, String apellidos, String correoElectronico,
			String direccion, Date fechaNacimiento, int cP, String localidad, String genero, int nomina, String dni,
			boolean carnet, String tipoVehiculo, int numRepartos) {

		super(nombreUsuario, contrasenya, nombre, apellidos, correoElectronico, direccion, fechaNacimiento, cP,
				localidad, genero);

		this.carnet = carnet;
		this.dni = dni;
		this.nomina = nomina;
		this.numRepartos = numRepartos;
		this.tipoVehiculo = tipoVehiculo;

	}

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

}

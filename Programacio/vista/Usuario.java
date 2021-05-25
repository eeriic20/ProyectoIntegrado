package vista;

import java.sql.Date;

public class Usuario {
	
	private String nombreUsuario;
	private String contrasenya;
	private String nombre;
	private String apellidos;
	private String correoElectronico;
	private String direccion;
	private Date fechaNacimiento;
	private int cP;
	private String localidad;
	private String genero;
	
	public Usuario() {
		
	}

	public Usuario(String nombreUsuario, String contrasenya, String nombre, String apellidos, String correoElectronico,
			String direccion, Date fechaNacimiento, int cP, String localidad, String genero) {
		
		this.nombreUsuario = nombreUsuario;
		this.contrasenya = contrasenya;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correoElectronico = correoElectronico;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
		this.cP = cP;
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getcP() {
		return cP;
	}

	public void setcP(int cP) {
		this.cP = cP;
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

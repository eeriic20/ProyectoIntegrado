package vista;

import java.sql.Date;
import java.sql.Time;

public class Pedido {

	/**
	 * @since 25-05-2021
	 * 
	 */
	
	private Time horaPedido;
	private Date fechaPedido;
	private String estadoPedido;
	private double precioPedido;
	private Empleado empleado;
	private Cliente cliente;
	private Comida menu;
	/**
	 * Constructor sin parametros
	 */
	public Pedido() {
		
	}
	/**
	 * 
	 * @param horaPedido
	 * @param fechaPedido
	 * @param estadoPedido
	 * @param precioPedido
	 * @param empleado
	 * @param cliente
	 * @param menu
	 */
	public Pedido(Time horaPedido, Date fechaPedido, String estadoPedido, double precioPedido, Empleado empleado,Cliente cliente, Comida menu) {
	
		this.horaPedido = horaPedido;
		this.fechaPedido = fechaPedido;
		this.estadoPedido = estadoPedido;
		this.precioPedido = precioPedido;
		this.empleado = empleado;
		this.cliente = cliente;
		this.menu = menu;
	}
	
	/**
	 * 
	 * @return
	 */
	public Time getHoraPedido() {
		return horaPedido;
	}

	public void setHoraPedido(Time horaPedido) {
		this.horaPedido = horaPedido;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public String getEstadoPedido() {
		return estadoPedido;
	}

	public void setEstadoPedido(String estadoPedido) {
		this.estadoPedido = estadoPedido;
	}

	public double getPrecioPedido() {
		return precioPedido;
	}

	public void setPrecioPedido(double precioPedido) {
		this.precioPedido = precioPedido;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Comida getMenu() {
		return menu;
	}

	public void setMenu(Comida menu) {
		this.menu = menu;
	}
	
	
	
	
	
	
}

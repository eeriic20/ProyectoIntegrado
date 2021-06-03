package modelo;

import java.sql.Date;
import java.sql.Time;

public class Pedido {

	/**
	 * <h1>Clase Pedido-Proyecto Integrado.</h1>
	 * 
	 * @author David, Alex y Eric.
	 * 
	 * @since 25/05/2021
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
	 * <h2>Constructor sin parametros.</h2>
	 * 
	 * Este es el constructor con todos los parametros por defecto.
	 */

	public Pedido() {

	}

	/**
	 * 
	 * <h2>Constructor con todos los datos insertados por parametro.</h2>
	 * 
	 * Este es elconstructor con todos los datos modificables por parametro.
	 * 
	 * @param horaPedido   es la hora a la que se ha realizado el pedido.
	 * @param fechaPedido  es la fecha en la que se ha realizado el pedido.
	 * @param estadoPedido es el estado del pedido, se refiere a si esta en camino o
	 *                     se esta haciendo...
	 * @param precioPedido es el coste del pedido.
	 * @param empleado     es el empleado encargado de llevar el pedido.
	 * @param cliente      es el cliente que ha realizado el pedido.
	 * @param menu         el menu que ha sido pedido.
	 */
	public Pedido(Time horaPedido, Date fechaPedido, String estadoPedido, double precioPedido, Empleado empleado,
			Cliente cliente, Comida menu) {

		this.horaPedido = horaPedido;
		this.fechaPedido = fechaPedido;
		this.estadoPedido = estadoPedido;
		this.precioPedido = precioPedido;
		this.empleado = empleado;
		this.cliente = cliente;
		this.menu = menu;
	}

	/**
	 * <h2>Getters y setters.</h2>
	 * 
	 * estos son los getters y setters de la clase.
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

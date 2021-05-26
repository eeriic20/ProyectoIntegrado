package principal;

import java.awt.EventQueue;

import vista.PantallaLogin;

public class Principal {
	/**
	 * <h1>Clase Principal-Proyecto Integrado.</h1>
	 * 
	 * @author David, Alex y Eric.
	 * 
	 * @since 25/05/2021
	 *
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaLogin frame = new PantallaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}

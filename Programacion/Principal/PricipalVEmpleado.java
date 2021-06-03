package principal;

import java.awt.EventQueue;

import vista.PantallaLogin;
import vista.vistaEmpleado;

public class PricipalVEmpleado {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaEmpleado frame = new vistaEmpleado();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import conexion.Conexion;

public class Pedido {

	public void terminarPedido(String menuTotal, String fechaTexto, int precioTotal, String estado, String empresa,
			String direccion, int id_localidad, int idCliente, JPanel contentPane) {

		Conexion c = new Conexion();

		Connection miConexion = c.getConexion();
		String mysql = "INSERT INTO pedido(Menu, FechaPedido, PrecioPedido, EstadoPedido, Empresa, direccion, CodigoLocalidad, idCliente) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			PreparedStatement pst = miConexion.prepareStatement(mysql);

			pst.setString(1, menuTotal);
			pst.setString(2, fechaTexto);
			pst.setInt(3, precioTotal);
			pst.setString(4, estado);
			pst.setString(5, empresa);
			pst.setString(6, direccion);
			pst.setInt(7, id_localidad);
			pst.setInt(8, idCliente);

			if (pst.executeUpdate() == 1) {

			}

		} catch (SQLException e1) {

			e1.printStackTrace();

		}

		int opcion = JOptionPane.showConfirmDialog(null, "¿Quiere terminar se pedido?", "Aviso",
				JOptionPane.YES_NO_OPTION);

		if (opcion == JOptionPane.YES_OPTION) {

			JOptionPane.showMessageDialog(contentPane,
					"Su pedido costara " + precioTotal + "€" + ", gracias por confiar en nosotros",
					"Su pedido esta en camino", JOptionPane.WARNING_MESSAGE);

			int opcion2 = JOptionPane.showConfirmDialog(null, "¿Quiere salir de la aplicación?", "Aviso",
					JOptionPane.YES_NO_OPTION);

			if (opcion2 == JOptionPane.YES_OPTION) {
				System.exit(0);
			} else {

			}

		}

	}

}

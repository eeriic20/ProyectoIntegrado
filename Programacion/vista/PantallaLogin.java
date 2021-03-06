package vista;

/**
 * Pantalla de Login-Proyecto Integrado.
 * 
 * @author David, Alex y Eric.
 * 
 * @since 25/05/2021
 *
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import conexion.Conexion;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class PantallaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField usuario;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JLabel lblUser;
	private JLabel lblContrasea;
	private JLabel lblNewLabel_1;
	private JPasswordField password;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnRegister;
	public String nombreUsuLog;

	/**
	 * El constructor de la clase Login
	 * 
	 */

	public PantallaLogin() {
		setFont(null);
		setTitle("DELIVERY BUFA");
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(PantallaLogin.class.getResource("/vista/Imagenes/logofinal.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 885, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setResizable(false);

		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(PantallaLogin.class.getResource("/vista/Imagenes/logo.PNG")));
		lblNewLabel_2.setBounds(331, -12, 186, 115);
		contentPane.add(lblNewLabel_2);

		lblUser = new JLabel("Usuario:");
		lblUser.setFont(new Font("Segoe Print", Font.PLAIN, 30));
		lblUser.setBounds(364, 127, 136, 50);
		contentPane.add(lblUser);

		lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Segoe Print", Font.PLAIN, 30));
		lblContrasea.setBounds(331, 248, 194, 34);
		contentPane.add(lblContrasea);

		usuario = new JTextField();
		usuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		usuario.setBounds(317, 177, 220, 34);
		contentPane.add(usuario);
		usuario.setColumns(10);

		/**
		 * 
		 * Este boton es de logearse, detecta automaticamente si la persona es cliente o
		 * empleado
		 * 
		 */

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String user = usuario.getText();
				String contrasenya = password.getText();

				Conexion c = new Conexion();

				try {

					// Aqui es donde se hace una consulta donde usando los datos introducidos en el
					// textfield comprueba si exite en la base de datos

					Statement s = c.getConexion().createStatement();
					String sql = "select NombreUsuario, Contrase?a, ID from persona where NombreUsuario = '" + user
							+ "' AND Contrase?a = '" + contrasenya + "'";
					ResultSet rs = s.executeQuery(sql);

					if (rs.next()) {

						// Aqui se guarda el id de la persona para utilizarla luego

						int id = Integer.parseInt(rs.getString("ID"));

						// En esta consulta es donde se comprueba si la persona es cliente o empleado

						sql = "select idEmpleado from empleado where idEmpleado = '" + id + "'";
						rs = s.executeQuery(sql);

						if (rs.next()) {

							vistaEmpleado vE = new vistaEmpleado(user);
							dispose();
							vE.setVisible(true);

						} else {

							// En el caso de no ser empleado se guardan los datos que seran usados luego
							// para hacer los pedidos

							sql = "select Localidad from persona where ID = '" + id + "'";
							rs = s.executeQuery(sql);

							if (rs.next()) {

								String localidad = rs.getString("Localidad");

								sql = "select Direccion from persona where ID = '" + id + "'";
								rs = s.executeQuery(sql);

								if (rs.next()) {

									String direccion = rs.getString("Direccion");

									PantallaRestaurantes pU = new PantallaRestaurantes(user, id, localidad, direccion);
									dispose();
									pU.setVisible(true);

								}

							}

						}

					} else {

						JOptionPane.showMessageDialog(null, "La contrase?a/usuario no son correctos o no coinciden",
								"INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);

					}

				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		});
		btnLogin.setBounds(317, 405, 89, 23);
		contentPane.add(btnLogin);

		/**
		 * 
		 * Este es el boton que te lleva a la pantalla de registro
		 * 
		 */

		btnRegister = new JButton("Registrase");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PantallaRegistrar frameRegis = new PantallaRegistrar();
				dispose();
				frameRegis.setVisible(true);

			}
		});
		btnRegister.setBounds(436, 405, 101, 23);
		contentPane.add(btnRegister);

		password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 16));
		password.setBounds(317, 303, 220, 34);
		contentPane.add(password);
		password.setColumns(10);
		password.setEchoChar('*');

		/**
		 * 
		 * Este boton permite ver la contrase?a
		 * 
		 */

		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				password.setEchoChar((char) 0);

				btnNewButton.setVisible(false);
				btnNewButton_1.setVisible(true);

			}
		});

		btnNewButton.setIcon(new ImageIcon(PantallaLogin.class.getResource("/vista/Imagenes/verpass1.png")));
		btnNewButton.setBounds(542, 303, 34, 34);
		contentPane.add(btnNewButton);

		/**
		 * 
		 * Este boton permite lo contrario al anterior, sirve para ocultarla
		 * 
		 */

		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				password.setEchoChar('*');

				btnNewButton_1.setVisible(false);
				btnNewButton.setVisible(true);

			}
		});
		btnNewButton_1.setIcon(new ImageIcon(PantallaLogin.class.getResource("/vista/Imagenes/noverPass1.png")));
		btnNewButton_1.setBounds(542, 303, 34, 34);
		contentPane.add(btnNewButton_1);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(PantallaLogin.class.getResource("/vista/Imagenes/fondo4.jpg")));
		lblNewLabel_1.setBounds(250, 93, 363, 393);
		contentPane.add(lblNewLabel_1);

		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PantallaLogin.class.getResource("/vista/Imagenes/FondoLogearse.jpg")));
		lblNewLabel.setBounds(-133, -81, 1136, 754);
		contentPane.add(lblNewLabel);

	}
}

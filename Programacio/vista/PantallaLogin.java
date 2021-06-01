package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import conexion.Conexion;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class PantallaLogin extends JFrame {
	/**
	 * <h1>Pantalla de Login-Proyecto Integrado.</h1>
	 * 
	 * @author David, Alex y Eric.
	 * 
	 * @since 25/05/2021
	 *
	 */
	private JPanel contentPane;
	private JTextField textField;
	private JTextField usuario;
	private JTextField textField_2;
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
	 * Create the frame.
	 */

	public PantallaLogin() {
		setFont(null);
		setTitle("DELIVERY BUFA");
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\logofinal.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 885, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setResizable(false);

		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\logo.PNG"));
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

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String user = usuario.getText();
				String contrasenya = password.getText();

				Conexion c = new Conexion();

				try {
					Statement s = c.getConexion().createStatement();
					String sql = "select NombreUsuario, Contraseña, ID from persona where NombreUsuario = '" + user
							+ "' AND Contraseña = '" + contrasenya + "'";
					ResultSet rs = s.executeQuery(sql);

					if (rs.next()) {

						int id = Integer.parseInt(rs.getString("ID"));

						sql = "select idEmpleado from empleado where idEmpleado = '" + id + "'";
						rs = s.executeQuery(sql);

						if (rs.next()) {

							vistaEmpleado vE = new vistaEmpleado(user);

							vE.setVisible(true);

						} else {

							sql = "select Localidad from persona where ID = '" + id + "'";
							rs = s.executeQuery(sql);

							if (rs.next()) {
								
								String localidad = rs.getString("Localidad");

								sql = "select Direccion from persona where ID = '" + id + "'";
								rs = s.executeQuery(sql);

								if (rs.next()) {

									String direccion = rs.getString("Direccion");

									PantallaRestaurantes pU = new PantallaRestaurantes(id, localidad, direccion);
									dispose();
									pU.setVisible(true);

								}

							}

						}

					}

				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		});
		btnLogin.setBounds(317, 405, 89, 23);
		contentPane.add(btnLogin);

		btnRegister = new JButton("Registrase");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PantallaRegistrar frameRegis = new PantallaRegistrar();
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

		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				password.setEchoChar((char) 0);

				btnNewButton.setVisible(false);
				btnNewButton_1.setVisible(true);

			}
		});

		btnNewButton.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\verpass1.png"));
		btnNewButton.setBounds(542, 303, 34, 34);
		contentPane.add(btnNewButton);

		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				password.setEchoChar('*');

				btnNewButton_1.setVisible(false);
				btnNewButton.setVisible(true);

			}
		});
		btnNewButton_1.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\noverPass1.png"));
		btnNewButton_1.setBounds(542, 303, 34, 34);
		contentPane.add(btnNewButton_1);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fondo4.jpg"));
		lblNewLabel_1.setBounds(250, 93, 363, 393);
		contentPane.add(lblNewLabel_1);

		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\FondoLogearse.jpg"));
		lblNewLabel.setBounds(-133, -81, 1136, 754);
		contentPane.add(lblNewLabel);

	}
}

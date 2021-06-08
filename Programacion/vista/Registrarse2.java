package vista;

/**
 * Pantalla de registro 2-Proyecto Integrado.
 * 
 * @author David, Alex y Eric.
 * 
 * @since 25/05/2021
 *
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import conexion.Conexion;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.Toolkit;

public class Registrarse2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Nombr;
	private JTextField textField_Apelli;
	private JTextField textField_FechaNac;
	private JTextField textField_CP;
	private JTextField textField_Direccion;
	private String nombre;
	private String apellidos;
	private String cP;
	private String direccion;
	private String localidad;
	private String fechaNac;
	private String contrasenya;
	private String correo;
	private String nombreUsuario;
	private JTextArea textArea;

	/**
	 * El constructor de registarse 2
	 * 
	 * @param contrasenyaC   la contraseña del usuario que se registra
	 * @param correoC        el correo del usuario que se registra
	 * @param nombreUsuarioC el nombre de usuario del usuario
	 */

	public Registrarse2(String contrasenyaC, String correoC, String nombreUsuarioC) {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(Registrarse2.class.getResource("/vista/Imagenes/logofinal.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 885, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_Logo = new JLabel("");
		lblNewLabel_Logo.setIcon(new ImageIcon(Registrarse2.class.getResource("/vista/Imagenes/logo.PNG")));
		lblNewLabel_Logo.setBounds(349, -14, 186, 107);
		contentPane.add(lblNewLabel_Logo);

		JLabel lblDeliveryBufa = new JLabel("DELIVERY BUFA");
		lblDeliveryBufa.setFont(new Font("Noto Serif", Font.PLAIN, 18));
		lblDeliveryBufa.setBounds(359, 104, 158, 16);
		contentPane.add(lblDeliveryBufa);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		lblNombre.setBounds(283, 157, 81, 23);
		contentPane.add(lblNombre);

		JLabel lblNewLabel_Apellido = new JLabel("Apellidos: ");
		lblNewLabel_Apellido.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		lblNewLabel_Apellido.setBounds(283, 191, 81, 23);
		contentPane.add(lblNewLabel_Apellido);

		JLabel lblFechaNac = new JLabel("Fecha Nacimiento:");
		lblFechaNac.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		lblFechaNac.setBounds(283, 225, 144, 16);
		contentPane.add(lblFechaNac);

		JLabel lblCdigoPostal = new JLabel("C\u00F3digo Postal:");
		lblCdigoPostal.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		lblCdigoPostal.setBounds(283, 260, 111, 16);
		contentPane.add(lblCdigoPostal);

		JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		lblDireccion.setBounds(293, 293, 119, 16);
		contentPane.add(lblDireccion);

		JLabel lblLocalidad = new JLabel("Localidad:");
		lblLocalidad.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		lblLocalidad.setBounds(283, 335, 81, 23);
		contentPane.add(lblLocalidad);

		textField_Nombr = new JTextField();
		textField_Nombr.setBounds(435, 160, 111, 20);
		contentPane.add(textField_Nombr);
		textField_Nombr.setColumns(10);

		textField_Apelli = new JTextField();
		textField_Apelli.setBounds(435, 194, 111, 20);
		contentPane.add(textField_Apelli);
		textField_Apelli.setColumns(10);

		textField_FechaNac = new JTextField();
		textField_FechaNac.setBounds(436, 225, 110, 20);
		contentPane.add(textField_FechaNac);
		textField_FechaNac.setColumns(10);

		textField_CP = new JTextField();
		textField_CP.setBounds(435, 256, 111, 20);
		contentPane.add(textField_CP);
		textField_CP.setColumns(10);

		textField_Direccion = new JTextField();
		textField_Direccion.setBounds(435, 293, 111, 20);
		contentPane.add(textField_Direccion);
		textField_Direccion.setColumns(10);

		/**
		 * 
		 * Este es el boton que finaliza el registro y sube los datos a la base de datos
		 * 
		 */

		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				nombre = textField_Nombr.getText();
				apellidos = textField_Apelli.getText();
				cP = textField_CP.getText();
				direccion = textField_Direccion.getText();
				fechaNac = textField_FechaNac.getText();
				contrasenya = contrasenyaC;
				correo = correoC;
				nombreUsuario = nombreUsuarioC;
				localidad = textArea.getText();

				// Comprobara que se pongan todos los cuadros

				if (nombre.equals("")) {

					JOptionPane.showMessageDialog(null, "Rellena el campo de nombre", "INFORMATION_MESSAGE",
							JOptionPane.INFORMATION_MESSAGE);

				} else {

					if (apellidos.equals("")) {

						JOptionPane.showMessageDialog(null, "Rellena el campo de apellidos", "INFORMATION_MESSAGE",
								JOptionPane.INFORMATION_MESSAGE);

					} else {

						if (fechaNac.equals("")) {

							JOptionPane.showMessageDialog(null, "Rellena el campo fecha nacimiento",
									"INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);

						} else {

							if (cP.equals("")) {

								JOptionPane.showMessageDialog(null, "Rellena el código postal", "INFORMATION_MESSAGE",
										JOptionPane.INFORMATION_MESSAGE);

							} else {
								if (direccion.equals("")) {

									JOptionPane.showMessageDialog(null, "Rellena el campo dirección",
											"INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);

								} else {

									if (localidad.equals("Seleccione una localidad") || localidad.equals("")) {

										JOptionPane.showMessageDialog(null, "Selecciona una localidad correcta",
												"INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);

									} else {

										// Inserta todos los datos en la tabla persona

										Conexion cn = new Conexion();
										Connection miConexion = cn.getConexion();
										String mysql = "INSERT INTO persona(Nombre, Apellidos, NombreUsuario, Contraseña, Correo, Direccion, Localidad, CodigoPostal, FechaNacimiento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

										try {
											PreparedStatement pst = miConexion.prepareStatement(mysql);

											pst.setString(1, nombre);
											pst.setString(2, apellidos);
											pst.setString(3, nombreUsuario);
											pst.setString(4, contrasenya);
											pst.setString(5, correo);
											pst.setString(6, direccion);
											pst.setString(7, localidad);
											pst.setString(8, cP);
											pst.setString(9, fechaNac);

											// Aqui registra la persona que se acaba de registrar en la tabla cliente
											// para que se guarden como clientes

											if (pst.executeUpdate() == 1) {

												mysql = "INSERT INTO cliente(idCliente) VALUES (?)";

												try {
													pst = miConexion.prepareStatement(mysql);

													Statement s = cn.getConexion().createStatement();
													String sql = "select ID from persona where nombreUsuario = '"
															+ nombreUsuario + "'";
													ResultSet rs = s.executeQuery(sql);

													if (rs.next()) {

														String id = rs.getString("ID");
														pst.setString(1, id);

													}

												} catch (SQLException e1) {

													e1.printStackTrace();

												}
												if (pst.executeUpdate() == 1) {

													PantallaLogin pL = new PantallaLogin();
													dispose();
													pL.setVisible(true);
												}

											}

										} catch (SQLException e1) {

											e1.printStackTrace();

										}
									}

								}

							}

						}

					}

				}

			}

		});
		btnRegistrarse.setBounds(376, 427, 114, 23);
		contentPane.add(btnRegistrarse);

		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String mensaje = "Seleccione una localidad";

				if (comboBox.getSelectedIndex() == 0) {

					textArea.setText(mensaje);
					textArea.setEnabled(false);
				} else {

					mensaje = comboBox.getSelectedItem().toString();

					textArea.setText(mensaje);

					if (textArea.isEnabled() == false)
						textArea.setEnabled(true);
				}

			}
		});
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "Selecciona una localidad", "Alc\u00FAdia", "Carcaixent", "Alzira", "Benimodo",
						"Benifai\u00F3", "Alginet", "Carlet", "Tous", "Algemes\u00ED", "Guadassuar", "Massalav\u00E9s",
						"Benimuslem", "Alberic", "Villanova de Castell\u00F3", "Gavarda", "Antella", "Sumac\u00E1rcel",
						"Cot\u00E9s", "C\u00E0rcer", "Beneixida", "Sellent", "Alc\u00E0ntera del Xuquer", "Senyera",
						"Manuel", "Sant Joan de \u00C8nova", "Rafelguaraf", "\u00C9nova", "Pobla Llarga" }));
		comboBox.setBounds(406, 338, 169, 20);
		contentPane.add(comboBox);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Registrarse2.class.getResource("/vista/Imagenes/fondo4.jpg")));
		lblNewLabel.setBounds(256, 87, 363, 393);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_Fondo = new JLabel("");
		lblNewLabel_Fondo.setIcon(new ImageIcon(Registrarse2.class.getResource("/vista/Imagenes/FondoLogearse.jpg")));
		lblNewLabel_Fondo.setBounds(-54, 0, 1136, 754);
		contentPane.add(lblNewLabel_Fondo);

		textArea = new JTextArea();
		textArea.setBounds(10, 558, 4, 4);
		contentPane.add(textArea);

	}
}

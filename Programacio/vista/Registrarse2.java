package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import Conexion.Conexion;
import modelo.Cliente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JProgressBar;

public class Registrarse2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Nombr;
	private JTextField textField_Apelli;
	private JTextField textField_FechaNac;
	private JTextField textField_CP;
	private JTextField textField_Direccion;
	private JTextField textField;
	private String nombre;
	private String apellidos;
	private String cP;
	private String genero;
	private String direccion;
	private String localidad;
	private PantallaRegistrar p = new PantallaRegistrar();
	private String fechaNac;
	JCheckBox chckbxChico;
	JCheckBox chckbxChica;
	private String contrasenya;
	private String nombreUsuario;
	private String correo;

	/**
	 * Create the frame.
	 */
	public Registrarse2() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 885, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_Logo = new JLabel("");
		lblNewLabel_Logo.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\logo.PNG"));
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
		lblFechaNac.setBounds(283, 233, 144, 16);
		contentPane.add(lblFechaNac);

		JLabel lblCdigoPostal = new JLabel("C\u00F3digo Postal:");
		lblCdigoPostal.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		lblCdigoPostal.setBounds(283, 260, 111, 16);
		contentPane.add(lblCdigoPostal);

		JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		lblDireccion.setBounds(283, 287, 119, 16);
		contentPane.add(lblDireccion);

		JLabel lblGnero = new JLabel("G\u00E9nero:");
		lblGnero.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		lblGnero.setBounds(283, 325, 70, 16);
		contentPane.add(lblGnero);

		JLabel lblLocalidad = new JLabel("Localidad:");
		lblLocalidad.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		lblLocalidad.setBounds(283, 352, 81, 23);
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
		textField_Direccion.setBounds(435, 290, 111, 20);
		contentPane.add(textField_Direccion);
		textField_Direccion.setColumns(10);

		textField = new JTextField();
		textField.setBounds(435, 355, 111, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				nombre = textField_Nombr.getText();
				apellidos = textField_Apelli.getText();
				cP = textField_CP.getText();
				direccion = textField_Direccion.getText();
				localidad = textField.getText();
				fechaNac = textField_FechaNac.getText();
				nombreUsuario = p.nombreUsuario;
				contrasenya = p.contrasenya;
				correo = p.correoE;
				
				
				if (cP.equals("")) {

					JOptionPane.showMessageDialog(null, "Rellena el Campo de Código Postal", "INFORMATION_MESSAGE",
							JOptionPane.INFORMATION_MESSAGE);

				} else {

					if (direccion.equals("")) {

						JOptionPane.showMessageDialog(null, "Rellena el Campo de Dirección", "INFORMATION_MESSAGE",
								JOptionPane.INFORMATION_MESSAGE);

					} else {

						if (nombre.equals("")) {

							JOptionPane.showMessageDialog(null, "Rellena el Campo de Nombre", "INFORMATION_MESSAGE",
									JOptionPane.INFORMATION_MESSAGE);

						} else {

							if (apellidos.equals("")) {

								JOptionPane.showMessageDialog(null, "Rellena el Campo de Apellidos",
										"INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);

							} else {
								
								PantallaLogin pL = new PantallaLogin();
								
								pL.setVisible(true);

							}

						}

					}

				}

				Conexion cn = new Conexion();
				Connection miConexion = cn.getConexion();
				String mysql = "INSERT INTO persona(Nombre, Apellidos, NombreUsuario, Contraseña, Correo, Direccion, Localidad, CodigoPostal, FechaNacimiento) VALUES ('"+nombre+"','"+ apellidos+"', '"+nombreUsuario +"', '"+contrasenya +"', '"+correo +"', '"+direccion+"', '"+localidad +"', '"+cP +"','"+ fechaNac+"')";
				
				
			}
				
		});
		btnRegistrarse.setBounds(403, 427, 89, 23);
		contentPane.add(btnRegistrarse);

		chckbxChico = new JCheckBox("Chico");
		chckbxChico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (chckbxChico.isSelected()) {

					genero = "Chico";

				}

			}
		});
		chckbxChico.setBounds(492, 324, 81, 23);
		contentPane.add(chckbxChico);

		chckbxChica = new JCheckBox("Chica");
		chckbxChica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (chckbxChica.isSelected()) {

					genero = "Chica";

				}

			}
		});
		chckbxChica.setBounds(438, 324, 79, 23);
		contentPane.add(chckbxChica);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fondo4.jpg"));
		lblNewLabel.setBounds(256, 87, 363, 393);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_Fondo = new JLabel("");
		lblNewLabel_Fondo.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\FondoLogearse.jpg"));
		lblNewLabel_Fondo.setBounds(-54, 0, 1136, 754);
		contentPane.add(lblNewLabel_Fondo);

	}
}

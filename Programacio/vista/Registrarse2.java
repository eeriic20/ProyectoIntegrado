package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

public class Registrarse2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Registrarse2() {
		setTitle("DELIVERY BUFA");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\logofinal.png"));
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

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		lblNombre.setBounds(300, 149, 81, 23);
		contentPane.add(lblNombre);

		JLabel lblNewLabel_Apellido = new JLabel("Apellidos: ");
		lblNewLabel_Apellido.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		lblNewLabel_Apellido.setBounds(300, 183, 81, 23);
		contentPane.add(lblNewLabel_Apellido);

		JLabel lblFechaNac = new JLabel("Fecha Nacimiento:");
		lblFechaNac.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		lblFechaNac.setBounds(299, 217, 101, 16);
		contentPane.add(lblFechaNac);

		JLabel lblNewLabel_Nombre = new JLabel("");
		lblNewLabel_Nombre.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fondo4.jpg"));
		lblNewLabel_Nombre.setBounds(257, 87, 363, 393);
		contentPane.add(lblNewLabel_Nombre);

		JLabel lblNewLabel_Fondo = new JLabel("");
		lblNewLabel_Fondo.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\FondoLogearse.jpg"));
		lblNewLabel_Fondo.setBounds(-54, 0, 1136, 754);
		contentPane.add(lblNewLabel_Fondo);

	}
}

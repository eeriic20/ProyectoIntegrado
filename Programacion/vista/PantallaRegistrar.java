package vista;

/**
 * <h1>Pantalla de Registro 1-Proyecto Integrado.</h1>
 * 
 * @author David, Alex y Eric.
 * 
 * @since 01/06/2021
 *
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import modelo.Cliente;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class PantallaRegistrar extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Usu;
	private JTextField textField_Correo;
	private JPasswordField passwordField_Contr;
	private JPasswordField passwordField_Rep;
	private JButton btn_nover;
	private JButton btn_ver;
	private JButton btn_nover2;
	private JButton btn_ver2;
	public String nombreUsuario;
	public String correoE;
	public String contrasenya;
	public Cliente c;

	/**
	 * Create the frame.
	 */
	public PantallaRegistrar() {
		setTitle("DELIVERY BUFA");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(PantallaRegistrar.class.getResource("/vista/Imagenes/logofinal.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setResizable(false);

		JLabel lblDeliveryBufa = new JLabel("DELIVERY BUFA");
		lblDeliveryBufa.setForeground(Color.DARK_GRAY);
		lblDeliveryBufa.setFont(new Font("Noto Serif Cond", Font.PLAIN, 18));
		lblDeliveryBufa.setBounds(355, 104, 149, 41);
		contentPane.add(lblDeliveryBufa);

		JLabel Usuar = new JLabel("Nombre Usuario:");
		Usuar.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		Usuar.setBounds(270, 164, 131, 41);
		contentPane.add(Usuar);

		JLabel CorrEl = new JLabel("Correo El\u00E9ctronico:");
		CorrEl.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		CorrEl.setBounds(270, 204, 163, 41);
		contentPane.add(CorrEl);

		JLabel Contra = new JLabel("Contrase\u00F1a:");
		Contra.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		Contra.setBounds(270, 256, 163, 41);
		contentPane.add(Contra);

		JLabel RepContra = new JLabel("Repetir Contrase\u00F1a:");
		RepContra.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		RepContra.setBounds(270, 308, 163, 41);
		contentPane.add(RepContra);

		/**
		 * 
		 * En este boton se comprueba que el usuario ha añadido los datos necesarios y
		 * que las dos contraseñas sean iguales
		 * 
		 */

		JButton btnRegistrarte = new JButton("Registrarte");
		btnRegistrarte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String pass1 = new String(passwordField_Contr.getPassword());
				String pass2 = new String(passwordField_Rep.getPassword());
				String usuario = textField_Usu.getText();
				String correo = textField_Correo.getText();

				nombreUsuario = usuario;
				contrasenya = pass1;
				correoE = correo;

				if (usuario.equals("")) {

					JOptionPane.showMessageDialog(null, "Rellena el Campo de Usuario", "INFORMATION_MESSAGE",
							JOptionPane.INFORMATION_MESSAGE);
				} else {

					if (correo.equals("")) {
						JOptionPane.showMessageDialog(null, "Rellena el Campo de Correo", "INFORMATION_MESSAGE",
								JOptionPane.INFORMATION_MESSAGE);

					} else {

						if (pass1.equals("")) {

							JOptionPane.showMessageDialog(null, "El campo contraseña no puede estar vacio",
									"INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);

						} else {
							if (pass1.equals(pass2)) {

								Registrarse2 frame = new Registrarse2(pass2, correo, usuario);
								dispose();
								frame.setVisible(true);
							} else {

								JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden",
										"INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);

							}

						}

					}

				}
			}
		});
		btnRegistrarte.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRegistrarte.setBounds(371, 399, 124, 33);
		contentPane.add(btnRegistrarte);

		textField_Usu = new JTextField();
		textField_Usu.setBounds(429, 176, 131, 20);
		contentPane.add(textField_Usu);
		textField_Usu.setColumns(10);

		textField_Correo = new JTextField();
		textField_Correo.setBounds(429, 216, 131, 20);
		contentPane.add(textField_Correo);
		textField_Correo.setColumns(10);

		passwordField_Contr = new JPasswordField();
		passwordField_Contr.setBounds(429, 268, 131, 20);
		contentPane.add(passwordField_Contr);
		passwordField_Contr.setColumns(10);
		passwordField_Contr.setEchoChar('*');

		passwordField_Rep = new JPasswordField();
		passwordField_Rep.setBounds(429, 320, 131, 20);
		contentPane.add(passwordField_Rep);
		passwordField_Rep.setColumns(10);
		passwordField_Rep.setEchoChar('*');

		btn_ver = new JButton("");
		btn_ver.setIcon(new ImageIcon(PantallaRegistrar.class.getResource("/vista/Imagenes/verpass1.png")));
		btn_ver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				passwordField_Contr.setEchoChar((char) 0);

				btn_ver.setVisible(false);
				btn_nover.setVisible(true);

			}
		});

		btn_ver.setBounds(570, 268, 31, 20);
		contentPane.add(btn_ver);

		btn_nover = new JButton("");
		btn_nover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				passwordField_Contr.setEchoChar('*');

				btn_nover.setVisible(false);
				btn_ver.setVisible(true);

			}
		});

		btn_nover.setIcon(new ImageIcon(PantallaRegistrar.class.getResource("/vista/Imagenes/noverPass1.png")));
		btn_nover.setBounds(570, 268, 31, 20);
		contentPane.add(btn_nover);

		btn_ver2 = new JButton("");
		btn_ver2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				passwordField_Rep.setEchoChar((char) 0);

				btn_ver2.setVisible(false);
				btn_nover2.setVisible(true);

			}
		});
		btn_ver2.setIcon(new ImageIcon(PantallaRegistrar.class.getResource("/vista/Imagenes/verpass1.png")));
		btn_ver2.setBounds(570, 320, 31, 20);
		contentPane.add(btn_ver2);

		btn_nover2 = new JButton("");
		btn_nover2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				passwordField_Rep.setEchoChar('*');

				btn_nover2.setVisible(false);
				btn_ver2.setVisible(true);

			}
		});
		btn_nover2.setIcon(new ImageIcon(PantallaRegistrar.class.getResource("/vista/Imagenes/noverPass1.png")));
		btn_nover2.setBounds(570, 320, 31, 20);
		contentPane.add(btn_nover2);

		JLabel Logo = new JLabel("");
		Logo.setIcon(new ImageIcon(PantallaRegistrar.class.getResource("/vista/Imagenes/logo.PNG")));
		Logo.setBounds(349, -14, 186, 107);
		contentPane.add(Logo);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PantallaRegistrar.class.getResource("/vista/Imagenes/fondo4.jpg")));
		lblNewLabel.setBounds(257, 87, 363, 393);
		contentPane.add(lblNewLabel);

		JLabel Fondo = new JLabel("");
		Fondo.setHorizontalAlignment(SwingConstants.CENTER);
		Fondo.setIcon(new ImageIcon(PantallaRegistrar.class.getResource("/vista/Imagenes/FondoLogearse.jpg")));
		Fondo.setBounds(-54, 0, 1136, 754);
		contentPane.add(Fondo);

	}
}

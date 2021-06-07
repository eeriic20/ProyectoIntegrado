package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import conexion.Conexion;
import controlador.Numero;
import controlador.Pedido;

public class MenuGinos extends JFrame {

	private JPanel contentPane;
	private String nombre;
	private int precio;
	private int id_localidad;
	private String estado;
	private String empresa;
	private String direccion;
	private int idCliente;
	private Date fecha;
	private int precioTotal = 0;
	private String menuTotal = "";

	/**
	 * Create the frame.
	 */
	public MenuGinos(int id, String localidad, String direccionD, String empresaE) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\logofinal.png"));
		setTitle("DELIVERY BUFA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setResizable(false);

		JLabel precio_prosciutto = new JLabel("9");
		precio_prosciutto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_prosciutto.setBounds(185, 209, 14, 14);
		contentPane.add(precio_prosciutto);

		JLabel precio_Margherita = new JLabel("8");
		precio_Margherita.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_Margherita.setBounds(664, 209, 14, 14);
		contentPane.add(precio_Margherita);

		JLabel precio_pollo = new JLabel("8");
		precio_pollo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_pollo.setBounds(455, 209, 14, 14);
		contentPane.add(precio_pollo);

		JLabel precio_peperoni = new JLabel("7");
		precio_peperoni.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_peperoni.setBounds(442, 397, 14, 14);
		contentPane.add(precio_peperoni);

		JLabel precio_tagliatelle = new JLabel("12");
		precio_tagliatelle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_tagliatelle.setBounds(697, 397, 26, 14);
		contentPane.add(precio_tagliatelle);

		JLabel precio_cacio = new JLabel("8");
		precio_cacio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_cacio.setBounds(690, 571, 14, 14);
		contentPane.add(precio_cacio);

		JLabel precio_penne = new JLabel("7");
		precio_penne.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_penne.setBounds(518, 571, 14, 14);
		contentPane.add(precio_penne);

		JLabel precio_spaghetti = new JLabel("7");
		precio_spaghetti.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_spaghetti.setBounds(261, 571, 14, 14);
		contentPane.add(precio_spaghetti);

		JLabel precio_piemontese = new JLabel("11");
		precio_piemontese.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_piemontese.setBounds(207, 397, 16, 14);
		contentPane.add(precio_piemontese);

		JLabel lblNewLabel = new JLabel("Prosciutto:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(116, 200, 72, 33);
		contentPane.add(lblNewLabel);

		JLabel newu = new JLabel("Pollo Barbecue:");
		newu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		newu.setBounds(357, 201, 98, 31);
		contentPane.add(newu);

		JLabel lblMenMcPollo = new JLabel("Margherita:");
		lblMenMcPollo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcPollo.setBounds(591, 202, 81, 31);
		contentPane.add(lblMenMcPollo);

		JLabel lblMenAmericanStyle = new JLabel("Piemontese:");
		lblMenAmericanStyle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenAmericanStyle.setBounds(134, 393, 81, 22);
		contentPane.add(lblMenAmericanStyle);

		JLabel lblMenHappyMeal = new JLabel("Peperoni:");
		lblMenHappyMeal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenHappyMeal.setBounds(383, 393, 62, 22);
		contentPane.add(lblMenHappyMeal);

		JLabel lblMenGrandMcextreme = new JLabel("Tagliatelle Integrali Primavera:");
		lblMenGrandMcextreme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenGrandMcextreme.setBounds(518, 393, 188, 22);
		contentPane.add(lblMenGrandMcextreme);

		JLabel lblMenMcfish = new JLabel("Spaghetti Ai Frutti Di Mare:");
		lblMenMcfish.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcfish.setBounds(98, 566, 165, 25);
		contentPane.add(lblMenMcfish);

		JLabel lblMenDobleQueso = new JLabel("Penne All'Arrabbiata Di Pepperoni:");
		lblMenDobleQueso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenDobleQueso.setBounds(309, 566, 211, 25);
		contentPane.add(lblMenDobleQueso);

		JLabel lblMenMcwrap = new JLabel("Cacio e Pepe:");
		lblMenMcwrap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcwrap.setBounds(604, 566, 88, 25);
		contentPane.add(lblMenMcwrap);

		JLabel lblEligeTuMen = new JLabel("ELIGE TU MEN\u00DA");
		lblEligeTuMen.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblEligeTuMen.setBounds(309, 0, 388, 61);
		contentPane.add(lblEligeTuMen);

		JButton prosciutto = new JButton("New button");
		prosciutto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nMenus = 0;
				String seleccion = JOptionPane.showInputDialog(null, "Selecciona una cantidad");

				while (!Numero.esNumero(seleccion)) {

					if (seleccion != null) {

						seleccion = JOptionPane.showInputDialog(null, "Por favor introduce un número valido");

						if (Numero.esNumero(seleccion)) {

							nMenus = Integer.parseInt(seleccion);

						}

					} else {

					}
				}

				precio = Integer.parseInt(precio_prosciutto.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Pizza prosciutto";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		prosciutto.setIcon(new ImageIcon(MenuGinos.class.getResource("/vista/Imagenes/ginos/8prosciutto_1.jpg")));
		prosciutto.setForeground(Color.WHITE);
		prosciutto.setBackground(Color.WHITE);
		prosciutto.setBounds(106, 52, 150, 150);
		contentPane.add(prosciutto);

		JButton barbecue = new JButton("New button");
		barbecue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nMenus = 0;
				String seleccion = JOptionPane.showInputDialog(null, "Selecciona una cantidad");

				while (!Numero.esNumero(seleccion)) {

					if (seleccion != null) {

						seleccion = JOptionPane.showInputDialog(null, "Por favor introduce un número valido");

						if (Numero.esNumero(seleccion)) {

							nMenus = Integer.parseInt(seleccion);

						}

					} else {

					}
				}

				precio = Integer.parseInt(precio_pollo.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Pollo BBQ";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}

		});
		barbecue.setIcon(new ImageIcon(
				MenuGinos.class.getResource("/vista/Imagenes/ginos/fichainterna1366x852pxpollobarbecue.jpg")));
		barbecue.setForeground(Color.WHITE);
		barbecue.setBackground(Color.WHITE);
		barbecue.setBounds(336, 52, 150, 150);
		contentPane.add(barbecue);

		JButton margherita = new JButton("New button");
		margherita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int nMenus = 0;
				String seleccion = JOptionPane.showInputDialog(null, "Selecciona una cantidad");

				while (!Numero.esNumero(seleccion)) {

					if (seleccion != null) {

						seleccion = JOptionPane.showInputDialog(null, "Por favor introduce un número valido");

						if (Numero.esNumero(seleccion)) {

							nMenus = Integer.parseInt(seleccion);

						}

					} else {

					}
				}

				precio = Integer.parseInt(precio_Margherita.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Margherita";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		margherita.setIcon(new ImageIcon(MenuGinos.class.getResource("/vista/Imagenes/ginos/8margherita.jpg")));
		margherita.setForeground(Color.WHITE);
		margherita.setBackground(Color.WHITE);
		margherita.setBounds(569, 52, 150, 150);
		contentPane.add(margherita);

		JButton piemontese = new JButton("New button");
		piemontese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nMenus = 0;
				String seleccion = JOptionPane.showInputDialog(null, "Selecciona una cantidad");

				while (!Numero.esNumero(seleccion)) {

					if (seleccion != null) {

						seleccion = JOptionPane.showInputDialog(null, "Por favor introduce un número valido");

						if (Numero.esNumero(seleccion)) {

							nMenus = Integer.parseInt(seleccion);

						}

					} else {

					}
				}

				precio = Integer.parseInt(precio_piemontese.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Piemontese";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		piemontese.setIcon(new ImageIcon(MenuGinos.class.getResource("/vista/Imagenes/ginos/8piemontese_0.jpg")));
		piemontese.setForeground(Color.WHITE);
		piemontese.setBackground(Color.WHITE);
		piemontese.setBounds(106, 244, 150, 150);
		contentPane.add(piemontese);

		JButton peperoni = new JButton("New button");
		peperoni.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int nMenus = 0;
				String seleccion = JOptionPane.showInputDialog(null, "Selecciona una cantidad");

				while (!Numero.esNumero(seleccion)) {

					if (seleccion != null) {

						seleccion = JOptionPane.showInputDialog(null, "Por favor introduce un número valido");

						if (Numero.esNumero(seleccion)) {

							nMenus = Integer.parseInt(seleccion);

						}

					} else {

					}
				}

				precio = Integer.parseInt(precio_peperoni.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Peperoni";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		peperoni.setIcon(new ImageIcon(MenuGinos.class.getResource("/vista/Imagenes/ginos/pepperoni_0.jpg")));
		peperoni.setForeground(Color.WHITE);
		peperoni.setBackground(Color.WHITE);
		peperoni.setBounds(336, 244, 150, 150);
		contentPane.add(peperoni);

		JButton tagliatelle = new JButton("New button");
		tagliatelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nMenus = 0;
				String seleccion = JOptionPane.showInputDialog(null, "Selecciona una cantidad");

				while (!Numero.esNumero(seleccion)) {

					if (seleccion != null) {

						seleccion = JOptionPane.showInputDialog(null, "Por favor introduce un número valido");

						if (Numero.esNumero(seleccion)) {

							nMenus = Integer.parseInt(seleccion);

						}

					} else {

					}
				}

				precio = Integer.parseInt(precio_tagliatelle.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Tagliatelle";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);
			}
		});
		tagliatelle
				.setIcon(new ImageIcon(MenuGinos.class.getResource("/vista/Imagenes/ginos/tagliatelleprimavera.jpg")));
		tagliatelle.setForeground(Color.WHITE);
		tagliatelle.setBackground(Color.WHITE);
		tagliatelle.setBounds(569, 244, 150, 150);
		contentPane.add(tagliatelle);

		JButton spaghetti = new JButton("New button");
		spaghetti.setIcon(
				new ImageIcon(MenuGinos.class.getResource("/vista/Imagenes/ginos/8ginos-fruti-de-mare-1366x852.jpg")));
		spaghetti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int nMenus = 0;
				String seleccion = JOptionPane.showInputDialog(null, "Selecciona una cantidad");

				while (!Numero.esNumero(seleccion)) {

					if (seleccion != null) {

						seleccion = JOptionPane.showInputDialog(null, "Por favor introduce un número valido");

						if (Numero.esNumero(seleccion)) {

							nMenus = Integer.parseInt(seleccion);

						}

					} else {

					}
				}

				precio = Integer.parseInt(precio_spaghetti.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Spaghetti";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		spaghetti.setForeground(Color.WHITE);
		spaghetti.setBackground(Color.WHITE);
		spaghetti.setBounds(106, 418, 150, 150);
		contentPane.add(spaghetti);

		JButton penne = new JButton("New button");
		penne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nMenus = 0;
				String seleccion = JOptionPane.showInputDialog(null, "Selecciona una cantidad");

				while (!Numero.esNumero(seleccion)) {

					if (seleccion != null) {

						seleccion = JOptionPane.showInputDialog(null, "Por favor introduce un número valido");

						if (Numero.esNumero(seleccion)) {

							nMenus = Integer.parseInt(seleccion);

						}

					} else {

					}
				}

				precio = Integer.parseInt(precio_penne.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Penne";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		penne.setIcon(new ImageIcon(MenuGinos.class
				.getResource("/vista/Imagenes/ginos/8nuevos-penne-allarrabbiata-di-pepperoni-en-ginos.jpg")));
		penne.setForeground(Color.WHITE);
		penne.setBackground(Color.WHITE);
		penne.setBounds(336, 418, 150, 150);
		contentPane.add(penne);

		JButton cacio = new JButton((String) null);
		cacio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nMenus = 0;
				String seleccion = JOptionPane.showInputDialog(null, "Selecciona una cantidad");

				while (!Numero.esNumero(seleccion)) {

					if (seleccion != null) {

						seleccion = JOptionPane.showInputDialog(null, "Por favor introduce un número valido");

						if (Numero.esNumero(seleccion)) {

							nMenus = Integer.parseInt(seleccion);

						}

					} else {

					}
				}

				precio = Integer.parseInt(precio_cacio.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Cacio e Pepe";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		cacio.setIcon(new ImageIcon(MenuGinos.class.getResource("/vista/Imagenes/ginos/caciopepe.jpg")));
		cacio.setForeground(Color.WHITE);
		cacio.setBackground(Color.WHITE);
		cacio.setBounds(569, 418, 150, 150);
		contentPane.add(cacio);

		JLabel label_euro = new JLabel("\u20AC");
		label_euro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_euro.setBounds(198, 209, 14, 14);
		contentPane.add(label_euro);

		JLabel label_euro_1 = new JLabel("\u20AC");
		label_euro_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_euro_1.setBounds(273, 571, 14, 14);
		contentPane.add(label_euro_1);

		JLabel label_euro_2 = new JLabel("\u20AC");
		label_euro_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_euro_2.setBounds(678, 209, 14, 14);
		contentPane.add(label_euro_2);

		JLabel label_euro_3 = new JLabel("\u20AC");
		label_euro_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_euro_3.setBounds(465, 209, 14, 14);
		contentPane.add(label_euro_3);

		JLabel label_euro_4 = new JLabel("\u20AC");
		label_euro_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_euro_4.setBounds(455, 397, 14, 14);
		contentPane.add(label_euro_4);

		JLabel label_euro_5 = new JLabel("\u20AC");
		label_euro_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_euro_5.setBounds(717, 397, 14, 14);
		contentPane.add(label_euro_5);

		JLabel label_euro_6 = new JLabel("\u20AC");
		label_euro_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_euro_6.setBounds(705, 571, 14, 14);
		contentPane.add(label_euro_6);

		JLabel label_euro_7 = new JLabel("\u20AC");
		label_euro_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_euro_7.setBounds(531, 571, 14, 14);
		contentPane.add(label_euro_7);

		JLabel label_euro_8 = new JLabel("\u20AC");
		label_euro_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_euro_8.setBounds(225, 397, 14, 14);
		contentPane.add(label_euro_8);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PantallaRestaurantes pR = new PantallaRestaurantes(id, localidad, direccionD);
				dispose();
				pR.setVisible(true);

			}
		});
		btnNewButton.setIcon(new ImageIcon(MenuGinos.class.getResource("/vista/Imagenes/flecha.png")));
		btnNewButton.setBounds(0, 0, 60, 60);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Terminar pedido");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Conexion c = new Conexion();

				empresa = empresaE;
				direccion = direccionD;
				estado = "En proceso";
				idCliente = id;

				fecha = new Date(Calendar.getInstance().getTimeInMillis());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String fechaTexto = formatter.format(fecha);

				try {

					Statement s = c.getConexion().createStatement();
					String sql = "select Codigo from localidad where Nombre = '" + localidad + "'";
					ResultSet rs = s.executeQuery(sql);

					if (rs.next()) {

						id_localidad = Integer.parseInt(rs.getString("Codigo"));

					}

				} catch (SQLException e1) {

					e1.printStackTrace();

				}

				Pedido p = new Pedido();

				p.terminarPedido(menuTotal, fechaTexto, precioTotal, estado, empresa, direccion, id_localidad,
						idCliente, contentPane);

			}

		});
		btnNewButton_1.setBounds(729, 480, 140, 110);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("Ver pedido");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(contentPane,
						"Su pedido: '" + menuTotal + "' con un coste total de " + precioTotal + "€", "Su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		btnNewButton_1_1.setBounds(727, 359, 142, 110);
		contentPane.add(btnNewButton_1_1);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(
				new ImageIcon(MenuGinos.class.getResource("/vista/Imagenes/Virtual-Backgrounds_Confetti-On-Gold.jpg")));
		lblNewLabel_1.setBounds(-156, -32, 1147, 666);
		contentPane.add(lblNewLabel_1);

	}
}

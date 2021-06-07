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

public class MenuKebab extends JFrame {

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
	public MenuKebab(int id, String localidad, String direccionD, String empresaE) {
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

		JLabel lblEligeTuMen = new JLabel("ELIGE TU MEN\u00DA");
		lblEligeTuMen.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblEligeTuMen.setBounds(309, 0, 388, 61);
		contentPane.add(lblEligeTuMen);

		JLabel label = new JLabel("5");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(214, 210, 15, 14);
		contentPane.add(label);

		JLabel precio_kbPollo = new JLabel("4");
		precio_kbPollo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_kbPollo.setBounds(691, 212, 15, 14);
		contentPane.add(precio_kbPollo);

		JLabel precio_kbPitaMx = new JLabel("6");
		precio_kbPitaMx.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_kbPitaMx.setBounds(258, 399, 15, 14);
		contentPane.add(precio_kbPitaMx);

		JLabel precio_PizzaJQ = new JLabel("6");
		precio_PizzaJQ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_PizzaJQ.setBounds(224, 573, 15, 14);
		contentPane.add(precio_PizzaJQ);

		JLabel precio_kbPitaTer = new JLabel("6");
		precio_kbPitaTer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_kbPitaTer.setBounds(502, 399, 15, 14);
		contentPane.add(precio_kbPitaTer);

		JLabel precio_PKeb = new JLabel("6");
		precio_PKeb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_PKeb.setBounds(481, 573, 15, 14);
		contentPane.add(precio_PKeb);

		JLabel precio_kbPitaPoll = new JLabel("6");
		precio_kbPitaPoll.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_kbPitaPoll.setBounds(708, 399, 15, 14);
		contentPane.add(precio_kbPitaPoll);

		JLabel precio_PizzAaBBq = new JLabel("7");
		precio_PizzAaBBq.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_PizzAaBBq.setBounds(704, 573, 15, 14);
		contentPane.add(precio_PizzAaBBq);

		JLabel precio_kbTernera = new JLabel("5");
		precio_kbTernera.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_kbTernera.setBounds(473, 210, 15, 14);
		contentPane.add(precio_kbTernera);

		JButton mixto = new JButton("New button");
		mixto.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_kbTernera.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Kebab mixto";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		mixto.setIcon(new ImageIcon(MenuKebab.class.getResource("/vista/Imagenes/kebab/mixto.jpg")));
		mixto.setForeground(Color.WHITE);
		mixto.setBackground(Color.WHITE);
		mixto.setBounds(106, 52, 150, 150);
		contentPane.add(mixto);

		JButton ternera = new JButton("New button");
		ternera.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_kbTernera.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Kebab ternera";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		ternera.setIcon(new ImageIcon(MenuKebab.class.getResource("/vista/Imagenes/kebab/ternera.jpg")));
		ternera.setForeground(Color.WHITE);
		ternera.setBackground(Color.WHITE);
		ternera.setBounds(336, 52, 150, 150);
		contentPane.add(ternera);

		JButton pollo = new JButton("New button");
		pollo.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_kbPollo.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Kebab pollo";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		pollo.setIcon(new ImageIcon(MenuKebab.class.getResource("/vista/Imagenes/kebab/pollo.jpg")));
		pollo.setForeground(Color.WHITE);
		pollo.setBackground(Color.WHITE);
		pollo.setBounds(569, 52, 150, 150);
		contentPane.add(pollo);

		JButton mixtoPita = new JButton("New button");
		mixtoPita.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_kbPitaMx.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Kebab mixto pan de pita";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		mixtoPita.setIcon(new ImageIcon(MenuKebab.class.getResource("/vista/Imagenes/kebab/mixtopanpita.png")));
		mixtoPita.setForeground(Color.WHITE);
		mixtoPita.setBackground(Color.WHITE);
		mixtoPita.setBounds(106, 244, 150, 150);
		contentPane.add(mixtoPita);

		JButton terneraPita = new JButton("New button");
		terneraPita.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_kbPitaTer.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Kebab ternera pan de pita";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		terneraPita.setIcon(new ImageIcon(MenuKebab.class.getResource("/vista/Imagenes/kebab/ternerapanpita.png")));
		terneraPita.setForeground(Color.WHITE);
		terneraPita.setBackground(Color.WHITE);
		terneraPita.setBounds(336, 244, 150, 150);
		contentPane.add(terneraPita);

		JButton polloPita = new JButton("New button");
		polloPita.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_kbPitaPoll.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Kebab pollo pan de pita";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		polloPita.setIcon(new ImageIcon(MenuKebab.class.getResource("/vista/Imagenes/kebab/pollopanpita.jpg")));
		polloPita.setForeground(Color.WHITE);
		polloPita.setBackground(Color.WHITE);
		polloPita.setBounds(569, 244, 150, 150);
		contentPane.add(polloPita);

		JButton pizzaKebab = new JButton("New button");
		pizzaKebab.setIcon(new ImageIcon(MenuKebab.class.getResource("/vista/Imagenes/kebab/kebabpizza2.jpg")));
		pizzaKebab.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_PKeb.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Pizza kebab";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);
			}
		});
		pizzaKebab.setForeground(Color.WHITE);
		pizzaKebab.setBackground(Color.WHITE);
		pizzaKebab.setBounds(106, 418, 150, 150);
		contentPane.add(pizzaKebab);

		JButton jamonQueso = new JButton("New button");
		jamonQueso.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_PizzaJQ.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Pizza jamon y queso";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);
			}
		});
		jamonQueso.setIcon(new ImageIcon(
				MenuKebab.class.getResource("/vista/Imagenes/kebab/pizza_jamonyqueso_sinlactosa_730x470.jpg")));
		jamonQueso.setForeground(Color.WHITE);
		jamonQueso.setBackground(Color.WHITE);
		jamonQueso.setBounds(336, 418, 150, 150);
		contentPane.add(jamonQueso);

		JButton barbacoa = new JButton((String) null);
		barbacoa.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_PizzAaBBq.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Pizza barbacoa";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		barbacoa.setIcon(new ImageIcon(MenuKebab.class.getResource("/vista/Imagenes/kebab/pizza-barbacoa-xxl.jpg")));
		barbacoa.setForeground(Color.WHITE);
		barbacoa.setBackground(Color.WHITE);
		barbacoa.setBounds(569, 418, 150, 150);
		contentPane.add(barbacoa);

		JLabel lblNewLabel = new JLabel("Kebab Mixto");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(131, 201, 91, 33);
		contentPane.add(lblNewLabel);

		JLabel newu = new JLabel("Kebab de Ternera");
		newu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		newu.setBounds(359, 202, 115, 31);
		contentPane.add(newu);

		JLabel lblMenMcPollo = new JLabel("Kebab de pollo");
		lblMenMcPollo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcPollo.setBounds(594, 202, 103, 31);
		contentPane.add(lblMenMcPollo);

		JLabel lblMenAmericanStyle = new JLabel("Kebab Mixto Pan de Pita");
		lblMenAmericanStyle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenAmericanStyle.setBounds(106, 393, 150, 22);
		contentPane.add(lblMenAmericanStyle);

		JLabel lblMenHappyMeal = new JLabel("Kebab de Ternera Pan de Pita");
		lblMenHappyMeal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenHappyMeal.setBounds(309, 393, 194, 22);
		contentPane.add(lblMenHappyMeal);

		JLabel lblMenGrandMcextreme = new JLabel("Kebab de Pollo Pan de Pita");
		lblMenGrandMcextreme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenGrandMcextreme.setBounds(542, 395, 173, 22);
		contentPane.add(lblMenGrandMcextreme);

		JLabel lblMenMcfish = new JLabel("Pizza Kebab");
		lblMenMcfish.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcfish.setBounds(138, 566, 107, 25);
		contentPane.add(lblMenMcfish);

		JLabel lblMenDobleQueso = new JLabel("Pizza Jamon y Queso");
		lblMenDobleQueso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenDobleQueso.setBounds(346, 566, 150, 25);
		contentPane.add(lblMenDobleQueso);

		JLabel hola = new JLabel("Pizza Barbacoa");
		hola.setFont(new Font("Tahoma", Font.PLAIN, 14));
		hola.setBounds(606, 566, 91, 25);
		contentPane.add(hola);

		JLabel label_1 = new JLabel("\u20AC");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(224, 210, 21, 14);
		contentPane.add(label_1);

		JLabel label_1_1 = new JLabel("\u20AC");
		label_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_1.setBounds(484, 210, 21, 14);
		contentPane.add(label_1_1);

		JLabel label_1_1_1 = new JLabel("\u20AC");
		label_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_1_1.setBounds(701, 213, 21, 14);
		contentPane.add(label_1_1_1);

		JLabel label_1_1_2 = new JLabel("\u20AC");
		label_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_1_2.setBounds(719, 400, 21, 14);
		contentPane.add(label_1_1_2);

		JLabel label_1_1_3 = new JLabel("\u20AC");
		label_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_1_3.setBounds(511, 399, 21, 14);
		contentPane.add(label_1_1_3);

		JLabel label_1_1_4 = new JLabel("\u20AC");
		label_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_1_4.setBounds(266, 399, 21, 14);
		contentPane.add(label_1_1_4);

		JLabel label_1_1_5 = new JLabel("\u20AC");
		label_1_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_1_5.setBounds(235, 573, 21, 14);
		contentPane.add(label_1_1_5);

		JLabel label_1_1_6 = new JLabel("\u20AC");
		label_1_1_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_1_6.setBounds(491, 573, 21, 14);
		contentPane.add(label_1_1_6);

		JLabel label_1_1_7 = new JLabel("\u20AC");
		label_1_1_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_1_7.setBounds(712, 573, 21, 14);
		contentPane.add(label_1_1_7);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PantallaRestaurantes pR = new PantallaRestaurantes(id, localidad, direccionD);
				dispose();
				pR.setVisible(true);

			}
		});
		btnNewButton.setIcon(new ImageIcon(MenuKebab.class.getResource("/vista/Imagenes/flecha.png")));
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
		btnNewButton_1.setBounds(732, 480, 137, 110);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("Ver pedido");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(contentPane,
						"Su pedido: '" + menuTotal + "' con un coste total de " + precioTotal + "€", "Su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		btnNewButton_1_1.setBounds(731, 359, 138, 110);
		contentPane.add(btnNewButton_1_1);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(
				new ImageIcon(MenuKebab.class.getResource("/vista/Imagenes/Virtual-Backgrounds_Confetti-On-Gold.jpg")));
		lblNewLabel_1.setBounds(-156, -32, 1147, 666);
		contentPane.add(lblNewLabel_1);

	}

}

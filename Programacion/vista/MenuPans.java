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

public class MenuPans extends JFrame {

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
	public MenuPans(int id, String localidad, String direccionD, String empresaE) {
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

		JLabel precio_pechugapollo = new JLabel("4");
		precio_pechugapollo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_pechugapollo.setBounds(243, 213, 13, 14);
		contentPane.add(precio_pechugapollo);

		JLabel label = new JLabel("\u20AC");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(254, 213, 46, 14);
		contentPane.add(label);

		JLabel precio_breton = new JLabel("5");
		precio_breton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_breton.setBounds(427, 212, 13, 14);
		contentPane.add(precio_breton);

		JLabel precio_iberico = new JLabel("4");
		precio_iberico.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_iberico.setBounds(676, 213, 13, 14);
		contentPane.add(precio_iberico);

		JLabel precio_britishbacon = new JLabel("4");
		precio_britishbacon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_britishbacon.setBounds(230, 399, 13, 14);
		contentPane.add(precio_britishbacon);

		JLabel precio_serranobrie = new JLabel("5");
		precio_serranobrie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_serranobrie.setBounds(438, 399, 13, 14);
		contentPane.add(precio_serranobrie);

		JLabel precio_pollosupreme = new JLabel("5");
		precio_pollosupreme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_pollosupreme.setBounds(695, 399, 13, 14);
		contentPane.add(precio_pollosupreme);

		JLabel precio_crujientepollobacon = new JLabel("4");
		precio_crujientepollobacon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_crujientepollobacon.setBounds(266, 573, 13, 14);
		contentPane.add(precio_crujientepollobacon);

		JLabel precio_pulledporkbbq = new JLabel("6");
		precio_pulledporkbbq.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_pulledporkbbq.setBounds(461, 573, 13, 14);
		contentPane.add(precio_pulledporkbbq);

		JLabel precio_asadobrie = new JLabel("6");
		precio_asadobrie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_asadobrie.setBounds(695, 573, 13, 14);
		contentPane.add(precio_asadobrie);

		JButton pechuga = new JButton("New button");
		pechuga.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_pechugapollo.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Pechuga de Pollo";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		pechuga.setIcon(new ImageIcon(MenuPans.class.getResource("/vista/Imagenes/pans/1pechugapollo.jpg")));
		pechuga.setForeground(Color.WHITE);
		pechuga.setBackground(Color.WHITE);
		pechuga.setBounds(106, 52, 150, 150);
		contentPane.add(pechuga);

		JButton breton = new JButton("New button");
		breton.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_breton.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Breton";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		breton.setIcon(new ImageIcon(MenuPans.class.getResource("/vista/Imagenes/pans/BRET\u00D3N.jpg")));
		breton.setForeground(Color.WHITE);
		breton.setBackground(Color.WHITE);
		breton.setBounds(336, 52, 150, 150);
		contentPane.add(breton);

		JButton iberico = new JButton("New button");
		iberico.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_iberico.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Ibérico";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		iberico.setIcon(new ImageIcon(MenuPans.class.getResource("/vista/Imagenes/pans/IB\u00C9RICO.jpg")));
		iberico.setForeground(Color.WHITE);
		iberico.setBackground(Color.WHITE);
		iberico.setBounds(569, 52, 150, 150);
		contentPane.add(iberico);

		JButton british = new JButton("New button");
		british.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_britishbacon.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" British Bacon";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		british.setIcon(new ImageIcon(MenuPans.class.getResource("/vista/Imagenes/pans/BRITISH BACON.jpg")));
		british.setForeground(Color.WHITE);
		british.setBackground(Color.WHITE);
		british.setBounds(106, 244, 150, 150);
		contentPane.add(british);

		JButton serrano = new JButton("New button");
		serrano.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_serranobrie.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Serrano Brie";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		serrano.setIcon(new ImageIcon(MenuPans.class.getResource("/vista/Imagenes/pans/serranobrie.jpg")));
		serrano.setForeground(Color.WHITE);
		serrano.setBackground(Color.WHITE);
		serrano.setBounds(336, 244, 150, 150);
		contentPane.add(serrano);

		JButton supreme = new JButton("New button");
		supreme.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_pollosupreme.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Pollo Supreme";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		supreme.setIcon(new ImageIcon(MenuPans.class.getResource("/vista/Imagenes/pans/POLLO SUPREME.jpg")));
		supreme.setForeground(Color.WHITE);
		supreme.setBackground(Color.WHITE);
		supreme.setBounds(569, 244, 150, 150);
		contentPane.add(supreme);

		JButton crujiente = new JButton("New button");
		crujiente.setIcon(
				new ImageIcon(MenuPans.class.getResource("/vista/Imagenes/pans/CRUJIENTE DE POLLO Y BACON.jpg")));
		crujiente.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_crujientepollobacon.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Crujiente de Pollo y Bacon";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		crujiente.setForeground(Color.WHITE);
		crujiente.setBackground(Color.WHITE);
		crujiente.setBounds(106, 418, 150, 150);
		contentPane.add(crujiente);

		JButton pulled = new JButton("New button");
		pulled.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_pulledporkbbq.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Pulled Pork BBQ";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		pulled.setIcon(new ImageIcon(MenuPans.class.getResource("/vista/Imagenes/pans/PULLED PORK BBQ.jpg")));
		pulled.setForeground(Color.WHITE);
		pulled.setBackground(Color.WHITE);
		pulled.setBounds(336, 418, 150, 150);
		contentPane.add(pulled);

		JButton asado = new JButton((String) null);
		asado.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_asadobrie.getText());
				precioTotal = precioTotal + precio;
				nombre = "Asado Brie";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		asado.setIcon(new ImageIcon(MenuPans.class.getResource("/vista/Imagenes/pans/POLLO ASADO BRIE.jpg")));
		asado.setForeground(Color.WHITE);
		asado.setBackground(Color.WHITE);
		asado.setBounds(569, 418, 150, 150);
		contentPane.add(asado);

		JLabel lblNewLabel = new JLabel("Pechuga de Pollo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(130, 201, 107, 33);
		contentPane.add(lblNewLabel);

		JLabel newu = new JLabel("Bret\u00F3n");
		newu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		newu.setBounds(383, 202, 68, 31);
		contentPane.add(newu);

		JLabel lblMenMcPollo = new JLabel("Ib\u00E9rico");
		lblMenMcPollo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcPollo.setBounds(629, 202, 68, 31);
		contentPane.add(lblMenMcPollo);

		JLabel lblMenAmericanStyle = new JLabel("British Bacon");
		lblMenAmericanStyle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenAmericanStyle.setBounds(149, 393, 107, 22);
		contentPane.add(lblMenAmericanStyle);

		JLabel lblMenHappyMeal = new JLabel("Serrano Brie");
		lblMenHappyMeal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenHappyMeal.setBounds(359, 393, 115, 22);
		contentPane.add(lblMenHappyMeal);

		JLabel lblMenGrandMcextreme = new JLabel("Pollo Supreme");
		lblMenGrandMcextreme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenGrandMcextreme.setBounds(601, 393, 118, 22);
		contentPane.add(lblMenGrandMcextreme);

		JLabel lblMenMcfish = new JLabel("Crujiente de Pollo y Bacon");
		lblMenMcfish.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcfish.setBounds(101, 566, 168, 25);
		contentPane.add(lblMenMcfish);

		JLabel lblMenDobleQueso = new JLabel("Pulled Pork BBQ");
		lblMenDobleQueso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenDobleQueso.setBounds(361, 566, 125, 25);
		contentPane.add(lblMenDobleQueso);

		JLabel hola = new JLabel("Pollo Asado Brie");
		hola.setFont(new Font("Tahoma", Font.PLAIN, 14));
		hola.setBounds(593, 566, 126, 25);
		contentPane.add(hola);

		JLabel label_1 = new JLabel("\u20AC");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(440, 213, 46, 14);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("\u20AC");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(687, 213, 46, 14);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("\u20AC");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(243, 399, 46, 14);
		contentPane.add(label_3);

		JLabel label_4 = new JLabel("\u20AC");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(453, 399, 46, 14);
		contentPane.add(label_4);

		JLabel label_5 = new JLabel("\u20AC");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(705, 399, 46, 14);
		contentPane.add(label_5);

		JLabel label_6 = new JLabel("\u20AC");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(279, 573, 46, 14);
		contentPane.add(label_6);

		JLabel label_7 = new JLabel("\u20AC");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_7.setBounds(473, 573, 46, 14);
		contentPane.add(label_7);

		JLabel label_8 = new JLabel("\u20AC");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds(705, 573, 46, 14);
		contentPane.add(label_8);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PantallaRestaurantes pR = new PantallaRestaurantes(id, localidad, direccionD);
				dispose();
				pR.setVisible(true);

			}
		});
		btnNewButton.setIcon(new ImageIcon(MenuPans.class.getResource("/vista/Imagenes/flecha.png")));
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
		btnNewButton_1.setBounds(730, 480, 139, 110);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("Ver pedido");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(contentPane,
						"Su pedido: '" + menuTotal + "' con un coste total de " + precioTotal + "€", "Su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		btnNewButton_1_1.setBounds(729, 359, 140, 110);
		contentPane.add(btnNewButton_1_1);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(
				new ImageIcon(MenuPans.class.getResource("/vista/Imagenes/Virtual-Backgrounds_Confetti-On-Gold.jpg")));
		lblNewLabel_1.setBounds(-156, -32, 1147, 666);
		contentPane.add(lblNewLabel_1);

	}

}

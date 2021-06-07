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

public class MenuTelepizza extends JFrame {

	private JPanel contentPane;
	private JLabel precio_tandemgourmet;
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
	public MenuTelepizza(int id, String localidad, String direccionD, String empresaE) {
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

		JLabel precio_bbq = new JLabel("7");
		precio_bbq.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_bbq.setBounds(220, 213, 16, 14);
		contentPane.add(precio_bbq);

		JLabel lblNewLabel_1 = new JLabel("\u20AC");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(228, 213, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel precio_carbonara = new JLabel("7");
		precio_carbonara.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_carbonara.setBounds(444, 211, 16, 14);
		contentPane.add(precio_carbonara);

		JLabel precio_hawaiana = new JLabel("7");
		precio_hawaiana.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_hawaiana.setBounds(681, 211, 16, 14);
		contentPane.add(precio_hawaiana);

		JLabel precio_cebolla = new JLabel("7");
		precio_cebolla.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_cebolla.setBounds(205, 399, 16, 14);
		contentPane.add(precio_cebolla);

		JLabel precio_peperoni = new JLabel("7");
		precio_peperoni.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_peperoni.setBounds(444, 399, 16, 14);
		contentPane.add(precio_peperoni);

		JLabel precio_baconcrispy = new JLabel("7");
		precio_baconcrispy.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_baconcrispy.setBounds(692, 399, 16, 14);
		contentPane.add(precio_baconcrispy);

		JLabel precio_vulcanonachos = new JLabel("7");
		precio_vulcanonachos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_vulcanonachos.setBounds(240, 573, 16, 14);
		contentPane.add(precio_vulcanonachos);

		precio_tandemgourmet = new JLabel("7");
		precio_tandemgourmet.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_tandemgourmet.setBounds(476, 573, 16, 14);
		contentPane.add(precio_tandemgourmet);

		JLabel precio_supreme = new JLabel("7");
		precio_supreme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_supreme.setBounds(689, 573, 16, 14);
		contentPane.add(precio_supreme);

		JLabel lblEligeTuMen = new JLabel("ELIGE TU MEN\u00DA");
		lblEligeTuMen.setBackground(Color.WHITE);
		lblEligeTuMen.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblEligeTuMen.setBounds(304, -14, 215, 61);
		contentPane.add(lblEligeTuMen);

		JButton barbacoa = new JButton("New button");
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

				precio = Integer.parseInt(precio_bbq.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Barbacoa";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		barbacoa.setIcon(new ImageIcon(MenuTelepizza.class.getResource("/vista/Imagenes/telepizza/barbacoa.jpg")));
		barbacoa.setForeground(Color.WHITE);
		barbacoa.setBackground(Color.WHITE);
		barbacoa.setBounds(106, 52, 150, 150);
		contentPane.add(barbacoa);

		JButton carbonara = new JButton("New button");
		carbonara.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_carbonara.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Carbonara";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		carbonara.setIcon(new ImageIcon(MenuTelepizza.class.getResource("/vista/Imagenes/telepizza/carbonara.jpg")));
		carbonara.setForeground(Color.WHITE);
		carbonara.setBackground(Color.WHITE);
		carbonara.setBounds(336, 52, 150, 150);
		contentPane.add(carbonara);

		JButton hawaiana = new JButton("New button");
		hawaiana.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_hawaiana.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Hawaiana";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		hawaiana.setIcon(new ImageIcon(MenuTelepizza.class.getResource("/vista/Imagenes/telepizza/hawaina.jpg")));
		hawaiana.setForeground(Color.WHITE);
		hawaiana.setBackground(Color.WHITE);
		hawaiana.setBounds(569, 52, 150, 150);
		contentPane.add(hawaiana);

		JButton cebolla = new JButton("New button");
		cebolla.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_cebolla.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Cebolla";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		cebolla.setIcon(new ImageIcon(MenuTelepizza.class.getResource("/vista/Imagenes/telepizza/cebolla.jpg")));
		cebolla.setForeground(Color.WHITE);
		cebolla.setBackground(Color.WHITE);
		cebolla.setBounds(106, 244, 150, 150);
		contentPane.add(cebolla);

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
		peperoni.setIcon(new ImageIcon(MenuTelepizza.class.getResource("/vista/Imagenes/telepizza/peperoni.jpg")));
		peperoni.setForeground(Color.WHITE);
		peperoni.setBackground(Color.WHITE);
		peperoni.setBounds(336, 244, 150, 150);
		contentPane.add(peperoni);

		JButton baconCrispy = new JButton("New button");
		baconCrispy.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_baconcrispy.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Bacon Crispy";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);
			}

		});
		baconCrispy
				.setIcon(new ImageIcon(MenuTelepizza.class.getResource("/vista/Imagenes/telepizza/baconcrispy.jpg")));
		baconCrispy.setForeground(Color.WHITE);
		baconCrispy.setBackground(Color.WHITE);
		baconCrispy.setBounds(569, 244, 150, 150);
		contentPane.add(baconCrispy);

		JButton vulcanoNachos = new JButton("New button");
		vulcanoNachos
				.setIcon(new ImageIcon(MenuTelepizza.class.getResource("/vista/Imagenes/telepizza/vulcanonachos.jpg")));
		vulcanoNachos.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_vulcanonachos.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Vulcanos Nachos";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		vulcanoNachos.setForeground(Color.WHITE);
		vulcanoNachos.setBackground(Color.WHITE);
		vulcanoNachos.setBounds(106, 418, 150, 150);
		contentPane.add(vulcanoNachos);

		JButton tandemGourmet = new JButton("New button");
		tandemGourmet.addActionListener(new ActionListener() {
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

				precio = Integer.parseInt(precio_tandemgourmet.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Tandem Gourmet";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		tandemGourmet
				.setIcon(new ImageIcon(MenuTelepizza.class.getResource("/vista/Imagenes/telepizza/tandemgourmet.jpg")));
		tandemGourmet.setForeground(Color.WHITE);
		tandemGourmet.setBackground(Color.WHITE);
		tandemGourmet.setBounds(336, 418, 150, 150);
		contentPane.add(tandemGourmet);

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

				precio = Integer.parseInt(precio_supreme.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion+" Supreme";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);
			}
		});
		supreme.setIcon(new ImageIcon(MenuTelepizza.class.getResource("/vista/Imagenes/telepizza/supreme.jpg")));
		supreme.setForeground(Color.WHITE);
		supreme.setBackground(Color.WHITE);
		supreme.setBounds(569, 418, 150, 150);
		contentPane.add(supreme);

		JLabel lblNewLabel = new JLabel("Barbacoa");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(150, 200, 57, 33);
		contentPane.add(lblNewLabel);

		JLabel lblMenCuartoDe = new JLabel("Carbonara");
		lblMenCuartoDe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenCuartoDe.setBounds(375, 201, 98, 31);
		contentPane.add(lblMenCuartoDe);

		JLabel lblMenMcPollo = new JLabel("Hawaiana");
		lblMenMcPollo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcPollo.setBounds(613, 201, 92, 31);
		contentPane.add(lblMenMcPollo);

		JLabel lblMenAmericanStyle = new JLabel("Cebolla");
		lblMenAmericanStyle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenAmericanStyle.setBounds(156, 393, 80, 22);
		contentPane.add(lblMenAmericanStyle);

		JLabel lblMenHappyMeal = new JLabel("Peperoni");
		lblMenHappyMeal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenHappyMeal.setBounds(383, 393, 98, 22);
		contentPane.add(lblMenHappyMeal);

		JLabel lblMenGrandMcextreme = new JLabel("Bacon Crispy");
		lblMenGrandMcextreme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenGrandMcextreme.setBounds(609, 393, 110, 22);
		contentPane.add(lblMenGrandMcextreme);

		JLabel lblMenMcfish = new JLabel("Vulcano Nachos");
		lblMenMcfish.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcfish.setBounds(132, 566, 150, 25);
		contentPane.add(lblMenMcfish);

		JLabel lblMenDobleQueso = new JLabel("Tandem Gourmet");
		lblMenDobleQueso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenDobleQueso.setBounds(360, 566, 140, 25);
		contentPane.add(lblMenDobleQueso);

		JLabel lblMenMcwrap = new JLabel("Supreme");
		lblMenMcwrap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcwrap.setBounds(624, 566, 73, 25);
		contentPane.add(lblMenMcwrap);

		JLabel lblNewLabel_1_1 = new JLabel("\u20AC");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(454, 213, 46, 14);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("\u20AC");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(692, 211, 46, 14);
		contentPane.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("\u20AC");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(220, 399, 46, 14);
		contentPane.add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_4 = new JLabel("\u20AC");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_4.setBounds(454, 399, 46, 14);
		contentPane.add(lblNewLabel_1_4);

		JLabel lblNewLabel_1_5 = new JLabel("\u20AC");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_5.setBounds(702, 399, 46, 14);
		contentPane.add(lblNewLabel_1_5);

		JLabel lblNewLabel_1_6 = new JLabel("\u20AC");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_6.setBounds(252, 573, 46, 14);
		contentPane.add(lblNewLabel_1_6);

		JLabel lblNewLabel_1_7 = new JLabel("\u20AC");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_7.setBounds(484, 573, 46, 14);
		contentPane.add(lblNewLabel_1_7);

		JLabel lblNewLabel_1_8 = new JLabel("\u20AC");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_8.setBounds(702, 573, 46, 14);
		contentPane.add(lblNewLabel_1_8);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PantallaRestaurantes pR = new PantallaRestaurantes(id, localidad, direccionD);
				dispose();
				pR.setVisible(true);

			}
		});
		btnNewButton.setIcon(new ImageIcon(MenuTelepizza.class.getResource("/vista/Imagenes/flecha.png")));
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
		btnNewButton_1.setBounds(733, 480, 136, 110);
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

		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(
				MenuTelepizza.class.getResource("/vista/Imagenes/Virtual-Backgrounds_Confetti-On-Gold.jpg")));
		lblNewLabel_12.setBounds(-156, -32, 1147, 666);
		contentPane.add(lblNewLabel_12);

	}

}

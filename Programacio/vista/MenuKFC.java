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

public class MenuKFC extends JFrame {

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
	public MenuKFC(int id, String localidad, String direccionD, String empresaE) {
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

		JLabel precio_BBQ = new JLabel("9");
		precio_BBQ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_BBQ.setBounds(273, 212, 27, 14);
		contentPane.add(precio_BBQ);

		JLabel precio_Original = new JLabel("9");
		precio_Original.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_Original.setBounds(502, 211, 46, 14);
		contentPane.add(precio_Original);

		JLabel precio_bacon = new JLabel("8");
		precio_bacon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_bacon.setBounds(723, 211, 46, 14);
		contentPane.add(precio_bacon);

		JLabel precio_sobrada = new JLabel("6");
		precio_sobrada.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_sobrada.setBounds(210, 399, 46, 14);
		contentPane.add(precio_sobrada);

		JLabel precio_mazorca = new JLabel("3");
		precio_mazorca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_mazorca.setBounds(437, 399, 46, 14);
		contentPane.add(precio_mazorca);

		JLabel precio_twister = new JLabel("4");
		precio_twister.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_twister.setBounds(662, 399, 46, 14);
		contentPane.add(precio_twister);

		JLabel precio_Oburger = new JLabel("5");
		precio_Oburger.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_Oburger.setBounds(221, 573, 46, 14);
		contentPane.add(precio_Oburger);

		JLabel precio_Mix = new JLabel("6");
		precio_Mix.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_Mix.setBounds(450, 573, 46, 14);
		contentPane.add(precio_Mix);

		JLabel precio_alitas = new JLabel("4");
		precio_alitas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_alitas.setBounds(694, 573, 46, 14);
		contentPane.add(precio_alitas);

		JButton doble = new JButton("New button");
		doble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precio_BBQ.getText());
				precioTotal = precioTotal + precio;
				nombre = "Doble BBQ Bacon Cheese Burger";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		doble.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\kfc\\doble bbq cheesburger.jpg"));
		doble.setForeground(Color.WHITE);
		doble.setBackground(Color.WHITE);
		doble.setBounds(106, 52, 150, 150);
		contentPane.add(doble);

		JButton cheese = new JButton("New button");
		cheese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precio_Original.getText());
				precioTotal = precioTotal + precio;
				nombre = "Original Doble Cheese Burger";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		cheese.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\kfc\\doblecheesburger.jpg"));
		cheese.setForeground(Color.WHITE);
		cheese.setBackground(Color.WHITE);
		cheese.setBounds(336, 52, 150, 150);
		contentPane.add(cheese);

		JButton baconcheese = new JButton("New button");
		baconcheese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precio_bacon.getText());
				precioTotal = precioTotal + precio;
				nombre = "BBQ Bacon Cheese Burger";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		baconcheese.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\kfc\\bbqbaconcheesburger.jpg"));
		baconcheese.setForeground(Color.WHITE);
		baconcheese.setBackground(Color.WHITE);
		baconcheese.setBounds(569, 52, 150, 150);
		contentPane.add(baconcheese);

		JButton sobrada = new JButton("New button");
		sobrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precio_sobrada.getText());
				precioTotal = precioTotal + precio;
				nombre = "Sobrada";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		sobrada.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\kfc\\sobrada.jpg"));
		sobrada.setForeground(Color.WHITE);
		sobrada.setBackground(Color.WHITE);
		sobrada.setBounds(106, 244, 150, 150);
		contentPane.add(sobrada);

		JButton mazorca = new JButton("New button");
		mazorca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precio_mazorca.getText());
				precioTotal = precioTotal + precio;
				nombre = "Mazorca";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		mazorca.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\kfc\\41379.jpg"));
		mazorca.setForeground(Color.WHITE);
		mazorca.setBackground(Color.WHITE);
		mazorca.setBounds(336, 244, 150, 150);
		contentPane.add(mazorca);

		JButton twister = new JButton("New button");
		twister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precio_twister.getText());
				precioTotal = precioTotal + precio;
				nombre = "Twisterr";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		twister.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\kfc\\twister.jpg"));
		twister.setForeground(Color.WHITE);
		twister.setBackground(Color.WHITE);
		twister.setBounds(569, 244, 150, 150);
		contentPane.add(twister);

		JButton orginal = new JButton("New button");
		orginal.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\kfc\\originalburger.jpg"));
		orginal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				precio = Integer.parseInt(precio_Oburger.getText());
				precioTotal = precioTotal + precio;
				nombre = "Original Burger";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		orginal.setForeground(Color.WHITE);
		orginal.setBackground(Color.WHITE);
		orginal.setBounds(106, 418, 150, 150);
		contentPane.add(orginal);

		JButton bucket = new JButton("New button");
		bucket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precio_Mix.getText());
				precioTotal = precioTotal + precio;
				nombre = "Bucket Mix";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		bucket.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\kfc\\bucketmix.jpg"));
		bucket.setForeground(Color.WHITE);
		bucket.setBackground(Color.WHITE);
		bucket.setBounds(336, 418, 150, 150);
		contentPane.add(bucket);

		JButton picantes = new JButton((String) null);
		picantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precio_alitas.getText());
				precioTotal = precioTotal + precio;
				nombre = "Alitas picantes";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		picantes.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\kfc\\picantes.jpg"));
		picantes.setForeground(Color.WHITE);
		picantes.setBackground(Color.WHITE);
		picantes.setBounds(569, 418, 150, 150);
		contentPane.add(picantes);

		JLabel lblNewLabel = new JLabel("Doble BBQ Bacon Cheese Burger");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(66, 200, 211, 33);
		contentPane.add(lblNewLabel);

		JLabel newu = new JLabel("Original Doble Cheese Burger");
		newu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		newu.setBounds(323, 202, 182, 31);
		contentPane.add(newu);

		JLabel lblMenMcPollo = new JLabel("BBQ Bacon Cheese Burger");
		lblMenMcPollo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcPollo.setBounds(558, 202, 175, 31);
		contentPane.add(lblMenMcPollo);

		JLabel lblMenAmericanStyle = new JLabel("Sobrada");
		lblMenAmericanStyle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenAmericanStyle.setBounds(151, 393, 62, 22);
		contentPane.add(lblMenAmericanStyle);

		JLabel lblMenHappyMeal = new JLabel("Mazorca");
		lblMenHappyMeal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenHappyMeal.setBounds(383, 393, 68, 22);
		contentPane.add(lblMenHappyMeal);

		JLabel lblMenGrandMcextreme = new JLabel("Twister");
		lblMenGrandMcextreme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenGrandMcextreme.setBounds(615, 393, 50, 22);
		contentPane.add(lblMenGrandMcextreme);

		JLabel lblMenMcfish = new JLabel("Original Burger");
		lblMenMcfish.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcfish.setBounds(130, 566, 111, 25);
		contentPane.add(lblMenMcfish);

		JLabel lblMenDobleQueso = new JLabel("Bucket Mix");
		lblMenDobleQueso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenDobleQueso.setBounds(379, 566, 82, 25);
		contentPane.add(lblMenDobleQueso);

		JLabel hola = new JLabel("Alitas Picantes");
		hola.setFont(new Font("Tahoma", Font.PLAIN, 14));
		hola.setBounds(607, 566, 126, 25);
		contentPane.add(hola);

		JLabel label_1 = new JLabel("\u20AC");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(284, 211, 46, 14);
		contentPane.add(label_1);

		JLabel label_1_1 = new JLabel("\u20AC");
		label_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_1.setBounds(515, 211, 46, 14);
		contentPane.add(label_1_1);

		JLabel label_1_2 = new JLabel("\u20AC");
		label_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_2.setBounds(733, 211, 46, 14);
		contentPane.add(label_1_2);

		JLabel label_1_3 = new JLabel("\u20AC");
		label_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_3.setBounds(223, 399, 46, 14);
		contentPane.add(label_1_3);

		JLabel label_1_4 = new JLabel("\u20AC");
		label_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_4.setBounds(450, 399, 46, 14);
		contentPane.add(label_1_4);

		JLabel label_1_5 = new JLabel("\u20AC");
		label_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_5.setBounds(673, 399, 46, 14);
		contentPane.add(label_1_5);

		JLabel label_1_6 = new JLabel("\u20AC");
		label_1_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_6.setBounds(231, 573, 46, 14);
		contentPane.add(label_1_6);

		JLabel label_1_7 = new JLabel("\u20AC");
		label_1_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_7.setBounds(462, 573, 46, 14);
		contentPane.add(label_1_7);

		JLabel label_1_8 = new JLabel("\u20AC");
		label_1_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_8.setBounds(704, 573, 46, 14);
		contentPane.add(label_1_8);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PantallaRestaurantes pR = new PantallaRestaurantes(id, localidad, direccionD);
				dispose();
				pR.setVisible(true);

			}
		});
		btnNewButton.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\flecha.png"));
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

				Connection miConexion = c.getConexion();
				String mysql = "INSERT INTO pedido(Menu, FechaPedido, PrecioPedido, EstadoPedido, Empresa, direccion, CodigoLocalidad, idCliente) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

				try {
					PreparedStatement pst = miConexion.prepareStatement(mysql);

					pst.setString(1, menuTotal);
					pst.setString(2, fechaTexto);
					pst.setInt(3, precioTotal);
					pst.setString(4, estado);
					pst.setString(5, empresa);
					pst.setString(6, direccion);
					pst.setInt(7, id_localidad);
					pst.setInt(8, idCliente);

					if (pst.executeUpdate() == 1) {

					}

				} catch (SQLException e1) {

					e1.printStackTrace();

				}

				int opcion = JOptionPane.showConfirmDialog(null, "�Quiere terminar se pedido?", "Aviso",
						JOptionPane.YES_NO_OPTION);

				if (opcion == JOptionPane.YES_OPTION) {

					JOptionPane.showMessageDialog(contentPane,
							"Su pedido costara " + precioTotal + "�" + ", gracias por confiar en nosotros",
							"Su pedido esta en camino", JOptionPane.WARNING_MESSAGE);

					System.exit(0);

				}

			}

		});
		btnNewButton_1.setBounds(744, 480, 125, 110);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("Ver pedido");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(contentPane,
						"Su pedido: '" + menuTotal + "' con un coste total de " + precioTotal + "�", "Su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		btnNewButton_1_1.setBounds(744, 359, 125, 110);
		contentPane.add(btnNewButton_1_1);

	}
}

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

public class MenuBurgerKing extends JFrame {

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
	public MenuBurgerKing(int id, String localidad, String direccionD, String empresaE) {
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

		JLabel precioLong = new JLabel("8");
		precioLong.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precioLong.setBounds(715, 573, 19, 14);
		contentPane.add(precioLong);

		JLabel precioBigK = new JLabel("8");
		precioBigK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precioBigK.setBounds(224, 209, 19, 14);
		contentPane.add(precioBigK);

		JLabel precioKrispy = new JLabel("7");
		precioKrispy.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precioKrispy.setBounds(477, 573, 19, 14);
		contentPane.add(precioKrispy);

		JLabel precioChes = new JLabel("7");
		precioChes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precioChes.setBounds(467, 209, 19, 14);
		contentPane.add(precioChes);

		JLabel precioWhop = new JLabel("6");
		precioWhop.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precioWhop.setBounds(691, 209, 19, 14);
		contentPane.add(precioWhop);

		JLabel precioHuevo = new JLabel("8");
		precioHuevo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precioHuevo.setBounds(490, 399, 19, 14);
		contentPane.add(precioHuevo);

		JLabel precioBacon = new JLabel("7");
		precioBacon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precioBacon.setBounds(257, 573, 19, 14);
		contentPane.add(precioBacon);

		JLabel precioSteak = new JLabel("7");
		precioSteak.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precioSteak.setBounds(224, 397, 19, 14);
		contentPane.add(precioSteak);

		JLabel precioJR = new JLabel("5");
		precioJR.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precioJR.setBounds(678, 399, 19, 14);
		contentPane.add(precioJR);

		JButton bigKing = new JButton("New button");
		bigKing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precioBigK.getText());
				precioTotal = precioTotal + precio;
				nombre = "BigKing";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);
			}
		});
		bigKing.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\burger\\bigking.png"));
		bigKing.setForeground(Color.WHITE);
		bigKing.setBackground(Color.WHITE);
		bigKing.setBounds(106, 52, 150, 150);
		contentPane.add(bigKing);

		JButton cheeseburger = new JButton("New button");
		cheeseburger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precioChes.getText());
				precioTotal = precioTotal + precio;
				nombre = "Cheeseburger";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		cheeseburger.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\burger\\cheeseburger.png"));
		cheeseburger.setForeground(Color.WHITE);
		cheeseburger.setBackground(Color.WHITE);
		cheeseburger.setBounds(336, 52, 150, 150);
		contentPane.add(cheeseburger);

		JButton whopper = new JButton("New button");
		whopper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precioWhop.getText());
				precioTotal = precioTotal + precio;
				nombre = "Whopper";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		whopper.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\burger\\whopper.png"));
		whopper.setForeground(Color.WHITE);
		whopper.setBackground(Color.WHITE);
		whopper.setBounds(569, 52, 150, 150);
		contentPane.add(whopper);

		JButton steakhouse = new JButton("New button");
		steakhouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precioSteak.getText());
				precioTotal = precioTotal + precio;
				nombre = "Steakhouse";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		steakhouse.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\burger\\steakhouse.png"));
		steakhouse.setForeground(Color.WHITE);
		steakhouse.setBackground(Color.WHITE);
		steakhouse.setBounds(106, 244, 150, 150);
		contentPane.add(steakhouse);

		JButton kingHuevo = new JButton("New button");
		kingHuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precioHuevo.getText());
				precioTotal = precioTotal + precio;
				nombre = "King huevo";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		kingHuevo.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\burger\\thekinghuevo.png"));
		kingHuevo.setForeground(Color.WHITE);
		kingHuevo.setBackground(Color.WHITE);
		kingHuevo.setBounds(336, 244, 150, 150);
		contentPane.add(kingHuevo);

		JButton kingJr = new JButton("New button");
		kingJr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precioJR.getText());
				precioTotal = precioTotal + precio;
				nombre = "King jr";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		kingJr.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\burger\\kingjr.jpg"));
		kingJr.setForeground(Color.WHITE);
		kingJr.setBackground(Color.WHITE);
		kingJr.setBounds(569, 244, 150, 150);
		contentPane.add(kingJr);

		JButton KingBacon = new JButton("New button");
		KingBacon.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\burger\\1564392248145_M_The_King_Bacon_2C-1-1.png"));
		KingBacon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				precio = Integer.parseInt(precioBacon.getText());
				precioTotal = precioTotal + precio;
				nombre = "King bacon";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		KingBacon.setForeground(Color.WHITE);
		KingBacon.setBackground(Color.WHITE);
		KingBacon.setBounds(106, 418, 150, 150);
		contentPane.add(KingBacon);

		JButton crispyChicken = new JButton("New button");
		crispyChicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precioKrispy.getText());
				precioTotal = precioTotal + precio;
				nombre = "crispy chicken";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		crispyChicken.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\burger\\1564391634329_M_Crispy_Chicken.png"));
		crispyChicken.setForeground(Color.WHITE);
		crispyChicken.setBackground(Color.WHITE);
		crispyChicken.setBounds(336, 418, 150, 150);
		contentPane.add(crispyChicken);

		JButton longChicken = new JButton("New button");
		longChicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precioLong.getText());
				precioTotal = precioTotal + precio;
				nombre = "long chicken";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		longChicken.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\burger\\1564391124618_M_Long_Chicken.png"));
		longChicken.setForeground(Color.WHITE);
		longChicken.setBackground(Color.WHITE);
		longChicken.setBounds(569, 418, 150, 150);
		contentPane.add(longChicken);

		JLabel lblNewLabel = new JLabel("Men\u00FA Big King");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(133, 200, 97, 33);
		contentPane.add(lblNewLabel);

		JLabel lblMenCuartoDe = new JLabel("Men\u00FA Cheesburger");
		lblMenCuartoDe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenCuartoDe.setBounds(346, 202, 121, 31);
		contentPane.add(lblMenCuartoDe);

		JLabel lblMenMcPollo = new JLabel("Men\u00FA Whopper");
		lblMenMcPollo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcPollo.setBounds(591, 201, 102, 31);
		contentPane.add(lblMenMcPollo);

		JLabel lblMenAmericanStyle = new JLabel("Men\u00FA Steakhouse");
		lblMenAmericanStyle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenAmericanStyle.setBounds(106, 393, 114, 22);
		contentPane.add(lblMenAmericanStyle);

		JLabel lblMenHappyMeal = new JLabel("Men\u00FA The King Huevo");
		lblMenHappyMeal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenHappyMeal.setBounds(346, 393, 140, 22);
		contentPane.add(lblMenHappyMeal);

		JLabel lblMenGrandMcextreme = new JLabel("Men\u00FA King Jr");
		lblMenGrandMcextreme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenGrandMcextreme.setBounds(591, 393, 110, 22);
		contentPane.add(lblMenGrandMcextreme);

		JLabel lblMenMcfish = new JLabel("Men\u00FA The King Bacon");
		lblMenMcfish.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcfish.setBounds(116, 566, 150, 25);
		contentPane.add(lblMenMcfish);

		JLabel lblMenDobleQueso = new JLabel("Men\u00FA Crispy Chicken");
		lblMenDobleQueso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenDobleQueso.setBounds(346, 566, 140, 25);
		contentPane.add(lblMenDobleQueso);

		JLabel lblMenMcwrap = new JLabel("Men\u00FA Long Chicken");
		lblMenMcwrap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcwrap.setBounds(591, 566, 128, 25);
		contentPane.add(lblMenMcwrap);

		JLabel label_1 = new JLabel("\u20AC");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(234, 209, 22, 14);
		contentPane.add(label_1);

		JLabel label_1_1 = new JLabel("\u20AC");
		label_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_1.setBounds(477, 209, 22, 14);
		contentPane.add(label_1_1);

		JLabel label_1_1_1 = new JLabel("\u20AC");
		label_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_1_1.setBounds(703, 209, 22, 14);
		contentPane.add(label_1_1_1);

		JLabel label_1_2 = new JLabel("\u20AC");
		label_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_2.setBounds(234, 397, 22, 14);
		contentPane.add(label_1_2);

		JLabel label_1_2_1 = new JLabel("\u20AC");
		label_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_2_1.setBounds(501, 399, 22, 14);
		contentPane.add(label_1_2_1);

		JLabel label_1_2_1_1 = new JLabel("\u20AC");
		label_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_2_1_1.setBounds(691, 399, 22, 14);
		contentPane.add(label_1_2_1_1);

		JLabel label_1_2_1_1_1 = new JLabel("\u20AC");
		label_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_2_1_1_1.setBounds(267, 573, 22, 14);
		contentPane.add(label_1_2_1_1_1);

		JLabel label_1_2_1_1_1_1 = new JLabel("\u20AC");
		label_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_2_1_1_1_1.setBounds(487, 573, 22, 14);
		contentPane.add(label_1_2_1_1_1_1);

		JLabel label_1_2_1_1_1_1_1 = new JLabel("\u20AC");
		label_1_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_2_1_1_1_1_1.setBounds(723, 573, 22, 14);
		contentPane.add(label_1_2_1_1_1_1_1);

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

				int opcion = JOptionPane.showConfirmDialog(null, "¿Quiere terminar se pedido?", "Aviso",
						JOptionPane.YES_NO_OPTION);

				if (opcion == JOptionPane.YES_OPTION) {

					JOptionPane.showMessageDialog(contentPane,
							"Su pedido costara " + precioTotal + "€" + ", gracias por confiar en nosotros",
							"Su pedido esta en camino", JOptionPane.WARNING_MESSAGE);

					System.exit(0);

				}

			}

		});
		btnNewButton_1.setBounds(729, 477, 140, 110);
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
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\Virtual-Backgrounds_Confetti-On-Gold.jpg"));
		lblNewLabel_1.setBounds(-156, -32, 1147, 666);
		contentPane.add(lblNewLabel_1);

	}
}

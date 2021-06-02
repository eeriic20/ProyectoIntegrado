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

public class MenuFosters extends JFrame {

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
	public MenuFosters(int id, String localidad, String direccionD, String empresaE) {
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

		JLabel precio_newyorker = new JLabel("11");
		precio_newyorker.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_newyorker.setBounds(492, 211, 22, 14);
		contentPane.add(precio_newyorker);

		JLabel precio_nationalstar = new JLabel("11");
		precio_nationalstar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_nationalstar.setBounds(703, 209, 26, 14);
		contentPane.add(precio_nationalstar);

		JLabel precio_tribeca = new JLabel("9");
		precio_tribeca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_tribeca.setBounds(222, 399, 15, 14);
		contentPane.add(precio_tribeca);

		JLabel precio_guacamole = new JLabel("10");
		precio_guacamole.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_guacamole.setBounds(454, 399, 32, 14);
		contentPane.add(precio_guacamole);

		JLabel precio_beffbone = new JLabel("13");
		precio_beffbone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_beffbone.setBounds(671, 399, 26, 14);
		contentPane.add(precio_beffbone);

		JLabel precio_costillas = new JLabel("13");
		precio_costillas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_costillas.setBounds(270, 571, 22, 14);
		contentPane.add(precio_costillas);

		JLabel precio_raclette = new JLabel("12");
		precio_raclette.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_raclette.setBounds(466, 571, 20, 14);
		contentPane.add(precio_raclette);

		JLabel precio_cheese = new JLabel("8");
		precio_cheese.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_cheese.setBounds(693, 573, 15, 14);
		contentPane.add(precio_cheese);

		JLabel lblEligeTuMen = new JLabel("ELIGE TU MEN\u00DA");
		lblEligeTuMen.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblEligeTuMen.setBounds(309, 0, 388, 61);
		contentPane.add(lblEligeTuMen);

		JLabel precio_hollywood = new JLabel("9");
		precio_hollywood.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_hollywood.setBounds(249, 211, 15, 14);
		contentPane.add(precio_hollywood);

		JButton combo = new JButton("New button");
		combo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precio_hollywood.getText());
				precioTotal = precioTotal + precio;
				nombre = "Hollywood Combo";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		combo.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fosters\\hollywood-combo.png"));
		combo.setForeground(Color.WHITE);
		combo.setBackground(Color.WHITE);
		combo.setBounds(106, 52, 150, 150);
		contentPane.add(combo);

		JButton newyorker = new JButton("New button");
		newyorker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precio_newyorker.getText());
				precioTotal = precioTotal + precio;
				nombre = "The NewYorker";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		newyorker.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fosters\\new_yorker_1000x495_0.png"));
		newyorker.setForeground(Color.WHITE);
		newyorker.setBackground(Color.WHITE);
		newyorker.setBounds(336, 52, 150, 150);
		contentPane.add(newyorker);

		JButton national = new JButton("New button");
		national.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precio_nationalstar.getText());
				precioTotal = precioTotal + precio;
				nombre = "National Star";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		national.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fosters\\national-ribs-de-cerdo.png"));
		national.setForeground(Color.WHITE);
		national.setBackground(Color.WHITE);
		national.setBounds(569, 52, 150, 150);
		contentPane.add(national);

		JButton tribella = new JButton("New button");
		tribella.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precio_tribeca.getText());
				precioTotal = precioTotal + precio;
				nombre = "Tribeca";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);
			}
		});
		tribella.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fosters\\fosters_burgers_2_tribeca.png"));
		tribella.setForeground(Color.WHITE);
		tribella.setBackground(Color.WHITE);
		tribella.setBounds(106, 244, 150, 150);
		contentPane.add(tribella);

		JButton guacamole = new JButton("New button");
		guacamole.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precio_guacamole.getText());
				precioTotal = precioTotal + precio;
				nombre = "Guacamole";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		guacamole.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fosters\\guacamole-hecho-en-tu-mesa.png"));
		guacamole.setForeground(Color.WHITE);
		guacamole.setBackground(Color.WHITE);
		guacamole.setBounds(336, 244, 150, 150);
		contentPane.add(guacamole);

		JButton bone = new JButton("New button");
		bone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precio_beffbone.getText());
				precioTotal = precioTotal + precio;
				nombre = "Beff Bone";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		bone.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fosters\\beef-bone.png"));
		bone.setForeground(Color.WHITE);
		bone.setBackground(Color.WHITE);
		bone.setBounds(569, 244, 150, 150);
		contentPane.add(bone);

		JButton costillas = new JButton("New button");
		costillas.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fosters\\costillas-ibericas-black-label.png"));
		costillas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				precio = Integer.parseInt(precio_costillas.getText());
				precioTotal = precioTotal + precio;
				nombre = "Costillas";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		costillas.setForeground(Color.WHITE);
		costillas.setBackground(Color.WHITE);
		costillas.setBounds(106, 418, 150, 150);
		contentPane.add(costillas);

		JButton raclette = new JButton("New button");
		raclette.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precio_raclette.getText());
				precioTotal = precioTotal + precio;
				nombre = "Raclette Burger";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		raclette.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fosters\\xracllette-fh.pngqitoknyfqozeb.pagespeed.ic_.8pekl6yknf.png"));
		raclette.setForeground(Color.WHITE);
		raclette.setBackground(Color.WHITE);
		raclette.setBounds(336, 418, 150, 150);
		contentPane.add(raclette);

		JButton cheese = new JButton((String) null);
		cheese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				precio = Integer.parseInt(precio_cheese.getText());
				precioTotal = precioTotal + precio;
				nombre = "Cheese Burger";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		cheese.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fosters\\cheese-burger_optimizado.png"));
		cheese.setForeground(Color.WHITE);
		cheese.setBackground(Color.WHITE);
		cheese.setBounds(569, 418, 150, 150);
		contentPane.add(cheese);

		JLabel lblNewLabel = new JLabel("Hollywood Combo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(132, 200, 120, 33);
		contentPane.add(lblNewLabel);

		JLabel newu = new JLabel("The NewYorker 325 GRS");
		newu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		newu.setBounds(336, 202, 178, 31);
		contentPane.add(newu);

		JLabel lblMenMcPollo = new JLabel("National Star Ribs");
		lblMenMcPollo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcPollo.setBounds(593, 201, 110, 31);
		contentPane.add(lblMenMcPollo);

		JLabel lblMenAmericanStyle = new JLabel("Tribeca Buger");
		lblMenAmericanStyle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenAmericanStyle.setBounds(136, 393, 120, 22);
		contentPane.add(lblMenAmericanStyle);

		JLabel lblMenHappyMeal = new JLabel("Guacamole");
		lblMenHappyMeal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenHappyMeal.setBounds(383, 393, 73, 22);
		contentPane.add(lblMenHappyMeal);

		JLabel lblMenGrandMcextreme = new JLabel("Beff Bone");
		lblMenGrandMcextreme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenGrandMcextreme.setBounds(609, 393, 64, 22);
		contentPane.add(lblMenGrandMcextreme);

		JLabel lblMenMcfish = new JLabel("Costillas Ib\u00E9ricas Black Label");
		lblMenMcfish.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcfish.setBounds(94, 566, 170, 25);
		contentPane.add(lblMenMcfish);

		JLabel lblMenDobleQueso = new JLabel("Raclette Burger");
		lblMenDobleQueso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenDobleQueso.setBounds(360, 566, 98, 25);
		contentPane.add(lblMenDobleQueso);

		JLabel lblMenMcwrap = new JLabel("Cheese Burger");
		lblMenMcwrap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcwrap.setBounds(593, 566, 104, 25);
		contentPane.add(lblMenMcwrap);

		JLabel label_1 = new JLabel("\u20AC");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(260, 211, 46, 14);
		contentPane.add(label_1);

		JLabel label_1_1 = new JLabel("\u20AC");
		label_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_1.setBounds(511, 209, 46, 14);
		contentPane.add(label_1_1);

		JLabel label_1_2 = new JLabel("\u20AC");
		label_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_2.setBounds(723, 209, 46, 14);
		contentPane.add(label_1_2);

		JLabel label_1_3 = new JLabel("\u20AC");
		label_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_3.setBounds(236, 399, 46, 14);
		contentPane.add(label_1_3);

		JLabel label_1_4 = new JLabel("\u20AC");
		label_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_4.setBounds(480, 397, 46, 14);
		contentPane.add(label_1_4);

		JLabel label_1_5 = new JLabel("\u20AC");
		label_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_5.setBounds(693, 397, 46, 14);
		contentPane.add(label_1_5);

		JLabel label_1_6 = new JLabel("\u20AC");
		label_1_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_6.setBounds(707, 573, 46, 14);
		contentPane.add(label_1_6);

		JLabel label_1_7 = new JLabel("\u20AC");
		label_1_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_7.setBounds(492, 571, 46, 14);
		contentPane.add(label_1_7);

		JLabel label_1_8 = new JLabel("\u20AC");
		label_1_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_8.setBounds(288, 571, 46, 14);
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
		btnNewButton_1.setBounds(744, 480, 125, 110);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("Ver pedido");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(contentPane,
						"Su pedido: '" + menuTotal + "' con un coste total de " + precioTotal + "€", "Su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		btnNewButton_1_1.setBounds(744, 359, 125, 110);
		contentPane.add(btnNewButton_1_1);

	}

}

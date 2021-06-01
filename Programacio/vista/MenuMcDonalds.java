package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Conexion.Conexion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class MenuMcDonalds extends JFrame {

	private JPanel contentPane;
	private int hora;
	private int minutos;
	private int segundos;
	private int dia;
	private int mes;
	private int anyo;
	private String nombre;
	private int precio;
	private int id_localidad;
	private String estado;
	private String empresa;
	private String direccion;
	private int idCliente;
	private Date fecha;
	private int id_empleado;
	private int precioTotal = 0;
	private String menuTotal = "";
	

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { MenusMcDonalds frame = new
	 * MenusMcDonalds(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the frame.
	 */
	public MenuMcDonalds(int id, String localidad, String direccionD, String empresaE) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\logofinal.png"));
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
		
		JLabel precio_bigmc = new JLabel("8");
		precio_bigmc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_bigmc.setBounds(221, 209, 46, 14);
		contentPane.add(precio_bigmc);
		
		JLabel precio_cuarto = new JLabel("8");
		precio_cuarto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_cuarto.setBounds(484, 209, 14, 14);
		contentPane.add(precio_cuarto);
		
		JLabel precio_mcpollo = new JLabel("8");
		precio_mcpollo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_mcpollo.setBounds(683, 211, 46, 14);
		contentPane.add(precio_mcpollo);
		
		JLabel precio_stylechicken = new JLabel("9");
		precio_stylechicken.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_stylechicken.setBounds(262, 399, 46, 14);
		contentPane.add(precio_stylechicken);
		
		JLabel precio_happymeal = new JLabel("5");
		precio_happymeal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_happymeal.setBounds(469, 399, 46, 14);
		contentPane.add(precio_happymeal);
		
		JLabel precio_mcextreme = new JLabel("9");
		precio_mcextreme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_mcextreme.setBounds(720, 399, 46, 14);
		contentPane.add(precio_mcextreme);
		
		JLabel precio_mcfish = new JLabel("6");
		precio_mcfish.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_mcfish.setBounds(221, 573, 46, 14);
		contentPane.add(precio_mcfish);
		
		JLabel precio_doblequeso = new JLabel("6");
		precio_doblequeso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_doblequeso.setBounds(469, 573, 46, 14);
		contentPane.add(precio_doblequeso);
		
		JLabel precio_mcwrap = new JLabel("7");
		precio_mcwrap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_mcwrap.setBounds(683, 573, 46, 14);
		contentPane.add(precio_mcwrap);
		
		JButton bigMac = new JButton("New button");
		bigMac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conexion c = new Conexion();

				fecha = new Date(Calendar.getInstance().getTimeInMillis());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String fechaTexto = formatter.format(fecha);

				precio = Integer.parseInt(precio_bigmc.getText());
				precioTotal = precioTotal+precio;
				nombre = "Big Mac";
				menuTotal = nombre+", "+menuTotal;
				empresa = empresaE;
				direccion = direccionD;
				estado = "En proceso";
				idCliente = id;

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

				int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres hacer otro pedido?", "Aviso",
						JOptionPane.YES_NO_OPTION);

				if (opcion == JOptionPane.YES_OPTION) {

				} else {

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

					JOptionPane.showMessageDialog(contentPane, "¡Su pedido esta en camino!",
							"Gracias por confiar en nosotros", JOptionPane.WARNING_MESSAGE);

					System.exit(0);
				}
				
			}
		});
		bigMac.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\mc\\menu-big-mac.png"));
		bigMac.setForeground(Color.WHITE);
		bigMac.setBackground(Color.WHITE);
		bigMac.setBounds(106, 52, 150, 150);
		contentPane.add(bigMac);
		
		JButton cuartoLibra = new JButton("New button");
		cuartoLibra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conexion c = new Conexion();

				fecha = new Date(Calendar.getInstance().getTimeInMillis());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String fechaTexto = formatter.format(fecha);

				precio = Integer.parseInt(precio_cuarto.getText());
				precioTotal = precioTotal+precio;
				nombre = "Menu Cuarto de Libra";
				menuTotal = nombre+", "+menuTotal;
				empresa = empresaE;
				direccion = direccionD;
				estado = "En proceso";
				idCliente = id;

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

				int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres hacer otro pedido?", "Aviso",
						JOptionPane.YES_NO_OPTION);

				if (opcion == JOptionPane.YES_OPTION) {

				} else {

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

					JOptionPane.showMessageDialog(contentPane, "¡Su pedido esta en camino!",
							"Gracias por confiar en nosotros", JOptionPane.WARNING_MESSAGE);

					System.exit(0);
				}
				
			}
		});
		cuartoLibra.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\mc\\cuartodelibra.jpg"));
		cuartoLibra.setForeground(Color.WHITE);
		cuartoLibra.setBackground(Color.WHITE);
		cuartoLibra.setBounds(336, 52, 150, 150);
		contentPane.add(cuartoLibra);
		
		JButton mcPollo = new JButton("New button");
		mcPollo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conexion c = new Conexion();

				fecha = new Date(Calendar.getInstance().getTimeInMillis());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String fechaTexto = formatter.format(fecha);

				precio = Integer.parseInt(precio_mcpollo.getText());
				precioTotal = precioTotal+precio;
				nombre = "Menu Mc Pollo";
				menuTotal = nombre+", "+menuTotal;
				empresa = empresaE;
				direccion = direccionD;
				estado = "En proceso";
				idCliente = id;

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

				int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres hacer otro pedido?", "Aviso",
						JOptionPane.YES_NO_OPTION);

				if (opcion == JOptionPane.YES_OPTION) {

				} else {

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

					JOptionPane.showMessageDialog(contentPane, "¡Su pedido esta en camino!",
							"Gracias por confiar en nosotros", JOptionPane.WARNING_MESSAGE);

					System.exit(0);
				}
				
			}
		});
		mcPollo.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\mc\\Mcmenu-mediano-mcpollo.jpg"));
		mcPollo.setForeground(Color.WHITE);
		mcPollo.setBackground(Color.WHITE);
		mcPollo.setBounds(569, 52, 150, 150);
		contentPane.add(mcPollo);
		
		JButton styleChiken = new JButton("New button");
		styleChiken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conexion c = new Conexion();

				fecha = new Date(Calendar.getInstance().getTimeInMillis());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String fechaTexto = formatter.format(fecha);

				precio = Integer.parseInt(precio_stylechicken.getText());
				precioTotal = precioTotal+precio;
				nombre = "Menú American Style Chicken";
				menuTotal = nombre+", "+menuTotal;
				empresa = empresaE;
				direccion = direccionD;
				estado = "En proceso";
				idCliente = id;

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

				int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres hacer otro pedido?", "Aviso",
						JOptionPane.YES_NO_OPTION);

				if (opcion == JOptionPane.YES_OPTION) {

				} else {

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

					JOptionPane.showMessageDialog(contentPane, "¡Su pedido esta en camino!",
							"Gracias por confiar en nosotros", JOptionPane.WARNING_MESSAGE);

					System.exit(0);
				}
				
			}
		});
		styleChiken.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\mc\\american-style-chicken-324x324.png"));
		styleChiken.setForeground(Color.WHITE);
		styleChiken.setBackground(Color.WHITE);
		styleChiken.setBounds(106, 244, 150, 150);
		contentPane.add(styleChiken);
		
		JButton happyMeal = new JButton("New button");
		happyMeal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conexion c = new Conexion();

				fecha = new Date(Calendar.getInstance().getTimeInMillis());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String fechaTexto = formatter.format(fecha);

				precio = Integer.parseInt(precio_happymeal.getText());
				precioTotal = precioTotal+precio;
				nombre = "Happy Meal";
				menuTotal = nombre+", "+menuTotal;
				empresa = empresaE;
				direccion = direccionD;
				estado = "En proceso";
				idCliente = id;

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

				int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres hacer otro pedido?", "Aviso",
						JOptionPane.YES_NO_OPTION);

				if (opcion == JOptionPane.YES_OPTION) {

				} else {

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

					JOptionPane.showMessageDialog(contentPane, "¡Su pedido esta en camino!",
							"Gracias por confiar en nosotros", JOptionPane.WARNING_MESSAGE);

					System.exit(0);
				}
				
			}
		});
		happyMeal.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\mc\\harapymeal.png"));
		happyMeal.setForeground(Color.WHITE);
		happyMeal.setBackground(Color.WHITE);
		happyMeal.setBounds(336, 244, 150, 150);
		contentPane.add(happyMeal);
		
		JButton grandMcExtreme = new JButton("New button");
		grandMcExtreme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conexion c = new Conexion();

				fecha = new Date(Calendar.getInstance().getTimeInMillis());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String fechaTexto = formatter.format(fecha);

				precio = Integer.parseInt(precio_mcextreme.getText());
				precioTotal = precioTotal+precio;
				nombre = "Grand McExtreme";
				menuTotal = nombre+", "+menuTotal;
				empresa = empresaE;
				direccion = direccionD;
				estado = "En proceso";
				idCliente = id;

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

				int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres hacer otro pedido?", "Aviso",
						JOptionPane.YES_NO_OPTION);

				if (opcion == JOptionPane.YES_OPTION) {

				} else {

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

					JOptionPane.showMessageDialog(contentPane, "¡Su pedido esta en camino!",
							"Gracias por confiar en nosotros", JOptionPane.WARNING_MESSAGE);

					System.exit(0);
				}
				
			}
		});
		grandMcExtreme.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\mc\\mc_menu_grand-mcextreme_double_bacon.png"));
		grandMcExtreme.setForeground(Color.WHITE);
		grandMcExtreme.setBackground(Color.WHITE);
		grandMcExtreme.setBounds(569, 244, 150, 150);
		contentPane.add(grandMcExtreme);
		
		JButton mcFish = new JButton("New button");
		mcFish.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\mc\\Mcfish.png"));
		mcFish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Conexion c = new Conexion();

				fecha = new Date(Calendar.getInstance().getTimeInMillis());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String fechaTexto = formatter.format(fecha);

				precio = Integer.parseInt(precio_mcfish.getText());
				precioTotal = precioTotal+precio;
				nombre = "Menú McFish";
				menuTotal = nombre+", "+menuTotal;
				empresa = empresaE;
				direccion = direccionD;
				estado = "En proceso";
				idCliente = id;

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

				int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres hacer otro pedido?", "Aviso",
						JOptionPane.YES_NO_OPTION);

				if (opcion == JOptionPane.YES_OPTION) {

				} else {

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

					JOptionPane.showMessageDialog(contentPane, "¡Su pedido esta en camino!",
							"Gracias por confiar en nosotros", JOptionPane.WARNING_MESSAGE);

					System.exit(0);
				}
				
			}
		});
		mcFish.setForeground(Color.WHITE);
		mcFish.setBackground(Color.WHITE);
		mcFish.setBounds(106, 418, 150, 150);
		contentPane.add(mcFish);
		
		JButton hamburguesaConQueso = new JButton("New button");
		hamburguesaConQueso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conexion c = new Conexion();

				fecha = new Date(Calendar.getInstance().getTimeInMillis());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String fechaTexto = formatter.format(fecha);

				precio = Integer.parseInt(precio_doblequeso.getText());
				precioTotal = precioTotal+precio;
				nombre = "Hamburguesa con Doble de Queso";
				menuTotal = nombre+", "+menuTotal;
				empresa = empresaE;
				direccion = direccionD;
				estado = "En proceso";
				idCliente = id;

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

				int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres hacer otro pedido?", "Aviso",
						JOptionPane.YES_NO_OPTION);

				if (opcion == JOptionPane.YES_OPTION) {

				} else {

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

					JOptionPane.showMessageDialog(contentPane, "¡Su pedido esta en camino!",
							"Gracias por confiar en nosotros", JOptionPane.WARNING_MESSAGE);

					System.exit(0);
				}
				
			}
		});
		hamburguesaConQueso.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\mc\\menu-hamburguesa-doble-cheese-burger.jpg"));
		hamburguesaConQueso.setForeground(Color.WHITE);
		hamburguesaConQueso.setBackground(Color.WHITE);
		hamburguesaConQueso.setBounds(336, 418, 150, 150);
		contentPane.add(hamburguesaConQueso);
		
		JButton mcWrap = new JButton("New button");
		mcWrap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conexion c = new Conexion();

				fecha = new Date(Calendar.getInstance().getTimeInMillis());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String fechaTexto = formatter.format(fecha);

				precio = Integer.parseInt(precio_mcwrap.getText());
				precioTotal = precioTotal+precio;
				nombre = "McWrap";
				menuTotal = nombre+", "+menuTotal;
				empresa = empresaE;
				direccion = direccionD;
				estado = "En proceso";
				idCliente = id;

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

				int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres hacer otro pedido?", "Aviso",
						JOptionPane.YES_NO_OPTION);

				if (opcion == JOptionPane.YES_OPTION) {

				} else {

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

					JOptionPane.showMessageDialog(contentPane, "¡Su pedido esta en camino!",
							"Gracias por confiar en nosotros", JOptionPane.WARNING_MESSAGE);

					System.exit(0);
				}
				
			}
		});
		mcWrap.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\mc\\mcwrap.jpg"));
		mcWrap.setForeground(Color.WHITE);
		mcWrap.setBackground(Color.WHITE);
		mcWrap.setBounds(569, 418, 150, 150);
		contentPane.add(mcWrap);
		
		JLabel lblNewLabel = new JLabel("Men\u00FA Big Mac");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(133, 200, 89, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblMenCuartoDe = new JLabel("Men\u00FA Cuarto de Libra");
		lblMenCuartoDe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenCuartoDe.setBounds(346, 202, 140, 31);
		contentPane.add(lblMenCuartoDe);
		
		JLabel lblMenMcPollo = new JLabel("Men\u00FA Mc Pollo");
		lblMenMcPollo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcPollo.setBounds(591, 201, 110, 31);
		contentPane.add(lblMenMcPollo);
		
		JLabel lblMenAmericanStyle = new JLabel("Men\u00FA American Style Chiken");
		lblMenAmericanStyle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenAmericanStyle.setBounds(88, 393, 178, 22);
		contentPane.add(lblMenAmericanStyle);
		
		JLabel lblMenHappyMeal = new JLabel("Men\u00FA Happy Meal");
		lblMenHappyMeal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenHappyMeal.setBounds(358, 393, 140, 22);
		contentPane.add(lblMenHappyMeal);
		
		JLabel lblMenGrandMcextreme = new JLabel("Men\u00FA Grand McExtreme");
		lblMenGrandMcextreme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenGrandMcextreme.setBounds(569, 393, 164, 22);
		contentPane.add(lblMenGrandMcextreme);
		
		JLabel lblMenMcfish = new JLabel("Men\u00FA McFish");
		lblMenMcfish.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcfish.setBounds(133, 566, 123, 25);
		contentPane.add(lblMenMcfish);
		
		JLabel lblMenDobleQueso = new JLabel("Men\u00FA Doble Queso");
		lblMenDobleQueso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenDobleQueso.setBounds(346, 566, 140, 25);
		contentPane.add(lblMenDobleQueso);
		
		JLabel lblMenMcwrap = new JLabel("Men\u00FA McWrap");
		lblMenMcwrap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcwrap.setBounds(591, 566, 128, 25);
		contentPane.add(lblMenMcwrap);
		
		JLabel label_1 = new JLabel("\u20AC");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(232, 211, 46, 14);
		contentPane.add(label_1);
	
		
		JLabel label_1_1 = new JLabel("\u20AC");
		label_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_1.setBounds(497, 209, 46, 14);
		contentPane.add(label_1_1);
		
		JLabel label_1_2 = new JLabel("\u20AC");
		label_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_2.setBounds(694, 211, 46, 14);
		contentPane.add(label_1_2);
		
		JLabel label_1_3 = new JLabel("\u20AC");
		label_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_3.setBounds(274, 399, 46, 14);
		contentPane.add(label_1_3);
		
		JLabel label_1_4 = new JLabel("\u20AC");
		label_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_4.setBounds(479, 399, 46, 14);
		contentPane.add(label_1_4);
		
		JLabel label_1_5 = new JLabel("\u20AC");
		label_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_5.setBounds(732, 399, 46, 14);
		contentPane.add(label_1_5);
		
		JLabel label_1_6 = new JLabel("\u20AC");
		label_1_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_6.setBounds(232, 573, 46, 14);
		contentPane.add(label_1_6);
		
		JLabel label_1_7 = new JLabel("\u20AC");
		label_1_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_7.setBounds(484, 573, 46, 14);
		contentPane.add(label_1_7);
		
		JLabel label_1_8 = new JLabel("\u20AC");
		label_1_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_8.setBounds(694, 573, 46, 14);
		contentPane.add(label_1_8);
	}

}

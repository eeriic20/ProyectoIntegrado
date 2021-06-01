package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
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

import Conexion.Conexion;

public class MenuPans extends JFrame {

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
	 * Runnable() { public void run() { try { MenuPans frame = new MenuPans();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */

	/**
	 * Create the frame.
	 */
	public MenuPans(int id, String localidad, String direccionD, String empresaE) {
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
				
				Conexion c = new Conexion();

				fecha = new Date(Calendar.getInstance().getTimeInMillis());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String fechaTexto = formatter.format(fecha);

				precio = Integer.parseInt(precio_pechugapollo.getText());
				precioTotal = precioTotal+precio;
				nombre = "Pechuga de Pollo";
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
		pechuga.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\pans\\1pechugapollo.jpg"));
		pechuga.setForeground(Color.WHITE);
		pechuga.setBackground(Color.WHITE);
		pechuga.setBounds(106, 52, 150, 150);
		contentPane.add(pechuga);

		JButton breton = new JButton("New button");
		breton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conexion c = new Conexion();

				fecha = new Date(Calendar.getInstance().getTimeInMillis());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String fechaTexto = formatter.format(fecha);

				precio = Integer.parseInt(precio_breton.getText());
				precioTotal = precioTotal+precio;
				nombre = "Breton";
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
		breton.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\pans\\BRET\u00D3N.jpg"));
		breton.setForeground(Color.WHITE);
		breton.setBackground(Color.WHITE);
		breton.setBounds(336, 52, 150, 150);
		contentPane.add(breton);

		JButton iberico = new JButton("New button");
		iberico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conexion c = new Conexion();

				fecha = new Date(Calendar.getInstance().getTimeInMillis());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String fechaTexto = formatter.format(fecha);

				precio = Integer.parseInt(precio_iberico.getText());
				precioTotal = precioTotal+precio;
				nombre = "Ibérico";
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
		iberico.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\pans\\IB\u00C9RICO.jpg"));
		iberico.setForeground(Color.WHITE);
		iberico.setBackground(Color.WHITE);
		iberico.setBounds(569, 52, 150, 150);
		contentPane.add(iberico);

		JButton british = new JButton("New button");
		british.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conexion c = new Conexion();

				fecha = new Date(Calendar.getInstance().getTimeInMillis());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String fechaTexto = formatter.format(fecha);

				precio = Integer.parseInt(precio_britishbacon.getText());
				precioTotal = precioTotal+precio;
				nombre = "British Bacon";
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
		british.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\pans\\BRITISH BACON.jpg"));
		british.setForeground(Color.WHITE);
		british.setBackground(Color.WHITE);
		british.setBounds(106, 244, 150, 150);
		contentPane.add(british);

		JButton serrano = new JButton("New button");
		serrano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conexion c = new Conexion();

				fecha = new Date(Calendar.getInstance().getTimeInMillis());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String fechaTexto = formatter.format(fecha);

				precio = Integer.parseInt(precio_serranobrie.getText());
				precioTotal = precioTotal+precio;
				nombre = "Serrano Brie";
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
		serrano.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\pans\\serranobrie.jpg"));
		serrano.setForeground(Color.WHITE);
		serrano.setBackground(Color.WHITE);
		serrano.setBounds(336, 244, 150, 150);
		contentPane.add(serrano);

		JButton supreme = new JButton("New button");
		supreme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conexion c = new Conexion();

				fecha = new Date(Calendar.getInstance().getTimeInMillis());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String fechaTexto = formatter.format(fecha);

				precio = Integer.parseInt(precio_pollosupreme.getText());
				precioTotal = precioTotal+precio;
				nombre = "Pollo Supreme";
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
		supreme.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\pans\\POLLO SUPREME.jpg"));
		supreme.setForeground(Color.WHITE);
		supreme.setBackground(Color.WHITE);
		supreme.setBounds(569, 244, 150, 150);
		contentPane.add(supreme);

		JButton crujiente = new JButton("New button");
		crujiente.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\pans\\CRUJIENTE DE POLLO Y BACON.jpg"));
		crujiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Conexion c = new Conexion();

				fecha = new Date(Calendar.getInstance().getTimeInMillis());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String fechaTexto = formatter.format(fecha);

				precio = Integer.parseInt(precio_crujientepollobacon.getText());
				precioTotal = precioTotal+precio;
				nombre = "Crujiente de Pollo y Bacon";
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
		crujiente.setForeground(Color.WHITE);
		crujiente.setBackground(Color.WHITE);
		crujiente.setBounds(106, 418, 150, 150);
		contentPane.add(crujiente);

		JButton pulled = new JButton("New button");
		pulled.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conexion c = new Conexion();

				fecha = new Date(Calendar.getInstance().getTimeInMillis());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String fechaTexto = formatter.format(fecha);

				precio = Integer.parseInt(precio_pulledporkbbq.getText());
				precioTotal = precioTotal+precio;
				nombre = "Pulled Pork BBQ";
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
		pulled.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\pans\\PULLED PORK BBQ.jpg"));
		pulled.setForeground(Color.WHITE);
		pulled.setBackground(Color.WHITE);
		pulled.setBounds(336, 418, 150, 150);
		contentPane.add(pulled);

		JButton asado = new JButton((String) null);
		asado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conexion c = new Conexion();

				fecha = new Date(Calendar.getInstance().getTimeInMillis());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String fechaTexto = formatter.format(fecha);

				precio = Integer.parseInt(precio_asadobrie.getText());
				precioTotal = precioTotal+precio;
				nombre = "Asado Brie";
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
		asado.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\pans\\POLLO ASADO BRIE.jpg"));
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
	}

}

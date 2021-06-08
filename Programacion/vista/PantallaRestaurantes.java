package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import conexion.Conexion;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class PantallaRestaurantes extends JFrame {

	private JPanel contentPane;
	private int id_cliente, postal;
	private String nom, cognoms, usuari, correu, direccio, data, contrasenya, carrer;
	private ImageIcon image;
	private String localidad_user;

	/**
	 * Create the frame.
	 */
	public PantallaRestaurantes(String nombreUser, int id, String localidad, String direccion) {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(PantallaRestaurantes.class.getResource("/vista/Imagenes/logofinal.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setResizable(false);
		localidad_user = localidad;
		JButton ginos = new JButton("New button");
		ginos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int id_user = id;

				String direccion_user = direccion;
				String empresa = "Ginos";

				MenuGinos frame = new MenuGinos(nombreUser, id_user, localidad_user, direccion_user, empresa);
				dispose();
				frame.setVisible(true);
			}
		});
		ginos.setBackground(new Color(204, 204, 204));
		ginos.setIcon(new ImageIcon(PantallaRestaurantes.class.getResource("/vista/Imagenes/ginos.png")));
		ginos.setBounds(360, 245, 150, 150);
		contentPane.add(ginos);

		JButton kfc = new JButton("New button");
		kfc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int id_user = id;
				String direccion_user = direccion;
				String empresa = "KFC";

				MenuKFC frame = new MenuKFC(nombreUser, id_user, localidad_user, direccion_user, empresa);
				dispose();
				frame.setVisible(true);
			}
		});
		kfc.setBackground(Color.WHITE);
		kfc.setIcon(new ImageIcon(PantallaRestaurantes.class.getResource("/vista/Imagenes/kfc.jpg")));
		kfc.setBounds(592, 245, 150, 150);
		contentPane.add(kfc);

		JButton pans = new JButton("New button");
		pans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int id_user = id;
				String localidad_user = localidad;
				String direccion_user = direccion;
				String empresa = "Pans";

				MenuPans frame = new MenuPans(nombreUser, id_user, localidad_user, direccion_user, empresa);
				dispose();
				frame.setVisible(true);
			}
		});
		pans.setBackground(Color.WHITE);
		pans.setIcon(new ImageIcon(PantallaRestaurantes.class.getResource("/vista/Imagenes/pans.png")));
		pans.setBounds(136, 419, 150, 150);
		contentPane.add(pans);

		JButton xequebo = new JButton("New button");
		xequebo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int id_user = id;
				String localidad_user = localidad;
				String direccion_user = direccion;
				String empresa = "XeQueBo";

				MenuXeQueBo frame = new MenuXeQueBo(nombreUser, id_user, localidad_user, direccion_user, empresa);
				dispose();
				frame.setVisible(true);
			}
		});
		xequebo.setIcon(new ImageIcon(PantallaRestaurantes.class.getResource("/vista/Imagenes/xequebo.png")));
		xequebo.setBounds(360, 419, 150, 150);
		contentPane.add(xequebo);

		JButton kebab = new JButton("New button");
		kebab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int id_user = id;
				String localidad_user = localidad;
				String direccion_user = direccion;
				String empresa = "KFC";

				MenuKebab frame = new MenuKebab(nombreUser, id_user, localidad_user, direccion_user, empresa);
				dispose();
				frame.setVisible(true);
			}
		});
		kebab.setBackground(Color.RED);
		kebab.setIcon(new ImageIcon(PantallaRestaurantes.class.getResource("/vista/Imagenes/kebab.jpg")));
		kebab.setBounds(592, 419, 150, 150);
		contentPane.add(kebab);

		JLabel lblNewLabel = new JLabel("ELIGE TU RESTAURANTE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(270, 11, 388, 61);
		contentPane.add(lblNewLabel);

		JButton burgerking = new JButton("New button");
		burgerking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int id_user = id;
				String localidad_user = localidad;
				String direccion_user = direccion;
				String empresa = "BurgerKing";

				MenuBurgerKing frame = new MenuBurgerKing(nombreUser, id_user, localidad_user, direccion_user, empresa);
				dispose();
				frame.setVisible(true);
			}
		});
		burgerking.setBackground(Color.WHITE);
		burgerking.setIcon(new ImageIcon(PantallaRestaurantes.class.getResource("/vista/Imagenes/burger.png")));
		burgerking.setBounds(360, 68, 150, 150);
		contentPane.add(burgerking);

		JButton mcdonalds = new JButton("New button");
		mcdonalds.setForeground(new Color(255, 255, 255));
		mcdonalds.setBackground(Color.WHITE);
		mcdonalds.setIcon(new ImageIcon(PantallaRestaurantes.class.getResource("/vista/Imagenes/mc.png")));
		mcdonalds.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int id_user = id;
				String localidad_user = localidad;
				String direccion_user = direccion;
				String empresa = "McDonalds";

				MenuMcDonalds frame = new MenuMcDonalds(nombreUser, id_user, localidad_user, direccion_user, empresa);
				dispose();
				frame.setVisible(true);
			}
		});
		mcdonalds.setBounds(136, 68, 150, 150);
		contentPane.add(mcdonalds);

		JButton telepizza = new JButton("New button");
		telepizza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int id_user = id;
				String localidad_user = localidad;
				String direccion_user = direccion;
				String empresa = "Telepizza";

				MenuTelepizza frame = new MenuTelepizza(nombreUser, id_user, localidad_user, direccion_user, empresa);
				dispose();
				frame.setVisible(true);
			}
		});
		telepizza.setBackground(new Color(204, 0, 0));
		telepizza.setIcon(new ImageIcon(PantallaRestaurantes.class.getResource("/vista/Imagenes/telepizza.png")));
		telepizza.setBounds(592, 68, 150, 150);
		contentPane.add(telepizza);

		JButton fosters = new JButton("New button");
		fosters.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				int id_user = id;
				String localidad_user = localidad;
				String direccion_user = direccion;
				String empresa = "Fosters";

				MenuFosters frame = new MenuFosters(nombreUser, id_user, localidad_user, direccion_user, empresa);
				dispose();
				frame.setVisible(true);
			}
		});

		fosters.setBackground(Color.WHITE);
		fosters.setIcon(new ImageIcon(PantallaRestaurantes.class.getResource("/vista/Imagenes/fosters.jpg")));
		fosters.setBounds(136, 245, 150, 150);
		contentPane.add(fosters);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PantallaRestaurantes.class.getResource("/vista/Imagenes/unnamed8.jpg")));
		lblNewLabel_1.setBounds(-131, -206, 1065, 928);
		contentPane.add(lblNewLabel_1);

		JButton perfil = new JButton("Mi Perfil");
		perfil.setBounds(10, 25, 106, 34);
		contentPane.add(perfil);

		perfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Conexion c = new Conexion();
				Connection miConexion = c.getConexion();

				try {

					Statement s = c.getConexion().createStatement();
					String sql = "select ID from persona where NombreUsuario = '" + nombreUser + "'";
					ResultSet rs = s.executeQuery(sql);

					if (rs.next()) {

						String id = rs.getString("ID");

						s = c.getConexion().createStatement();
						String sql1 = "select ID, Nombre, Apellidos, Contraseña, Correo, Direccion, Localidad, CodigoPostal, FechaNacimiento from persona where ID = '"
								+ id + "'";
						ResultSet rs1 = s.executeQuery(sql1);

						if (rs1.next()) {

							id_cliente = rs1.getInt("ID");
							nom = rs1.getString("Nombre");
							cognoms = rs1.getString("Apellidos");
							usuari = nombreUser;
							correu = rs1.getString("Correo");
							data = rs1.getString("FechaNacimiento");
							contrasenya = rs1.getString("Contraseña");
							localidad_user = rs1.getString("Localidad");
							carrer = rs1.getString("Direccion");
							postal = rs1.getInt("CodigoPostal");
						}
					}
				} catch (SQLException e1) {

					e1.printStackTrace();
				}

				PreparedStatement st;
				try {
					st = miConexion
							.prepareStatement("select imagen from persona where NombreUsuario = '" + nombreUser + "'");
					ResultSet rs = st.executeQuery();

					direccio = carrer + ", " + postal + ", " + localidad;

					while (rs.next()) {

						Blob blob = rs.getBlob(1);

						if (blob == null) {

							//image = new ImageIcon("/vista/Imagenes/default1.png");

							PerfilCliente frame = new PerfilCliente(id_cliente, nom, cognoms, usuari, correu, direccio,
									data, contrasenya, image);
							dispose();
							frame.setVisible(true);

						} else {

							InputStream is = blob.getBinaryStream();
							BufferedImage imagen = ImageIO.read(is);
							ImageIcon imagen2 = new ImageIcon(imagen);
							image = imagen2;

							PerfilCliente frame = new PerfilCliente(id_cliente, nom, cognoms, usuari, correu, direccio,
									data, contrasenya, image);
							dispose();
							frame.setVisible(true);

						}

					}

				} catch (SQLException e) {

					e.printStackTrace();

				} catch (FileNotFoundException e) {

					e.printStackTrace();

				} catch (IOException e) {

					e.printStackTrace();

				}

			}
		});
	}
}

package vista;

/**
 * Pantalla de perfil de cliente-Proyecto Integrado.
 * 
 * @author David, Alex y Eric.
 * 
 * @since 03/06/2021
 *
 */
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import conexion.Conexion;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PerfilCliente extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel modelo;
	private String localidad;
	private String direccionC;

	/**
	 * El constructor de la clase perfil cliente
	 * 
	 * @param id_cliente  el id del cliente
	 * @param nom         el nombre del cliente
	 * @param cognoms     los apellidos del cliente
	 * @param usuari      el nombre de usuario del cliente
	 * @param correu      el correo electronico del cliente
	 * @param direccio    la direccion donde vive el cliente
	 * @param data        la fecha de nacimiento
	 * @param contrasenya la contraseña del usuario
	 * @param image       la imagen de perfil que tiene el usuario puede ser null al
	 *                    ser nuevo
	 */

	public PerfilCliente(int id_cliente, String nom, String cognoms, String usuari, String correu, String direccio,
			String data, String contrasenya, ImageIcon image) {

		/**
		 * 
		 * Este evento se activa al abrirse la ventana, es para que en el historial se
		 * pongan los datos del pedido al momento de iniciar
		 * 
		 */
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {

				Conexion c = new Conexion();
				Connection miConexion = c.getConexion();

				table.setEnabled(false);

				Statement st;
				try {
					st = miConexion.createStatement();
					ResultSet rsUsuarios = st
							.executeQuery("Select * from pedido where IdCliente = '" + id_cliente + "'");

					Object[] fila = new Object[7];

					while (rsUsuarios.next()) {

						fila[0] = rsUsuarios.getString("Menu");
						fila[1] = rsUsuarios.getString("FechaPedido");
						fila[2] = rsUsuarios.getInt("PrecioPedido");
						fila[3] = rsUsuarios.getString("Empresa");
						fila[4] = rsUsuarios.getString("direccion");
						fila[5] = rsUsuarios.getInt("CodigoLocalidad");

						// Aqui se guarda el codigo de la localidad para luego hacer una consulta y
						// buscar su nombre para ponerlo en la tabla

						int codigo = (int) fila[5];

						Statement s = c.getConexion().createStatement();
						String sql = "select Nombre from localidad where Codigo = '" + codigo + "'";
						ResultSet rs = s.executeQuery(sql);

						if (rs.next()) {

							localidad = rs.getString("Nombre");

							Object ob = localidad;

							fila[6] = ob;

							modelo.addRow(fila);

							// En esta consulta se saca la direccion para poder pasarla por parametro luego

							sql = "select Direccion from persona where ID = '" + id_cliente + "'";
							rs = s.executeQuery(sql);

							if (rs.next()) {

								direccionC = rs.getString("Direccion");

							}

						}

					}

					rsUsuarios.close();
				} catch (SQLException e1) {

					e1.printStackTrace();
				}

			}
		});
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(PerfilCliente.class.getResource("/vista/Imagenes/logofinal.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(260, 31, 97, 20);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_2 = new JLabel("Apellidos:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(474, 31, 97, 20);
		contentPane.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("Nombre de Usuario:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_3.setBounds(693, 31, 176, 20);
		contentPane.add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_4 = new JLabel("Correo:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_4.setBounds(260, 108, 97, 20);
		contentPane.add(lblNewLabel_1_4);

		JLabel lblNewLabel_1_5 = new JLabel("Direcci\u00F3n");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_5.setBounds(474, 108, 97, 20);
		contentPane.add(lblNewLabel_1_5);

		JLabel lblNewLabel_1_6 = new JLabel("Contrase\u00F1a Actual:");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_6.setBounds(474, 181, 176, 20);
		contentPane.add(lblNewLabel_1_6);

		JLabel nombre = new JLabel(nom);
		nombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nombre.setBounds(260, 62, 57, 20);
		contentPane.add(nombre);

		JLabel apellidos = new JLabel(cognoms);
		apellidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		apellidos.setBounds(474, 62, 120, 20);
		contentPane.add(apellidos);

		JLabel usuario = new JLabel(usuari);
		usuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		usuario.setBounds(693, 62, 57, 20);
		contentPane.add(usuario);

		JLabel correo = new JLabel(correu);
		correo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		correo.setBounds(260, 139, 203, 20);
		contentPane.add(correo);

		JLabel direccion = new JLabel(direccio);
		direccion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		direccion.setBounds(474, 139, 320, 20);
		contentPane.add(direccion);

		JLabel contraseña = new JLabel("************");
		contraseña.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contraseña.setBounds(474, 212, 120, 20);
		contentPane.add(contraseña);

		JLabel lblNewLabel = new JLabel("HISTORIAL:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(374, 243, 137, 42);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1_6_1 = new JLabel("Fecha de Nacimiento:");
		lblNewLabel_1_6_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_6_1.setBounds(260, 181, 185, 20);
		contentPane.add(lblNewLabel_1_6_1);

		JLabel fecha = new JLabel(data);
		fecha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		fecha.setBounds(260, 212, 97, 20);
		contentPane.add(fecha);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 297, 849, 283);
		contentPane.add(scrollPane);

		modelo = new DefaultTableModel();
		table = new JTable(modelo);

		modelo.addColumn("Menu");
		modelo.addColumn("FechaPedido");
		modelo.addColumn("PrecioPedido");
		modelo.addColumn("Empresa");
		modelo.addColumn("direccion");
		modelo.addColumn("Localidad");

		scrollPane.setViewportView(table);

		JLabel labelFoto = new JLabel("");
		labelFoto.setHorizontalAlignment(SwingConstants.CENTER);
		labelFoto.setFont(new Font("Tahoma", Font.BOLD, 99));
		labelFoto.setBounds(28, 22, 176, 160);

		/**
		 * Este if comprueba si la imagen pasada por parametro es null, si lo es pondra
		 * una x en el hueco de la foto como seña de que no hay foto
		 */
		if (image == null) {

			labelFoto.setText("X");
			labelFoto.setHorizontalAlignment(SwingConstants.CENTER);
			labelFoto.setFont(new Font("Tahoma", Font.BOLD, 99));
			labelFoto.setBounds(28, 22, 176, 160);

		} else {
			labelFoto.setIcon(new ImageIcon(image.getImage().getScaledInstance(labelFoto.getWidth(),
					labelFoto.getHeight(), Image.SCALE_SMOOTH)));

		}
		contentPane.add(labelFoto);

		/**
		 * En este boton se cambia la imagen del usuario, para que cada vez que entre a
		 * su perfil le salga esa foto
		 */

		JButton cambiarImagen = new JButton("Cambiar imagen");
		cambiarImagen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				labelFoto.setText("");

				// Aqui es donde la foto se permite ser elegida y subida a la base de datos

				JFileChooser fc = new JFileChooser();

				FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & JPEG & PNG", "jpg", "jpeg", "png");
				fc.setFileFilter(filter);

				// Se comprueba si lo seleccionado es una foto en el caso que no lo sea dara
				// error

				int seleccion = fc.showOpenDialog(null);
				fc.setDialogTitle("Buscar imagen...");

				if (seleccion == JFileChooser.APPROVE_OPTION) {

					File f = fc.getSelectedFile();

					ImageIcon i = null;

					try {

						i = new ImageIcon(f.toURI().toURL());

					} catch (MalformedURLException ex) {

						JOptionPane.showMessageDialog(null, "Error en el formato o al encontrar la imagen.");
					}

					// Se pone la foto en el label

					labelFoto.setIcon(new ImageIcon(i.getImage().getScaledInstance(labelFoto.getWidth(),
							labelFoto.getHeight(), Image.SCALE_SMOOTH)));
					cambiarImagen.setEnabled(true);

					try {

						// Se sube la foto a la base de datos

						Conexion c = new Conexion();
						Connection miConexion = c.getConexion();
						String sql = "UPDATE persona SET imagen = ? WHERE ID =" + id_cliente;
						FileInputStream is = new FileInputStream(f.getAbsolutePath());
						PreparedStatement st = miConexion.prepareStatement(sql);

						st.setBlob(1, is);

						st.executeUpdate();
						is.close();
						st.close();

					} catch (SQLException e1) {

						e1.printStackTrace();

					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}
		});

		cambiarImagen.setBounds(48, 192, 137, 23);
		contentPane.add(cambiarImagen);

		/**
		 * 
		 * Este boton permite cambiar la contraseña de la cuenta
		 * 
		 */
		JButton cambiarContraseña = new JButton("Cambiar Contrase\u00F1a");
		cambiarContraseña.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String seleccion = JOptionPane.showInputDialog(null, "Nueva Contraseña:");

				if (seleccion == null) {

					seleccion = contrasenya;
				}

				try {

					Conexion c = new Conexion();
					Connection miConexion = c.getConexion();
					String sql = "UPDATE persona SET Contraseña = ? WHERE ID =" + id_cliente;
					PreparedStatement st = miConexion.prepareStatement(sql);

					st.setString(1, seleccion);

					st.executeUpdate();
					st.close();

				} catch (SQLException e1) {

					e1.printStackTrace();

				}

			}
		});
		cambiarContraseña.setBounds(642, 182, 167, 23);
		contentPane.add(cambiarContraseña);

		/**
		 * 
		 * Este boton cierra la sesion y te devuelve a la pantalla de login
		 * 
		 */

		JButton btnCerrarSesion = new JButton("Cerrar sesion");
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				PantallaLogin pL = new PantallaLogin();
				dispose();
				pL.setVisible(true);

			}
		});
		btnCerrarSesion.setBounds(48, 228, 137, 23);
		contentPane.add(btnCerrarSesion);

		/**
		 * Con este boton vuelves a la pantalla de restaurantes
		 */

		JButton btnVolverARestaurantes = new JButton("Volver a restaurantes");
		btnVolverARestaurantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PantallaRestaurantes pR = new PantallaRestaurantes(usuari, id_cliente, localidad, direccionC);
				dispose();
				pR.setVisible(true);

			}
		});
		btnVolverARestaurantes.setBounds(28, 262, 176, 23);
		contentPane.add(btnVolverARestaurantes);
	}
}
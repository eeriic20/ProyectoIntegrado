package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Conexion.Conexion;

import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class vistaEmpleado extends JFrame {

	private JPanel contentPane;
	private PantallaLogin pL = new PantallaLogin();
	private JTable table;

	/**
	 * Create the frame.
	 */
	public vistaEmpleado(String nombreUsuario) {
		setTitle("DELIVERY BUFA");
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\logofinal.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setResizable(false);

		JList list = new JList();
		list.setBounds(269, 304, -81, -41);
		contentPane.add(list);

		JLabel lblNewLabel = new JLabel(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel.setBounds(0, 218, 911, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre.setBounds(29, 26, 129, 38);
		contentPane.add(lblNombre);

		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblApellidos.setBounds(29, 61, 129, 38);
		contentPane.add(lblApellidos);

		JLabel lblLocalidad = new JLabel("Localidad:");
		lblLocalidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLocalidad.setBounds(29, 102, 129, 38);
		contentPane.add(lblLocalidad);

		JLabel lblDisponibilidad = new JLabel("Disponibilidad:");
		lblDisponibilidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDisponibilidad.setBounds(29, 141, 129, 38);
		contentPane.add(lblDisponibilidad);

		JLabel lblDisponibilidadR = new JLabel("**");
		lblDisponibilidadR.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDisponibilidadR.setBounds(143, 141, 129, 38);
		contentPane.add(lblDisponibilidadR);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(87, 255, 734, 310);
		contentPane.add(scrollPane);
		
		DefaultTableModel modelo = new DefaultTableModel();
		table = new JTable(modelo);
		modelo.addColumn("IdPedido");
		modelo.addColumn("Menu");
		modelo.addColumn("FechaPedido");
		modelo.addColumn("PrecioPedido");
		modelo.addColumn("EstadoPedido");
		modelo.addColumn("Empresa");
		modelo.addColumn("direccion");
		modelo.addColumn("CodigoLocalidad");
		modelo.addColumn("IdCliente");
		modelo.addColumn("IdEmpleado");
		
		scrollPane.setViewportView(table);

		JLabel lblLocalidadR = new JLabel("**");
		lblLocalidadR.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLocalidadR.setBounds(143, 102, 129, 38);
		contentPane.add(lblLocalidadR);

		JLabel lblApellidosR = new JLabel("**");
		lblApellidosR.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblApellidosR.setBounds(143, 61, 129, 38);
		contentPane.add(lblApellidosR);

		JLabel lblNombreR = new JLabel("**");
		lblNombreR.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombreR.setBounds(143, 26, 129, 38);
		contentPane.add(lblNombreR);

		JLabel lblrojo = new JLabel("No disponible");
		lblrojo.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\rojo.jpg"));
		lblrojo.setBackground(Color.WHITE);
		lblrojo.setHorizontalAlignment(SwingConstants.CENTER);
		lblrojo.setBounds(704, 75, 102, 58);
		contentPane.add(lblrojo);

		JLabel lblVerde = new JLabel("Disponible");
		lblVerde.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\verde.jpg"));
		lblVerde.setHorizontalAlignment(SwingConstants.CENTER);
		lblVerde.setBackground(Color.WHITE);
		lblVerde.setBounds(704, 75, 102, 58);
		contentPane.add(lblVerde);
		lblVerde.setVisible(false);

		JButton btnNewButton = new JButton("Disponible");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				lblrojo.setVisible(false);
				lblVerde.setVisible(true);

				Conexion c = new Conexion();

				try {

					Statement s = c.getConexion().createStatement();
					String sql = "select Nombre, Apellidos, Localidad from persona where NombreUsuario = '"
							+ nombreUsuario + "'";
					ResultSet rs = s.executeQuery(sql);

					if (rs.next()) {

						String nombreEmp = rs.getString("Nombre");
						String ApellidosEmp = rs.getString("Apellidos");
						String LocalidadEmp = rs.getString("Localidad");

						lblNombreR.setText(nombreEmp);
						lblApellidosR.setText(ApellidosEmp);
						lblLocalidadR.setText(LocalidadEmp);

						lblDisponibilidadR.setText("Disponible");

					}

				} catch (SQLException e) {

					e.printStackTrace();

				}

				try {
					Statement s = c.getConexion().createStatement();
					String sql = "select * from pedido where IdEmpleado = null";
					ResultSet rs = s.executeQuery(sql);

					if (rs.next()) {

					}
				} catch (SQLException e) {

					e.printStackTrace();

				}
			}
		});
		btnNewButton.setBounds(458, 188, 113, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("No disponible");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				lblVerde.setVisible(false);
				lblrojo.setVisible(true);

				lblNombreR.setText("**");
				lblApellidosR.setText("**");
				lblLocalidadR.setText("**");

				lblDisponibilidadR.setText("No disponible");

			}
		});
		btnNewButton_1.setBounds(327, 188, 113, 23);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\logo.PNG"));
		lblNewLabel_3.setBounds(343, -17, 211, 114);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fondo4.jpg"));
		lblNewLabel_2.setBounds(10, 26, 243, 153);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\FondoLogearse.jpg"));
		lblNewLabel_1.setBounds(-14, -17, 941, 643);
		contentPane.add(lblNewLabel_1);

	}
}

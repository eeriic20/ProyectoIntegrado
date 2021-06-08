package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import conexion.Conexion;
import javafx.scene.control.ComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import controlador.*;

public class vistaEmpleado extends JFrame {

	private JPanel contentPane;
	private PantallaLogin pL = new PantallaLogin();
	private JTable table;
	private JTable table1;
	private JTextArea textArea;
	private JComboBox comboBox;

	/**
	 * Create the frame.
	 */
	public vistaEmpleado(String nombreUsuario) {
		setTitle("DELIVERY BUFA");
		setIconImage(Toolkit.getDefaultToolkit().getImage(vistaEmpleado.class.getResource("/vista/Imagenes/logofinal.png")));
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
		scrollPane.setBounds(10, 243, 859, 347);
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
		modelo.addColumn("Localidad");
		modelo.addColumn("IdCliente");

		scrollPane.setViewportView(table);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 243, 859, 347);
		contentPane.add(scrollPane_1);

		DefaultTableModel modelo1 = new DefaultTableModel();
		table1 = new JTable(modelo1);

		modelo1.addColumn("IdPedido");
		modelo1.addColumn("Menu");
		modelo1.addColumn("FechaPedido");
		modelo1.addColumn("PrecioPedido");
		modelo1.addColumn("EstadoPedido");
		modelo1.addColumn("Empresa");
		modelo1.addColumn("direccion");
		modelo1.addColumn("Localidad");
		modelo1.addColumn("IdCliente");

		scrollPane_1.setViewportView(table1);

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
		lblrojo.setIcon(new ImageIcon(vistaEmpleado.class.getResource("/vista/Imagenes/rojo.jpg")));
		lblrojo.setBackground(Color.WHITE);
		lblrojo.setHorizontalAlignment(SwingConstants.CENTER);
		lblrojo.setBounds(383, 94, 102, 58);
		contentPane.add(lblrojo);

		JLabel lblVerde = new JLabel("Disponible");
		lblVerde.setIcon(new ImageIcon(vistaEmpleado.class.getResource("/vista/Imagenes/verde.jpg")));
		lblVerde.setHorizontalAlignment(SwingConstants.CENTER);
		lblVerde.setBackground(Color.WHITE);
		lblVerde.setBounds(383, 94, 102, 58);
		contentPane.add(lblVerde);
		lblVerde.setVisible(false);

		JButton btn_Disponible = new JButton("Disponible");
		btn_Disponible.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				lblrojo.setVisible(false);
				lblVerde.setVisible(true);

				scrollPane_1.setVisible(false);
				scrollPane.setVisible(true);

				Conexion c = new Conexion();
				Connection miConexion = c.getConexion();

				table.setEnabled(false);

				Statement st;
				try {
					st = miConexion.createStatement();
					ResultSet rsUsuarios = st.executeQuery("Select * from pedido where IdEmpleado IS NULL");

					Object[] fila = new Object[9];
					TableColumnModel columnModel = table.getColumnModel();
					columnModel.getColumn(0).setPreferredWidth(50);
					columnModel.getColumn(1).setPreferredWidth(150);
					columnModel.getColumn(2).setPreferredWidth(150);
					columnModel.getColumn(3).setPreferredWidth(50);
					columnModel.getColumn(6).setPreferredWidth(100);
					columnModel.getColumn(7).setPreferredWidth(50);
					columnModel.getColumn(8).setPreferredWidth(50);
					while (rsUsuarios.next()) {

						fila[0] = rsUsuarios.getInt("IdPedido");
						fila[1] = rsUsuarios.getString("Menu");
						fila[2] = rsUsuarios.getString("FechaPedido");
						fila[3] = rsUsuarios.getInt("PrecioPedido");
						fila[4] = rsUsuarios.getString("EstadoPedido");
						fila[5] = rsUsuarios.getString("Empresa");
						fila[6] = rsUsuarios.getString("direccion");
						fila[7] = rsUsuarios.getInt("CodigoLocalidad");
						fila[8] = rsUsuarios.getInt("IdCliente");
						String idPedido = ""+rsUsuarios.getInt("IdPedido");
						comboBox.addItem(idPedido);
						int codigo = (int) fila[7];

						Statement s = c.getConexion().createStatement();
						String sql = "select Nombre from localidad where Codigo = '" + codigo + "'";
						ResultSet rs = s.executeQuery(sql);

						if (rs.next()) {

							String localidad = rs.getString("Nombre");

							Object ob = localidad;

							fila[7] = ob;

							modelo.addRow(fila);

						}

					}

					rsUsuarios.close();
				} catch (SQLException e1) {

					e1.printStackTrace();
				}

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

			}
		});

		JLabel lblNewLabel_hacerpedido = new JLabel("Que pedido deseas realizar");
		lblNewLabel_hacerpedido.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_hacerpedido.setBounds(634, 46, 212, 44);
		contentPane.add(lblNewLabel_hacerpedido);
		btn_Disponible.setBounds(458, 188, 113, 23);
		contentPane.add(btn_Disponible);

		JButton btn_noDisponible = new JButton("No disponible");
		btn_noDisponible.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				lblVerde.setVisible(false);
				lblrojo.setVisible(true);

				lblNombreR.setText("**");
				lblApellidosR.setText("**");
				lblLocalidadR.setText("**");

				lblDisponibilidadR.setText("No disponible");

				table1.setEnabled(false);

				TableColumnModel columnModel = table1.getColumnModel();
				columnModel.getColumn(0).setPreferredWidth(50);
				columnModel.getColumn(1).setPreferredWidth(150);
				columnModel.getColumn(2).setPreferredWidth(150);
				columnModel.getColumn(3).setPreferredWidth(50);
				columnModel.getColumn(6).setPreferredWidth(100);
				columnModel.getColumn(7).setPreferredWidth(50);
				columnModel.getColumn(8).setPreferredWidth(50);

				scrollPane_1.setVisible(true);
				scrollPane.setVisible(false);
				
				comboBox.removeAllItems();

				modelo.setRowCount(0);

			}
		});
		btn_noDisponible.setBounds(327, 188, 113, 23);
		contentPane.add(btn_noDisponible);

		comboBox = new JComboBox();
		comboBox.setBounds(685, 94, 102, 20);
		contentPane.add(comboBox);

		JButton btn_realizarpedido = new JButton("Realizar pedido");
		btn_realizarpedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String id = comboBox.getSelectedItem().toString();
				int idPedido = Integer.parseInt(id);
				
				if(idPedido==0) {
					
					JOptionPane.showMessageDialog(null, "Debes seleccionar un id", "Error",
							JOptionPane.INFORMATION_MESSAGE);
					
				}
				
				try {
					
					Conexion c = new Conexion();
					Connection miConexion = c.getConexion();
					Statement s = c.getConexion().createStatement();
					String sql = "select ID from persona where NombreUsuario = '"+nombreUsuario+"'";
					ResultSet rs = s.executeQuery(sql);
					
					if(rs.next()) {
						
						String id_Empleado = rs.getString("ID");
						
						int idEmpleado = Integer.parseInt(id_Empleado);
						
						Conexion cn = new Conexion();
						miConexion = cn.getConexion();
						
						String msql = "UPDATE pedido SET idEmpleado = ? WHERE IdPedido = '"+idPedido+"'";
						
						PreparedStatement st = miConexion.prepareStatement(msql);
						
						st.setInt(1, idEmpleado);
						st.execute();
						
						Conexion c1 = new Conexion();
						Connection miConexion1 = c1.getConexion();

						table.setEnabled(false);
						
						limpiarTabla(table);

						Statement st1;
						try {
							st1 = miConexion1.createStatement();
							ResultSet rsUsuarios1 = st1.executeQuery("Select * from pedido where IdEmpleado IS NULL");

							Object[] fila1 = new Object[9];
							TableColumnModel columnModel = table.getColumnModel();
							columnModel.getColumn(0).setPreferredWidth(50);
							columnModel.getColumn(1).setPreferredWidth(150);
							columnModel.getColumn(2).setPreferredWidth(150);
							columnModel.getColumn(3).setPreferredWidth(50);
							columnModel.getColumn(6).setPreferredWidth(100);
							columnModel.getColumn(7).setPreferredWidth(50);
							columnModel.getColumn(8).setPreferredWidth(50);
							while (rsUsuarios1.next()) {

								fila1[0] = rsUsuarios1.getInt("IdPedido");
								fila1[1] = rsUsuarios1.getString("Menu");
								fila1[2] = rsUsuarios1.getString("FechaPedido");
								fila1[3] = rsUsuarios1.getInt("PrecioPedido");
								fila1[4] = rsUsuarios1.getString("EstadoPedido");
								fila1[5] = rsUsuarios1.getString("Empresa");
								fila1[6] = rsUsuarios1.getString("direccion");
								fila1[7] = rsUsuarios1.getInt("CodigoLocalidad");
								fila1[8] = rsUsuarios1.getInt("IdCliente");
								comboBox.removeAllItems();
								String idPedido2 = ""+rsUsuarios1.getInt("IdPedido");
								comboBox.addItem(idPedido2);
								int codigo = (int) fila1[7];
								
								Statement s2 = c1.getConexion().createStatement();
								String sql2 = "select Nombre from localidad where Codigo = '" + codigo + "'";
								ResultSet rs2 = s2.executeQuery(sql2);
								
								if (rs2.next()) {

									String localidad = rs2.getString("Nombre");

									Object ob = localidad;

									fila1[7] = ob;

									modelo.addRow(fila1);
									table.setModel(modelo);
									modelo.fireTableDataChanged();

								}

							}

							rsUsuarios1.close();
						} catch (SQLException e1) {

							e1.printStackTrace();
						}
						
						scrollPane.setVisible(false);
						
						scrollPane.setVisible(true);
					}
					
				} catch (SQLException e1) {

					e1.printStackTrace();

				}
				
			}
		});
		
		JButton btnCerrarSesion = new JButton("Cerrar sesion");
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaLogin pL = new PantallaLogin();
				dispose();
				pL.setVisible(true);
				
			}
		});
		btnCerrarSesion.setBounds(80, 188, 135, 23);
		contentPane.add(btnCerrarSesion);
		btn_realizarpedido.setBounds(675, 125, 129, 23);
		contentPane.add(btn_realizarpedido);

		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(vistaEmpleado.class.getResource("/vista/Imagenes/fondo4.jpg")));
		lblNewLabel_4.setBounds(633, 51, 211, 38);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(vistaEmpleado.class.getResource("/vista/Imagenes/logo.PNG")));
		lblNewLabel_3.setBounds(343, -17, 211, 114);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(vistaEmpleado.class.getResource("/vista/Imagenes/fondo4.jpg")));
		lblNewLabel_2.setBounds(10, 26, 262, 153);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(vistaEmpleado.class.getResource("/vista/Imagenes/FondoLogearse.jpg")));
		lblNewLabel_1.setBounds(-14, -17, 941, 643);
		contentPane.add(lblNewLabel_1);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(875, 597, 4, 4);
		contentPane.add(textArea);

	}
	
	public void limpiarTabla(JTable tabla){
        try {
            DefaultTableModel modelo=(DefaultTableModel) tabla.getModel();
            int filas=tabla.getRowCount();
            for (int i = 0;filas>i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }
}

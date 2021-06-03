package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.html.ImageView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.MalformedURLException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JSplitPane;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;

public class PerfilCliente extends JFrame {

	private JPanel contentPane;
	private int id_cliente = 15;

	/**
	 * Launch the application.
	 */

	
	  public static void main(String[] args) { EventQueue.invokeLater(new
	  Runnable() { public void run() { try { PerfilCliente frame = new
	  PerfilCliente(); frame.setVisible(true); } catch (Exception e) {
	  e.printStackTrace(); } } }); }
	 


	/**
	 * Create the frame.
	 */
	public PerfilCliente() {
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

		JLabel nombre = new JLabel("Eric");
		nombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nombre.setBounds(260, 62, 57, 20);
		contentPane.add(nombre);

		JLabel apellidos = new JLabel("Quintero Moreno");
		apellidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		apellidos.setBounds(474, 62, 120, 20);
		contentPane.add(apellidos);

		JLabel usuario = new JLabel("eeriic20");
		usuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		usuario.setBounds(693, 62, 57, 20);
		contentPane.add(usuario);

		JLabel correo = new JLabel("ericquintero2002@gmail.com");
		correo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		correo.setBounds(260, 139, 203, 20);
		contentPane.add(correo);

		JLabel direccion = new JLabel("Carrer del Dr. Peset, 46, 46250 L'Alc\u00FAdia");
		direccion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		direccion.setBounds(474, 139, 320, 20);
		contentPane.add(direccion);

		JLabel contraseņa = new JLabel("************");
		contraseņa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contraseņa.setBounds(474, 212, 120, 20);
		contentPane.add(contraseņa);

		JLabel lblNewLabel_1_7_3_2 = new JLabel("Cambiar contrase\u00F1a");
		lblNewLabel_1_7_3_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1_7_3_2.setBounds(641, 183, 109, 20);
		contentPane.add(lblNewLabel_1_7_3_2);

		JLabel lblNewLabel = new JLabel("HISTORIAL:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(370, 261, 137, 42);
		contentPane.add(lblNewLabel);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(28, 318, 813, 272);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel_1_6_1 = new JLabel("Fecha de Nacimiento:");
		lblNewLabel_1_6_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_6_1.setBounds(260, 181, 185, 20);
		contentPane.add(lblNewLabel_1_6_1);

		JLabel fecha = new JLabel("18/04/2002");
		fecha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		fecha.setBounds(260, 212, 97, 20);
		contentPane.add(fecha);

		JLabel labelFoto = new JLabel("");
		labelFoto.setIcon(new ImageIcon(PerfilCliente.class.getResource("/vista/Imagenes/default1.png")));
		labelFoto.setBounds(28, 22, 176, 160);
		contentPane.add(labelFoto);

		JButton cambiarImagen = new JButton("Cambiar imagen");
		cambiarImagen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				JFileChooser fc = new JFileChooser();

				FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & JPEG & PNG", "jpg", "jpeg", "png");
				fc.setFileFilter(filter);

				int seleccion = fc.showOpenDialog(null);
				fc.setDialogTitle("Buscar imagen...");

				if (seleccion == JFileChooser.APPROVE_OPTION) {
					File f = fc.getSelectedFile();
					ImageIcon i = null;
					try {
						i = new ImageIcon(f.toURI().toURL());
						
						
//						Preparedtatement ps = c.prepareStatement("UPDATE persona SET imagen = ? WHERE ID = '"+id_cliente+"'");
						
						
						
					} catch (MalformedURLException ex) {
						JOptionPane.showMessageDialog(null, "Error en el formato o al encontrar la imagen.");
					}
					labelFoto.setIcon(new ImageIcon(i.getImage().getScaledInstance(labelFoto.getWidth(), labelFoto.getHeight(), Image.SCALE_SMOOTH)));
					cambiarImagen.setEnabled(true);
					
					try {
						
						Conexion c = new Conexion();
						Connection miConexion = c.getConexion();
						String sql = "UPDATE persona SET imagen = ? WHERE ID = '"+id_cliente+"'";
						
						FileInputStream is = new FileInputStream(f.getAbsolutePath());
						PreparedStatement st = miConexion.prepareStatement(sql);
						
						st.setBlob(10, is);
						st.execute();
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
	}
}

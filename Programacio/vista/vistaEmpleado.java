package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class vistaEmpleado extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public vistaEmpleado() {
		setTitle("DELIVERY BUFA");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\logofinal.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(269, 304, -81, -41);
		contentPane.add(list);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 243, 849, 337);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
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
		
		JLabel lblNombre_1 = new JLabel("**");
		lblNombre_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre_1.setBounds(143, 141, 129, 38);
		contentPane.add(lblNombre_1);
		
		JLabel lblNombre_2 = new JLabel("**");
		lblNombre_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre_2.setBounds(143, 102, 129, 38);
		contentPane.add(lblNombre_2);
		
		JLabel lblNombre_3 = new JLabel("**");
		lblNombre_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre_3.setBounds(143, 61, 129, 38);
		contentPane.add(lblNombre_3);
		
		JLabel lblNombre_4 = new JLabel("**");
		lblNombre_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre_4.setBounds(143, 26, 129, 38);
		contentPane.add(lblNombre_4);
		
		JButton btnNewButton = new JButton("Disponible");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
		});
		btnNewButton.setBounds(458, 188, 113, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("No disponible");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(327, 188, 113, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("No disponible");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\rojo.jpg"));
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(704, 75, 102, 58);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Disponible");
		lblNewLabel_4_1.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\verde.jpg"));
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBackground(Color.WHITE);
		lblNewLabel_4_1.setBounds(704, 75, 102, 58);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\logo.PNG"));
		lblNewLabel_3.setBounds(343, -17, 211, 114);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fondo4.jpg"));
		lblNewLabel_2.setBounds(10, 26, 243, 153);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\FondoLogearse.jpg"));
		lblNewLabel_1.setBounds(-14, -17, 941, 643);
		contentPane.add(lblNewLabel_1);
		

		

		

		
		
	}
}

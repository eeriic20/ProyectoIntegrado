package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class PantallaLogin extends JFrame {
	/**
	 * <h1>Pantalla de Login-Proyecto Integrado.</h1>
	 * 
	 * @author David, Alex y Eric.
	 * 
	 * @since 25/05/2021
	 *
	 */
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblContrasea;
	private JLabel lblNewLabel_1;

	/**
	 * Create the frame.
	 */
	public PantallaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\logo.PNG"));
		lblNewLabel_2.setBounds(0, -14, 186, 115);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Usuario:");
		lblNewLabel_3.setFont(new Font("Segoe Print", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(351, 132, 136, 50);
		contentPane.add(lblNewLabel_3);
		
		lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Segoe Print", Font.PLAIN, 30));
		lblContrasea.setBounds(330, 280, 194, 34);
		contentPane.add(lblContrasea);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(381, 391, 89, 23);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(310, 325, 220, 34);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(310, 193, 220, 34);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\fondo4.jpg"));
		lblNewLabel_1.setBounds(246, 99, 343, 370);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\FondoLogearse.jpg"));
		lblNewLabel.setBounds(-14, -35, 1136, 754);
		contentPane.add(lblNewLabel);
		

		

	}
}

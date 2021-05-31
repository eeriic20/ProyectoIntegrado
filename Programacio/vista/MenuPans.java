package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuPans extends JFrame {

	private JPanel contentPane;

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
	public MenuPans() {
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

		JButton pechuga = new JButton("New button");
		pechuga.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\pans\\1pechugapollo.jpg"));
		pechuga.setForeground(Color.WHITE);
		pechuga.setBackground(Color.WHITE);
		pechuga.setBounds(106, 52, 150, 150);
		contentPane.add(pechuga);

		JButton breton = new JButton("New button");
		breton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		breton.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\pans\\BRET\u00D3N.jpg"));
		breton.setForeground(Color.WHITE);
		breton.setBackground(Color.WHITE);
		breton.setBounds(336, 52, 150, 150);
		contentPane.add(breton);

		JButton iberico = new JButton("New button");
		iberico.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\pans\\IB\u00C9RICO.jpg"));
		iberico.setForeground(Color.WHITE);
		iberico.setBackground(Color.WHITE);
		iberico.setBounds(569, 52, 150, 150);
		contentPane.add(iberico);

		JButton british = new JButton("New button");
		british.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\pans\\BRITISH BACON.jpg"));
		british.setForeground(Color.WHITE);
		british.setBackground(Color.WHITE);
		british.setBounds(106, 244, 150, 150);
		contentPane.add(british);

		JButton serrano = new JButton("New button");
		serrano.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\pans\\serranobrie.jpg"));
		serrano.setForeground(Color.WHITE);
		serrano.setBackground(Color.WHITE);
		serrano.setBounds(336, 244, 150, 150);
		contentPane.add(serrano);

		JButton supreme = new JButton("New button");
		supreme.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\pans\\POLLO SUPREME.jpg"));
		supreme.setForeground(Color.WHITE);
		supreme.setBackground(Color.WHITE);
		supreme.setBounds(569, 244, 150, 150);
		contentPane.add(supreme);

		JButton crujiente = new JButton("New button");
		crujiente.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\pans\\CRUJIENTE DE POLLO Y BACON.jpg"));
		crujiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		crujiente.setForeground(Color.WHITE);
		crujiente.setBackground(Color.WHITE);
		crujiente.setBounds(106, 418, 150, 150);
		contentPane.add(crujiente);

		JButton pulled = new JButton("New button");
		pulled.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\pans\\PULLED PORK BBQ.jpg"));
		pulled.setForeground(Color.WHITE);
		pulled.setBackground(Color.WHITE);
		pulled.setBounds(336, 418, 150, 150);
		contentPane.add(pulled);

		JButton asado = new JButton((String) null);
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
		
		JLabel lblNewLabel_1 = new JLabel("4");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(243, 213, 13, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("\u20AC");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(254, 213, 46, 14);
		contentPane.add(label);
		
		JLabel lblNewLabel_1_1 = new JLabel("5");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(427, 212, 13, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("4");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(676, 213, 13, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("4");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(230, 399, 13, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("5");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_4.setBounds(438, 399, 13, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("5");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_5.setBounds(695, 399, 13, 14);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("4");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_6.setBounds(266, 573, 13, 14);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("6");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_7.setBounds(461, 573, 13, 14);
		contentPane.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("6");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_8.setBounds(695, 573, 13, 14);
		contentPane.add(lblNewLabel_1_8);
		
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

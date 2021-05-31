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

public class MenuTelepizza extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { MenusTelepizza frame = new
	 * MenusTelepizza(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the frame.
	 */
	public MenuTelepizza() {
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

		JButton barbacoa = new JButton("New button");
		barbacoa.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\telepizza\\barbacoa.jpg"));
		barbacoa.setForeground(Color.WHITE);
		barbacoa.setBackground(Color.WHITE);
		barbacoa.setBounds(106, 52, 150, 150);
		contentPane.add(barbacoa);

		JButton carbonara = new JButton("New button");
		carbonara.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\telepizza\\carbonara.jpg"));
		carbonara.setForeground(Color.WHITE);
		carbonara.setBackground(Color.WHITE);
		carbonara.setBounds(336, 52, 150, 150);
		contentPane.add(carbonara);

		JButton hawaiana = new JButton("New button");
		hawaiana.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\telepizza\\hawaina.jpg"));
		hawaiana.setForeground(Color.WHITE);
		hawaiana.setBackground(Color.WHITE);
		hawaiana.setBounds(569, 52, 150, 150);
		contentPane.add(hawaiana);

		JButton cebolla = new JButton("New button");
		cebolla.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\telepizza\\cebolla.jpg"));
		cebolla.setForeground(Color.WHITE);
		cebolla.setBackground(Color.WHITE);
		cebolla.setBounds(106, 244, 150, 150);
		contentPane.add(cebolla);

		JButton peperoni = new JButton("New button");
		peperoni.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\telepizza\\peperoni.jpg"));
		peperoni.setForeground(Color.WHITE);
		peperoni.setBackground(Color.WHITE);
		peperoni.setBounds(336, 244, 150, 150);
		contentPane.add(peperoni);

		JButton baconCrispy = new JButton("New button");
		baconCrispy.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\telepizza\\baconcrispy.jpg"));
		baconCrispy.setForeground(Color.WHITE);
		baconCrispy.setBackground(Color.WHITE);
		baconCrispy.setBounds(569, 244, 150, 150);
		contentPane.add(baconCrispy);

		JButton vulcanoNachos = new JButton("New button");
		vulcanoNachos.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\telepizza\\vulcanonachos.jpg"));
		vulcanoNachos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		vulcanoNachos.setForeground(Color.WHITE);
		vulcanoNachos.setBackground(Color.WHITE);
		vulcanoNachos.setBounds(106, 418, 150, 150);
		contentPane.add(vulcanoNachos);

		JButton tandemGourmet = new JButton("New button");
		tandemGourmet.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\telepizza\\tandemgourmet.jpg"));
		tandemGourmet.setForeground(Color.WHITE);
		tandemGourmet.setBackground(Color.WHITE);
		tandemGourmet.setBounds(336, 418, 150, 150);
		contentPane.add(tandemGourmet);

		JButton supreme = new JButton("New button");
		supreme.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\telepizza\\supreme.jpg"));
		supreme.setForeground(Color.WHITE);
		supreme.setBackground(Color.WHITE);
		supreme.setBounds(569, 418, 150, 150);
		contentPane.add(supreme);

		JLabel lblNewLabel = new JLabel("Barbacoa");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(150, 200, 57, 33);
		contentPane.add(lblNewLabel);

		JLabel lblMenCuartoDe = new JLabel("Carbonara");
		lblMenCuartoDe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenCuartoDe.setBounds(375, 201, 98, 31);
		contentPane.add(lblMenCuartoDe);

		JLabel lblMenMcPollo = new JLabel("Hawaiana");
		lblMenMcPollo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcPollo.setBounds(613, 201, 92, 31);
		contentPane.add(lblMenMcPollo);

		JLabel lblMenAmericanStyle = new JLabel("Cebolla");
		lblMenAmericanStyle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenAmericanStyle.setBounds(156, 393, 80, 22);
		contentPane.add(lblMenAmericanStyle);

		JLabel lblMenHappyMeal = new JLabel("Peperoni");
		lblMenHappyMeal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenHappyMeal.setBounds(383, 393, 98, 22);
		contentPane.add(lblMenHappyMeal);

		JLabel lblMenGrandMcextreme = new JLabel("Bacon Crispy");
		lblMenGrandMcextreme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenGrandMcextreme.setBounds(609, 393, 110, 22);
		contentPane.add(lblMenGrandMcextreme);

		JLabel lblMenMcfish = new JLabel("Vulcano Nachos");
		lblMenMcfish.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcfish.setBounds(132, 566, 150, 25);
		contentPane.add(lblMenMcfish);

		JLabel lblMenDobleQueso = new JLabel("Tandem Gourmet");
		lblMenDobleQueso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenDobleQueso.setBounds(360, 566, 140, 25);
		contentPane.add(lblMenDobleQueso);

		JLabel lblMenMcwrap = new JLabel("Supreme");
		lblMenMcwrap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcwrap.setBounds(624, 566, 73, 25);
		contentPane.add(lblMenMcwrap);
		
		JLabel label = new JLabel("7");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(220, 213, 16, 14);
		contentPane.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("\u20AC");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(228, 213, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("7");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(444, 211, 16, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("7");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(681, 211, 16, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("7");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(205, 399, 16, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("7");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(444, 399, 16, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("7");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(692, 399, 16, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("7");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(240, 573, 16, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("7");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_7.setBounds(476, 573, 16, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("7");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds(689, 573, 16, 14);
		contentPane.add(label_8);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u20AC");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(454, 213, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("\u20AC");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(692, 211, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("\u20AC");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(220, 399, 46, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("\u20AC");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_4.setBounds(454, 399, 46, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("\u20AC");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_5.setBounds(702, 399, 46, 14);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("\u20AC");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_6.setBounds(252, 573, 46, 14);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("\u20AC");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_7.setBounds(484, 573, 46, 14);
		contentPane.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("\u20AC");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_8.setBounds(702, 573, 46, 14);
		contentPane.add(lblNewLabel_1_8);
	}

}

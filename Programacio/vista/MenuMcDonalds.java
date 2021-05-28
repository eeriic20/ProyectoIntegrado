package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class MenuMcDonalds extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { MenusMcDonalds frame = new
	 * MenusMcDonalds(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the frame.
	 */
	public MenuMcDonalds() {
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
		
		JButton bigMac = new JButton("New button");
		bigMac.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\mc\\menu-big-mac.png"));
		bigMac.setForeground(Color.WHITE);
		bigMac.setBackground(Color.WHITE);
		bigMac.setBounds(106, 52, 150, 150);
		contentPane.add(bigMac);
		
		JButton cuartoLibra = new JButton("New button");
		cuartoLibra.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\mc\\cuartodelibra.jpg"));
		cuartoLibra.setForeground(Color.WHITE);
		cuartoLibra.setBackground(Color.WHITE);
		cuartoLibra.setBounds(336, 52, 150, 150);
		contentPane.add(cuartoLibra);
		
		JButton mcPollo = new JButton("New button");
		mcPollo.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\mc\\Mcmenu-mediano-mcpollo.jpg"));
		mcPollo.setForeground(Color.WHITE);
		mcPollo.setBackground(Color.WHITE);
		mcPollo.setBounds(569, 52, 150, 150);
		contentPane.add(mcPollo);
		
		JButton styleChiken = new JButton("New button");
		styleChiken.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\mc\\american-style-chicken-324x324.png"));
		styleChiken.setForeground(Color.WHITE);
		styleChiken.setBackground(Color.WHITE);
		styleChiken.setBounds(106, 244, 150, 150);
		contentPane.add(styleChiken);
		
		JButton happyMeal = new JButton("New button");
		happyMeal.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\mc\\harapymeal.png"));
		happyMeal.setForeground(Color.WHITE);
		happyMeal.setBackground(Color.WHITE);
		happyMeal.setBounds(336, 244, 150, 150);
		contentPane.add(happyMeal);
		
		JButton grandMcExtreme = new JButton("New button");
		grandMcExtreme.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\mc\\mc_menu_grand-mcextreme_double_bacon.png"));
		grandMcExtreme.setForeground(Color.WHITE);
		grandMcExtreme.setBackground(Color.WHITE);
		grandMcExtreme.setBounds(569, 244, 150, 150);
		contentPane.add(grandMcExtreme);
		
		JButton mcFish = new JButton("New button");
		mcFish.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\mc\\Mcfish.png"));
		mcFish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mcFish.setForeground(Color.WHITE);
		mcFish.setBackground(Color.WHITE);
		mcFish.setBounds(106, 418, 150, 150);
		contentPane.add(mcFish);
		
		JButton hamburguesaConQueso = new JButton("New button");
		hamburguesaConQueso.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\mc\\menu-hamburguesa-doble-cheese-burger.jpg"));
		hamburguesaConQueso.setForeground(Color.WHITE);
		hamburguesaConQueso.setBackground(Color.WHITE);
		hamburguesaConQueso.setBounds(336, 418, 150, 150);
		contentPane.add(hamburguesaConQueso);
		
		JButton mcWrap = new JButton("New button");
		mcWrap.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\mc\\mcwrap.jpg"));
		mcWrap.setForeground(Color.WHITE);
		mcWrap.setBackground(Color.WHITE);
		mcWrap.setBounds(569, 418, 150, 150);
		contentPane.add(mcWrap);
		
		JLabel lblNewLabel = new JLabel("Men\u00FA Big Mac");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(133, 200, 116, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblMenCuartoDe = new JLabel("Men\u00FA Cuarto de Libra");
		lblMenCuartoDe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenCuartoDe.setBounds(346, 202, 140, 31);
		contentPane.add(lblMenCuartoDe);
		
		JLabel lblMenMcPollo = new JLabel("Men\u00FA Mc Pollo");
		lblMenMcPollo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcPollo.setBounds(591, 201, 110, 31);
		contentPane.add(lblMenMcPollo);
		
		JLabel lblMenAmericanStyle = new JLabel("Men\u00FA American Style Chiken");
		lblMenAmericanStyle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenAmericanStyle.setBounds(88, 393, 178, 22);
		contentPane.add(lblMenAmericanStyle);
		
		JLabel lblMenHappyMeal = new JLabel("Men\u00FA Happy Meal");
		lblMenHappyMeal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenHappyMeal.setBounds(358, 393, 140, 22);
		contentPane.add(lblMenHappyMeal);
		
		JLabel lblMenGrandMcextreme = new JLabel("Men\u00FA Grand McExtreme");
		lblMenGrandMcextreme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenGrandMcextreme.setBounds(569, 393, 164, 22);
		contentPane.add(lblMenGrandMcextreme);
		
		JLabel lblMenMcfish = new JLabel("Men\u00FA McFish");
		lblMenMcfish.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcfish.setBounds(133, 566, 123, 25);
		contentPane.add(lblMenMcfish);
		
		JLabel lblMenDobleQueso = new JLabel("Men\u00FA Doble Queso");
		lblMenDobleQueso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenDobleQueso.setBounds(346, 566, 140, 25);
		contentPane.add(lblMenDobleQueso);
		
		JLabel lblMenMcwrap = new JLabel("Men\u00FA McWrap");
		lblMenMcwrap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcwrap.setBounds(591, 566, 128, 25);
		contentPane.add(lblMenMcwrap);
	}

}

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

public class MenuKebab extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { MenuKebab frame = new MenuKebab();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */

	/**
	 * Create the frame.
	 */
	public MenuKebab() {
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

		JButton mixto = new JButton("New button");
		mixto.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\kebab\\mixto.jpg"));
		mixto.setForeground(Color.WHITE);
		mixto.setBackground(Color.WHITE);
		mixto.setBounds(106, 52, 150, 150);
		contentPane.add(mixto);

		JButton ternera = new JButton("New button");
		ternera.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\kebab\\ternera.jpg"));
		ternera.setForeground(Color.WHITE);
		ternera.setBackground(Color.WHITE);
		ternera.setBounds(336, 52, 150, 150);
		contentPane.add(ternera);

		JButton pollo = new JButton("New button");
		pollo.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\kebab\\kebab_de_pollo_casero.jpg"));
		pollo.setForeground(Color.WHITE);
		pollo.setBackground(Color.WHITE);
		pollo.setBounds(569, 52, 150, 150);
		contentPane.add(pollo);

		JButton mixtoPita = new JButton("New button");
		mixtoPita.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\kebab\\mixtopanpita.png"));
		mixtoPita.setForeground(Color.WHITE);
		mixtoPita.setBackground(Color.WHITE);
		mixtoPita.setBounds(106, 244, 150, 150);
		contentPane.add(mixtoPita);

		JButton terneraPita = new JButton("New button");
		terneraPita.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\kebab\\ternerapanpita.png"));
		terneraPita.setForeground(Color.WHITE);
		terneraPita.setBackground(Color.WHITE);
		terneraPita.setBounds(336, 244, 150, 150);
		contentPane.add(terneraPita);

		JButton polloPita = new JButton("New button");
		polloPita.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\kebab\\pollopanpita.jpg"));
		polloPita.setForeground(Color.WHITE);
		polloPita.setBackground(Color.WHITE);
		polloPita.setBounds(569, 244, 150, 150);
		contentPane.add(polloPita);

		JButton pizzaKebab = new JButton("New button");
		pizzaKebab.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\kebab\\kebabpizza2.jpg"));
		pizzaKebab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		pizzaKebab.setForeground(Color.WHITE);
		pizzaKebab.setBackground(Color.WHITE);
		pizzaKebab.setBounds(106, 418, 150, 150);
		contentPane.add(pizzaKebab);

		JButton jamonQueso = new JButton("New button");
		jamonQueso.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\kebab\\pizza_jamonyqueso_sinlactosa_730x470.jpg"));
		jamonQueso.setForeground(Color.WHITE);
		jamonQueso.setBackground(Color.WHITE);
		jamonQueso.setBounds(336, 418, 150, 150);
		contentPane.add(jamonQueso);

		JButton barbacoa = new JButton((String) null);
		barbacoa.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\kebab\\pizza-barbacoa-xxl.jpg"));
		barbacoa.setForeground(Color.WHITE);
		barbacoa.setBackground(Color.WHITE);
		barbacoa.setBounds(569, 418, 150, 150);
		contentPane.add(barbacoa);

		JLabel lblNewLabel = new JLabel("Kebab Mixto");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(131, 201, 91, 33);
		contentPane.add(lblNewLabel);

		JLabel newu = new JLabel("Kebab de Ternera");
		newu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		newu.setBounds(359, 202, 115, 31);
		contentPane.add(newu);

		JLabel lblMenMcPollo = new JLabel("Kebab de pollo");
		lblMenMcPollo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcPollo.setBounds(594, 202, 103, 31);
		contentPane.add(lblMenMcPollo);

		JLabel lblMenAmericanStyle = new JLabel("Kebab Mixto Pan de Pita");
		lblMenAmericanStyle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenAmericanStyle.setBounds(106, 393, 150, 22);
		contentPane.add(lblMenAmericanStyle);

		JLabel lblMenHappyMeal = new JLabel("Kebab de Ternera Pan de Pita");
		lblMenHappyMeal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenHappyMeal.setBounds(318, 393, 194, 22);
		contentPane.add(lblMenHappyMeal);

		JLabel lblMenGrandMcextreme = new JLabel("Kebab de Pollo Pan de Pita");
		lblMenGrandMcextreme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenGrandMcextreme.setBounds(560, 393, 173, 22);
		contentPane.add(lblMenGrandMcextreme);

		JLabel lblMenMcfish = new JLabel("Pizza Kebab");
		lblMenMcfish.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcfish.setBounds(149, 566, 107, 25);
		contentPane.add(lblMenMcfish);

		JLabel lblMenDobleQueso = new JLabel("Pizza Jamon y Queso");
		lblMenDobleQueso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenDobleQueso.setBounds(346, 566, 150, 25);
		contentPane.add(lblMenDobleQueso);

		JLabel hola = new JLabel("Pizza Barbacoa");
		hola.setFont(new Font("Tahoma", Font.PLAIN, 14));
		hola.setBounds(606, 566, 91, 25);
		contentPane.add(hola);
	}

}

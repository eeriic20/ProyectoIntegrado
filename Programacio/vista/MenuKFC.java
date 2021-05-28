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

public class MenuKFC extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { MenuKFC frame = new MenuKFC();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */

	/**
	 * Create the frame.
	 */
	public MenuKFC() {
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

		JButton doble = new JButton("New button");
		doble.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\kfc\\doble bbq cheesburger.jpg"));
		doble.setForeground(Color.WHITE);
		doble.setBackground(Color.WHITE);
		doble.setBounds(106, 52, 150, 150);
		contentPane.add(doble);

		JButton cheese = new JButton("New button");
		cheese.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\kfc\\doblecheesburger.jpg"));
		cheese.setForeground(Color.WHITE);
		cheese.setBackground(Color.WHITE);
		cheese.setBounds(336, 52, 150, 150);
		contentPane.add(cheese);

		JButton baconcheese = new JButton("New button");
		baconcheese.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\kfc\\bbqbaconcheesburger.jpg"));
		baconcheese.setForeground(Color.WHITE);
		baconcheese.setBackground(Color.WHITE);
		baconcheese.setBounds(569, 52, 150, 150);
		contentPane.add(baconcheese);

		JButton sobrada = new JButton("New button");
		sobrada.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\kfc\\sobrada.jpg"));
		sobrada.setForeground(Color.WHITE);
		sobrada.setBackground(Color.WHITE);
		sobrada.setBounds(106, 244, 150, 150);
		contentPane.add(sobrada);

		JButton mazorca = new JButton("New button");
		mazorca.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\kfc\\41379.jpg"));
		mazorca.setForeground(Color.WHITE);
		mazorca.setBackground(Color.WHITE);
		mazorca.setBounds(336, 244, 150, 150);
		contentPane.add(mazorca);

		JButton twister = new JButton("New button");
		twister.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\kfc\\twister.jpg"));
		twister.setForeground(Color.WHITE);
		twister.setBackground(Color.WHITE);
		twister.setBounds(569, 244, 150, 150);
		contentPane.add(twister);

		JButton orginal = new JButton("New button");
		orginal.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\kfc\\originalburger.jpg"));
		orginal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		orginal.setForeground(Color.WHITE);
		orginal.setBackground(Color.WHITE);
		orginal.setBounds(106, 418, 150, 150);
		contentPane.add(orginal);

		JButton bucket = new JButton("New button");
		bucket.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\kfc\\bucketmix.jpg"));
		bucket.setForeground(Color.WHITE);
		bucket.setBackground(Color.WHITE);
		bucket.setBounds(336, 418, 150, 150);
		contentPane.add(bucket);

		JButton picantes = new JButton((String) null);
		picantes.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\kfc\\picantes.jpg"));
		picantes.setForeground(Color.WHITE);
		picantes.setBackground(Color.WHITE);
		picantes.setBounds(569, 418, 150, 150);
		contentPane.add(picantes);

		JLabel lblNewLabel = new JLabel("Doble BBQ Bacon Cheese Burger");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(75, 201, 211, 33);
		contentPane.add(lblNewLabel);

		JLabel newu = new JLabel("Original Doble Cheese Burger");
		newu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		newu.setBounds(323, 202, 197, 31);
		contentPane.add(newu);

		JLabel lblMenMcPollo = new JLabel("BBQ Bacon Cheese Burger");
		lblMenMcPollo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcPollo.setBounds(558, 202, 175, 31);
		contentPane.add(lblMenMcPollo);

		JLabel lblMenAmericanStyle = new JLabel("Sobrada");
		lblMenAmericanStyle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenAmericanStyle.setBounds(151, 393, 62, 22);
		contentPane.add(lblMenAmericanStyle);

		JLabel lblMenHappyMeal = new JLabel("Mazorca");
		lblMenHappyMeal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenHappyMeal.setBounds(383, 393, 68, 22);
		contentPane.add(lblMenHappyMeal);

		JLabel lblMenGrandMcextreme = new JLabel("Twister");
		lblMenGrandMcextreme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenGrandMcextreme.setBounds(615, 393, 50, 22);
		contentPane.add(lblMenGrandMcextreme);

		JLabel lblMenMcfish = new JLabel("Original Burger");
		lblMenMcfish.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcfish.setBounds(130, 566, 111, 25);
		contentPane.add(lblMenMcfish);

		JLabel lblMenDobleQueso = new JLabel("Bucket Mix");
		lblMenDobleQueso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenDobleQueso.setBounds(379, 566, 82, 25);
		contentPane.add(lblMenDobleQueso);

		JLabel hola = new JLabel("8 Alitas Picantes");
		hola.setFont(new Font("Tahoma", Font.PLAIN, 14));
		hola.setBounds(593, 566, 126, 25);
		contentPane.add(hola);
	}

}

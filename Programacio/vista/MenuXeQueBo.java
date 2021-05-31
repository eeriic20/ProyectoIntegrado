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

public class MenuXeQueBo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { MenuXeQueBo frame = new MenuXeQueBo();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */

	/**
	 * Create the frame.
	 */
	public MenuXeQueBo() {
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

		JButton chivito = new JButton("New button");
		chivito.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\xequebo\\xivito.jpg"));
		chivito.setForeground(Color.WHITE);
		chivito.setBackground(Color.WHITE);
		chivito.setBounds(106, 52, 150, 150);
		contentPane.add(chivito);

		JButton breton = new JButton("New button");
		breton.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\xequebo\\lomo-con-queso.jpg"));
		breton.setForeground(Color.WHITE);
		breton.setBackground(Color.WHITE);
		breton.setBounds(336, 52, 150, 150);
		contentPane.add(breton);

		JButton brascada = new JButton("New button");
		brascada.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\xequebo\\Brascada-o-Bocadillo-de-ternera-Receta-tipica-de-Valencia.jpg"));
		brascada.setForeground(Color.WHITE);
		brascada.setBackground(Color.WHITE);
		brascada.setBounds(569, 52, 150, 150);
		contentPane.add(brascada);

		JButton caballo = new JButton("New button");
		caballo.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\xequebo\\CARNE-DE-CABALLO-e1572524562624.png"));
		caballo.setForeground(Color.WHITE);
		caballo.setBackground(Color.WHITE);
		caballo.setBounds(106, 244, 150, 150);
		contentPane.add(caballo);

		JButton calamares = new JButton("New button");
		calamares.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\xequebo\\bocadillo-calamares.jpg"));
		calamares.setForeground(Color.WHITE);
		calamares.setBackground(Color.WHITE);
		calamares.setBounds(336, 244, 150, 150);
		contentPane.add(calamares);

		JButton sepia = new JButton("New button");
		sepia.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\xequebo\\SEPIA-e1572524731254-1024x422.png"));
		sepia.setForeground(Color.WHITE);
		sepia.setBackground(Color.WHITE);
		sepia.setBounds(569, 244, 150, 150);
		contentPane.add(sepia);

		JButton crujiente = new JButton("New button");
		crujiente.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\xequebo\\bocadillo-tortilla-variada.jpg"));
		crujiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		crujiente.setForeground(Color.WHITE);
		crujiente.setBackground(Color.WHITE);
		crujiente.setBounds(106, 418, 150, 150);
		contentPane.add(crujiente);

		JButton jamon = new JButton("New button");
		jamon.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\xequebo\\jamwich.jpg"));
		jamon.setForeground(Color.WHITE);
		jamon.setBackground(Color.WHITE);
		jamon.setBounds(336, 418, 150, 150);
		contentPane.add(jamon);

		JButton boquerones = new JButton((String) null);
		boquerones.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\xequebo\\boquerones-1.jpg"));
		boquerones.setForeground(Color.WHITE);
		boquerones.setBackground(Color.WHITE);
		boquerones.setBounds(569, 418, 150, 150);
		contentPane.add(boquerones);

		JLabel lblNewLabel = new JLabel("Chivito");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(149, 200, 68, 33);
		contentPane.add(lblNewLabel);

		JLabel newu = new JLabel("Lomo con Queso");
		newu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		newu.setBounds(359, 202, 115, 31);
		contentPane.add(newu);

		JLabel lblMenMcPollo = new JLabel("Brascada");
		lblMenMcPollo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcPollo.setBounds(614, 201, 68, 31);
		contentPane.add(lblMenMcPollo);

		JLabel lblMenAmericanStyle = new JLabel("Carne de Caballo");
		lblMenAmericanStyle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenAmericanStyle.setBounds(130, 393, 107, 22);
		contentPane.add(lblMenAmericanStyle);

		JLabel lblMenHappyMeal = new JLabel("Calamares");
		lblMenHappyMeal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenHappyMeal.setBounds(374, 393, 91, 22);
		contentPane.add(lblMenHappyMeal);

		JLabel lblMenGrandMcextreme = new JLabel("Sepia");
		lblMenGrandMcextreme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenGrandMcextreme.setBounds(620, 393, 62, 22);
		contentPane.add(lblMenGrandMcextreme);

		JLabel lblMenMcfish = new JLabel("Tortilla Patata");
		lblMenMcfish.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcfish.setBounds(130, 566, 107, 25);
		contentPane.add(lblMenMcfish);

		JLabel lblMenDobleQueso = new JLabel("Jam\u00F3n");
		lblMenDobleQueso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenDobleQueso.setBounds(389, 566, 62, 25);
		contentPane.add(lblMenDobleQueso);

		JLabel hola = new JLabel("Boquerones");
		hola.setFont(new Font("Tahoma", Font.PLAIN, 14));
		hola.setBounds(606, 566, 91, 25);
		contentPane.add(hola);
	}

}

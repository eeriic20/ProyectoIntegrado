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

public class MenuGinos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { MenuGinos frame = new MenuGinos();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */

	/**
	 * Create the frame.
	 */
	public MenuGinos() {
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

		JButton prosciutto = new JButton("New button");
		prosciutto.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\ginos\\8prosciutto_1.jpg"));
		prosciutto.setForeground(Color.WHITE);
		prosciutto.setBackground(Color.WHITE);
		prosciutto.setBounds(106, 52, 150, 150);
		contentPane.add(prosciutto);

		JButton barbecue = new JButton("New button");
		barbecue.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\ginos\\fichainterna1366x852pxpollobarbecue.jpg"));
		barbecue.setForeground(Color.WHITE);
		barbecue.setBackground(Color.WHITE);
		barbecue.setBounds(336, 52, 150, 150);
		contentPane.add(barbecue);

		JButton margherita = new JButton("New button");
		margherita.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\ginos\\8margherita.jpg"));
		margherita.setForeground(Color.WHITE);
		margherita.setBackground(Color.WHITE);
		margherita.setBounds(569, 52, 150, 150);
		contentPane.add(margherita);

		JButton piemontese = new JButton("New button");
		piemontese.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\ginos\\8piemontese_0.jpg"));
		piemontese.setForeground(Color.WHITE);
		piemontese.setBackground(Color.WHITE);
		piemontese.setBounds(106, 244, 150, 150);
		contentPane.add(piemontese);

		JButton peperoni = new JButton("New button");
		peperoni.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\ginos\\pepperoni_0.jpg"));
		peperoni.setForeground(Color.WHITE);
		peperoni.setBackground(Color.WHITE);
		peperoni.setBounds(336, 244, 150, 150);
		contentPane.add(peperoni);

		JButton tagliatelle = new JButton("New button");
		tagliatelle.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\ginos\\tagliatelleprimavera.jpg"));
		tagliatelle.setForeground(Color.WHITE);
		tagliatelle.setBackground(Color.WHITE);
		tagliatelle.setBounds(569, 244, 150, 150);
		contentPane.add(tagliatelle);

		JButton spaghetti = new JButton("New button");
		spaghetti.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\ginos\\8ginos-fruti-de-mare-1366x852.jpg"));
		spaghetti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		spaghetti.setForeground(Color.WHITE);
		spaghetti.setBackground(Color.WHITE);
		spaghetti.setBounds(106, 418, 150, 150);
		contentPane.add(spaghetti);

		JButton penne = new JButton("New button");
		penne.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\ginos\\8nuevos-penne-allarrabbiata-di-pepperoni-en-ginos.jpg"));
		penne.setForeground(Color.WHITE);
		penne.setBackground(Color.WHITE);
		penne.setBounds(336, 418, 150, 150);
		contentPane.add(penne);

		JButton cacio = new JButton((String) null);
		cacio.setIcon(new ImageIcon("C:\\eclipse-workspace\\DeliveryBufa\\src\\vista\\Imagenes\\ginos\\caciopepe.jpg"));
		cacio.setForeground(Color.WHITE);
		cacio.setBackground(Color.WHITE);
		cacio.setBounds(569, 418, 150, 150);
		contentPane.add(cacio);

		JLabel lblNewLabel = new JLabel("Prosciutto");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(146, 201, 81, 33);
		contentPane.add(lblNewLabel);

		JLabel newu = new JLabel("Pollo Barbecue");
		newu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		newu.setBounds(371, 202, 110, 31);
		contentPane.add(newu);

		JLabel lblMenMcPollo = new JLabel("Margherita");
		lblMenMcPollo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcPollo.setBounds(609, 202, 88, 31);
		contentPane.add(lblMenMcPollo);

		JLabel lblMenAmericanStyle = new JLabel("Piemontese");
		lblMenAmericanStyle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenAmericanStyle.setBounds(146, 393, 120, 22);
		contentPane.add(lblMenAmericanStyle);

		JLabel lblMenHappyMeal = new JLabel("Peperoni");
		lblMenHappyMeal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenHappyMeal.setBounds(383, 393, 98, 22);
		contentPane.add(lblMenHappyMeal);

		JLabel lblMenGrandMcextreme = new JLabel("Tagliatelle Integrali Primavera");
		lblMenGrandMcextreme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenGrandMcextreme.setBounds(556, 393, 188, 22);
		contentPane.add(lblMenGrandMcextreme);

		JLabel lblMenMcfish = new JLabel("Spaghetti Ai Frutti Di Mare");
		lblMenMcfish.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcfish.setBounds(98, 566, 188, 25);
		contentPane.add(lblMenMcfish);

		JLabel lblMenDobleQueso = new JLabel("Penne All'Arrabbiata Di Pepperoni");
		lblMenDobleQueso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenDobleQueso.setBounds(309, 566, 211, 25);
		contentPane.add(lblMenDobleQueso);

		JLabel lblMenMcwrap = new JLabel("Cacio e Pepe");
		lblMenMcwrap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcwrap.setBounds(604, 566, 104, 25);
		contentPane.add(lblMenMcwrap);
	}

}

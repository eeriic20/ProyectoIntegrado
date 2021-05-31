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
	 * Create the frame.
	 */
	public MenuGinos(String id, String localidad, String direccion, String empresa) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\logofinal.png"));
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
		prosciutto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		prosciutto.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\ginos\\8prosciutto_1.jpg"));
		prosciutto.setForeground(Color.WHITE);
		prosciutto.setBackground(Color.WHITE);
		prosciutto.setBounds(106, 52, 150, 150);
		contentPane.add(prosciutto);

		JButton barbecue = new JButton("New button");
		barbecue.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\ginos\\fichainterna1366x852pxpollobarbecue.jpg"));
		barbecue.setForeground(Color.WHITE);
		barbecue.setBackground(Color.WHITE);
		barbecue.setBounds(336, 52, 150, 150);
		contentPane.add(barbecue);

		JButton margherita = new JButton("New button");
		margherita.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\ginos\\8margherita.jpg"));
		margherita.setForeground(Color.WHITE);
		margherita.setBackground(Color.WHITE);
		margherita.setBounds(569, 52, 150, 150);
		contentPane.add(margherita);

		JButton piemontese = new JButton("New button");
		piemontese.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\ginos\\8piemontese_0.jpg"));
		piemontese.setForeground(Color.WHITE);
		piemontese.setBackground(Color.WHITE);
		piemontese.setBounds(106, 244, 150, 150);
		contentPane.add(piemontese);

		JButton peperoni = new JButton("New button");
		peperoni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		peperoni.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\ginos\\pepperoni_0.jpg"));
		peperoni.setForeground(Color.WHITE);
		peperoni.setBackground(Color.WHITE);
		peperoni.setBounds(336, 244, 150, 150);
		contentPane.add(peperoni);

		JButton tagliatelle = new JButton("New button");
		tagliatelle.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\ginos\\tagliatelleprimavera.jpg"));
		tagliatelle.setForeground(Color.WHITE);
		tagliatelle.setBackground(Color.WHITE);
		tagliatelle.setBounds(569, 244, 150, 150);
		contentPane.add(tagliatelle);

		JButton spaghetti = new JButton("New button");
		spaghetti.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\ginos\\8ginos-fruti-de-mare-1366x852.jpg"));
		spaghetti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		spaghetti.setForeground(Color.WHITE);
		spaghetti.setBackground(Color.WHITE);
		spaghetti.setBounds(106, 418, 150, 150);
		contentPane.add(spaghetti);

		JButton penne = new JButton("New button");
		penne.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\ginos\\8nuevos-penne-allarrabbiata-di-pepperoni-en-ginos.jpg"));
		penne.setForeground(Color.WHITE);
		penne.setBackground(Color.WHITE);
		penne.setBounds(336, 418, 150, 150);
		contentPane.add(penne);

		JButton cacio = new JButton((String) null);
		cacio.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\ginos\\caciopepe.jpg"));
		cacio.setForeground(Color.WHITE);
		cacio.setBackground(Color.WHITE);
		cacio.setBounds(569, 418, 150, 150);
		contentPane.add(cacio);

		JLabel lblNewLabel = new JLabel("Prosciutto:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(116, 200, 81, 33);
		contentPane.add(lblNewLabel);

		JLabel newu = new JLabel("Pollo Barbecue:");
		newu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		newu.setBounds(371, 202, 98, 31);
		contentPane.add(newu);

		JLabel lblMenMcPollo = new JLabel("Margherita:");
		lblMenMcPollo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcPollo.setBounds(591, 202, 81, 31);
		contentPane.add(lblMenMcPollo);

		JLabel lblMenAmericanStyle = new JLabel("Piemontese:");
		lblMenAmericanStyle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenAmericanStyle.setBounds(146, 393, 81, 22);
		contentPane.add(lblMenAmericanStyle);

		JLabel lblMenHappyMeal = new JLabel("Peperoni:");
		lblMenHappyMeal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenHappyMeal.setBounds(383, 393, 62, 22);
		contentPane.add(lblMenHappyMeal);

		JLabel lblMenGrandMcextreme = new JLabel("Tagliatelle Integrali Primavera:");
		lblMenGrandMcextreme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenGrandMcextreme.setBounds(556, 393, 188, 22);
		contentPane.add(lblMenGrandMcextreme);

		JLabel lblMenMcfish = new JLabel("Spaghetti Ai Frutti Di Mare:");
		lblMenMcfish.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcfish.setBounds(98, 566, 165, 25);
		contentPane.add(lblMenMcfish);

		JLabel lblMenDobleQueso = new JLabel("Penne All'Arrabbiata Di Pepperoni:");
		lblMenDobleQueso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenDobleQueso.setBounds(309, 566, 211, 25);
		contentPane.add(lblMenDobleQueso);

		JLabel lblMenMcwrap = new JLabel("Cacio e Pepe:");
		lblMenMcwrap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcwrap.setBounds(604, 566, 88, 25);
		contentPane.add(lblMenMcwrap);
		
		JLabel precio_prosciutto = new JLabel("9");
		precio_prosciutto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_prosciutto.setBounds(195, 209, 14, 14);
		contentPane.add(precio_prosciutto);
		
		JLabel precio_Margherita = new JLabel("8");
		precio_Margherita.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_Margherita.setBounds(664, 209, 14, 14);
		contentPane.add(precio_Margherita);
		
		JLabel precio_pollo = new JLabel("8");
		precio_pollo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_pollo.setBounds(472, 209, 14, 14);
		contentPane.add(precio_pollo);
		
		JLabel precio_peperoni = new JLabel("7");
		precio_peperoni.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_peperoni.setBounds(455, 397, 14, 14);
		contentPane.add(precio_peperoni);
		
		JLabel precio_tagliatelle = new JLabel("12");
		precio_tagliatelle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_tagliatelle.setBounds(742, 397, 26, 14);
		contentPane.add(precio_tagliatelle);
		
		JLabel precio_cacio = new JLabel("8");
		precio_cacio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_cacio.setBounds(693, 571, 14, 14);
		contentPane.add(precio_cacio);
		
		JLabel precio_penne = new JLabel("7");
		precio_penne.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_penne.setBounds(518, 571, 14, 14);
		contentPane.add(precio_penne);
		
		JLabel precio_spaghetti = new JLabel("7");
		precio_spaghetti.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_spaghetti.setBounds(273, 571, 14, 14);
		contentPane.add(precio_spaghetti);
		
		JLabel precio_piemontese = new JLabel("11");
		precio_piemontese.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_piemontese.setBounds(230, 397, 26, 14);
		contentPane.add(precio_piemontese);
	}
}

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

public class MenuBurgerKing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { MenuBurgerKing frame = new
	 * MenuBurgerKing(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the frame.
	 */
	public MenuBurgerKing() {
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

		JButton bigKing = new JButton("New button");
		bigKing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
		});
		bigKing.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\burger\\bigking.png"));
		bigKing.setForeground(Color.WHITE);
		bigKing.setBackground(Color.WHITE);
		bigKing.setBounds(106, 52, 150, 150);
		contentPane.add(bigKing);

		JButton cheeseburger = new JButton("New button");
		cheeseburger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cheeseburger.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\burger\\cheeseburger.png"));
		cheeseburger.setForeground(Color.WHITE);
		cheeseburger.setBackground(Color.WHITE);
		cheeseburger.setBounds(336, 52, 150, 150);
		contentPane.add(cheeseburger);

		JButton whopper = new JButton("New button");
		whopper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		whopper.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\burger\\whopper.png"));
		whopper.setForeground(Color.WHITE);
		whopper.setBackground(Color.WHITE);
		whopper.setBounds(569, 52, 150, 150);
		contentPane.add(whopper);

		JButton steakhouse = new JButton("New button");
		steakhouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		steakhouse.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\burger\\steakhouse.png"));
		steakhouse.setForeground(Color.WHITE);
		steakhouse.setBackground(Color.WHITE);
		steakhouse.setBounds(106, 244, 150, 150);
		contentPane.add(steakhouse);

		JButton kingHuevo = new JButton("New button");
		kingHuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		kingHuevo.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\burger\\thekinghuevo.png"));
		kingHuevo.setForeground(Color.WHITE);
		kingHuevo.setBackground(Color.WHITE);
		kingHuevo.setBounds(336, 244, 150, 150);
		contentPane.add(kingHuevo);

		JButton kingJr = new JButton("New button");
		kingJr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		kingJr.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\burger\\kingjr.jpg"));
		kingJr.setForeground(Color.WHITE);
		kingJr.setBackground(Color.WHITE);
		kingJr.setBounds(569, 244, 150, 150);
		contentPane.add(kingJr);

		JButton KingBacon = new JButton("New button");
		KingBacon.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\burger\\1564392248145_M_The_King_Bacon_2C-1-1.png"));
		KingBacon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		KingBacon.setForeground(Color.WHITE);
		KingBacon.setBackground(Color.WHITE);
		KingBacon.setBounds(106, 418, 150, 150);
		contentPane.add(KingBacon);

		JButton crispyChicken = new JButton("New button");
		crispyChicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		crispyChicken.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\burger\\1564391634329_M_Crispy_Chicken.png"));
		crispyChicken.setForeground(Color.WHITE);
		crispyChicken.setBackground(Color.WHITE);
		crispyChicken.setBounds(336, 418, 150, 150);
		contentPane.add(crispyChicken);

		JButton longChicken = new JButton("New button");
		longChicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		longChicken.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\burger\\1564391124618_M_Long_Chicken.png"));
		longChicken.setForeground(Color.WHITE);
		longChicken.setBackground(Color.WHITE);
		longChicken.setBounds(569, 418, 150, 150);
		contentPane.add(longChicken);

		JLabel lblNewLabel = new JLabel("Men\u00FA Big King");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(133, 200, 116, 33);
		contentPane.add(lblNewLabel);

		JLabel lblMenCuartoDe = new JLabel("Men\u00FA Cheesburger");
		lblMenCuartoDe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenCuartoDe.setBounds(346, 202, 140, 31);
		contentPane.add(lblMenCuartoDe);

		JLabel lblMenMcPollo = new JLabel("Men\u00FA Whopper");
		lblMenMcPollo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcPollo.setBounds(591, 201, 110, 31);
		contentPane.add(lblMenMcPollo);

		JLabel lblMenAmericanStyle = new JLabel("Men\u00FA Steakhouse");
		lblMenAmericanStyle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenAmericanStyle.setBounds(116, 393, 140, 22);
		contentPane.add(lblMenAmericanStyle);

		JLabel lblMenHappyMeal = new JLabel("Men\u00FA The King Huevo");
		lblMenHappyMeal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenHappyMeal.setBounds(346, 393, 140, 22);
		contentPane.add(lblMenHappyMeal);

		JLabel lblMenGrandMcextreme = new JLabel("Men\u00FA King Jr");
		lblMenGrandMcextreme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenGrandMcextreme.setBounds(591, 393, 110, 22);
		contentPane.add(lblMenGrandMcextreme);

		JLabel lblMenMcfish = new JLabel("Men\u00FA The King Bacon");
		lblMenMcfish.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcfish.setBounds(116, 566, 150, 25);
		contentPane.add(lblMenMcfish);

		JLabel lblMenDobleQueso = new JLabel("Men\u00FA Crispy Chicken");
		lblMenDobleQueso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenDobleQueso.setBounds(346, 566, 140, 25);
		contentPane.add(lblMenDobleQueso);

		JLabel lblMenMcwrap = new JLabel("Men\u00FA Long Chicken");
		lblMenMcwrap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcwrap.setBounds(591, 566, 128, 25);
		contentPane.add(lblMenMcwrap);

	}

}

package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Toolkit;

public class PantallaRestaurantes extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public PantallaRestaurantes(int id, String localidad, String direccion) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\logofinal.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setResizable(false);

		JButton ginos = new JButton("New button");
		ginos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int id_user = id;
				String localidad_user = localidad;
				String direccion_user = direccion;
				String empresa = "Ginos";

				MenuGinos frame = new MenuGinos(id_user, localidad_user, direccion_user, empresa);
				dispose();
				frame.setVisible(true);
			}
		});
		ginos.setBackground(new Color(204, 204, 204));
		ginos.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\ginos.png"));
		ginos.setBounds(360, 245, 150, 150);
		contentPane.add(ginos);

		JButton kfc = new JButton("New button");
		kfc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int id_user = id;
				String localidad_user = localidad;
				String direccion_user = direccion;
				String empresa = "KFC";
				
				MenuKFC frame = new MenuKFC(id_user, localidad_user, direccion_user, empresa);
				dispose();
				frame.setVisible(true);
			}
		});
		kfc.setBackground(Color.WHITE);
		kfc.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\kfc.jpg"));
		kfc.setBounds(592, 245, 150, 150);
		contentPane.add(kfc);

		JButton pans = new JButton("New button");
		pans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int id_user = id;
				String localidad_user = localidad;
				String direccion_user = direccion;
				String empresa = "Pans";
				
				MenuPans frame = new MenuPans(id_user, localidad_user, direccion_user, empresa);
				dispose();
				frame.setVisible(true);
			}
		});
		pans.setBackground(Color.WHITE);
		pans.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\pans.png"));
		pans.setBounds(136, 419, 150, 150);
		contentPane.add(pans);

		JButton xequebo = new JButton("New button");
		xequebo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int id_user = id;
				String localidad_user = localidad;
				String direccion_user = direccion;
				String empresa = "XeQueBo";
				
				MenuXeQueBo frame = new MenuXeQueBo(id_user, localidad_user, direccion_user, empresa);
				dispose();
				frame.setVisible(true);
			}
		});
		xequebo.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\xequebo.png"));
		xequebo.setBounds(360, 419, 150, 150);
		contentPane.add(xequebo);

		JButton kebab = new JButton("New button");
		kebab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int id_user = id;
				String localidad_user = localidad;
				String direccion_user = direccion;
				String empresa = "KFC";
				
				MenuKebab frame = new MenuKebab(id_user, localidad_user, direccion_user, empresa);
				dispose();
				frame.setVisible(true);
			}
		});
		kebab.setBackground(Color.RED);
		kebab.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\kebab.jpg"));
		kebab.setBounds(592, 419, 150, 150);
		contentPane.add(kebab);

		JLabel lblNewLabel = new JLabel("ELIGE TU RESTAURANTE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(270, 11, 388, 61);
		contentPane.add(lblNewLabel);

		JButton burgerking = new JButton("New button");
		burgerking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int id_user = id;
				String localidad_user = localidad;
				String direccion_user = direccion;
				String empresa = "BurgerKing";

				MenuBurgerKing frame = new MenuBurgerKing(id_user, localidad_user, direccion_user, empresa);
				dispose();
				frame.setVisible(true);
			}
		});
		burgerking.setBackground(Color.WHITE);
		burgerking.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\burger.png"));
		burgerking.setBounds(360, 68, 150, 150);
		contentPane.add(burgerking);

		JButton mcdonalds = new JButton("New button");
		mcdonalds.setForeground(new Color(255, 255, 255));
		mcdonalds.setBackground(Color.WHITE);
		mcdonalds.setIcon(
				new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\mc.png"));
		mcdonalds.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int id_user = id;
				String localidad_user = localidad;
				String direccion_user = direccion;
				String empresa = "McDonalds";
				
				MenuMcDonalds frame = new MenuMcDonalds(id_user, localidad_user, direccion_user, empresa);
				dispose();
				frame.setVisible(true);
			}
		});
		mcdonalds.setBounds(136, 68, 150, 150);
		contentPane.add(mcdonalds);

		JButton telepizza = new JButton("New button");
		telepizza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int id_user = id;
				String localidad_user = localidad;
				String direccion_user = direccion;
				String empresa = "Telepizza";
				
				MenuTelepizza frame = new MenuTelepizza(id_user, localidad_user, direccion_user, empresa);
				dispose();
				frame.setVisible(true);
			}
		});
		telepizza.setBackground(new Color(204, 0, 0));
		telepizza.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\telepizza.png"));
		telepizza.setBounds(592, 68, 150, 150);
		contentPane.add(telepizza);

		JButton fosters = new JButton("New button");
		fosters.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				
				int id_user = id;
				String localidad_user = localidad;
				String direccion_user = direccion;
				String empresa = "Fosters";
				
				MenuFosters frame = new MenuFosters(id_user, localidad_user, direccion_user, empresa   );
				dispose();
				frame.setVisible(true);
			}
		});
		fosters.setBackground(Color.WHITE);
		fosters.setIcon(new ImageIcon(
				"C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fosters.jpg"));
		fosters.setBounds(136, 245, 150, 150);
		contentPane.add(fosters);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\unnamed8.jpg"));
		lblNewLabel_1.setBounds(-131, -206, 1065, 928);
		contentPane.add(lblNewLabel_1);
	}
}

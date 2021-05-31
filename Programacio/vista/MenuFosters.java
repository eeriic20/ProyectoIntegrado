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

public class MenuFosters extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public MenuFosters() {
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

		JButton combo = new JButton("New button");
		combo.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fosters\\hollywood-combo.png"));
		combo.setForeground(Color.WHITE);
		combo.setBackground(Color.WHITE);
		combo.setBounds(106, 52, 150, 150);
		contentPane.add(combo);

		JButton newyorker = new JButton("New button");
		newyorker.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fosters\\new_yorker_1000x495_0.png"));
		newyorker.setForeground(Color.WHITE);
		newyorker.setBackground(Color.WHITE);
		newyorker.setBounds(336, 52, 150, 150);
		contentPane.add(newyorker);

		JButton national = new JButton("New button");
		national.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fosters\\national-ribs-de-cerdo.png"));
		national.setForeground(Color.WHITE);
		national.setBackground(Color.WHITE);
		national.setBounds(569, 52, 150, 150);
		contentPane.add(national);

		JButton tribella = new JButton("New button");
		tribella.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fosters\\fosters_burgers_2_tribeca.png"));
		tribella.setForeground(Color.WHITE);
		tribella.setBackground(Color.WHITE);
		tribella.setBounds(106, 244, 150, 150);
		contentPane.add(tribella);

		JButton guacamole = new JButton("New button");
		guacamole.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fosters\\guacamole-hecho-en-tu-mesa.png"));
		guacamole.setForeground(Color.WHITE);
		guacamole.setBackground(Color.WHITE);
		guacamole.setBounds(336, 244, 150, 150);
		contentPane.add(guacamole);

		JButton bone = new JButton("New button");
		bone.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fosters\\beef-bone.png"));
		bone.setForeground(Color.WHITE);
		bone.setBackground(Color.WHITE);
		bone.setBounds(569, 244, 150, 150);
		contentPane.add(bone);

		JButton costillas = new JButton("New button");
		costillas.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fosters\\costillas-ibericas-black-label.png"));
		costillas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		costillas.setForeground(Color.WHITE);
		costillas.setBackground(Color.WHITE);
		costillas.setBounds(106, 418, 150, 150);
		contentPane.add(costillas);

		JButton raclette = new JButton("New button");
		raclette.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fosters\\xracllette-fh.pngqitoknyfqozeb.pagespeed.ic_.8pekl6yknf.png"));
		raclette.setForeground(Color.WHITE);
		raclette.setBackground(Color.WHITE);
		raclette.setBounds(336, 418, 150, 150);
		contentPane.add(raclette);

		JButton cheese = new JButton((String) null);
		cheese.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Eclipse\\ProyectoInt\\Delivery\\src\\vista\\Imagenes\\fosters\\cheese-burger_optimizado.png"));
		cheese.setForeground(Color.WHITE);
		cheese.setBackground(Color.WHITE);
		cheese.setBounds(569, 418, 150, 150);
		contentPane.add(cheese);

		JLabel lblNewLabel = new JLabel("Hollywood Combo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(132, 200, 150, 33);
		contentPane.add(lblNewLabel);

		JLabel newu = new JLabel("The NewYorker 325 GRS");
		newu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		newu.setBounds(336, 202, 178, 31);
		contentPane.add(newu);

		JLabel lblMenMcPollo = new JLabel("National Star Ribs");
		lblMenMcPollo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcPollo.setBounds(593, 201, 126, 31);
		contentPane.add(lblMenMcPollo);

		JLabel lblMenAmericanStyle = new JLabel("Tribeca Buger");
		lblMenAmericanStyle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenAmericanStyle.setBounds(136, 393, 120, 22);
		contentPane.add(lblMenAmericanStyle);

		JLabel lblMenHappyMeal = new JLabel("Guacamole");
		lblMenHappyMeal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenHappyMeal.setBounds(383, 393, 98, 22);
		contentPane.add(lblMenHappyMeal);

		JLabel lblMenGrandMcextreme = new JLabel("Beff Bone");
		lblMenGrandMcextreme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenGrandMcextreme.setBounds(609, 393, 110, 22);
		contentPane.add(lblMenGrandMcextreme);

		JLabel lblMenMcfish = new JLabel("Costillas Ib\u00E9ricas Black Label");
		lblMenMcfish.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcfish.setBounds(94, 566, 188, 25);
		contentPane.add(lblMenMcfish);

		JLabel lblMenDobleQueso = new JLabel("Raclette Burger");
		lblMenDobleQueso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenDobleQueso.setBounds(360, 566, 140, 25);
		contentPane.add(lblMenDobleQueso);

		JLabel lblMenMcwrap = new JLabel("Cheese Burger");
		lblMenMcwrap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenMcwrap.setBounds(593, 566, 104, 25);
		contentPane.add(lblMenMcwrap);
	}

}

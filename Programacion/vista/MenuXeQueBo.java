package vista;

/**
 * <h1>Menu Xe que bo-Proyecto Integrado.</h1>
 * 
 * @author David, Alex y Eric.
 * 
 * @since 25/05/2021
 *
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import conexion.Conexion;
import controlador.Numero;
import controlador.Pedido;

public class MenuXeQueBo extends JFrame {

	private JPanel contentPane;
	private String nombre;
	private int precio;
	private int id_localidad;
	private String estado;
	private String empresa;
	private String direccion;
	private int idCliente;
	private Date fecha;
	private int precioTotal;
	private String menuTotal = "";

	/**
	 * 
	 * El constructor del menuXeQueBo
	 * 
	 * @param nombreuser es el nombre del usuario
	 * @param id         es el id del usuario
	 * @param localidad  la localidad donde vive el usuario
	 * @param direccionD la direccion del usuario
	 * @param empresaE   la empresa la cual vende los menus
	 */

	public MenuXeQueBo(String nombreuser, int id, String localidad, String direccionD, String empresaE) {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(MenuXeQueBo.class.getResource("/vista/Imagenes/logofinal.png")));
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

		JLabel precio_chivito = new JLabel("5");
		precio_chivito.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_chivito.setBounds(214, 209, 8, 14);
		contentPane.add(precio_chivito);

		/**
		 * Los siguientes botones son los de seleccion de pedido
		 */

		JButton chivito = new JButton("New button");
		chivito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nMenus = 0;
				String seleccion = JOptionPane.showInputDialog(null, "Selecciona una cantidad");

				while (!Numero.esNumero(seleccion)) {

					seleccion = JOptionPane.showInputDialog(null, "Por favor introduce un número valido");
				}

				if (Numero.esNumero(seleccion)) {

					nMenus = Integer.parseInt(seleccion);

				}

				precio = Integer.parseInt(precio_chivito.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion + " Chivito";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		chivito.setIcon(new ImageIcon(MenuXeQueBo.class.getResource("/vista/Imagenes/xequebo/xivito.jpg")));
		chivito.setForeground(Color.WHITE);
		chivito.setBackground(Color.WHITE);
		chivito.setBounds(106, 52, 150, 150);
		contentPane.add(chivito);

		JLabel precio_lomoqueso = new JLabel("5");
		precio_lomoqueso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_lomoqueso.setBounds(467, 211, 8, 14);
		contentPane.add(precio_lomoqueso);

		JButton breton = new JButton("New button");
		breton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nMenus = 0;
				String seleccion = JOptionPane.showInputDialog(null, "Selecciona una cantidad");

				while (!Numero.esNumero(seleccion)) {

					seleccion = JOptionPane.showInputDialog(null, "Por favor introduce un número valido");
				}

				if (Numero.esNumero(seleccion)) {

					nMenus = Integer.parseInt(seleccion);

				}

				precio = Integer.parseInt(precio_lomoqueso.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion + " Breton";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		breton.setIcon(new ImageIcon(MenuXeQueBo.class.getResource("/vista/Imagenes/xequebo/lomo-con-queso.jpg")));
		breton.setForeground(Color.WHITE);
		breton.setBackground(Color.WHITE);
		breton.setBounds(336, 52, 150, 150);
		contentPane.add(breton);

		JLabel precio_brascada = new JLabel("5");
		precio_brascada.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_brascada.setBounds(673, 211, 8, 14);
		contentPane.add(precio_brascada);

		JButton brascada = new JButton("New button");
		brascada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nMenus = 0;
				String seleccion = JOptionPane.showInputDialog(null, "Selecciona una cantidad");

				while (!Numero.esNumero(seleccion)) {

					seleccion = JOptionPane.showInputDialog(null, "Por favor introduce un número valido");
				}

				if (Numero.esNumero(seleccion)) {

					nMenus = Integer.parseInt(seleccion);

				}

				precio = Integer.parseInt(precio_brascada.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion + " Brascada";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		brascada.setIcon(new ImageIcon(MenuXeQueBo.class
				.getResource("/vista/Imagenes/xequebo/Brascada-o-Bocadillo-de-ternera-Receta-tipica-de-Valencia.jpg")));
		brascada.setForeground(Color.WHITE);
		brascada.setBackground(Color.WHITE);
		brascada.setBounds(569, 52, 150, 150);
		contentPane.add(brascada);

		JLabel precio_carnecaballo = new JLabel("6");
		precio_carnecaballo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_carnecaballo.setBounds(234, 399, 8, 14);
		contentPane.add(precio_carnecaballo);

		JButton caballo = new JButton("New button");
		caballo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nMenus = 0;
				String seleccion = JOptionPane.showInputDialog(null, "Selecciona una cantidad");

				while (!Numero.esNumero(seleccion)) {

					seleccion = JOptionPane.showInputDialog(null, "Por favor introduce un número valido");
				}
				if (Numero.esNumero(seleccion)) {

					nMenus = Integer.parseInt(seleccion);

				}

				precio = Integer.parseInt(precio_carnecaballo.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion + " Carne de Caballo";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		caballo.setIcon(new ImageIcon(
				MenuXeQueBo.class.getResource("/vista/Imagenes/xequebo/CARNE-DE-CABALLO-e1572524562624.png")));
		caballo.setForeground(Color.WHITE);
		caballo.setBackground(Color.WHITE);
		caballo.setBounds(106, 244, 150, 150);
		contentPane.add(caballo);

		JLabel precio_calamares = new JLabel("4");
		precio_calamares.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_calamares.setBounds(443, 399, 8, 14);
		contentPane.add(precio_calamares);

		JButton calamares = new JButton("New button");
		calamares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nMenus = 0;
				String seleccion = JOptionPane.showInputDialog(null, "Selecciona una cantidad");

				while (!Numero.esNumero(seleccion)) {

					seleccion = JOptionPane.showInputDialog(null, "Por favor introduce un número valido");
				}

				if (Numero.esNumero(seleccion)) {

					nMenus = Integer.parseInt(seleccion);

				}

				precio = Integer.parseInt(precio_calamares.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion + " Calamares";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		calamares.setIcon(
				new ImageIcon(MenuXeQueBo.class.getResource("/vista/Imagenes/xequebo/bocadillo-calamares.jpg")));
		calamares.setForeground(Color.WHITE);
		calamares.setBackground(Color.WHITE);
		calamares.setBounds(336, 244, 150, 150);
		contentPane.add(calamares);

		JLabel precio_sepia = new JLabel("5");
		precio_sepia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_sepia.setBounds(655, 399, 8, 14);
		contentPane.add(precio_sepia);

		JButton sepia = new JButton("New button");
		sepia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nMenus = 0;
				String seleccion = JOptionPane.showInputDialog(null, "Selecciona una cantidad");

				while (!Numero.esNumero(seleccion)) {

					seleccion = JOptionPane.showInputDialog(null, "Por favor introduce un número valido");
				}

				if (Numero.esNumero(seleccion)) {

					nMenus = Integer.parseInt(seleccion);

				}

				precio = Integer.parseInt(precio_sepia.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion + " Sepia";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		sepia.setIcon(new ImageIcon(
				MenuXeQueBo.class.getResource("/vista/Imagenes/xequebo/SEPIA-e1572524731254-1024x422.png")));
		sepia.setForeground(Color.WHITE);
		sepia.setBackground(Color.WHITE);
		sepia.setBounds(569, 244, 150, 150);
		contentPane.add(sepia);

		JLabel precio_tortilla = new JLabel("4");
		precio_tortilla.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_tortilla.setBounds(214, 573, 8, 14);
		contentPane.add(precio_tortilla);

		JButton crujiente = new JButton("New button");
		crujiente.setIcon(
				new ImageIcon(MenuXeQueBo.class.getResource("/vista/Imagenes/xequebo/bocadillo-tortilla-variada.jpg")));
		crujiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int nMenus = 0;
				String seleccion = JOptionPane.showInputDialog(null, "Selecciona una cantidad");

				while (!Numero.esNumero(seleccion)) {

					seleccion = JOptionPane.showInputDialog(null, "Por favor introduce un número valido");

				}
				if (Numero.esNumero(seleccion)) {

					nMenus = Integer.parseInt(seleccion);

				}

				precio = Integer.parseInt(precio_tortilla.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion + " Tortilla de Patatas";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		crujiente.setForeground(Color.WHITE);
		crujiente.setBackground(Color.WHITE);
		crujiente.setBounds(106, 418, 150, 150);
		contentPane.add(crujiente);

		JLabel precio_jamon = new JLabel("3");
		precio_jamon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_jamon.setBounds(443, 573, 8, 14);
		contentPane.add(precio_jamon);

		JButton jamon = new JButton("New button");
		jamon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nMenus = 0;
				String seleccion = JOptionPane.showInputDialog(null, "Selecciona una cantidad");

				while (!Numero.esNumero(seleccion)) {

					seleccion = JOptionPane.showInputDialog(null, "Por favor introduce un número valido");
				}

				if (Numero.esNumero(seleccion)) {

					nMenus = Integer.parseInt(seleccion);

				}

				precio = Integer.parseInt(precio_jamon.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion + " Bocadillo de Jamon";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}

		});
		jamon.setIcon(new ImageIcon(MenuXeQueBo.class.getResource("/vista/Imagenes/xequebo/jamwich.jpg")));
		jamon.setForeground(Color.WHITE);
		jamon.setBackground(Color.WHITE);
		jamon.setBounds(336, 418, 150, 150);
		contentPane.add(jamon);

		JLabel precio_boquerones = new JLabel("5");
		precio_boquerones.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precio_boquerones.setBounds(689, 573, 8, 14);
		contentPane.add(precio_boquerones);

		JButton boquerones = new JButton((String) null);
		boquerones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nMenus = 0;
				String seleccion = JOptionPane.showInputDialog(null, "Selecciona una cantidad");

				while (!Numero.esNumero(seleccion)) {

					seleccion = JOptionPane.showInputDialog(null, "Por favor introduce un número valido");
				}

				if (Numero.esNumero(seleccion)) {

					nMenus = Integer.parseInt(seleccion);

				}

				precio = Integer.parseInt(precio_boquerones.getText());
				precioTotal = precioTotal + (precio * nMenus);
				nombre = seleccion + " Boquerones";
				menuTotal = nombre + ", " + menuTotal;

				JOptionPane.showMessageDialog(contentPane, "Se ha agregado a su pedido", "Agregado a su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		boquerones.setIcon(new ImageIcon(MenuXeQueBo.class.getResource("/vista/Imagenes/xequebo/boquerones-1.jpg")));
		boquerones.setForeground(Color.WHITE);
		boquerones.setBackground(Color.WHITE);
		boquerones.setBounds(569, 418, 150, 150);
		contentPane.add(boquerones);

		JLabel lblNewLabel = new JLabel("Chivito");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(149, 200, 46, 33);
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

		JLabel label_1 = new JLabel("\u20AC");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(221, 209, 46, 14);
		contentPane.add(label_1);

		JLabel label_1_1 = new JLabel("\u20AC");
		label_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_1.setBounds(475, 211, 46, 14);
		contentPane.add(label_1_1);

		JLabel label_1_2 = new JLabel("\u20AC");
		label_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_2.setBounds(683, 213, 46, 14);
		contentPane.add(label_1_2);

		JLabel label_1_3 = new JLabel("\u20AC");
		label_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_3.setBounds(247, 399, 46, 14);
		contentPane.add(label_1_3);

		JLabel label_1_4 = new JLabel("\u20AC");
		label_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_4.setBounds(454, 399, 46, 14);
		contentPane.add(label_1_4);

		JLabel label_1_5 = new JLabel("\u20AC");
		label_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_5.setBounds(662, 399, 46, 14);
		contentPane.add(label_1_5);

		JLabel label_1_6 = new JLabel("\u20AC");
		label_1_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_6.setBounds(221, 573, 46, 14);
		contentPane.add(label_1_6);

		JLabel label_1_7 = new JLabel("\u20AC");
		label_1_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_7.setBounds(454, 573, 46, 14);
		contentPane.add(label_1_7);

		JLabel label_1_8 = new JLabel("\u20AC");
		label_1_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1_8.setBounds(699, 573, 46, 14);
		contentPane.add(label_1_8);

		/**
		 * Este boton te regresa a la pantalla de seleccion de restaurantes
		 */

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PantallaRestaurantes pR = new PantallaRestaurantes(nombreuser, id, localidad, direccionD);
				dispose();
				pR.setVisible(true);

			}
		});
		btnNewButton.setIcon(new ImageIcon(MenuXeQueBo.class.getResource("/vista/Imagenes/flecha.png")));
		btnNewButton.setBounds(-1, -1, 60, 60);
		contentPane.add(btnNewButton);

		/**
		 * Este boton te permite terminar el pedido y subirlo a la DB
		 */

		JButton btnNewButton_1 = new JButton("Terminar pedido");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Conexion c = new Conexion();

				empresa = empresaE;
				direccion = direccionD;
				estado = "En proceso";
				idCliente = id;

				fecha = new Date(Calendar.getInstance().getTimeInMillis());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String fechaTexto = formatter.format(fecha);

				try {

					Statement s = c.getConexion().createStatement();
					String sql = "select Codigo from localidad where Nombre = '" + localidad + "'";
					ResultSet rs = s.executeQuery(sql);

					if (rs.next()) {

						id_localidad = Integer.parseInt(rs.getString("Codigo"));

					}

				} catch (SQLException e1) {

					e1.printStackTrace();

				}

				Pedido p = new Pedido();

				p.terminarPedido(menuTotal, fechaTexto, precioTotal, estado, empresa, direccion, id_localidad,
						idCliente, contentPane);

			}

		});
		btnNewButton_1.setBounds(730, 480, 139, 110);
		contentPane.add(btnNewButton_1);

		/**
		 * Este boton te permite ver lo que llevas de pedido
		 */

		JButton btnNewButton_1_1 = new JButton("Ver pedido");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(contentPane,
						"Su pedido: '" + menuTotal + "' con un coste total de " + precioTotal + "€", "Su pedido",
						JOptionPane.WARNING_MESSAGE);

			}
		});
		btnNewButton_1_1.setBounds(731, 359, 138, 110);
		contentPane.add(btnNewButton_1_1);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(
				MenuXeQueBo.class.getResource("/vista/Imagenes/Virtual-Backgrounds_Confetti-On-Gold.jpg")));
		lblNewLabel_1.setBounds(-156, -32, 1147, 666);
		contentPane.add(lblNewLabel_1);

	}
}

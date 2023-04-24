package TiendAbarrotes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmPantalla {

	private JFrame frame;
	private JTextField txtID_Producto;
	private JTextField txtNombre_Producto;
	private JTextField txtMarca_Producto;
	private JTextField txtTipo_Producto;
	private JTextField txtPrecio_Producto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPantalla window = new frmPantalla();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frmPantalla() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblID_Producto = new JLabel("ID_Producto");
		lblID_Producto.setBounds(34, 26, 92, 14);
		frame.getContentPane().add(lblID_Producto);
		
		JLabel lblNombre_Producto = new JLabel("Nombre_Producto");
		lblNombre_Producto.setBounds(34, 77, 92, 14);
		frame.getContentPane().add(lblNombre_Producto);
		
		JLabel lblMarca_Producto = new JLabel("Marca_Producto");
		lblMarca_Producto.setBounds(34, 125, 92, 14);
		frame.getContentPane().add(lblMarca_Producto);
		
		JLabel lblTipo_Producto = new JLabel("Tipo_Producto");
		lblTipo_Producto.setBounds(34, 170, 92, 14);
		frame.getContentPane().add(lblTipo_Producto);
		
		JLabel lblPrecio_Producto = new JLabel("Precio_Producto");
		lblPrecio_Producto.setBounds(34, 214, 78, 14);
		frame.getContentPane().add(lblPrecio_Producto);
		
		txtID_Producto = new JTextField();
		txtID_Producto.setBounds(178, 23, 86, 20);
		frame.getContentPane().add(txtID_Producto);
		txtID_Producto.setColumns(10);
		
		txtNombre_Producto = new JTextField();
		txtNombre_Producto.setBounds(178, 74, 86, 20);
		frame.getContentPane().add(txtNombre_Producto);
		txtNombre_Producto.setColumns(10);
		
		txtMarca_Producto = new JTextField();
		txtMarca_Producto.setBounds(178, 122, 86, 20);
		frame.getContentPane().add(txtMarca_Producto);
		txtMarca_Producto.setColumns(10);
		
		txtTipo_Producto = new JTextField();
		txtTipo_Producto.setBounds(178, 167, 86, 20);
		frame.getContentPane().add(txtTipo_Producto);
		txtTipo_Producto.setColumns(10);
		
		txtPrecio_Producto = new JTextField();
		txtPrecio_Producto.setBounds(178, 211, 86, 20);
		frame.getContentPane().add(txtPrecio_Producto);
		txtPrecio_Producto.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(312, 22, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(312, 73, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(312, 136, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(312, 195, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
	}
}

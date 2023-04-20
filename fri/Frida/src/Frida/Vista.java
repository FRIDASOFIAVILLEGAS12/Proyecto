package Frida;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista {

	private JFrame frmCliente;
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista window = new Vista();
					window.frmCliente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Vista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCliente = new JFrame();
		frmCliente.setFont(new Font("Aparajita", Font.PLAIN, 39));
		frmCliente.setTitle("Cliente");
		frmCliente.setBounds(100, 100, 410, 300);
		frmCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCliente.getContentPane().setLayout(null);
		frmCliente.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 10);
		frmCliente.getContentPane().add(panel);
		
		JLabel lblIb = new JLabel("Id");
		lblIb.setBounds(38, 35, 46, 14);
		frmCliente.getContentPane().add(lblIb);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(24, 92, 46, 14);
		frmCliente.getContentPane().add(lblNombre);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(24, 143, 46, 14);
		frmCliente.getContentPane().add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(188, 35, 46, 14);
		frmCliente.getContentPane().add(lblTelefono);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(200, 92, 46, 14);
		frmCliente.getContentPane().add(lblEmail);
		
		txtId = new JTextField();
		txtId.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtId.getText().length()>=3) {
					e.consume();
				}
				
			}
		});
		txtId.setBounds(71, 32, 46, 20);
		frmCliente.getContentPane().add(txtId);
		txtId.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtNombre.getText().length()>=50) {
					e.consume();
				}
			}
		});
		txtNombre.setBounds(71, 89, 119, 20);
		frmCliente.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtDireccion.getText().length()>=100) {
					e.consume();
				}	
				
			}
		});
		txtDireccion.setBounds(71, 140, 119, 20);
		frmCliente.getContentPane().add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtTelefono.getText().length()>=10) {
					e.consume();
				}	
			}
		});
		txtTelefono.setBounds(244, 32, 138, 20);
		frmCliente.getContentPane().add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtEmail.getText().length()>=40) {
					e.consume();
				}
			}
		});
		txtEmail.setBounds(244, 89, 138, 20);
		frmCliente.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Fri np=new Fri ();
					np.setId(txtId.getText());
					np.setNombre(txtNombre.getText());
					np.setDireccion(txtDireccion.getText());
					np.setTelefono(txtTelefono.getText());
					np.setEmail(txtEmail.getText());
					limpiar();
					if(np.Insertar()) {
						JOptionPane.showMessageDialog(null, "Cliente insertado");
					}else {
						JOptionPane.showMessageDialog(null, "ERROR");
					}
				}catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
				}
				
			
			
			}
		});
		btnInsertar.setBounds(10, 188, 89, 23);
		frmCliente.getContentPane().add(btnInsertar);
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String Id = JOptionPane.showInputDialog("introduce el ID al cargar");
					Fri np = new Fri();
					np.setId(Id);
					if(np.Cargar()) {
						txtId.setText(np.getId());
						txtNombre.setText(np.getNombre());
						txtDireccion.setText(np.getDireccion());
						txtTelefono.setText(np.getTelefono());
						txtEmail.setText(np.getEmail());
						
						
						JOptionPane.showMessageDialog(null, "Provedor encontrado");
					}else {
						JOptionPane.showMessageDialog(null, "ERROR");
					}
				}catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
				}
			}
		});
		btnCargar.setBounds(123, 188, 89, 23);
		frmCliente.getContentPane().add(btnCargar);
		
		JButton btbnBorrar = new JButton("Borrar");
		btbnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
			}
		});
		btbnBorrar.setBounds(230, 188, 89, 23);
		frmCliente.getContentPane().add(btbnBorrar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String Id = JOptionPane.showInputDialog("introduce el ID al Eliminar");
					Fri np = new Fri();
					np.setId(Id);
					if(np.Eliminar()) {
						JOptionPane.showMessageDialog(null, "Provedor Borrado");
					}else {
						JOptionPane.showMessageDialog(null, "ERROR");
					}
				}catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
				}
			
			}
		});
		btnEliminar.setBounds(71, 222, 89, 23);
		frmCliente.getContentPane().add(btnEliminar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Fri np=new Fri ();
					np.setId(txtId.getText());
					np.setNombre(txtNombre.getText());
					np.setDireccion(txtDireccion.getText());
					np.setTelefono(txtTelefono.getText());
					np.setEmail(txtEmail.getText());
					
					if(np.Actualizar()) {
						limpiar();
						JOptionPane.showMessageDialog(null, "Cliente Actualizado");
					}else {
						JOptionPane.showMessageDialog(null, "ERROR");
					}
				}catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
				}
			}
		});
		btnActualizar.setBounds(215, 222, 89, 23);
		frmCliente.getContentPane().add(btnActualizar);
	}
	public void limpiar () {
		txtId.setText("");
		txtNombre.setText("");
		txtDireccion.setText("");
		txtTelefono.setText("");
		txtEmail.setText("");
	}
}

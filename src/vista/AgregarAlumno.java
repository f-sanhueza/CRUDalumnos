package vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.SpringLayout;

import org.w3c.dom.events.EventTarget;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.Event;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AgregarAlumno extends JInternalFrame {
	private JTextField txtApellidoMaterno;
	private JTextField txtRut;
	private JTextField txtNombre;
	private JTextField txtApellidoPaterno;
	private JTextField txtApellidoMaterno_1;
	private JTextField txtNCelular;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarAlumno frame = new AgregarAlumno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public AgregarAlumno() {
		setTitle("Agregar Alumno");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 294);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblRut = new JLabel("Rut:");
		springLayout.putConstraint(SpringLayout.NORTH, lblRut, 24, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblRut, 117, SpringLayout.WEST, getContentPane());
		lblRut.setAlignmentX(3.0f);
		lblRut.setFont(new Font("Tahoma", Font.PLAIN, 15));
		getContentPane().add(lblRut);
		
		JLabel lblNombre = new JLabel("Nombre:");
		springLayout.putConstraint(SpringLayout.WEST, lblNombre, 87, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNombre, -290, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblRut, 0, SpringLayout.EAST, lblNombre);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		getContentPane().add(lblNombre);
		
		JLabel lblApellidoPaterno = new JLabel("Apellido Paterno:");
		springLayout.putConstraint(SpringLayout.WEST, lblApellidoPaterno, 37, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblApellidoPaterno, -290, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNombre, -6, SpringLayout.NORTH, lblApellidoPaterno);
		springLayout.putConstraint(SpringLayout.NORTH, lblApellidoPaterno, 74, SpringLayout.NORTH, getContentPane());
		lblApellidoPaterno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		getContentPane().add(lblApellidoPaterno);
		
		JLabel lblApellidoMaterno = new JLabel("Apellido Materno:");
		springLayout.putConstraint(SpringLayout.NORTH, lblApellidoMaterno, 6, SpringLayout.SOUTH, lblApellidoPaterno);
		springLayout.putConstraint(SpringLayout.WEST, lblApellidoMaterno, 33, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblApellidoMaterno, -290, SpringLayout.EAST, getContentPane());
		lblApellidoMaterno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		getContentPane().add(lblApellidoMaterno);
		
		JLabel lblNCelular = new JLabel("N\u00B0 Celular:");
		springLayout.putConstraint(SpringLayout.NORTH, lblNCelular, 6, SpringLayout.SOUTH, lblApellidoMaterno);
		springLayout.putConstraint(SpringLayout.WEST, lblNCelular, 75, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNCelular, -290, SpringLayout.EAST, getContentPane());
		lblNCelular.setFont(new Font("Tahoma", Font.PLAIN, 15));
		getContentPane().add(lblNCelular);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha de nacimiento:");
		springLayout.putConstraint(SpringLayout.NORTH, lblFechaNacimiento, 6, SpringLayout.SOUTH, lblNCelular);
		springLayout.putConstraint(SpringLayout.WEST, lblFechaNacimiento, -139, SpringLayout.EAST, lblRut);
		springLayout.putConstraint(SpringLayout.EAST, lblFechaNacimiento, 0, SpringLayout.EAST, lblRut);
		lblFechaNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		getContentPane().add(lblFechaNacimiento);
		
		txtRut = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtRut, 0, SpringLayout.NORTH, lblRut);
		springLayout.putConstraint(SpringLayout.WEST, txtRut, 6, SpringLayout.EAST, lblRut);
		springLayout.putConstraint(SpringLayout.EAST, txtRut, 181, SpringLayout.EAST, lblRut);
		txtRut.setColumns(10);
		getContentPane().add(txtRut);
		
		txtNombre = new JTextField();
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				   int key = e.getKeyChar();
				   boolean mayusculas = key >= 65 && key <= 90;
				   boolean minusculas = key >= 97 && key <= 122;       
				   if (!(minusculas || mayusculas))
				   {
					   e.consume();
				   }	
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, txtNombre, 0, SpringLayout.NORTH, lblNombre);
		springLayout.putConstraint(SpringLayout.WEST, txtNombre, 6, SpringLayout.EAST, lblNombre);
		springLayout.putConstraint(SpringLayout.EAST, txtNombre, 0, SpringLayout.EAST, txtRut);
		txtNombre.setColumns(10);
		getContentPane().add(txtNombre);
		
		txtApellidoPaterno = new JTextField();
		txtApellidoPaterno.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 int key = e.getKeyChar();
				   boolean mayusculas = key >= 65 && key <= 90;
				   boolean minusculas = key >= 97 && key <= 122;       
				   if (!(minusculas || mayusculas))
				   {
					   e.consume();
				   }	
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, txtApellidoPaterno, 6, SpringLayout.SOUTH, lblNombre);
		springLayout.putConstraint(SpringLayout.WEST, txtApellidoPaterno, 6, SpringLayout.EAST, lblApellidoPaterno);
		springLayout.putConstraint(SpringLayout.EAST, txtApellidoPaterno, 0, SpringLayout.EAST, txtRut);
		txtApellidoPaterno.setColumns(10);
		getContentPane().add(txtApellidoPaterno);
		
		txtApellidoMaterno_1 = new JTextField();
		txtApellidoMaterno_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 int key = e.getKeyChar();
				   boolean mayusculas = key >= 65 && key <= 90;
				   boolean minusculas = key >= 97 && key <= 122;       
				   if (!(minusculas || mayusculas))
				   {
					   e.consume();
				   }	
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, txtApellidoMaterno_1, 0, SpringLayout.NORTH, lblApellidoMaterno);
		springLayout.putConstraint(SpringLayout.WEST, txtApellidoMaterno_1, 6, SpringLayout.EAST, lblApellidoMaterno);
		springLayout.putConstraint(SpringLayout.EAST, txtApellidoMaterno_1, 0, SpringLayout.EAST, txtRut);
		txtApellidoMaterno_1.setColumns(10);
		getContentPane().add(txtApellidoMaterno_1);
		
		txtNCelular = new JTextField();
		txtNCelular.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				  int key = e.getKeyChar();

				    boolean numeros = key >= 48 && key <= 57;
				        
				    if (!numeros)
				    {
				        e.consume();
				    }

				    if (txtNCelular.getText().trim().length() == 8) {
				        e.consume();
				    }
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, txtNCelular, 0, SpringLayout.NORTH, lblNCelular);
		springLayout.putConstraint(SpringLayout.WEST, txtNCelular, 6, SpringLayout.EAST, lblNCelular);
		springLayout.putConstraint(SpringLayout.EAST, txtNCelular, 0, SpringLayout.EAST, txtRut);
		txtNCelular.setColumns(10);
		getContentPane().add(txtNCelular);
		
		JDateChooser dtFechaNacimiento = new JDateChooser();
		springLayout.putConstraint(SpringLayout.NORTH, dtFechaNacimiento, 5, SpringLayout.SOUTH, txtNCelular);
		springLayout.putConstraint(SpringLayout.WEST, dtFechaNacimiento, 6, SpringLayout.EAST, lblFechaNacimiento);
		springLayout.putConstraint(SpringLayout.EAST, dtFechaNacimiento, 113, SpringLayout.EAST, lblFechaNacimiento);
		getContentPane().add(dtFechaNacimiento);
		
		JButton btnAgregar = new JButton("Agregar");
		springLayout.putConstraint(SpringLayout.SOUTH, btnAgregar, -44, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnAgregar, 0, SpringLayout.EAST, txtRut);
		getContentPane().add(btnAgregar);

	}
}
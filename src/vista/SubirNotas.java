package vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SubirNotas extends JInternalFrame {
	private JTextField txtRut;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtNota4;
	private JTextField txtNota5;
	private JTextField txtNota6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SubirNotas frame = new SubirNotas();
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
	public SubirNotas() {
		setTitle("Subir Notas");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 340, 338);
		getContentPane().setLayout(null);
		
		JLabel lblRut = new JLabel("Rut: ");
		lblRut.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRut.setAlignmentX(3.0f);
		lblRut.setBounds(10, 11, 32, 19);
		getContentPane().add(lblRut);
		
		txtRut = new JTextField();
		txtRut.setBounds(52, 12, 150, 20);
		getContentPane().add(txtRut);
		txtRut.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(212, 11, 89, 23);
		getContentPane().add(btnBuscar);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNota1.setAlignmentX(3.0f);
		lblNota1.setBounds(10, 50, 54, 19);
		getContentPane().add(lblNota1);
		
		txtNota1 = new JTextField();
		txtNota1.setColumns(10);
		txtNota1.setBounds(80, 51, 98, 20);
		getContentPane().add(txtNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNota2.setAlignmentX(3.0f);
		lblNota2.setBounds(10, 82, 54, 19);
		getContentPane().add(lblNota2);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(80, 83, 98, 20);
		getContentPane().add(txtNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		lblNota3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNota3.setAlignmentX(3.0f);
		lblNota3.setBounds(10, 112, 54, 19);
		getContentPane().add(lblNota3);
		
		txtNota3 = new JTextField();
		txtNota3.setColumns(10);
		txtNota3.setBounds(80, 113, 98, 20);
		getContentPane().add(txtNota3);
		
		JLabel lblNota4 = new JLabel("Nota 4:");
		lblNota4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNota4.setAlignmentX(3.0f);
		lblNota4.setBounds(10, 142, 54, 19);
		getContentPane().add(lblNota4);
		
		txtNota4 = new JTextField();
		txtNota4.setColumns(10);
		txtNota4.setBounds(80, 143, 98, 20);
		getContentPane().add(txtNota4);
		
		JLabel lblNota5 = new JLabel("Nota 5:");
		lblNota5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNota5.setAlignmentX(3.0f);
		lblNota5.setBounds(10, 172, 54, 19);
		getContentPane().add(lblNota5);
		
		txtNota5 = new JTextField();
		txtNota5.setColumns(10);
		txtNota5.setBounds(80, 173, 98, 20);
		getContentPane().add(txtNota5);
		
		JLabel lblNota6 = new JLabel("Nota 6:");
		lblNota6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNota6.setAlignmentX(3.0f);
		lblNota6.setBounds(10, 202, 54, 19);
		getContentPane().add(lblNota6);
		
		txtNota6 = new JTextField();
		txtNota6.setColumns(10);
		txtNota6.setBounds(80, 203, 98, 20);
		getContentPane().add(txtNota6);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(80, 245, 98, 23);
		getContentPane().add(btnActualizar);

	}

}

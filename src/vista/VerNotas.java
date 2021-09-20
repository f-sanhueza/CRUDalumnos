package vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class VerNotas extends JInternalFrame {
	private JTextField txtRutBuscar;
	private JTable tableAlumnos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerNotas frame = new VerNotas();
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
	public VerNotas() {
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 505, 402);
		getContentPane().setLayout(null);
		
		JLabel lblRutAlumno = new JLabel("Rut Alumno:");
		lblRutAlumno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRutAlumno.setAlignmentX(3.0f);
		lblRutAlumno.setBounds(10, 11, 83, 19);
		getContentPane().add(lblRutAlumno);
		
		txtRutBuscar = new JTextField();
		txtRutBuscar.setBounds(103, 12, 277, 20);
		getContentPane().add(txtRutBuscar);
		txtRutBuscar.setColumns(10);
		
		JButton btnBuscar = new JButton("buscar");
		btnBuscar.setBounds(390, 11, 89, 23);
		getContentPane().add(btnBuscar);
		
		tableAlumnos = new JTable();
		tableAlumnos.setBounds(10, 41, 469, 320);
		getContentPane().add(tableAlumnos);

	}

}

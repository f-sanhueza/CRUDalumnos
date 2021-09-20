package vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class EliminarAlumno extends JInternalFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EliminarAlumno frame = new EliminarAlumno();
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
	public EliminarAlumno() {
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 396, 159);
		getContentPane().setLayout(null);
		
		JLabel lblRut = new JLabel("Rut:");
		lblRut.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRut.setAlignmentX(3.0f);
		lblRut.setBounds(10, 48, 27, 19);
		getContentPane().add(lblRut);
		
		textField = new JTextField();
		textField.setBounds(47, 49, 323, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Eliminar");
		btnNewButton.setBounds(281, 95, 89, 23);
		getContentPane().add(btnNewButton);

	}

}

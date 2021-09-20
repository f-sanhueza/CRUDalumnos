package vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SubirNotas extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

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
		
		textField = new JTextField();
		textField.setBounds(52, 12, 150, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(212, 11, 89, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblRut_1 = new JLabel("Nota 1:");
		lblRut_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRut_1.setAlignmentX(3.0f);
		lblRut_1.setBounds(10, 50, 54, 19);
		getContentPane().add(lblRut_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(80, 51, 98, 20);
		getContentPane().add(textField_1);
		
		JLabel lblRut_1_1 = new JLabel("Nota 2:");
		lblRut_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRut_1_1.setAlignmentX(3.0f);
		lblRut_1_1.setBounds(10, 82, 54, 19);
		getContentPane().add(lblRut_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(80, 83, 98, 20);
		getContentPane().add(textField_2);
		
		JLabel lblRut_1_2 = new JLabel("Nota 3:");
		lblRut_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRut_1_2.setAlignmentX(3.0f);
		lblRut_1_2.setBounds(10, 112, 54, 19);
		getContentPane().add(lblRut_1_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(80, 113, 98, 20);
		getContentPane().add(textField_3);
		
		JLabel lblRut_1_3 = new JLabel("Nota 4:");
		lblRut_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRut_1_3.setAlignmentX(3.0f);
		lblRut_1_3.setBounds(10, 142, 54, 19);
		getContentPane().add(lblRut_1_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(80, 143, 98, 20);
		getContentPane().add(textField_4);
		
		JLabel lblRut_1_4 = new JLabel("Nota 5:");
		lblRut_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRut_1_4.setAlignmentX(3.0f);
		lblRut_1_4.setBounds(10, 172, 54, 19);
		getContentPane().add(lblRut_1_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(80, 173, 98, 20);
		getContentPane().add(textField_5);
		
		JLabel lblRut_1_5 = new JLabel("Nota 6:");
		lblRut_1_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRut_1_5.setAlignmentX(3.0f);
		lblRut_1_5.setBounds(10, 202, 54, 19);
		getContentPane().add(lblRut_1_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(80, 203, 98, 20);
		getContentPane().add(textField_6);
		
		JButton btnNewButton_1 = new JButton("Actualizar");
		btnNewButton_1.setBounds(80, 245, 98, 23);
		getContentPane().add(btnNewButton_1);

	}

}

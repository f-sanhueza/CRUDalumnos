package vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BuscarAlumno extends JInternalFrame {
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscarAlumno frame = new BuscarAlumno();
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
	public BuscarAlumno() {
		setTitle("Buscar Alumno");
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 540, 375);
		getContentPane().setLayout(null);
		
		JLabel lblEliga = new JLabel("Buscar por:");
		lblEliga.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEliga.setAlignmentX(3.0f);
		lblEliga.setBounds(10, 30, 83, 19);
		getContentPane().add(lblEliga);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Rut", "Nombre", "Apellido"}));
		comboBox.setBounds(102, 30, 83, 22);
		getContentPane().add(comboBox);
		
		table = new JTable();
		table.setMinimumSize(new Dimension(3, 3));
		table.setBounds(10, 60, 500, 274);
		getContentPane().add(table);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(421, 30, 89, 23);
		getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(195, 31, 216, 20);
		getContentPane().add(textField);
		textField.setColumns(10);

	}
}

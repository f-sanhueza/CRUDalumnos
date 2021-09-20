package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("CRUD ALUMNOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1055, 617);
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane escritorio = new JDesktopPane();
		escritorio.setBackground(SystemColor.textHighlight);
		escritorio.setBounds(0, 0, 1039, 556);
		contentPane.add(escritorio);
		escritorio.setLayout(null);
		
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAlumnos = new JMenu("Alumnos");
		menuBar.add(mnAlumnos);
		
		JMenuItem opAgregar = new JMenuItem("Agregar");
		opAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgregarAlumno agregarVentana = new AgregarAlumno();
				escritorio.add(agregarVentana);
				agregarVentana.show();				
			}
		});
		mnAlumnos.add(opAgregar);
		
		JMenuItem opActualizar = new JMenuItem("Actualizar");
		opActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ActualizarAlumno actualizarVentana = new ActualizarAlumno();
				escritorio.add(actualizarVentana);
				actualizarVentana.show();
			}
		});
		mnAlumnos.add(opActualizar);
		
		JMenuItem opEliminar = new JMenuItem("Eliminar ");
		opEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EliminarAlumno eliminarVentana = new EliminarAlumno();
				escritorio.add(eliminarVentana);
				eliminarVentana.show();
			}
		});
		mnAlumnos.add(opEliminar);
		
		JMenuItem opBuscar = new JMenuItem("Buscar");
		opBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuscarAlumno buscarVentana = new BuscarAlumno();
				escritorio.add(buscarVentana);
				buscarVentana.show();
			}
		});
		mnAlumnos.add(opBuscar);
		
		JMenu mnNotas = new JMenu("Notas");
		menuBar.add(mnNotas);
		
		JMenuItem opSubir = new JMenuItem("Subir");
		opSubir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SubirNotas subirVentana = new SubirNotas();
				escritorio.add(subirVentana);
				subirVentana.show();
				
			}
		});
		mnNotas.add(opSubir);
		
		JMenuItem opVer = new JMenuItem("Ver");
		opVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VerNotas verVentana = new VerNotas();
				escritorio.add(verVentana);
				verVentana.show();
			}
		});
		mnNotas.add(opVer);
		
	}
}

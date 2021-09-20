package principal;

import vista.AgregarAlumno;

public class Alumno {
	
	public static String alumnos[][] = new String[20][13];
	
	public static void llenarmatriz (String rut) 
	{
		
		alumnos[0][0] = rut; 
	}
	
	
}

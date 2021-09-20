package principal;

import java.util.Scanner;
import java.math.*;

public class Notas {
	
	public static boolean minmaxnum(Double min, Double max, Double num) {
		boolean retorno;
		if (num<=max && num>=min) {
			retorno = false;
		} else {
			retorno = true;
		}
		return retorno;
	}

	
	public static void main(String[] args) {
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("SUBIR NOTAS");
		
		Double suma = 0.0;
		Double promedio = 0.0;
		int contador = 0;
		int i = 0;
		int j = 0;
		Double nota = 0.0;
		boolean bt = true;
		boolean rangonotas;
		
		for (i=0; i<=19;i++) {
			for (j=0;j<=12;j++) {
				Alumno.alumnos[i][j] = "0";
			}
		}
		
		Alumno.alumnos[0][0]= "19808593";
		
		System.out.println("Ingrese el rut del alumno al cual quiere ingresar notas ");
		String rutnotas =  sc.nextLine();
		while (bt==true && i<13) {
			if(Alumno.alumnos[i][0].equals(rutnotas)){
				for (j=7;j<=12;j++) {
					rangonotas = true;
					while (rangonotas==true) {
						System.out.printf("Ingresa la nota", j-6);
						nota = sc.nextDouble();
						if (minmaxnum(1.0,7.0,nota) == false || nota == 0) {
							rangonotas = false;
						} else {
							System.out.printf("Rango Incorrecto, Ingrese nuevamente la nota numero", j-6);
						}
					}
					Alumno.alumnos[i][j] = Double.toString(nota);
					if ((Double.parseDouble(Alumno.alumnos[i][j])!=0)) {
						contador = contador + 1;
					}
					suma = suma + Double.parseDouble(Alumno.alumnos[i][j]);
					promedio = suma/contador;	
				}
				i = i+1;
				bt = true;
			}else {
				bt = false;
				i = i+1;
			}
		}
		if (bt==false && promedio==0) {
			System.out.println("este alumno no esta registrado o es incorrecto");
		} else {
			for (j=7;j<=13;j++) {
				System.out.println(Alumno.alumnos[i][j]);
			}
			System.out.println("promedio: "+promedio);
		}
		
		
		
	}
	
	
	
}

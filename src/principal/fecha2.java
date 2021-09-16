package principal;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

import java.time.format.DateTimeParseException;

import java.util.Scanner;

 

public class fecha2 {
	
	public static boolean verificaFecha() {
	
		try {
			Scanner sc = new Scanner(System.in);

			System.out.print("Ingrese año de nacimiento");
			String year1 = sc.nextLine();
			
			System.out.print("Ingrese mes de nancimiento");
			String mes = sc.nextLine();

			System.out.print("Ingrese dia de nacimiento ");

			String dia = sc.nextLine();
			
			String entrada=year1+"-"+mes+"-"+dia;

			LocalDate fecha = LocalDate.parse(entrada, DateTimeFormatter.ISO_LOCAL_DATE);
			System.out.println("Fecha correcta");
			
			return true;
			
		} catch(DateTimeParseException ex) {
			System.out.println("Fecha incorrecta");
			return false;
		}
	}
 

	public static void main(String[] args) {

		boolean evaluacionFecha=false;
		String opcion="";
		
 while (evaluacionFecha==true || opcion.equals("SI")) {
	 	
		evaluacionFecha=verificaFecha();
		if (evaluacionFecha==false) {
			System.out.println("Desea terminar con la ejecucion (SI/NO) ");
			Scanner sc = new Scanner(System.in);
			opcion = sc.nextLine();
			//opcion=opcion.toUpperCase();
		}
		
	 
 }
		

	}
}
 


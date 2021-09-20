package principal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;




public class fecha2 {
	
	
	public static String verificaFecha() {
	
		try {
			Scanner sc = new Scanner(System.in);

			System.out.print("Ingrese año de nacimiento en formato yyyy");
			String year1 = sc.nextLine();
			boolean checkNumero=year1.matches("[1-9][1,4]");
			if (checkNumero==true){
				int yearNumeric=Integer.parseInt( year1);
				LocalDate current_date = LocalDate.now();
				int current_Year = current_date.getYear();
				if (yearNumeric>1900 && yearNumeric<(current_Year-4)) {
					System.out.print("Ingrese mes de nancimiento en formato mm");
					String mes = sc.nextLine();

					System.out.print("Ingrese dia de nacimiento en dormato dd ");

					String dia = sc.nextLine();
					
					String entrada=year1+"-"+mes+"-"+dia;

					LocalDate fecha = LocalDate.parse(entrada, DateTimeFormatter.ISO_LOCAL_DATE);
					System.out.println("Fecha correcta");
					entrada=dia+"-"+mes+"-"+year1;
					return entrada;
				}else {
					System.out.println("Año fuera de rango establecido");
					return "0";
				}
			}else {
				System.out.println("Error de digitacion, solo se aceptan numeros ");
				return "0";
			}
			
			
			
		} catch(DateTimeParseException ex) {
			System.out.println("Fecha incorrecta");
			return "0";
		}
	}
	
	public static boolean esNombre(String nombre) {
		boolean verificaLetras=false;
		nombre=nombre.trim();
		nombre=nombre.toUpperCase();
		verificaLetras=nombre.matches("[a-zA-Z]*");
		System.out.println("Resultado= "+ verificaLetras);
		if (verificaLetras==true) {
			return true;
		}
		return false;
	}

	
		
	
 

	public static void main(String[] args) {
/* evaluacion fecha
 * 
 */
		
		String evaluacionFecha="0";
		String opcion="";
		Scanner sc = new Scanner(System.in);
		
		
		while (evaluacionFecha=="0" && !opcion.equals("SI")) {
	 	
			evaluacionFecha=verificaFecha();
		
			if (evaluacionFecha=="0") {
				System.out.println("Desea terminar con la ejecucion (SI/NO) ");
			
				opcion = sc.nextLine();
				opcion=opcion.toUpperCase();
				System.out.println("opcion ingresada " + opcion);
			
			}
		
		}
		System.out.println("sali del while, Fecha = "+ evaluacionFecha);
 
		//sc.close();	
		
		/* evaluacion nombre
		 * 
		 */
		opcion="";
		String nombre="";
		boolean verificaLetras=false;
		do {
			System.out.println("Ingrese el nombre del estudiante: ");
			nombre=sc.nextLine();
			nombre=nombre.trim();
			nombre=nombre.toUpperCase();
			verificaLetras=nombre.matches("[a-zA-Z]*");
			System.out.println("Resultado= "+ verificaLetras);
			
			if (verificaLetras==false) {
				System.out.println("Desea terminar con la ejecucion (SI/NO) ");
			
				opcion = sc.nextLine();
				opcion=opcion.toUpperCase();
				System.out.println("opcion ingresada " + opcion);
			}
			
		}while(verificaLetras==false && !opcion.equals("SI"));
		
		System.out.println("sali del while, nombre = "+ nombre);
	
		

	}
}
 


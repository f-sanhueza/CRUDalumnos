package principal;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class primeraclase {
	
	
	public static boolean rutVerificado(String rutIngresado) {
		
		String[] stringRut=null;
		rutIngresado=rutIngresado.trim();// se quitan los espacios contenidos en el dato ingresado.
		int multiplicador=2;
		int SumaMulti=0;
		int resto=0;
		int rutNumer=0;
		if (rutIngresado.contains(".")==true) {//se evalua si el rut fue ingresado con puntos 
			rutIngresado = rutIngresado.replace(".", ""); // Se eliminan los puntos ingresados 
		}
		
		Pattern pattern = Pattern.compile("^[0-9]+-[0-9kK]{1}$");//se crea una cadena de caracteres con  la que se evaluara el rut ingresado
		Matcher matcher=pattern.matcher(rutIngresado);// se comienza la evaluacion 

		if (matcher.matches()==true) {//si el retorno de la evaluacion es verdadero, sin letras ni caracteres, se continua con los sigueites pasos de verificacion
			stringRut= rutIngresado.split("-");// se divide en dos segmentos el rut para evaluacion de vrificador por separado
			StringBuilder rut = new StringBuilder(stringRut[0]);// se toma solo la parte de millosnes de rut 
			rutIngresado = rut.reverse().toString();// se invierte la cadena
			System.out.println("rut dado vuelta =" + rutIngresado );
			int largo=rutIngresado.length();// se toma el largo de la cadena 
			System.out.println("largo =" + largo );
			for (int i=0; i<=rutIngresado.length()-1;i++) {
				char c =rutIngresado.charAt(i);//Se toma caracter por caracter de la cadena 
				rutNumer=Character.getNumericValue(c);// los caracteres se traspasan a numero
				System.out.print("indice= "+ i);
				System.out.print("   Caracter =" + c);
				System.out.print("   entero="+ rutNumer);
				System.out.print("   multiplicador="+ multiplicador);
				SumaMulti=SumaMulti+(rutNumer*multiplicador);// se realiza la suma de la multiplicacion 
				System.out.println("    Suma= "+ SumaMulti);
				
				multiplicador=multiplicador+1;// el multiplicador se aumenta 

				if (multiplicador>7) {// restriccion al multiplicador
					multiplicador=2;
				}
			}
			resto=SumaMulti%11;// se saca el resto de la multiplicacion 
			System.out.print("resto= "+ resto);
			int resta=11-resto;// se realiza una resta 
			System.out.print("       resta= "+ resta);
			String restoaux="";
// se evalua el resultado de la resta 
			switch(resta) {
			case 10:
				restoaux="K";
				break;
			case 11:
				restoaux="0";
				break;
			default:
				restoaux=Integer.toString(resta);// se pasa a string el entero resta 
			}
			System.out.print("      restoaux= "+ restoaux);
			StringBuilder verificador = new StringBuilder(stringRut[1].toUpperCase());//Se construye un string con el digito verificador del rut ingresado
			
			System.out.print("        verificador= "+ verificador);
			String ver=verificador.toString();//Se pasa a estring por problemas de numero
			ver=ver.trim();// se quitan los espacios en caso de que existan 
			System.out.println("        ver= "+ ver);
			// esto no funciona!!
			if (ver == restoaux.toUpperCase()) {//se verifica para que de un mensaje por pantalla 
				System.out.println("Rut correcto");
				return true;
			}else {
				System.out.println("Rut incorrecto");
				return false;
			}
		}else {
			System.out.println("Rut incorrecto");// este mensaje es arrojado en caso de que el rut ingresado tenga caracteres invalidos
			return false;
		}	
		
	}
	
	static String opciones() {
		String opcion="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Desea terminar con la ejecucion (SI/NO) ");
		opcion = sc.nextLine();
		opcion=opcion.toUpperCase();
		System.out.println("opcion ingresada " + opcion);
		return opcion;
	}
	
	public static void main(String[] args) {
		
		String opcion="";
		Scanner sc = new Scanner(System.in);
		boolean checkRut=false;
		/*
		do {
		System.out.println("Ingrese el numero de rut");
		String rutIngresado=sc.nextLine();
		checkRut=rutVerificado(rutIngresado);
		if (checkRut ==false) {
			opciones();
		}
		
		}while (checkRut==false && !opcion.equals("SI"));
*/
		
		
}
}

package principal;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class primeraclase {
	
	public static String dv ( String rut ) {
		
		
		Integer M=0,S=1,T=Integer.parseInt(rut);
		System.out.println("Variable T = "+T);
		for (;T!=0;T=(int) Math.floor(T/=10))
			System.out.println("Variable T2 = "+  Math.floor(T/=10));
			S=(S+T%10*(9-M++%6))%11;
			System.out.println("Variable s = "+  S);
		return ( S > 0 ) ? String.valueOf(S-1) : "k";		
	}
	
		
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] stringRut=null;
		System.out.println("Ingrese el numero de rut");
		String rutIngresado=sc.nextLine();
		rutIngresado=rutIngresado.trim();
		System.out.println("indice =" +  rutIngresado.contains("."));
		if (rutIngresado.contains(".")==true) {
			rutIngresado = rutIngresado.replace(".", ""); 
		}
		System.out.println("rut ingresado ="+  rutIngresado);
		Pattern pattern = Pattern.compile("^[0-9]+-[0-9kK]{1}$");
		Matcher matcher=pattern.matcher(rutIngresado);

		if (matcher.matches()==true) {
			stringRut= rutIngresado.split("-");
			StringBuilder rut = new StringBuilder(stringRut[0]);
			rutIngresado = rut.reverse().toString();
			System.out.println("rut dado vuelta =" + rutIngresado );
		}
		
		
		
		//System.out.println("lo ultimo del archivo"+stringRut[1].toLowerCase().equals(primeraclase.dv(stringRut[0])));
		
	}

}

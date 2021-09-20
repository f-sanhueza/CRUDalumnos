import java.util.Scanner;

public class ValidacionCorreo {
	public static void main(String[] args) {
	{
	int Arroba;
	Boolean BanderaCorreo;
	int i;
	int Punto;
	String Correo = "";
	Arroba = 0;
	Punto = 0;
	BanderaCorreo = false;
	
	while (BanderaCorreo == false) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba su Correo: ");
		Correo = sc.nextLine();
		
		for (i = 0; i <= Correo.length()-1; i++) {
			if (Correo.substring(i,i+1).equals("@")) {
				Arroba = Arroba+1;
			}
			if (Correo.substring(i,i+1).equals(".")) {
				Punto = Punto+1;
			}
		}
		if (Arroba <1 || Arroba >2 & Punto <1 || Punto>2) {
			System.out.println("Correo invalido" + "(use Punto y @)");
		} else {
			System.out.println("correo valido" + ":" + Correo);
			BanderaCorreo = true;
	}
 }
	}
}
}

package principal;


import java.text.SimpleDateFormat;
import java.util.Date;

public class fecha {
	/*
	
	public static void evaluacionFecha(String fechaIngresada) {
		
		try {
			
			Date fecha=new SimpleDateFormat("dd/mm/yyyy").parse(fechaIngresada);
			String fechaSalida=new SimpleDateFormat("dd/mm/yyyy").format(fecha);
			
			System.out.println("fecha ingresada : " + fechaIngresada);
			System.out.println("fecha salida : " + fecha);
			if (fechaIngresada.equals(fechaSalida)){
				System.out.println("fecha ingresada es correcta: ");
			}else {
				System.out.println("fecha ingresada es incorrecta: ");
			}
				
		}catch (Exception e) {
			
		}
		
		
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	
		
		//evaluacionFecha("30/02/2020");
		
		
		
		
		
		try {
			String fechaIngresada="32/02/2020";
			
			Date fecha=new SimpleDateFormat("dd/mm/yyyy").parse(fechaIngresada);
			String fechaSalida=new SimpleDateFormat("dd/mm/yyyy").format(fecha);
			
			System.out.println("fecha ingresada : " + fechaIngresada);
			System.out.println("Conversion fecha : " + fecha);
			System.out.println("fecha salida : " + fechaSalida);
			if (fechaIngresada.equals(fechaSalida)){
				System.out.println("fecha ingresada es correcta ");
			}else {
				System.out.println("fecha ingresada es incorrecta ");
			}
				
		}catch (Exception e) {
			
		}
	}

}

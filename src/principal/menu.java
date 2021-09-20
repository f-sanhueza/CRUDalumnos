package principal;

import java.util.Scanner;

public class menu {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean pregunta=false;
		String alumnos[][] = new String[20][13];
		int row=alumnos.length;
		int col=alumnos[0].length;
		Scanner sc = new Scanner(System.in);
		boolean siempre=true;
		do {
			boolean redireccion=false;
			String opcion="";
			System.out.println("");
			System.out.println("########################################");
			System.out.println("#                 MENU                 #");
			System.out.println("#                                      #");
			System.out.println("#   [1] AGREGAR      [2] ACTUALIZAR    #");
			System.out.println("#                                      #");
			System.out.println("#   [3] ELIMIMAR    [4] BUSCAR         #");
			System.out.println("#                                      #");
			System.out.println("#   [5] SUBIR NOTAS [6] VER NOTAS      #");
			System.out.println("#                                      #");
			System.out.println("#        [7] SALIR DEL SISTEMA         #");
			System.out.println("#                                      #");
			System.out.println("########################################");
			boolean checkRut=false;
			boolean buscarepetir=false;
			String evaluacionFecha="0";
			while (redireccion==false) {
				opcion=sc.nextLine();
				System.out.println(opcion);
				if (opcion.matches("[1-7][1]")==true) {
					System.out.println("Ingrese al si ");
					switch (Integer.parseInt(opcion)) {

					case 1:
						System.out.println("AGREGAR");
						redireccion = true;
						int cnin=0;
						String rutIngresado="";
						while (pregunta==false &&  cnin <=row-1 ) {
							if (alumnos[cnin][0].equals(null)) {
								
							
								do {
									System.out.println("Ingrese el numero de rut en formato nnnnnnnn-n");
									rutIngresado=sc.nextLine();
									checkRut=principal.primeraclase.rutVerificado(rutIngresado);
									if (checkRut ==false) {
										principal.primeraclase.opciones();
									}
									
									}while (checkRut==false && !principal.primeraclase.opciones().equals("SI"));
								
								if (checkRut==true) {
									buscarepetir=principal.primeraclase.buscaElemento(alumnos, rutIngresado, 0, row-1, 0);
									if (buscarepetir==false) {
										alumnos[cnin][0] = rutIngresado;
									} else {
										System.out.println("Rut ingresado ya esta en sistema");
										principal.primeraclase.opciones();
									}
								}
								if (buscarepetir==false) {
									// ---------------ingreso nombre-----------------------------
									boolean validnombre = false;
									do {
										System.out.println("Ingrese el nombre del estudiante: ");
										String nombre=sc.nextLine();
										validnombre=principal.fecha2.esNombre(nombre);
										if(validnombre==true){
										
											alumnos[cnin][1] = nombre.toUpperCase();
									}else  {
											principal.primeraclase.opciones();
										}
									}while(validnombre==false&&!principal.primeraclase.opciones().equals("SI"));
									validnombre = false;
									
									do {
										System.out.println("Ingrese el apellido Paterno del estudiante: ");
										String appaterno=sc.nextLine();
										validnombre=principal.fecha2.esNombre(appaterno);
										if(validnombre==true){
										
											alumnos[cnin][2] = appaterno.toUpperCase();
									}else  {
											principal.primeraclase.opciones();
										}
									}while(validnombre==false&&!principal.primeraclase.opciones().equals("SI"));
									validnombre = false;
									do {
										System.out.println("Ingrese el apellido Materno del estudiante: ");
										String apmaterno=sc.nextLine();
										validnombre=principal.fecha2.esNombre(apmaterno);
										if(validnombre==true){
										
											alumnos[cnin][3] = apmaterno.toUpperCase();
									}else  {
											principal.primeraclase.opciones();
										}
									}while(validnombre==false&&!principal.primeraclase.opciones().equals("SI"));
									
									/// numero de contacto 
									
									
									/// correo electronico
									
									
									
									
									 	do {
										evaluacionFecha=principal.fecha2.verificaFecha();
									
										if (evaluacionFecha=="0") {
											
											principal.primeraclase.opciones();
										}else {
											alumnos[cnin][6] = evaluacionFecha;
										}
									
									}while (evaluacionFecha=="0" && !principal.primeraclase.opciones().equals("SI")) ;
									
									
								}
								
								
								
							}
						}
						int citer = 0;
						for (int j=0;j<=row-1;j++) {
							for (int k=0;k<=col-1;k++) {
								if (citer==j) {
									System.out.print(alumnos[j][k]+" || ");
								} else {
									System.out.println(alumnos[j][k]+" || ");
								}
								citer = j;
							}
						}
						
						
						break;
						
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						break;
					case 7:
						break;
						
					}
				
				
					}
				}
			
		}while(siempre!=false);
		
	
	}
}



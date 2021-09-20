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
		String cont = "";
		for (int j=0;j<=row-1;j++) {
			for (int k=0;k<=col-1;k++) {
				alumnos[j][k] = cont;
			}
		}
		int columna=0;
		String busca="";
		boolean redireccion=false;
		do {
			
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
				System.out.println(opcion+ "    " );
				
				if (opcion.matches("[1-7]")==true &&Integer.parseInt(opcion)<8 && Integer.parseInt(opcion)>0 ) {
					System.out.println("Ingrese al si ");
					switch (Integer.parseInt(opcion)) {

					case 1:
						System.out.println("AGREGAR");
						redireccion = true;
						int cnin=0;
						String rutIngresado="";
						while (pregunta==false &&  cnin <=row-1 ) {
							if (alumnos[cnin][0].equals("")) {
								
							
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
									 	
									 	System.out.println("Sali del do while ");
									 	break;
									
									 	
								}
								
								System.out.println("Sali del if ");
								
							}
							System.out.println("Sali del if2 ");
							break;
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
						System.out.println("ACTUALIZAR");
						
						break;
					case 3:
						System.out.println("ELIMINAR");
						String del = "SI";
						String eliminar = "";
						int  i = 0;
						System.out.println("Ingrese el identificadro del alumno que desea sacar del curso");
						busca=sc.nextLine();
						columna = 0;
						buscarepetir = principal.primeraclase.buscaElemento(alumnos,busca,0,row-1,0);
						if (buscarepetir==true) {
							int visualizar =principal.primeraclase.buscaMatriz (alumnos,busca,0,row-1,columna);
							System.out.println(visualizar);
							System.out.println("esta seguro de eliminar el registro? ingrese (si)");
							eliminar=sc.nextLine();
							if (eliminar.toUpperCase().equals(del)) {
								for (i=0;i<=col-1;i++) {
									alumnos[visualizar][i] = "";
								}
							}
						}
						break;
					case 4:
						boolean bnumber=false;
						System.out.println("BUSCAR");
						System.out.println("buscar: 1) Identificador     2)Nombre       3)Apellido");
						String sel=sc.nextLine();
						bnumber= sel.matches("[1-3]");
						int seleccion = Integer.parseInt(sel);
						columna=0;
						busca="";
						if (bnumber==true) {
							switch (seleccion) {
							case 1:
								columna = 0;
								System.out.println("ingrese el Identificador a buscar ");
								busca= sc.nextLine();
								break;
							case 2:
								columna = 1;
								System.out.println("ingrese el Nombre a buscar ");
								busca =sc.nextLine();
								break;
							case 3:
								columna = 2;
								System.out.println("ingrese el Apellido a buscar ");
								busca =sc.nextLine();
								break;	
							default:
								System.out.println("No ingresaste una seleccion valida.");
							}
							int visualizar = principal.primeraclase.buscaMatriz(alumnos,busca,0,row-1,columna);
						}
						
						break;
					case 5:
						System.out.println("SUBIR NOTAS");
						
						break;
					case 6:
						System.out.println("VER NOTAS");
						break;
					case 7:
						
						break;
						
					}
				
				
					}
				}
			
		}while(siempre!=false);
		
	
	}
}



/*
 * Descripción: Ejercicio 2 examen tema 1
 * Autor:Iván del cid plaza
 * Fecha:29/10/2025
 */
package delcid1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		
		System.out.println("ANÁLISIS DEL AÑO");
		System.out.println("-----------------");
		System.out.println("Introduzca un año (entre 1801-2100):");
		int anyo= teclado.nextInt();//introducimos el limite de la variable
			if (anyo<1800||anyo>2100) {
			System.out.println("El año no esta en ese rango");
		}else {
			System.out.println("RESULTADO");//si esta en rango seguimos con la peticion
			System.out.println("---------");
			
			if (anyo<2025) {// calculamos cuantos años nos faltan para llegar o cuantos años hace que pasó
				int pasado= 2025-anyo;
				System.out.println("El año introducido es anterior al actual." 
			+ " Han pasado " + pasado + " años" );
			}else if (anyo == 2025) {
				System.out.println("El año introducido coincide con el actual.");
			}else if(anyo>2025) {
				int futuro= anyo-2025;
				System.out.println("El año introducido es posterior al actual." 
				+ " Faltan "+ futuro + " años" );
			}
			
			
			
			
			if (anyo>=1801||anyo<=1900) {// buscamos la colocación del año dentro de su siglo
				System.out.println("El año: " + anyo + " Es el siglo XIX");
			}else if (anyo>=1901||anyo<=2000) {
				System.out.println("El año: " + anyo + " Es el siglo XX");
			}else if (anyo>=2001||anyo<=2100){
				System.out.println("El año: "+anyo + " Es el siglo XXI");
			}
		}
		
	}

}

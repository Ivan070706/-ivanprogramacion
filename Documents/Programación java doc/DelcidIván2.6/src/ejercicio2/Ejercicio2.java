/*
 * Nombre: Iván Del cid 
 * Descripción: Tenemos que pedir unos datos y hacer que los inválidos no sirvan
 * Fecha:6/10/2025
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		 
		 String nombre;                   // pedimos los datos requeridos para hacer la operación
		 System.out.println("Dame tu nombre: ");
		 nombre = teclado.nextLine();
		 
		 int edad;
		 System.out.println("Dame tu edad: "); 
		 edad = teclado.nextInt();
		 
		 double notaMedia;
		 System.out.println("Dame tu nota media:");
		 notaMedia = teclado.nextDouble();
			                                    // teniendo ya los datos ponemos las condiciones y el resultado
		 if (notaMedia >= 7.0 || edad >= 18) {
			 System.out.println(nombre + ", usted ha sido admitido en el curso, cumple las\r\n"
			 		+ "condiciones requeridas" );
		 }else {
			 System.out.println(nombre + " lo" 
					+ "sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos");
		 }
		 
	}
	
}


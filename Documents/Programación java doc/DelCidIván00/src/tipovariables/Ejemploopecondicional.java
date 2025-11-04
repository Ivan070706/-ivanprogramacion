/*
 * Descripción: como funciona el operador condicional 
 * Autor: Iván 
 * Fecha: 26/09/25
 */
package tipovariables;

import java.util.Scanner;

public class Ejemploopecondicional {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		
		 String nombre;
		 System.out.println("Dime tu nombre en minusculas: ");
		 nombre = teclado.nextLine();
		 String mayuscula = nombre.toUpperCase();
		 System.out.println("mayusculas: " + mayuscula);
		 
		 
		 String name;
		 System.out.println("Dime tu nombre en mayusculas");
		 name = teclado.nextLine();
		 String minus = nombre.toLowerCase();
		 System.out.println("minusculas:" + minus);
		 
		 boolean esIvan;
		 nombre = nombre.toLowerCase();
		 esIvan = nombre.equals("ivan");
		 System.out.println(esIvan);
	/*	 
		int edad;
		System.out.println("Dime tu edad: ");
		edad = teclado.nextInt();
		
		String mayorEdad;
		mayorEdad = (edad > 18) ? "Eres mayor de edad" : "Eres menor de edad";
		System.out.println(mayorEdad);
		
		*/
		

	}

}

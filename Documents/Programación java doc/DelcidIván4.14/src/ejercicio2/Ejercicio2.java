package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
         System.out.println("Dame tu edad: ");
         int edad1= teclado.nextInt();
         System.out.println(esMayorEdad(edad1));
	}
   public static boolean esMayorEdad(int a) {
	if (a>=18) {
		return true;
	}else {
		return false;
	}
	 
   }
}

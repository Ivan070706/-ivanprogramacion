package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame un nombre: ");
		String nombre1=teclado.nextLine();
		
		System.out.println("Dame el mismo nombre: ");
		String nombre2=teclado.nextLine();
		
		System.out.println( comparaNombres(nombre1,nombre2));
		

	}
	public static boolean comparaNombres (String n1,String n2) {
		if (n1.equals(n2)) {
			return true;
		}else {
			return false;
		}
	
	}
}

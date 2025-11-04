package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		final double CONVERSION = 166.386 ;
		
		Scanner teclado = new Scanner(System.in);
		
		double euros;
		System.out.println("Dime una cantidad de euros: ");
		euros = teclado.nextDouble();
		System.out.println("Euros: " + euros);
		
		double pesetas = (euros * CONVERSION) ;
		System.out.println("Pesetas: " + pesetas);
		
		
		double pidePesetas;
		System.out.println("Dime una cantidad de Pesetas: ");
		pidePesetas = teclado.nextDouble();
		System.out.println("Pesetas: " + pidePesetas);
		
		double euros2 = (pidePesetas / CONVERSION);
		System.out.println("Euros: " + euros2);

	}

}

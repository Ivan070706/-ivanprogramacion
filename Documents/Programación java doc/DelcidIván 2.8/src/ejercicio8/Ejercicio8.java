package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame tu nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.println("Dame tus apellidos: ");
		String apellidos = teclado.nextLine();
		
		System.out.println("Dame tu edad: ");
		int edad=teclado.nextInt();
		if (edad>17 || edad<45) {
			System.out.println(" ");
		}else {
			System.out.println("Esa edad no es correcta.");
		}
		System.out.println("Número de rutas realizadas: ");
		int numeroRutas=teclado.nextInt();
		System.out.println("Distancia de la ultima ruta: ");
		double distanciaRuta=teclado.nextDouble();
		
		System.out.println("nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Número de rutas realizadas: " + numeroRutas);
		
		if (numeroRutas>=5) {
		 double mediaruta = numeroRutas/5.0;
		 System.out.println("Distancia media(5 últimas rutas): "+ mediaruta);
		}
		
		
		
	}

}

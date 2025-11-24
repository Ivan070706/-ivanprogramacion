package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		
		System.out.println("Dame un numero: ");
		int numero= teclado.nextInt();
		
		System.out.println("La suma de tu numero mas 1: " + suma1aN(numero));
		System.out.println("El producto de tu numero a 1: " + producto1aN(numero));
		System.out.println("El medio de tu numero entre 1: " + intermedio1aN(numero));
		

	}
	// Devuelve la suma de enteros de 1 a n
	public static int suma1aN(int n) {
		int suma = n +1;
		return suma;
	
	}
	// Devuelve el producto de enteros de 1 a n
	public static int producto1aN(int n) {
		int multiplicacion= n*1;
		return multiplicacion;
		
	}
	// Devuelve el valor intermedio entre 1 y n
	public static double intermedio1aN(int n) {
		double medio = n/1;
		return medio;
		
	}
	
	
	

}

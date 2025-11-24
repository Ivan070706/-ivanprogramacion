package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime el caracter que quieres imprimir: ");
		char caracter= teclado.nextLine().charAt(0);
		
		System.out.println("Dime el tamaño de la piramide: ");
		int tamanyo=teclado.nextInt();
		
		System.out.println("Tu piramide es: " + piramideLetras(caracter,tamanyo));
		

	}
	
	public static int[] piramideLetras(char caracter, int tamanyo) {
	
		int[] piramide= new int [tamanyo];
	for (int lineas=0;lineas<tamanyo;lineas++) {
		
		
		for (int cantidad=0;cantidad<caracter;cantidad++) {
			System.out.print(" "+  " " + " " + caracter);
		}
		for (int letra=0;letra<lineas;letra++) {
		     
		}
		System.out.println();
	}
		
		return piramide ;
	}

}

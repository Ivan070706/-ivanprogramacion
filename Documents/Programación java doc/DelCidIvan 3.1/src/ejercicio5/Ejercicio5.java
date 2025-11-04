package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
	
         int suma = 0;
         double media;
		
		int[] numeros = new int[5];

	
		for (int num = 0; num < 5; num++) {
		System.out.print("Introduce el número " + (num + 1) + ": ");
		numeros[num] = teclado.nextInt();
		suma += numeros[num];
		
		}

		System.out.println("\nLos números guardados son:");
		for (int num = 0; num < 5; num++) {
		System.out.println("Numero " + (num + 1) + ": " + numeros[num]);
		}
	     media = suma/5.0;
		System.out.println("La meida de los numeros es: " + media);
			

		
		}
	}



package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroMasBajo,numeroMasAlto = 0;

		// Paso 1: Pedir el tamaño del array
		System.out.print("¿Cuántos números deseas guardar? ");
		int tamaño = sc.nextInt();

		// Paso 2: Crear el array
		int[] numeros = new int[tamaño];

		// Paso 3: Guardar los números en el array
		for (int i = 0; i < tamaño; i++) {
		System.out.print("Introduce el número " + (i + 1) + ": ");
		numeros[i] = sc.nextInt();
		}

		// Paso 4: Mostrar los números guardados
		System.out.println("\nLos números guardados son:");
		for (int i = 0; i < tamaño; i++) {
		System.out.println("Numero " + (i + 1) + ": " + numeros[i]);
		}
		int mayor = numeros[0];
		int menor = numeros[0];
		
		for(int i=0; i<tamaño; i++ ) {
		if (numeros[i] > mayor) {
			 mayor=numeros[i];
		}if (numeros[i] < menor) {
			menor =numeros[i];
		}
		
			System.out.println("el numero mayor es: " + mayor);
			System.out.println("el numero menor es: " + menor);
			

		sc.close();
		}
	}
}

	



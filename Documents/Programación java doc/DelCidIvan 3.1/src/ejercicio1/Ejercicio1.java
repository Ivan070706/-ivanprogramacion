package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

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

		sc.close();
		}

	}



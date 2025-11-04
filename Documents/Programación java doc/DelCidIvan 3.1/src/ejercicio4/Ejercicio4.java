package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma = 0;
        int sumaMenor = 0;

		// Paso 2: Crear el array
		int[] numeros = new int[20];

		// Paso 3: Guardar los números en el array
		for (int num = 0; num < 20; num++) {
		System.out.print("Introduce el número " + (num + 1) + ": ");
		numeros[num] = sc.nextInt();
		if (numeros[num] >0) {
			suma += numeros[num];
		}
		
		if(numeros[num] < 0) {
			sumaMenor += numeros[num];
		}

		}
		System.out.println("la suma de los numeros positivos es: "+ suma);
		System.out.println("la suma de los numeros negativos es: "+ sumaMenor);

		sc.close();
		}

	}



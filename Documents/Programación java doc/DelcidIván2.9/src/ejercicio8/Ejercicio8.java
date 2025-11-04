package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        int numero;

        System.out.println("Introduce una secuencia de números (termina con 0):");

        while (true) {
            System.out.print("Número: ");
            numero = entrada.nextInt();

            if (numero == 0) {
                break; // termina el ciclo
            }

            if (numero > 0) {
                positivos++;
            } else { // número < 0
                negativos++;
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);

        if (negativos > 0) {
            System.out.println("Se ha introducido al menos un número negativo.");
        } else {
            System.out.println("No se ha introducido ningún número negativo.");
        }

      
    }

	}



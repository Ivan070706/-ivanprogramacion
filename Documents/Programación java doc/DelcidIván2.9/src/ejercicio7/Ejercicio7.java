package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		   Scanner entrada = new Scanner(System.in);
	        int positivos = 0;
	        int negativos = 0;
	        int numero;

	        System.out.println("Ingrese 100 números no nulos (positivos o negativos):");

	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Número " + i + ": ");
	            numero = entrada.nextInt();

	            // Verificar que no sea nulo (cero)
	            while (numero == 0) {
	                System.out.print("El número no puede ser cero. Ingrese otro: ");
	                numero = entrada.nextInt();
	            }

	            // Clasificar el número
	            if (numero > 0) {
	                positivos++;
	            } else {
	                negativos++;
	            }
	        }

	        System.out.println("\n--- Resultados ---");
	        System.out.println("Cantidad de números positivos: " + positivos);
	        System.out.println("Cantidad de números negativos: " + negativos);

	        entrada.close();
	    }
	

	}



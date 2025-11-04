package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        int[] billetes = {500, 200, 100, 50, 20, 10, 5}; // tipos de billetes
	        int cantidad;

	        System.out.print("Introduce una cantidad en euros (múltiplo de 5): ");
	        cantidad = entrada.nextInt();

	        // Validar múltiplo de 5
	        if (cantidad % 5 != 0) {
	            System.out.println("La cantidad debe ser un múltiplo de 5.");
	        } else {
	            System.out.println("Billetes necesarios para " + cantidad + "€:");

	            for (int b : billetes) {
	                if (cantidad >= b) {
	                    int numBilletes = cantidad / b; // cuántos billetes de este tipo
	                    cantidad = cantidad % b;       // lo que queda por repartir
	                    System.out.println(numBilletes + " billete(s) de " + b + "€");
	                }
	            }
	        }

	        entrada.close();
	    }

	}


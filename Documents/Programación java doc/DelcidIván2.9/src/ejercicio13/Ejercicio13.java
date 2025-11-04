package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		  Scanner entrada = new Scanner(System.in);
	        int min = 1;
	        int max = 100;
	        int intentos = 0;
	        String respuesta;

	        System.out.println("Piensa en un número entre 1 y 100 y yo intentaré adivinarlo.");
	        System.out.println("Responde con 'mayor', 'menor' o 'igual'.");

	        while (min <= max) {
	            int intento = (min + max) / 2; // propuesta del ordenador
	            intentos++;

	            System.out.println("¿Es " + intento + "?");
	            System.out.print("Tu respuesta: ");
	            respuesta = entrada.next().toLowerCase();

	            if (respuesta.equals("igual")) {
	                System.out.println("¡He adivinado tu número en " + intentos + " intentos!");
	                break;
	            } else if (respuesta.equals("mayor")) {
	                min = intento + 1; // el número del usuario es mayor
	            } else if (respuesta.equals("menor")) {
	                max = intento - 1; // el número del usuario es menor
	            } else {
	                System.out.println("Respuesta no válida. Por favor, escribe 'mayor', 'menor' o 'igual'.");
	                intentos--; // no contar intento inválido
	            }
	        }

	        if (min > max) {
	            System.out.println("Parece que hubo un error en tus respuestas. 😅");
	        }

	        entrada.close();
	    }

	}



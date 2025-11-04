package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        boolean hayDiez = false;
	        double nota;

	        System.out.println("Introduce las notas (de 0 a 10). Escribe -1 para terminar:");

	        while (true) {
	            System.out.print("Nota: ");
	            nota = entrada.nextDouble();

	            if (nota == -1) {
	                break; // termina la lectura
	            }

	            // Validar que la nota esté entre 0 y 10
	            if (nota < 0 || nota > 10) {
	                System.out.println("⚠️  La nota debe estar entre 0 y 10. Intente otra vez.");
	                continue;
	            }

	            if (nota == 10) {
	                hayDiez = true;
	            }
	        }

	        System.out.println("\n--- Resultado ---");
	        if (hayDiez) {
	            System.out.println("✅ Se ha introducido al menos una nota con valor 10.");
	        } else {
	            System.out.println("❌ No se ha introducido ninguna nota con valor 10.");
	        }

	        entrada.close();
	    }
	}



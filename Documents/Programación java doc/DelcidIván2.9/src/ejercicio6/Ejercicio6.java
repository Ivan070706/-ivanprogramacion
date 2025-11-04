package ejercicio6;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		
		        Scanner entrada = new Scanner(System.in);
		        boolean hayNegativo = false; // bandera para detectar negativos
		        int numero;

		        System.out.println("Ingrese 100 números no nulos (positivos o negativos):");

		        for (int i = 1; i <= 5; i++) {
		            System.out.print("Número " + i + ": ");
		            numero = entrada.nextInt();

		            // Verifica que el número no sea nulo
		            while (numero == 0) {
		                System.out.print("El número no puede ser cero. Ingrese otro: ");
		                numero = entrada.nextInt();
		            }

		            // Si el número es negativo, se marca la bandera
		            if (numero < 0) {
		                hayNegativo = true;
		            }
		        }

		        // Mensaje final
		        if (hayNegativo) {
		            System.out.println("Se ha introducido al menos un número negativo.");
		        } else {
		            System.out.println("No se ha introducido ningún número negativo.");
		        }

		        entrada.close();
		    }



	}



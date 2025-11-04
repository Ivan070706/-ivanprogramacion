package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		  Scanner entrada = new Scanner(System.in);

	        System.out.print("Introduce la base A: ");
	        double A = entrada.nextDouble();

	        System.out.print("Introduce el exponente B (entero no negativo): ");
	        int B = entrada.nextInt();

	        double resultado = 1;

	        // Calculamos A^B multiplicando A por sí mismo B veces
	        for (int i = 1; i <= B; i++) {
	            resultado *= A;
	        }

	        System.out.println(A + " elevado a " + B + " es: " + resultado);

	        entrada.close();
	    }

	}



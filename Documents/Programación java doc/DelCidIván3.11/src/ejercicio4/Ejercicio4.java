package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		final int numeroAlumnos = 4;
        final int numeroAsignaturas = 5;
        double[][] notas = new double[numeroAlumnos][numeroAsignaturas];

        // Entrada de datos
        for (int filas = 0; filas < numeroAlumnos; filas++) {
            System.out.println("Introduce datos del alumno " + (filas + 1) + ":");
            for (int columnas = 0; columnas < numeroAsignaturas; columnas++) {
                System.out.print("Nota de la asignatura " + (columnas + 1) + ": ");
                notas[filas][columnas] = teclado.nextDouble();
            }
        }

        // Cálculo de resultados
        System.out.println("\nRESULTADOS:");
        for (int filas = 0; filas < numeroAlumnos; filas++) {
            double min = notas[filas][0];
            double max = notas[filas][0];
            double suma = 0;

            for (int columnas = 0; columnas < numeroAsignaturas; columnas++) {
                double nota = notas[filas][columnas];
                if (nota > max) max = nota;
                if (nota < min) min = nota;
                suma += nota;
            }

            double media = suma / numeroAsignaturas;
            System.out.printf("Alumno %d -> Mínima: %.2f | Máxima: %.2f | Media: %.2f%n",
                    (filas + 1), min, max, media);
		    	
		    	
		     }
		    	
				
		    	 
		   
}
}

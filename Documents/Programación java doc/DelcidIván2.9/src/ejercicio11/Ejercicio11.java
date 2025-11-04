package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		 int sumaPares = 0;
	        int sumaImpares = 0;

	        // Recorremos los números del 100 al 200 (incluidos)
	        for (int i = 100; i <= 200; i++) {
	            if (i % 2 == 0) {      // Si es par
	                sumaPares += i;
	            } else {               // Si es impar
	                sumaImpares += i;
	            }
	        }

	        // Mostrar los resultados
	        System.out.println("La suma de los números pares entre 100 y 200 es: " + sumaPares);
	        System.out.println("La suma de los números impares entre 100 y 200 es: " + sumaImpares);
	    }

	}



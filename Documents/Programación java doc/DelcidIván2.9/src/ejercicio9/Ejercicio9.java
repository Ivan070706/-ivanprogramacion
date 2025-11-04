package ejercicio9;

public class Ejercicio9 {

	public static void main(String[] args) {
		 int suma = 0;
	        int producto = 1;

	        // Recorremos los 10 primeros números naturales
	        for (int i = 1; i <= 10; i++) {
	            suma += i;        // Acumula la suma
	            producto *= i;    // Acumula el producto
	        }

	        System.out.println("La suma de los 10 primeros números naturales es: " + suma);
	        System.out.println("El producto de los 10 primeros números naturales es: " + producto);
	    }

	}



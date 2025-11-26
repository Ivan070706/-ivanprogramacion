package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        // Pedimos el nombre del jugador
	        System.out.print("Introduce el nombre del jugador: ");
	        String nombre = scanner.nextLine();

	        // Pedimos el dorsal del jugador
	        System.out.print("Introduce el dorsal del jugador (1-16): ");
	        int dorsal = scanner.nextInt();

	        // Llamamos al método para obtener la posición
	        String posicion = posicionJugador(dorsal);
	        
	        // Si la posición es incorrecta, mostramos el mensaje de error
	        if (posicion.equals("Número introducido incorrecto.")) {
	            System.out.println(posicion);
	        } else {
	            // Si la posición es válida, mostramos el mensaje con el nombre, dorsal y posición
	            System.out.println(nombre + ", con el dorsal " + dorsal + " juega el próximo partido como " + posicion + ".");
	        }

	}
	public static String posicionJugador(int dorsal) {
        // Verificamos si el dorsal está entre 1 y 16
        if (dorsal < 1 || dorsal > 16) {
            return "Número introducido incorrecto.";
        }
        
        // Declaramos la variable para la posición
        String posicion = "";

        // Asignamos la posición según el dorsal
        if (dorsal == 1) {
            posicion = "Portero";
        } else if (dorsal >= 2 && dorsal <= 5) {
            posicion = "Defensa";
        } else if (dorsal >= 6 && dorsal <= 8) {
            posicion = "Centrocampista";
        } else if (dorsal >= 9 && dorsal <= 11) {
            posicion = "Delantero";
        } else if (dorsal >= 12 && dorsal <= 16) {
            posicion = "Suplente";
        }

        return posicion;
    }
}

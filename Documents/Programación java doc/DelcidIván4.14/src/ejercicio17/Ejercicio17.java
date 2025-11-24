package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {
 public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;   // variable que controla el bucle

        do {
            System.out.println("Introduce valores, 0 si quieres pararlo: ");
            num = teclado.nextInt();   // leemos el número

            if (num != 0) {
                if (esPrimo(num)) {
                    System.out.println(num + " es primo");
                } else {
                    System.out.println(num + " no es primo");
                }
            }

        } while (num != 0);   // si es 0, termina

        System.out.println("fin");
    }

    // -------- FUNCIÓN QUE DETERMINA SI UN NÚMERO ES PRIMO --------
    public static boolean esPrimo(int n) {

        if (n <= 1) {
            return false; // 0, 1 y negativos NO son primos
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;  // Tiene un divisor → no es primo
            }
        }

        return true; // No tiene divisores → es primo
    }
}
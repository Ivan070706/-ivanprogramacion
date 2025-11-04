package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in); 
		
		
		int numero;
		
		do {
			System.out.println("Dame un numero: ");
			numero = teclado.nextInt();
		
			if (numero>=0) {
				int cuadrado = numero * numero;
				System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
			}else {
				System.out.println("El numero que ha sido introducido es negativo");
			}
			
			
		}while (numero>=0);

	}

}

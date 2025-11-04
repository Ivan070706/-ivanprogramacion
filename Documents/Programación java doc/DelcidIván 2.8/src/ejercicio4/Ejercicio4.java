package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame un valor:");
		int numero = teclado.nextInt();
		int suma = 0;
		int contador = 1;
		while (numero != 0) {
			System.out.println("Dame un valor:");
			numero = teclado.nextInt();
			suma = numero + numero ;
			
		}
		System.out.println(numero > 0);
		System.out.println(suma / 2);

	}

}

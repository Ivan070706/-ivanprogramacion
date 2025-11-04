package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		System.out.println("dame un numero hasta el que llegara el programa desde el 1: ");
		int n= teclado.nextInt();
		
		for (int numero= 1 ; numero<= n; numero++) {
			System.out.println(numero);
		}

	}

}

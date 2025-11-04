package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce el valor de N: ");
		int n = teclado.nextInt();
		System.out.println("Introduce el valor de M: ");
		int m = teclado.nextInt();
		
		int[] array = new int[n];
		
		for (int num=0; num < n; num++) {
		array[num] = m;
		}
	System.out.println("El array contiene: ");
	for(int num=0; num<n; num++) {
		System.out.println("Elemento " + (num +1) +": " + array[num] );
	}

}
}
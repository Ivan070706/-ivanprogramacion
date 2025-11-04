package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce el valor de P: ");
		int p = teclado.nextInt();
		System.out.println("Introduce el valor de Q: ");
		int q = teclado.nextInt();
		if (p>q) {
			System.out.println("Error, el numero Q debe ser mayor que P");
		}else {
			int tamanyo = q - p  ;
			int[] valores = new int [tamanyo];
			for (int val=0;val<tamanyo; val++) {
				valores[val]= p + val;
			}
				System.out.println("El array tiene valores desde " + p + " hasta " + q );
				for (int val=0;val<tamanyo;val++) {
					System.out.println(valores[val] );
			}
		}
	}
}
		
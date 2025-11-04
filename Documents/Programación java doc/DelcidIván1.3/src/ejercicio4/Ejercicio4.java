package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double  dato;
		System.out.println("Dame un dato decimal ");
		dato = teclado.nextInt();
		
		double resultado = Math.ceil(dato);
		System.out.println("Redondeo hacia arriba " + dato + ":"
				+ resultado);
		
		double result1 = Math.floor(dato);
		System.out.println("Redondeo hacia abajo " + dato + ":" 
				+ result1);
		
		double result2 = Math.round(dato);
		System.out.println("Redondeo cercano de " + dato + ":"
				+ result2);
		
		

	}

}

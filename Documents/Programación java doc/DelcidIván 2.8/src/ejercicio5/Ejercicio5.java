package ejercicio5;

import java.io.InputStream;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	int contadorPositivo = 0;
	int contadorNegativo = 0;
	int contadorCeros = 0;
	double sumaPositivos = 0;
	double sumaNegativos = 0;
	
	for (int i=1; i <= 10; i++) {
		System.out.println("Introduce el numero: ");
		double num = teclado.nextDouble();
		
		if (num > 0) {
			sumaPositivos += num;
			contadorPositivo++;
		}else if(num< 0) {
			sumaNegativos += num;
			contadorNegativo++;
		}else {
			contadorCeros++;
		}
	}
	double mediaPositivos = 0;
	double mediaNegativos = 0;
	
	if (contadorPositivo > 0) {
		mediaPositivos = sumaPositivos / contadorPositivo;
	}
	if (contadorNegativo > 0) {
		mediaNegativos = sumaNegativos / contadorNegativo;
		
	}
	
	System.out.println("\nResultados: ");
	if (contadorPositivo > 0) {
		System.out.println("Media de numeros positivos " + mediaPositivos);
	}else {
		System.out.println("No se introdujeron numeros positivos.");
	}if (contadorPositivo > 0) {
		System.out.println("Media de numeros negativos " + mediaNegativos);
	}else {
		System.out.println("No se introdujeron numeros negativos.");

	}
	System.out.println("Cantidad de ceros introducidos: " + contadorCeros);
	}


}

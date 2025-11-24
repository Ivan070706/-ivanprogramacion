package ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
	Scanner teclado=new Scanner (System.in);
		System.out.println("Dime los numeros de tu DNI(Sin la letra): ");
		int numeroDni=teclado.nextInt();
		
		char letra = letraDni(numeroDni);
		
		System.out.println("La letra de tu DNI es----" + letraDni(numeroDni) + "----");
		
	}
	// Enlacamos el numero de dni con una letra
	public static char letraDni(int numero) {
		char[]letras= {
				'T','R','W','A','G','M','Y','F','P','D','X','B','N',
				'J','Z','S','Q','V','H','L','C','K','E'
		};
		int resto= numero%23;
		return letras[resto];
		
	}

}

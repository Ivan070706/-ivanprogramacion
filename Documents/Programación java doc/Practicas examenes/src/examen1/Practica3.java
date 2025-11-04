package examen1;

import java.util.Scanner;

public class Practica3 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		
		System.out.println("Dame un numero decimal: ");
		double numero= teclado.nextDouble();
		 double numeroCeil = Math.ceil(numero);
		 double numeroFloor= Math.floor(numero);
		 double numeroRound= Math.round(numero);
		 
		 System.out.println("Tras hacer calculos con tu numero sabemos que"
		 		+ " el Math.ceil es: " + numeroCeil + " El Math.floor es: " + numeroFloor +
		 		" y por ultimo el Math.round es: " + numeroRound);
		
	

	}

}

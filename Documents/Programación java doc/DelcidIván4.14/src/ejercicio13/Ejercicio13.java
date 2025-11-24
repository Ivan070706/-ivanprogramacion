package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.println("Dime cual es el precio sin descuento: ");
		double pNoDescuento=teclado.nextDouble();
		
		System.out.println("Dime el precio con descuento: ");
		double pDescuento=teclado.nextDouble();
		
		System.out.println("El descuento del precio ha sido de: " + averiguaDescuento(pDescuento,pNoDescuento ) + "% ");
		

	}
	public static double averiguaDescuento (double pdes, double pndes) {
		
		double descuento= (((pndes-pdes)/(pndes))*100);
		
		
		return descuento;
	}
	
	

}

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		
		System.out.println("Introduce precio 1:");
		double  valor1=teclado.nextDouble();
		System.out.println("Introduce precio 2:");
		double  valor2=teclado.nextDouble();
		System.out.println("Introduce precio 3:");
		double  valor3=teclado.nextDouble();
		System.out.println("Introduce precio 4:");
		double  valor4=teclado.nextDouble();
		System.out.println("Introduce precio 5:");
		double  valor5=teclado.nextDouble();
		
		System.out.println("El valor mas IVA del 1: " + precioConIVA(valor1));
		System.out.println("El valor mas IVA del 2: " + precioConIVA(valor2));
		System.out.println("El valor mas IVA del 3: " + precioConIVA(valor3));
		System.out.println("El valor mas IVA del 4: " + precioConIVA(valor4));
		System.out.println("El valor mas IVA del 5: " + precioConIVA(valor5));
	}
     public static double precioConIVA(double precio) {
		
    	 double valorFinal = (precio*0.21)+precio;
    	 
    	 return valorFinal; 
     }
}

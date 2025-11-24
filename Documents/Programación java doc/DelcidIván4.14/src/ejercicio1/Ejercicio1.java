package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		System.out.println("Dame un numero decimal (A):");
		double a=teclado.nextDouble();
		
		System.out.println("Dame un numero decimal (B): ");
		double b=teclado.nextDouble();
		
		System.out.println(multiplicacion(a,b));

	}
      public static double  multiplicacion(double a,double b) {
    	   double multi = (a*b);
    	   return multi ;
      }
}

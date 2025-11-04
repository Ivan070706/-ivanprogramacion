package examen1;

import java.util.Scanner;

public class Practica4 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		
		System.out.println("Dame tu nombre: ");
		String nombre= teclado.nextLine();
		
		System.out.println("Dame tu edad: ");
		int edad = teclado.nextInt();
		
		System.out.println("Dime tu nota academica(en decimales):");
		double notaAcademica= teclado.nextDouble();
		
		if (edad< 18 && notaAcademica < 7 ) {
			System.out.println(nombre + " ,lo sentimos, no ha sido admitido"
					+ " en el curso ya que no cumple los requisitos mínimos");
		}else {
			System.out.println( nombre + " , usted ha sido admitido en el curso, cumple las"
					+ "condiciones requeridas");
		}

	}

}

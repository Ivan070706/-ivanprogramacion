package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime la primera nota: ");
		double nota1 = teclado.nextDouble();
		
		System.out.println("Dime la segunda nota: ");
		double nota2 = teclado.nextDouble();
		
		System.out.println("Dime la tercera nota: ");
		double nota3 = teclado.nextDouble();

		System.out.println("Dime la ultima nota: ");
		double nota4 = teclado.nextDouble();
		
		double suma = (nota1 + nota2 + nota3 + nota4 );
		
		double media = (suma / 4);
		System.out.println("Nota media: " +  media);
		
		double redondeo = media;
		double redondeoUp = Math.ceil(media);
		System.out.println("El redondeo hacia arriba es: " + redondeoUp );
		
		double redondeoDown = Math.floor(media);
		System.out.println("El redondeo hacia abajo es: " + redondeoDown );
		
		if (media >= 8) {
			System.out.println("Puede usted acceder a los estudios superiores");
		}else {
			System.out.println("La media de sus notas no ha sido lo sufidientemente alta como para"
					+ " cursar los estudios superiores");
		}
	}

}

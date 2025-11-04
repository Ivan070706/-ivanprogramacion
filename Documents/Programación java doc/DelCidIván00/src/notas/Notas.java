package notas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int aciertos;
		System.out.println("Número de aciertos");
		aciertos = teclado.nextInt();
		
		int fallos;
		System.out.println("Número de fallos");
		fallos = teclado.nextInt();
		
		if (aciertos + fallos >= 21) {
		System.out.println("Datos erróneos");
		}else {
			System.out.println("Datos válidos");
		
		double restaFallos = (fallos * 0.5);
		double restaNota = (aciertos - restaFallos);
		double notaFinal = (restaNota / 2);
		System.out.println("Tu nota es: " + notaFinal);
		
		if (notaFinal < 5.0) {
			System.out.println("Insuficiente");
		}else if (notaFinal < 6.0) {
			System.out.println("Bien");
		}else if (notaFinal < 7.0) {
			System.out.println("Notable");
		}else if (notaFinal < 8.0) {
			System.out.println("Sobresaliente");
		}
		}
	}

}

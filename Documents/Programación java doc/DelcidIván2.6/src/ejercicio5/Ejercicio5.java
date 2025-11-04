package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		String nombre;
		System.out.println("Dame tu nombre: ");
		nombre = teclado.nextLine();
		
		String apellido;
		System.out.println("Dame tus apellidos: ");
		apellido = teclado.nextLine();
		
		String cicloFormativo;
		System.out.println("Que Ciclo Formativo Cursas actualmente: ");
		cicloFormativo = teclado.nextLine();
		
		int notaAcademica;
		System.out.println("Nota Academica: ");
		notaAcademica = teclado.nextInt();
		
		if (notaAcademica < 5.0) {
			System.out.println("Insuficiente");
		}else if (notaAcademica < 6.0) {
			System.out.println("Bien");
		}else if (notaAcademica < 7.0) {
			System.out.println("Notable");
		}else if (notaAcademica < 8.0) {
			System.out.println("Sobresaliente");
		}
	}

	

}


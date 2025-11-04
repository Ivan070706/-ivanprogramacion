package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

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
		
		double notaAcademica;
		System.out.println("Nota Academica: ");
		notaAcademica = teclado.nextInt();
		
		if (notaAcademica < 0 && notaAcademica > 10) {
			System.out.println(" La nota académica indicada es incorrecta");
		}else {
			System.out.println(" La nota académica indicada es correcta");
		}
		
		if (notaAcademica < 5) {
			System.out.println("Insuficiente");
		}else if (notaAcademica < 6) {
			System.out.println("Bien");
		}else if (notaAcademica < 7) {
			System.out.println("Notable");
		}else if (notaAcademica < 8) {
			System.out.println("Sobresaliente");
		}else if (notaAcademica == 10) {
			System.out.println("Matricula de Honor");
		
		}
	}

}

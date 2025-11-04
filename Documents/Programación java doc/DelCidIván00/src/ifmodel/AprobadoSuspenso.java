package ifmodel;

import java.util.Scanner;

public class AprobadoSuspenso {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		
		 System.out.println("Dime cual es tu nota: "); 
		 double nota = teclado.nextDouble();
		 
		 if (nota >= 0 && nota <= 10){  // la nota es valida
		 
		 if (nota >= 5) {
			 System.out.println("Aprobado");
		 }else {
			 System.out.println("Suspenso");
		 }

	}else { 
		System.out.println("NOTA ERRONEA");
	}

	}
}

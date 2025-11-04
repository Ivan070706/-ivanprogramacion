package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Dime tu nota: ");
	int numero  = teclado.nextInt();
	
	switch(numero) {
	case 0:
		System.out.println("Insuficiente");
		break;
	case 1:
		System.out.println("Insuficiente");
		break;
	case 2:
		System.out.println("Insuficiente");
		break;
	case 3:
		System.out.println("Insuficiente");
		break;
	case 4:
		System.out.println("Insuficiente");
		break;
	case 5:
		System.out.println("Suficiente");
		break;
	case 6:
		System.out.println("Bien");
		break;
	case 7,8:
		System.out.println("Notable");
		break;
	case 9, 10:
		System.out.println("Sobresaliente");
	    break;
		default:
			System.out.println("La nota introducida ha sido incorrecta");
	}

	}

}

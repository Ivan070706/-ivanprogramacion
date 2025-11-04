package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		String nombre;
		System.out.println("Dame tu nombre: ");
		nombre = teclado.nextLine();
		
		String apellidos;
		System.out.println("Dame tus apellidos: ");
		apellidos = teclado.nextLine();
		
		int importeGastado1;
		System.out.println("Cuanto fue tu primera compra: ");
		importeGastado1 = teclado.nextInt();
		
		int importeGastado2;
		System.out.println("Cuanto gastaste en la segunda compra: ");
		importeGastado2 = teclado.nextInt();
		
		int importeGastado3;
		System.out.println("Cuanto gastaste en la tercera compra: ");
		importeGastado3 = teclado.nextInt();
		
		int importeGastado4;
		System.out.println("Y en la cuarta compra cual fue el importe: ");
		importeGastado4 = teclado.nextInt();
		
		int sumaTotal = ((importeGastado1 + importeGastado2 + importeGastado3 + importeGastado4)/ 4 );
		System.out.println("Importe Medio: " + sumaTotal);
		
		if (sumaTotal >= 300){
		System.out.println("Enhorabuena!! Usted consiguió el bono de descuento de 50 euros.");
	}else {
		System.out.println("Lo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone descuento.");
		
	}
		

	}

}

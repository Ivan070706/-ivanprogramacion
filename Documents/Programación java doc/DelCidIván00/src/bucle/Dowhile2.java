package bucle;

import java.util.Scanner;

public class Dowhile2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame el Inicio: ");
		int inicio = teclado.nextInt();
		
		System.out.println("Dame el Inicio: ");
		int fin = teclado.nextInt();
		
	int contador;
	
	contador = inicio;
	
	if (inicio<=fin) {// secuencia creciente
		contador = inicio;
		do {
			System.out.print(" " + contador);
			contador = (contador +1) * 3;
		}while ( contador <= fin);
	}else {
		contador = inicio;
		do {
			
			System.out.print(" " + contador);
			contador = (contador -1) /3;
			
		}while (contador >= fin);
		
		
		
		System.out.print("la secuencia es desde " + inicio);
		System.out.print(" hasta "+ fin );
	
		}
	}
}

	

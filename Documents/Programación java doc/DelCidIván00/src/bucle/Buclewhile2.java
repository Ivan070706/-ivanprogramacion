package bucle;

import java.util.Scanner;

public class Buclewhile2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Dame el Inicio: ");
		int inicio = teclado.nextInt();
		
		System.out.println("Dame el Inicio: ");
		int fin = teclado.nextInt();
	
		int contador = inicio;
		
		
		while (fin>= contador) {
			System.out.println(" " + fin );
			fin = fin + 1;
		}
		
	while  (contador <= fin)  {
		System.out.println(" " + contador);
		 contador = contador + 1;
		}
		System.out.print("la secuencia es desde " + inicio);
		System.out.print(" hasta "+ fin );

	}

}

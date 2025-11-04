/*
 * 
 */

package bucle;

import java.util.Scanner;

public class Dowhile extends Bucleswhile {

	public static void main(String[] args) {
Scanner teclado = new Scanner (System.in);
		int numero,suma = 0;
		int contador = 0;
      do {
    	  System.out.println("Dame un numero: (0 para terminar)");
    	  contador = contador + 1;
    	  numero = teclado.nextInt();
    	  suma = suma + numero;
      }while (numero != 0);
    	  
      contador = contador -1; // resto 1 a contador para no contar el 0
      System.out.print("La suma es: " + suma); 
      System.out.print(" y la cantidad de numeros es: " + contador);
	}

}

package bucle;

import java.util.Scanner;

public class Buclewhiledowhile3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int numero, numero2;
		
		System.out.println("Dame un número: ");
		numero = teclado.nextInt();
        System.out.println("Dame otro número: ");
        numero2 = teclado.nextInt();
        int contador;
        contador = numero;
       // do {
        	if (numero != numero2) {
        		contador = (contador + 1) /3;
        	}else {
        		contador = (contador + 1) * 3;
        	}
        //}while //
	
        System.out.println("" + contador);
	}
     
}

package bucle;

import java.util.Scanner;

public class Bucleswhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int num, suma , contador;
		System.out.println("Dame un número: ");
		num = teclado.nextInt();
		contador = 1;
		suma = num;
       while (num != 0  && contador!=8) {
    	   System.out.println("Dame un número: ");
    	   num = teclado.nextInt();
    	   contador = contador + 1; //contador++   //contador
    	   suma = suma + num; //acumulador
       }
       System.out.println("La suma es: " + suma);
	}

}

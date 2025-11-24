package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		
		System.out.println("Dame un numero: ");
		int numero=teclado.nextInt();
               
		System.out.println(tablaMultiplicar(numero));
	}
     public static int tablaMultiplicar(int valor) {
    	 // aqui no hace falta vector porque no es necesario guardar nada sino simplemente 
    	 // multiplicar el numero hasta hacer la tabla del numero.
		int numero = valor*1;
		int numero2= valor*2;
		int numero3= valor*3;
		int numero4= valor*4;
		int numero5= valor*5;
		int numero6= valor*6;
		int numero7= valor*7;
		int numero8= valor*8;
		int numero9= valor*9;
		int numero10= valor*10;
		
		System.out.println(numero);
		System.out.println(numero2);
		System.out.println(numero3);
		System.out.println(numero4);
		System.out.println(numero5);
		System.out.println(numero6);
		System.out.println(numero7);
		System.out.println(numero8);
		System.out.println(numero9);
		System.out.println(numero10);
		return 0;
    	 
     }
}

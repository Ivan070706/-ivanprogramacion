package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		System.out.println("Dime el tamaño que va a tener el array: "); // pedimos el tamaño
		int tamanyo=teclado.nextInt();
		
		int[]numeros=new int [tamanyo];// instanciamos el array
		
		numeros=rellenaArray(numeros);// llamamos a la funcion
		
		for(int i=0;i<numeros.length;i++) {// recorremos el array rellenandolo con numeros 
			System.out.print(numeros[i] + "  "); // lo mostramos añadiendole un espacio 
		}
	}
	public static int[] rellenaArray(int[] valor) { //Creamos la funcion
		
			 for (int n=0;n<valor.length; n++) {// recorremos el array
				 valor[n]=(int)(Math.random()*100);// le damos valores aleatorios a dicho array
			 }	
			 
			 return valor;// devolvemos valor a la funcion main 
			
		}
	}



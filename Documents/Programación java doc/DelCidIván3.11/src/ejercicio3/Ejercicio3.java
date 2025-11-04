package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		
		System.out.println("Dame el numero de filas (N): ");
		int n=teclado.nextInt();
		
		System.out.println("Dame el numero de columnas (M): ");
		int m=teclado.nextInt();
		
		int[][]matriz= new int[n][m];
	    int numeroValores= (n*m);
	    System.out.println("dame " + numeroValores + " valores para completar la tabla:");
	    for (int filas =0;filas<n;filas++) {
	    	for (int columnas=0;columnas<m;columnas++) {
	    		System.out.println("[" + filas + "]" + "[" + columnas +"]");
	    		matriz[filas][columnas] = teclado.nextInt();
	    	}
	    	
	    }
		int mayoresCero=0;
		int menoresCero=0;
		int igualesCero=0;
		
		 for (int filas =0;filas<n;filas++) {
			 for (int columnas=0;columnas<m;columnas++) {
				 if (matriz[filas ][columnas]<0) {
					 menoresCero++;
				 }if (matriz[filas ][columnas]>0) {
					 mayoresCero++;
				 }else {
					 igualesCero++;
				 }
				 System.out.println("Cantidad de numeros mayores de 0: " + mayoresCero);
				 System.out.println("Cantidad de numeros menores de 0: " + menoresCero);
				 System.out.println("Cantidad de numeros iguales de 0: " + igualesCero);
			 }
			
		 }
		
	}

}

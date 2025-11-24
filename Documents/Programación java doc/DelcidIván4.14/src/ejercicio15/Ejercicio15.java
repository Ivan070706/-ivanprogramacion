package ejercicio15;

import ejercicio16.Ejercicio16;

public class Ejercicio15 {

	public static void main(String[] args) {
		int []numeros=new int [50];
      
		valoresArrayAleatorio(numeros);
		
		System.out.println(" -----Contenido del array----- ");
		for(int num:numeros) {
		System.out.print(num + " ");
		}
		System.out.println("La suma de los valores del array es:" +sumaValores(numeros));
		System.out.println("La media de los valores es: " + mediaValores(numeros));
	}
	// llenamos el array de valores aleatorios
	public static void valoresArrayAleatorio(int[]val) {
		 for (int n=0;n<val.length; n++) {
			 val[n]=(int)(Math.random()*50)+50;
		 }	
		
	}
	// sumamos los valores
	public static int sumaValores(int[]val) {
		int suma = 0;
		 for (int n=0;n<val.length; n++) {
			return suma += val[n];
	}
		 return suma;
	}
	// hacemos la media de los valores
	public static double mediaValores(int [] val) {
		  int suma = sumaValores(val);  
	        return (double) suma / val.length; 
	}
}

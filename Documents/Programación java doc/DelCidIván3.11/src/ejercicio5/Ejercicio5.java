package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		
		System.out.println("Dime el numero de personas: ");
		int n= teclado.nextInt();
		
	double [][]brechaSalarial = new double   [n][2];
	  for (int genero=0;genero<0;genero++) {
		  System.out.println("Persona " + (genero + 1) + " :");
		  System.out.println("Introduzca el numero para saber el genero(0 para varón) o (1 para mujer");
		  brechaSalarial[genero][0] = teclado.nextInt();
		
		  while (brechaSalarial[genero][0] !=0 && brechaSalarial[genero][0]!=1) {
			  System.out.println("Error, el numero no es correcto,Introduce 0 para varón o 1 para mujer");
			  brechaSalarial[genero][0] = teclado.nextInt();
		  }
		  System.out.println("Introduzca sueldo: ");
		   brechaSalarial[genero][1] = teclado.nextInt();
		
	 
	  }
	  double sumaHombres=0;
	  double sumaMujeres=0;
	  int contHombres=0;
	  int contMujeres=0;
	  for(int genero=0;genero<n;genero++) {
		  if (brechaSalarial[genero][0]==0) {
			  sumaHombres+=brechaSalarial[genero][1];
			  contHombres++;
		  }else {
			  sumaMujeres+=brechaSalarial[genero][1];
			  contMujeres++;
		  }
		  double mediaHombres=(contHombres<0)?(sumaHombres/contHombres):0;
		  double mediaMujeres=(contMujeres<0)?(sumaMujeres/contMujeres):0;
		  
		  System.out.println("----RESULTADOS----");
		  System.out.println("Sueldo medio hombres: " + mediaHombres);
		  System.out.println("Sueldo medio mujeres: " + mediaMujeres);
	  
		  if (mediaMujeres < mediaHombres) {
			  System.out.println("Existe brecha salarial hacia la mujer ya que los varones cobran más");
			  
		  }if (mediaHombres<mediaMujeres) {
			  System.out.println("Existe brecha salarial hacia el varon  ya que las mujeres cobran más");
		  }else {
			  System.out.println("No existe brecha salarial debido a que los hombres y las mujeres cobran lo mismo");
		  }
	  }

	}
	
}

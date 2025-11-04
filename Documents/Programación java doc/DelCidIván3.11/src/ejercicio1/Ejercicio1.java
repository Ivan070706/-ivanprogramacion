package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
	  int[][]matriz= new int [5][5];
	  int numero=1;
	  
	  for(int val1=0;val1<5;val1++) {// creamos la matriz del 1 a 25
		  for (int val2=0;val2<5;val2++) {
			  matriz[val1][val2]=	numero;
			  numero++;
			  
		  }
		
	  }

			System.out.println("Matrix 5x5");
			  for(int val1=0;val1<5;val1++) {
				  for (int val2=0;val2<5;val2++) {
					  System.out.printf("%3d ",matriz[val1][val2]);
				  }
				  System.out.println();
			  }
					
				
			}
		}
	
		

	



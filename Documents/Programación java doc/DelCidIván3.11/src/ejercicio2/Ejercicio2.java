package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		 int[][]matriz= new int [10][10];
		 
		  
		  for(int val1=0;val1<10;val1++) {
			  for (int val2=0;val2<10;val2++) {
				  matriz[val1][val2]=	(val1+1)*(val2+1);
				  
	}
  }
		  for(int val1=0;val1<10;val1++) {
			  for (int val2=0;val2<10;val2++) {
				  System.out.printf("%3d ", matriz[val1][val2]);
			  }
			  System.out.println();
		  }
}
}

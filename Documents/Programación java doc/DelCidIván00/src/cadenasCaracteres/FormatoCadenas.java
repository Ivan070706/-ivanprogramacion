package cadenasCaracteres;

public class FormatoCadenas {

	public static void main(String[] args) {
		String nombre= "Juan";
		int edad =34;
		double altura = 1.87;
		double peso = 75.4;
		
		
		
		String cadena = String.format("Nombre: %s ** Edad: %d ** Altura: %.2f ** Peso: %.1f ",nombre, edad, altura,peso);// el %f = 6 decimales o %.2f = 2 decimales... Y el %1f=redondea el valor 
		System.out.println(cadena);
		
		System.out.printf("Nombre: %s // Edad: %d ",nombre, edad);//igual que el de arriba pero ahorras un paso 
		
		
	}

}

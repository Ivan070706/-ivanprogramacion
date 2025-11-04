package ejercicio4;

public class Ejercicio4 {
      public enum Tamaño {PEQUEÑO,MEDIANO,GRANDE,EXTRAGRANDE}
	public static void main(String[] args) {
		Tamaño tamañoActual = Tamaño.PEQUEÑO;
		Tamaño tamañoSiguiente1 = Tamaño.MEDIANO;
		Tamaño tamañoSiguiente2 = Tamaño.GRANDE;
		Tamaño tamañoSiguiente3 = Tamaño.EXTRAGRANDE;
		
		System.out.println("Primero: " + tamañoActual);
		System.out.println("Segundo: " + tamañoSiguiente1);
		System.out.println("Tercero: " + tamañoSiguiente2);
		System.out.println("Cuarto: " + tamañoSiguiente3);
		
		
 
	}

}

package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		System.out.println("Dame la altura del rectangulo:");
		double alto=teclado.nextDouble();
		
		System.out.println("Dame el ancho del rectangulo: ");
		double ancho=teclado.nextDouble();
		
		System.out.println(" El perimetro del rectangulo es: " + perimetroRectangulo(alto,ancho));
		System.out.println(" El área del rectangulo es: " + areaRectangulo(alto,ancho));

	}
	public static double perimetroRectangulo(double ancho, double alto) {
		double perimetro=2*(alto+ancho);
		return perimetro;
		}
    public static double areaRectangulo(double ancho, double alto) {
    	double area= alto*ancho;
    	return area;
    }
}

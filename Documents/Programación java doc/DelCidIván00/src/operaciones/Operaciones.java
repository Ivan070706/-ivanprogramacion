package operaciones;

public class Operaciones {

	public static void main(String[] args) {
		int dato1 ;
		double dato2;
		int dato3;
		
		dato1 = 5;
		dato2 = 3.0;
		dato3 = 5;
		
		int suma;
		suma = dato1+dato3;
		System.out.println("la suma es: " + suma);
		
		int resta;
		resta = dato1-dato3;
		System.out.println("la resta es: " + resta);
		
		int multi;
		multi = dato1*dato3;
		System.out.println("la multiplicación es: " + multi);
		
		double division;
		division = dato1/dato2;
		System.out.println("la división es: " + division);
		
		double modulo;
		modulo = dato1%dato3;
		System.out.println("el modulo es: " + modulo);
		
		int dato1mas, dato1menos;
		dato1mas = dato1++; // dato1mas = dato1 + 1
		dato1menos = dato1--; //dato1menso = dato1 -1
		
		System.out.println("Incremental posterior " + ++dato1);
		
		dato1 = dato1 + 1;
		System.out.println(dato1);
		
		boolean distinto = dato1 != dato3;
		System.out.println(distinto);

	}

}

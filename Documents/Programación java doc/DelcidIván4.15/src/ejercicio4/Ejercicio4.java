package ejercicio4;

public class Ejercicio4 {

	public static void main(String[] args) {
		System.out.println(accesoBecaUsa(25, 9.5, 18000, true)); // Apto
        System.out.println(accesoBecaUsa(32, 7.0, 19000, true)); // No apto (edad > 30)
        System.out.println(accesoBecaUsa(22, 4.5, 15000, true)); // No apto (nota < 5)
        System.out.println(accesoBecaUsa(28, 7.5, 25000, true)); // No apto (renta >= 20.000)
        System.out.println(accesoBecaUsa(26, 7.0, 15000, false)); // No apto (nivel idioma false)

	}
	public static String accesoBecaUsa(int edad, double notaAcademica, double renta, boolean nivelIdioma) {
        // Comprobamos si el nivel de idioma es el requerido
        if (!nivelIdioma) {
            return "No apto";
        }

        // Comprobamos si la edad es mayor a 30
        if (edad > 30) {
            return "No apto";
        }

        // Si no cumple las condiciones anteriores, analizamos la nota académica
        if (notaAcademica > 9) {
            return "Apto";
        } else if (notaAcademica < 5) {
            return "No apto";
        } else if (notaAcademica >= 6 && notaAcademica <= 8) {
            // Comprobamos la renta si la nota está entre 6 y 8
            if (renta < 20000) {
                return "Apto";
            } else {
                return "No apto";
            }
        }

        // Si no entra en ninguna de las condiciones anteriores
        return "No apto";

	}
}

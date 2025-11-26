package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		  // Ejemplo de llamada al método con el mes 2 (Febrero)
        System.out.println(indicaMesDias(2));  // Salida: "Febrero, 28 días"
        
        // Otro ejemplo con un mes fuera de rango
        System.out.println(indicaMesDias(15)); // Salida: "El mes es incorrecto."

	}
	public static String indicaMesDias(int mes) {
        // Comprobamos si el mes está entre 1 y 12
        if (mes < 1 || mes > 12) {
            return "El mes es incorrecto.";
        }

        // Declaramos el nombre del mes y el número de días en cada mes
        String mesNombre = "";
        int dias = 0;

        // Determinamos el mes y el número de días según el mes
        switch (mes) {
            case 1:
                mesNombre = "Enero";
                dias = 31;
                break;
            case 2:
                mesNombre = "Febrero";
                dias = 28; // Asumimos que no es un año bisiesto
                break;
            case 3:
                mesNombre = "Marzo";
                dias = 31;
                break;
            case 4:
                mesNombre = "Abril";
                dias = 30;
                break;
            case 5:
                mesNombre = "Mayo";
                dias = 31;
                break;
            case 6:
                mesNombre = "Junio";
                dias = 30;
                break;
            case 7:
                mesNombre = "Julio";
                dias = 31;
                break;
            case 8:
                mesNombre = "Agosto";
                dias = 31;
                break;
            case 9:
                mesNombre = "Septiembre";
                dias = 30;
                break;
            case 10:
                mesNombre = "Octubre";
                dias = 31;
                break;
            case 11:
                mesNombre = "Noviembre";
                dias = 30;
                break;
            case 12:
                mesNombre = "Diciembre";
                dias = 31;
                break;
        }

        // Devolvemos el mensaje con el mes y el número de días
        return mesNombre + ", " + dias + " días";
    }

}

package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		 // Ejemplo de llamada al método
        double precioFinal = productosDescuento(15.5, 3, 20);  // Precio por unidad 15.5, 3 unidades, 20% de descuento

	}
	//Calculo descuento total 
	 public static double productosDescuento(double precio, int cantidad, int descuento) {
	        // Calcular el precio sin descuento
	        double precioTotal = precio * cantidad;
	        
	        // Calcular el descuento a aplicar
	        double descuentoAplicado = precioTotal * (descuento / 100.0);
	        
	        // Calcular el precio final con descuento
	        double precioConDescuento = precioTotal - descuentoAplicado;
	        
	        // Imprimir el mensaje
	        System.out.println("Usted ha adquirido " + cantidad + " productos, a un precio de " + precio + " euros la unidad.");
	        System.out.println("El precio a pagar es " + precioTotal + " euros, pero al aplicarle el descuento del " + descuento + "% el precio final a pagar es: " + precioConDescuento + " euros.");
	        
	        // Retornar el precio final con descuento
	        return precioConDescuento;

	 }
}

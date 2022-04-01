/*2-. Modelar una clase CalculoIva para realizar el cálculo del IVA. La clase deberá de tener dos métodos, el primero que
calcule el IVA al precio de un artículo el cual deberá de recibir como parámetros el precio sin IVA y el porcentaje del IVA
a aplicar y el segundo que reciba como parámetro el precio del articulo con IVA y el porcentaje del IVA y que devuelva el
precio del artículo sin IVA.*/
package Ejercicios;

import java.util.Scanner;

public class CalculoIva {
    
    public static double obtenerIva( double precio1){
        double IVA;
        IVA = precio1 * 0.19;
    return IVA;
    }
    
    public static double articuloSinIVA( double precioArticulo_Iva){
        double precio;
        precio = precioArticulo_Iva / 0.19;
    return precio;
    }
    public static void main(String[] args) {
        double precio_articulo, IVA, precio;
        double precioArticulo_Iva = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el precio total del articulo: ");
        precio_articulo = leer.nextDouble();
        
        IVA = obtenerIva(precio_articulo);
        
        precio = articuloSinIVA(precioArticulo_Iva);
        
        System.out.println("El precio del articulo con Iva incluido es: " + (precio_articulo + IVA));
        
        System.out.println("Digite el precio del articulo ya con IVA: ");
        precioArticulo_Iva = leer.nextDouble();
        
        System.out.println("El precio del articulo sin Iva es: " + (precioArticulo_Iva + precio));
    }
}
    

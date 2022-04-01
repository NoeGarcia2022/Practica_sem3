/*1-. Modelar una clase Casa con los atributos número de casa, numero de pasaje y 
nombre de la calle. El número de la casa debe ser alfanumérico para contemplar las 
casas que tengan números como “27A”). Cuando la casa se crea se asigna tanto el número 
de la casa, el número de pasaje y la calle. La clase tiene que tener definido un método 
para imprimir los valores asignados.*/
package Ejercicios;

public class casa {
    private String numero_casa="27A", nombre_calle="Calle San Antonio Arriba";
    int numero_pasaje=1256;

    public String getNumero_casa() {
        return numero_casa;
    }

    public void setNumero_casa(String numero_casa) {
        this.numero_casa = numero_casa;
    }

    public String getNombre_calle() {
        return nombre_calle;
    }

    public void setNombre_calle(String nombre_calle) {
        this.nombre_calle = nombre_calle;
    }

    public double getNumero_pasaje() {
        return numero_pasaje;
    }

    public void setNumero_pasaje(int numero_pasaje) {
        this.numero_pasaje = numero_pasaje;
    }
    
    public String impre_Casa()
    {
        String info = "";
        info += "El numero de la casa es: " + this.numero_casa + "\n";
        info += "El numero de pasaje de la casa es: " + this.numero_pasaje + "\n";
        info += "El nombre de la calle es: " + this.nombre_calle + "\n";
    return info;
    }
    
    public casa(){
    
    }
    
    public static void main(String[] args) {
        casa casa1 = new casa();
        
        System.out.println("******* Impresion de valores asignados *******" + "\n");
        System.out.println("" + casa1.impre_Casa());
    }
}

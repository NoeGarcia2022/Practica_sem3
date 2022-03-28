package Demostracion;

import java.util.Scanner;
public class Demo_ejemplo {
    public static void main(String[] args) {
        //Estudiante objeto = new Estudiante("HOLA", "HOLA");
        //Estudiante objeto1 = new Estudiante(1, 1, "A", "B", "c");
        int carnet, edad;
        String nombres, apellidos, direccion;
        
        Scanner leer = new Scanner(System.in);
        Estudiante objeto = new Estudiante();
        
        System.out.println("Digite el numero de carnet ");
        objeto.setCarnet(Integer.parseInt(leer.nextLine()));
        
        System.out.println("Ditite el nombre del estudiante: ");
        objeto.setNombres(leer.nextLine());
        
        System.out.println("Digit los apellidos del estudiante: ");
        objeto.setApellidos(leer.nextLine());
        
        System.out.println("Digite la direccion del estudiante: ");
        objeto.setDireccion(leer.nextLine());
        
        System.out.println("Digite la edad del estudiante: ");
        objeto.setEdad(leer.nextInt());
        
        System.out.println("Digite la nota 1: ");
        objeto.setNota1(leer.nextDouble());
        
        System.out.println("Digite la nota 2: ");
        objeto.setNota2(leer.nextDouble());
        
        System.out.println("Digite la nota 3: ");
        objeto.setNota3(leer.nextDouble());
        
        //System.out.println(""+objeto.getNombres());
        //System.out.println(""+objeto.info_students());
        //System.out.println("La direccion es: " + objeto.getDireccion());
        //System.out.println(""+objeto.info_students(objeto));
        //System.out.println(""+objeto.info_students(objeto.getCarnet(), objeto.getEdad(), objeto.getNombres(), objeto.getApellidos(), objeto.getDireccion()));
        
        /*System.out.println("");
        objeto.Guardar_students();
        System.out.println("");
        objeto.Eliminar_students();
        System.out.println("");
        objeto.Actualizar_students();
        System.out.println("");
        objeto.Consultar_students();*/
        
        System.out.println(""+objeto.info_students());
        System.out.println("El promedio es: " + objeto.promedio());
        
    }
}

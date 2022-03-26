package Desarrollo.encapsulamiento.herencia;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RegistroEstudiante {
    public static void main(String[] args) {
        Estudiante est = new Estudiante(); //Objeto de la clase Estudiante
        //Agregar la clase respectiva para la lectura desde teclado
        BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
        
        try {
            //Ingreso de los respectivos valores
            System.out.println("Carnet del Estudiante: ");
            long carnet = Long.parseLong(leer.readLine());
            System.out.println("Nombres del Estudiante: ");
            String nombres = leer.readLine();
            System.out.println("Apellidos del Estudiante: ");
            String apellidos = leer.readLine();
            
            
            //Asignando los valores a cada atributo
            est.setCarnetEstudiantes(carnet);
            est.setNombreEstudiante(nombres);
            est.setApellidosEstudiante(apellidos);
            
            //Recuperacion de datos
            System.out.println("<<<Recuperacion valores>>>");
            System.out.println("Carnet: " + est.getCarnetEstudiantes());
            System.out.println("Nombres: " + est.getNombreEstudiante());
            System.out.println("Apellidos: " + est.getApellidosEstudiante());
        }catch(Exception e){
            System.out.println(e.getMessage());
        
        }
    }
}

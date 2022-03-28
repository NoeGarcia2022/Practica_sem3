package Demostracion;

public class Estudiante extends Notas{
    int carnet;
    int edad;
    String nombres;
    String apellidos;
    String direccion;
    
   
    
    public Estudiante(){
        
    }

    public Estudiante(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Estudiante(int carnet, int edad, String nombres, String apellidos, String direccion) {
        this.carnet = carnet;
        this.edad = edad;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String info_students(){
        String info = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n";
        info += "El nombre del estudiantes es: " + this.nombres + " " + this.apellidos + "\n";
        info += "La edad del estudiante es: " + this.edad + "\n";
        info += "La direccion del estudiante es: " + this.direccion + "\n";
        info += "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n";
        return info;
    }
    
    public String info_students(Estudiante obj){
        String info = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n";
        info += "El nombre del estudiantes es: " + obj.getNombres() + " " + obj.getApellidos() + "\n";
        info += "La edad del estudiante es: " + obj.getEdad() + "\n";
        info += "La direccion del estudiante es: " + obj.getDireccion() + "\n";
        info += "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n";
        return info;
    }
    
    public String info_students(int carnet, int edad, String nombres, String apellidos, String direccion){
        String info = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n";
        info += "El nombre del estudiantes es: " + nombres + " " + apellidos + "\n";
        info += "La edad del estudiante es: " + edad + "\n";
        info += "La direccion del estudiante es: " + direccion + "\n";
        info += "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n";
        return info;
    }
    
    
    public void Guardar_students(){
        //Instrucciones de conexion a la base de datos
        System.out.println("Registro guardado...");
    }
    
    public void Eliminar_students(){
        System.out.println("Registro eliminado...");
    }
    
    public void Actualizar_students(){
        System.out.println("Registro actualizado...");
    }
    
    public void Consultar_students(){
        System.out.println("Listado de estudiantes...");
    }  
}

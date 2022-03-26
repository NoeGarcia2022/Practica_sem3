package Desarrollo.encapsulamiento.herencia;

public class Estudiante {
    private long carnetEstudiantes;
    private String nombreEstudiante;
    private String apellidosEstudiante;

    public long getCarnetEstudiantes() {
        return carnetEstudiantes;
    }

    public void setCarnetEstudiantes(long carnetEstudiantes) {
        this.carnetEstudiantes = carnetEstudiantes;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidosEstudiante() {
        return apellidosEstudiante;
    }

    public void setApellidosEstudiante(String apellidosEstudiante) {
        this.apellidosEstudiante = apellidosEstudiante;
    }
}

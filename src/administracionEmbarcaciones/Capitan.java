package administracionEmbarcaciones;

public class Capitan {

    private String nombre;
    private String apellido;
    private int matriculaDeNavegacion;

    public Capitan(String nombre, String apellido, int matriculaDeNavegacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaDeNavegacion = matriculaDeNavegacion;
    }

    public String obtenerDatosCapitan(){
        return "\nDatos del capitan: \nNombre: " + this.nombre +
                "\nApellido: " + this.apellido +
                "\nMatrucula de navegación: " + this.matriculaDeNavegacion;
    }
}

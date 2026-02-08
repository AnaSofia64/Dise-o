public class Empleado {

    private final String nombre;
    private final String cargo;
    private final String funcion;

    public Empleado(String nombre, String cargo, String funcion) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.funcion = funcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public String getFuncion() {
        return funcion;
    }
}

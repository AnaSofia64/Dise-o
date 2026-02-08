public class RegistroImpresion {
    private final String nombre;
    private final String cargo;
    private final String funcion;
    private final int paginas;

    public RegistroImpresion(String nombre, String cargo, String funcion, int paginas) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.funcion = funcion;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Cargo: " + cargo + "\n" +
               "Función: " + funcion + "\n" +
               "Páginas impresas: " + paginas + "\n" +
               "--------------------";
    }

    public int getPaginas() {
        return paginas;
    }
}

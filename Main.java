import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Impresora impresora = Impresora.getInstance();
        
        int opcion = JOptionPane.YES_OPTION;
        
        while (opcion == JOptionPane.YES_OPTION) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado:", "Registro de Impresión", JOptionPane.QUESTION_MESSAGE);
            
            if (nombre == null || nombre.trim().isEmpty()) {
                break;
            }
            
            String cargo = JOptionPane.showInputDialog(null, "Ingrese el cargo del empleado:", "Registro de Impresión", JOptionPane.QUESTION_MESSAGE);
            if (cargo == null || cargo.trim().isEmpty()) {
                continue;
            }
            
            String funcion = JOptionPane.showInputDialog(null, "Ingrese la función del empleado:", "Registro de Impresión", JOptionPane.QUESTION_MESSAGE);
            if (funcion == null || funcion.trim().isEmpty()) {
                continue;
            }
            
            String paginasStr = JOptionPane.showInputDialog(null, "Ingrese el número de páginas a imprimir:", "Registro de Impresión", JOptionPane.QUESTION_MESSAGE);
            if (paginasStr == null || paginasStr.trim().isEmpty()) {
                continue;
            }
            
            try {
                int paginas = Integer.parseInt(paginasStr);
                RegistroImpresion registro = new RegistroImpresion(nombre, cargo, funcion, paginas);
                impresora.agregarAlHistorial(registro);
                
                JOptionPane.showMessageDialog(null, "Registro guardado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            
            opcion = JOptionPane.showConfirmDialog(null, "¿Desea registrar otro empleado?", "Continuar", JOptionPane.YES_NO_OPTION);
        }
        
        impresora.mostrarHistorial();
    }
}

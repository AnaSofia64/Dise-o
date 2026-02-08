import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Impresora {

    private static final Impresora instancia = new Impresora();
    private int totalPaginas;
    private final List<RegistroImpresion> historial;

    private Impresora() {
        totalPaginas = 0;
        historial = new ArrayList<>();
    }

    public static Impresora getInstance() {
        return instancia;
    }

    public void agregarAlHistorial(RegistroImpresion registro) {
        historial.add(registro);
        totalPaginas += registro.getPaginas();
    }

    public void mostrarHistorial() {
        if (historial.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay registros en el historial", "Historial", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder sb = new StringBuilder("===== HISTORIAL DE IMPRESIONES =====\n\n");
        for (RegistroImpresion registro : historial) {
            sb.append(registro.toString()).append("\n");
        }
        sb.append("\nTotal de páginas impresas: ").append(totalPaginas);

        JOptionPane.showMessageDialog(null, sb.toString(), "Historial", JOptionPane.INFORMATION_MESSAGE);
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }
}

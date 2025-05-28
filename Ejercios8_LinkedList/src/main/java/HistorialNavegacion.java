import java.util.LinkedList;

public class HistorialNavegacion {
    private LinkedList<String> historial = new LinkedList<>();

    public void agregarPagina(String url) {
        historial.add(url);
    }

    public void atras() {
        if (!historial.isEmpty()) {
            historial.removeLast();
        }
    }

    public void mostrarHistorial() {
        System.out.println("Historial actual:");
        for (String pagina : historial) {
            System.out.println("- " + pagina);
        }
    }
}

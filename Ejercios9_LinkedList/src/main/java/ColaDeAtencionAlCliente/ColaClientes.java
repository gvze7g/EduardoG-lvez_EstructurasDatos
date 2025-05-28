package ColaDeAtencionAlCliente;

import java.util.LinkedList;

public class ColaClientes {
    private LinkedList<String> cola = new LinkedList<>();

    public void agregarCliente(String cliente) {
        cola.addLast(cliente);
    }

    public void atenderCliente() {
        if (!cola.isEmpty()) {
            System.out.println("Atendiendo a: " + cola.removeFirst());
        }
    }

    public void agregarPrioritario(String cliente) {
        cola.addFirst(cliente);
    }

    public void mostrarSiguiente() {
        if (!cola.isEmpty()) {
            System.out.println("Siguiente en fila: " + cola.getFirst());
        }
    }
}


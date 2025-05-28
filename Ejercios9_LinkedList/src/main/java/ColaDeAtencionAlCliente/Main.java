package ColaDeAtencionAlCliente;

public class Main {
    public static void main(String[] args) {
        ColaClientes banco = new ColaClientes();

        banco.agregarCliente("Eduardo Gálvez");
        banco.agregarCliente("Camila Gomez");
        banco.agregarCliente("Javier Iraheta");

        banco.atenderCliente();
        banco.agregarPrioritario("Leo Adrian");
        banco.mostrarSiguiente();
    }
}

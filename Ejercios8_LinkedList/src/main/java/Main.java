public class Main {
    public static void main(String[] args) {
        HistorialNavegacion hn = new HistorialNavegacion();

        hn.agregarPagina("google.com");
        hn.agregarPagina("youtube.com");
        hn.agregarPagina("github.com");
        hn.agregarPagina("stackoverflow.com");
        hn.agregarPagina("openai.com");

        hn.atras();
        hn.mostrarHistorial();
    }
}



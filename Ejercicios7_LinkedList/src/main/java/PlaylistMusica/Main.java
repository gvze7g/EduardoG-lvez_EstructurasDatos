package PlaylistMusica;

public class Main {
    public static void main(String[] args) {
        PlaylistMusica pm = new PlaylistMusica();

        pm.agregarCancionesFinal("EEO", "WOAHH", "Cosa Nuestra");
        pm.agregarSiguiente("Next Song");
        pm.eliminarUltima();
        pm.mostrarPlaylist();
    }
}

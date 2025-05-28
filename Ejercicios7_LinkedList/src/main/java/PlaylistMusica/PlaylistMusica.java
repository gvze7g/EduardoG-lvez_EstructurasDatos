package PlaylistMusica;

import java.util.LinkedList;

public class PlaylistMusica {
    private LinkedList<String> playlist = new LinkedList<>();

    public void agregarCancionesFinal(String... canciones) {
        for (String cancion : canciones) {
            playlist.addLast(cancion);
        }
    }

    public void agregarSiguiente(String cancion) {
        playlist.addFirst(cancion);
    }

    public void eliminarUltima() {
        if (!playlist.isEmpty()) {
            playlist.removeLast();
        }
    }

    public void mostrarPlaylist() {
        System.out.println("Playlist actual:");
        for (String cancion : playlist) {
            System.out.println("- " + cancion);
        }
    }
}


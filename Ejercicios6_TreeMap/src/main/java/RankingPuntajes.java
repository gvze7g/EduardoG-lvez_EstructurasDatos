package RankingDePuntajes;

import java.util.*;


public class RankingPuntajes {
    private TreeMap<String, Integer> jugadores = new TreeMap<>();

    public void agregarJugador(String nombre, int puntaje) {
        jugadores.put(nombre, puntaje);
    }

    public void mostrarRanking() {
        System.out.println("Jugadores ordenados alfabéticamente:");
        jugadores.forEach((nombre, puntaje) -> System.out.println(nombre + ": " + puntaje));
    }

    public void mostrarMaximo() {
        if (!jugadores.isEmpty()) {
            Map.Entry<String, Integer> mejor = Collections.max(jugadores.entrySet(), Map.Entry.comparingByValue());
            System.out.println("Jugador con mayor puntaje: " + mejor.getKey() + " (" + mejor.getValue() + ")");
        }
    }
}

